package com.itheima.demo;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择您的服务：");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出系统");
            String choice = sc.next();
            switch (choice) {
                case "1": {
//                  System.out.println("添加学生");
                    addStudent(list);
                }
                case "2": {
                }
                case "3": {
                }
                case "4": {
                }
                case "5": {
                    break;
                }
                default:{
                    System.out.println("您的输入有误，请重新输入!");
                }
            }
        }
    }

    // 添加学生方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的学号:");
        String Sid = sc.next();
        System.out.println("请输入学生的姓名:");
        String name = sc.next();
        System.out.println("请输入学生的年龄:");
        int age = sc.nextInt();
        System.out.println("请输入学生的生日:");
        String birthday = sc.next();
        Student stu = new Student(Sid,name,age,birthday);
        list.add(stu);
    }
}
