package com.bean;

public class User {
    //�����û����ͣ�1Ϊ��߹���Ա��2Ϊ���Ź���Ա��3Ϊ��ͨԱ��
    private int type;
    //���������û����ԣ����֣��Ա𣬻���״�������ţ��绰�����䣬���룩
    private static int uid = 0;
    private String name;
    private String sex;
    private int marry;
    private String department;
    private String phone;
    private String email;
    private String password;


    private int id;
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getMarry() {
        return marry;
    }

    public void setMarry(int marry) {
        this.marry = marry;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
