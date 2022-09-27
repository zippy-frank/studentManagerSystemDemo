package com.itheima.demo;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        lo:
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
                    break;
                }
                case "2": {
//                    System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                }
                case "3": {
//                    System.out.println("修改学生");
                    resetStudent(list);
                    break;
                }
                case "4": {
//                    System.out.println("查询学生");
                    catStudent(list);
                    break;
                }
                case "5": {
                    break lo;
                }
                default: {
                    System.out.println("您的输入有误，请重新输入!");
                }
            }
        }
    }

    public static void resetStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        lo:
        while (true) {
            System.out.println("请输入需要修改的学生学号:");
            String Sid = sc.next();
            for (int i = 0; i < list.size(); i++) {
                if (Sid.equals(list.get(i).getSid())) {
                    list.remove(i);
                    System.out.println("请输入新的姓名:");
                    String name = sc.next();
                    System.out.println("请输入新的年龄:");
                    int age = sc.nextInt();
                    System.out.println("请输入新的生日:");
                    String birthday = sc.next();
                    Student stu = new Student(Sid, name, age, birthday);
                    list.add(i, stu);
                    break lo;
                } else {
                    System.out.println("您输入的学号有误，请重新输入！");
                    break;
                }
            }
        }
    }

    public static void catStudent(ArrayList<Student> list) {
        System.out.println("学号" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "生日");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSid() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" + list.get(i).getBirthday());
        }
    }

    // 删除学生
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("请输入您想删除的学生的学号:");
        Scanner sc = new Scanner(System.in);
        String Sid = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (Sid.equals(list.get(i).getSid())) {
                list.remove(i);
            } else {
                System.out.println("查无此人，请重新输入！");
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
        Student stu = new Student(Sid, name, age, birthday);
        list.add(stu);
    }
}
