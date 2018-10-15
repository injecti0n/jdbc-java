package net.hack4;


public class Main {

  public static void main (String[] args){


    Students students = new Students("","user@gmail.com","email","password");
    System.out.println(students.toString());

    students.LimitData(10);
    students.AllUsers();
    students.NewUser("Intecbrussel");

  }

}
