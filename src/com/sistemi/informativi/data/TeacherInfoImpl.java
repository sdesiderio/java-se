package com.sistemi.informativi.data;

import com.sistemi.informativi.bean.Student;
import com.sistemi.informativi.bean.Teacher;

import java.util.ArrayList;

public class TeacherInfoImpl implements TeacherInfo{
    @Override
    public ArrayList<Teacher> findAllTeachers() {

        //MOCK
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Mario Rossi",20,35));
        teachers.add(new Teacher("Teresa Plati",15,34));

        return teachers;


    }
}
