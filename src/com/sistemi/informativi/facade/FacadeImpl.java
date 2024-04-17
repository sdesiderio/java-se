package com.sistemi.informativi.facade;

import com.sistemi.informativi.bean.Recruiter;
import com.sistemi.informativi.bean.Student;
import com.sistemi.informativi.bean.Teacher;
import com.sistemi.informativi.data.*;

import java.util.ArrayList;

public class FacadeImpl implements Facade{


    @Override
    public ArrayList<Student> findAllStudents() {

        StudentInfo studentInfo = new StudentInfoImpl();
        return studentInfo.findAllStudents();

    }

    @Override
    public ArrayList<Teacher> findAllTeachers() {

        TeacherInfo teacherInfo = new TeacherInfoImpl();
        return teacherInfo.findAllTeachers();
    }

    @Override
    public ArrayList<Recruiter> findAllRecruiters() {

        RecruiterInfo reacruiterInfo = new RecruiterInfoImpl();
        return reacruiterInfo.findAllRecruiters();


    }
}
