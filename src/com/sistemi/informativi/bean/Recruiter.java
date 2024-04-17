package com.sistemi.informativi.bean;

public class Recruiter {

    private String name;

    private String agency;

    private String channel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Recruiter(String name, String agency, String channel) {
        this.name = name;
        this.agency = agency;
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Recruiter{" +
                "name='" + name + '\'' +
                ", agency='" + agency + '\'' +
                ", channel='" + channel + '\'' +
                '}';
    }
}
