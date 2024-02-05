package Models;

import java.util.Scanner;

public class Member {
    String name;
    int age;
    int contact;
    int salary;
    int leave;

    public Member(int leave) {
        this.leave = leave;
    }

    public Member(String name, int age, int contact, int salary) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.salary = salary;
    }

    public void overallsalary(int Leave){
        int s= this.salary;
        System.out.println("How many Leaves?");

        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int total_salary =24* s - leave*s;
        System.out.println("Yours total salary for this month is "+ total_salary);



    }
}
