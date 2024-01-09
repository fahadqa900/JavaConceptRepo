package com.metlife.student_runner;

import com.metlife.student.StudentType;

public class stud_runner
{
    public static void main(String[] args)
    {
 /*1001,"jack",jack@gmail.com,45.2, Global school, chennai
 1002,"peter",peter@gmail.com,85.2, Global school, chennai
 1003,"mark",mark@gmail.com,56.5, Global school, chennai*/

//First Student Object:
StudentType s1=new StudentType();
s1.studentRollno=1001;
s1.studentName="jack";
s1.studentMailid="jack@gmail.com";
s1.studentPercentage=45.2;
StudentType.schoolName="Global school";
StudentType.schoolAddres="chennai";

//Second Student Object:
StudentType s2=new StudentType();
s2.studentRollno=1002;
s2.studentName="peter";
s2.studentMailid="peter@gmail.com";
s2.studentPercentage=85.2;
StudentType.schoolName="Global school";
StudentType.schoolAddres="chennai";

//Third Student Object:
StudentType s3=new StudentType();
s3.studentRollno=1003;
s3.studentName="mark";
s3.studentMailid="mark@gmail.com";
s3.studentPercentage=56.5;
StudentType.schoolName="Global school";
StudentType.schoolAddres="chennai";
}
}
