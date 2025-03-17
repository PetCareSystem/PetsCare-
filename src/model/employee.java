/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ThienThu
 */
public class employee extends User {

    private double salary;
    private double workingHours;
    private int age;

    public employee(double salary, double workingHours, int age) {
        this.salary = salary;
        this.workingHours = workingHours;
        this.age = age;
    }

    public employee(double salary, double workingHours, int age, int userID, String userName, String password, String role) {
        super(userID, userName, password, role);
        this.salary = salary;
        this.workingHours = workingHours;
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee {\n"
                + "  %-12s: %.2f\n"
                + "  %-12s: %d hours\n"
                + "  %-12s: %d years old\n"
                + "}",
                "Salary", salary,
                "WorkingHours", workingHours,
                "Age", age
        );
    }

}
