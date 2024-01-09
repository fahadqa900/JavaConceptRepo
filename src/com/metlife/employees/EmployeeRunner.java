package com.metlife.employees;

public class EmployeeRunner
{
    public static void main(String[] args)
    {
     Employee emp1=new Employee();
     Employee emp2=new Employee();
     Employee emp3=new Employee();
     //First Employee Detail:
     emp1.empId=101;
     emp1.empName="John";
     emp1.empSalary=1000;
     emp1.empPerformance="A";
     emp1.empCompany="MetLife";

        //Second Employee Detail:
        emp2.empId=102;
        emp2.empName="Tom";
        emp2.empSalary=2000;
        emp2.empPerformance="B";
        emp2.empCompany="MetLife";

//Third Employee Detail:
        emp3.empId=103;
        emp3.empName="Allen";
        emp3.empSalary=3000;
        emp3.empPerformance="C";
        emp3.empCompany="MetLife";
    }
    private static void getBonus()
    {

    }
}
