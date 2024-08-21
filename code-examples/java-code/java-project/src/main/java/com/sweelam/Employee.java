package com.sweelam;

/**
 * Employee
 */
public class Employee {

  private String firstname;
  private String lastname;
  private String grade;
  private double salary;

  public Employee() {
  }

  public Employee(String firstname, String lastname, String grade, double salary) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.grade = grade;
    this.salary = salary;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public void setSalary(double salary) {
    if (salary < 0) {
      throw new IllegalArgumentException("Salary can't be less than 0");
    }
    this.salary = salary;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getGrade() {
    return grade;
  }

  public double getSalary() {
    return salary;
  }
}
