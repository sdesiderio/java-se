package com.sistemi.informativi.facade;

import com.sistemi.informativi.bean.Recruiter;
import com.sistemi.informativi.bean.Student;
import com.sistemi.informativi.bean.Teacher;
import com.sistemi.informativi.data.RecruiterInfo;
import com.sistemi.informativi.data.StudentInfo;
import com.sistemi.informativi.data.TeacherInfo;

import java.util.ArrayList;

public interface Facade  {

    public ArrayList<Student> findAllStudents();

    public ArrayList<Teacher> findAllTeachers();
    public ArrayList<Recruiter> findAllRecruiters();



}
