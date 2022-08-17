package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Student> alex = new HashSet<>();

        System.out.print("How many students for course A: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            alex.add(new Student(sc.nextInt()));
            sc.nextLine();
        }

        System.out.print("How many students for course B: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            alex.add(new Student(sc.nextInt()));
            sc.nextLine();
        }

        System.out.print("How many students for course C: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            alex.add(new Student(sc.nextInt()));
            sc.nextLine();
        }

        System.out.println("Total students: " + alex.size());

        sc.close();

    }
}
