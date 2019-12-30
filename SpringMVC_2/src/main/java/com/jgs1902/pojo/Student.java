package com.jgs1902.pojo;

public class Student {
    private String sname;
    private String cno;
    private String sex;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "学生{" +
                "姓名='" + sname + '\'' +
                ", 学号='" + cno + '\'' +
                ", 性别='" + sex + '\'' +
                '}';
    }
}
