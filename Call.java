package com.oops.inheritance;


public  class Call {

    public static void main(String[] args) {


        Employee e = new Employee(1001, "mj", 5500.00f, 10);

        System.out.println(e.empid);
        System.out.println(e.name);
        System.out.println(e.salary);
        System.out.println(e.experience);

        Emp e1 = new Emp(1002, "sidhu", 65000.00f,15,"hyd","abc@gamil.com",979797);

        System.out.println(e1.empid);
        System.out.println(e1.name);
        System.out.println(e1.salary);
        System.out.println(e1.address);
        System.out.println(e1.mailId);
        System.out.println(e1.mobileNo);
    }


}



