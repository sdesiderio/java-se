package com.sistemi.informativi.data;

import com.sistemi.informativi.bean.Recruiter;
import com.sistemi.informativi.bean.Teacher;

import java.util.ArrayList;

public class RecruiterInfoImpl implements RecruiterInfo{
    @Override
    public ArrayList<Recruiter> findAllRecruiters() {

        //MOCK
        ArrayList<Recruiter> recruiters = new ArrayList<>();
        recruiters.add(new Recruiter("Andrea Sesti","Agency1","Linkedin"));
        recruiters.add(new Recruiter("Marco Proto","Agency2","Linkedin"));

        return recruiters;

    }
}
