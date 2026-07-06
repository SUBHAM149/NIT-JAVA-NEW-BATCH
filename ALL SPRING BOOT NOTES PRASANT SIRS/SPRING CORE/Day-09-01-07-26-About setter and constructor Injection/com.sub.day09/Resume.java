package com.sub.day09;

public class Resume {
    private int experience;
    private String domain;

    public Resume() {
        System.out.println("Resume class default constructor");
    }

    public Resume(int experience, String domain) {
        super();
        this.experience = experience;
        this.domain = domain;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "Resume [experience=" + experience + ", domain=" + domain + "]";
    }
}
