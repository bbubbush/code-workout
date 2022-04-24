package com.bbubbush.tistory;

public class X755 {
  public Employee[] createEmployeeList() {
    Employee[] listOfEmployees = new Employee[5];
    for (int i = 0; i < listOfEmployees.length; i++) {
      listOfEmployees[i] = new Employee("");
    }
    listOfEmployees[0].setName("Mark");
    return listOfEmployees;
  }
}
