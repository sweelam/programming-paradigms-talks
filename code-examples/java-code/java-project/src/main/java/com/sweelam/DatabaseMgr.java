package com.sweelam;

import java.util.ArrayList;
import java.util.List;

/**
 * DatabaseMgr
 */
public class DatabaseMgr {

  public List<Employee> getAllEmployess() {
    // Simulating fetching from DB
    List<Employee> emps = new ArrayList<>();

    emps.add(new Employee("Mohamed", "Sweelam", "G7", 2020.0));
    emps.add(new Employee("Bob", "Alex", "G5", 1200.0));
    emps.add(new Employee("Alaa", "Emad", "G6", 2000.0));
    emps.add(new Employee("bahaa", "Emad", "G8", 3050.0));
    emps.add(new Employee("Ayman", "Mustafa", "G9", 4000.0));
    emps.add(new Employee("Alaa", "Mahmoud", "G3", 1200.0));

    return emps;
  }

}
