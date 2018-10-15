package net.hack4;


import java.util.Scanner;

public class Main {


  public static void main (String[] args){


    Students students = new Students("","user@gmail.com","email","password");
    System.out.println(students.toString());

   // students.LimitData(10);
 //   students.AllUsers();
    // NEW USER FUNCTION > students.NewUser("Phiber Optik");
    MainMenu();
    //students.ShowbyUsername("Phiber Optik");



  }

  public static void MainMenu() {
    Students records = new Students();
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to Students Manage System >" + "\n" +
            "[1] Show Student by username " + "\n" +
            "[2] Add New Student" + "\n" +
            "[3] Delete Student" + "\n" +
            "[4] Update Student Record");
    int option = keyboard.nextInt();


    //System.out.println(option);
    switch (option) {

      case 1:
        System.out.print("Enter username: ");
        String user = keyboard.next();
        records.ShowbyUsername(user);
        break;
      case 2:
        System.out.println("it's 2");
        break;
      case 3:
        System.out.println("it's 3");
        break;
      case 4:
        System.out.println("it's 4");
    }
  }
}
