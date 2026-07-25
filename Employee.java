package com.oops.inheritance;

class Employee {

    int empid;
    String name;
    float salary;
    int experience;

    Employee(int empid, String name, float salary, int experience) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}
    class Emp extends Employee {
        String address;
        String mailId;
        int mobileNo;

        Emp(int empid, String name, float salary, int experience, String address, String mailId, int mobileNo) {
            super(empid, name, salary, experience);
            this.address = address;
            this.mailId = mailId;
            this.mobileNo = mobileNo;

        }

    }

