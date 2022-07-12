/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


 public class Employee {

String name;
int age;
String designation;
double salary;
// This is the constructor of the class called Employee
public Employee(String name) {
this.name = name;
}
// We assign the age of the Employee to the variable called age.
public void empAge(int empAge) {
age = empAge;
}
/* We assign the designation to the variable called designation.*/
public void empDesignation(String empDesig) {
designation = empDesig;
}
/* We assign the salary to the variable called salary.*/
public void empSalary(double empSalary) {
salary = empSalary;
}
/* Print the Employee details */
public void printEmployee() {
System.out.println("Name:"+ name );
System.out.println("Age:" + age );
System.out.println("Designation:" + designation );
System.out.println("Salary:" + salary);
}
}
