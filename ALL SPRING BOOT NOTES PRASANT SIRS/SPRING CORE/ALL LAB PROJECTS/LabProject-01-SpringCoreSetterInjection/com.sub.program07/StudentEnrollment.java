package com.sub.program07;

import java.util.Set;

public class StudentEnrollment {

    private Set<String> subjects;

    public StudentEnrollment() {
        super();
    }

    public StudentEnrollment(Set<String> subjects) {
        super();
        this.subjects = subjects;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "StudentEnrollment [subjects=" + subjects + "]";
    }

}
