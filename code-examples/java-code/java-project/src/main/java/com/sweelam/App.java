package com.sweelam;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    DatabaseMgr db = new DatabaseMgr();

    List<Employee> allEmployess = db.getAllEmployess();

    List<String> promotedEmps = new ArrayList<>();

    for (Employee emp : allEmployess) {

      if (emp.getSalary() < 2000.0) {
        promotedEmps.add(emp.getFirstname() + " " + emp.getLastname());
      }

    }

    // for (String emp : promotedEmps) {
    // System.out.println(emp);
    // }

    // Init: Streaming initialization
    // Filter: check / validate
    // Mapping
    // Terminal

    List<String> report = allEmployess.stream()
        .filter(emp -> emp.getSalary() < 2000.0)
        .map(emp -> emp.getFirstname() + " " + emp.getLastname())
        .toList();

    for (String record : report) {
      System.out.println(record);
    }

  }
}
