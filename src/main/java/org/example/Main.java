package org.example;

import org.example.departman;
public class Main {
    public static void main(String[] args) {
        departman departman = new departman("Yazılım Departmanı");

        Employee employee1 = new Employee("1", "Esma", "Yazılım Test Uzmanı", 75000);
        Employee employee2 = new Employee("2", "Ayşe", "Yazılım Gerliştirici", 65000);
        Employee employee3 = new Employee("3", "Ali", "İş Analisti", 85000);

        departman.addEmployee(employee1);
        departman.addEmployee(employee2);
        departman.addEmployee(employee3);

        System.out.println("Departman İsmi: " + departman.getName());
        System.out.println("Calışanlar:");
        for (Employee employee : departman.getEmployees()) {
            System.out.println(employee);
        }
    }
}
