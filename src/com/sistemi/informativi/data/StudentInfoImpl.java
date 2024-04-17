package com.sistemi.informativi.data;

import com.sistemi.informativi.bean.Student;

import java.util.ArrayList;

public class StudentInfoImpl implements StudentInfo{


    @Override
    public ArrayList<Student> findAllStudents() {

        //MOCK
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mario Rossi","1028A",23));
        students.add(new Student("Teresa Plati","1028B",26));

        return students;

    }
}
