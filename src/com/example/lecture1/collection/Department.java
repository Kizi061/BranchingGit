package com.example.lecture1.collection;

import java.util.UUID;

public class Department {
    private String departmentId;
    private String departmentName;

    public Department(String departmentName) {
        this.departmentId = UUID.randomUUID().toString();
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
