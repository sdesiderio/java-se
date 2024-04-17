package com.sistemi.informativi.main;

import com.sistemi.informativi.data.*;
import com.sistemi.informativi.facade.Facade;
import com.sistemi.informativi.facade.FacadeImpl;

public class Main {
    public static void main(String[] args) {


        Facade facade = new FacadeImpl();

        //LOUSE COUPLING
        facade.findAllStudents().forEach(student->System.out.println(student));

        //LOUSE COUPLING
        facade.findAllTeachers().forEach(teacher->System.out.println(teacher));

        //LOUSE COUPLING
        facade.findAllRecruiters().forEach(recruiter->System.out.println(recruiter));




    }
}