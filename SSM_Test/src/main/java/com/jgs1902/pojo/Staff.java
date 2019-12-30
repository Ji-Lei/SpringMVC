package com.jgs1902.pojo;

public class Staff {
    private Integer id;
    private String staffname;
    private String password;
    private String job;
    private String name;
    private Integer role;

    public Staff() {
    }

    public Staff(Integer id, String staffname, String password, String job, String name, Integer role) {
        this.id = id;
        this.staffname = staffname;
        this.password = password;
        this.job = job;
        this.name = name;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
