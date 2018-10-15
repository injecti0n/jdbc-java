package net.hack4;

import java.sql.*;

public class Students {

  public String username;
  public String password;
  public String email;
  public String level;
  public int limit;
  String dbUser = "root";
  String dbPass = "ekmek";


  public Students() {
    super();
  }

  public Students(String username, String password, String email, String level) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.level = level;
  }

  public void LimitData(int limit) {

    this.limit = limit;

    //String dbHost = "jdbc:mysql://3306/beersDB";
    String dbUser = "root";
    String dbPass = "ekmek";
    try {
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beersDB", dbUser, dbPass);
      // 2. create a statement
      Statement myStatement = connection.createStatement();

      // 3. execute sql query

      myStatement.executeQuery("select * from Beers LIMIT " + limit + ";");

      ResultSet Datas = myStatement.getResultSet();


      // 4. process the result set

      while (Datas.next()) {
        // System.out.println(Datas.getString("Username" + " " + "Password" + " " + "Email" + " " + "Level"));
        System.out.println(Datas.getString("Name"));
      }


    } catch (Exception ex) {
      ex.printStackTrace();
    }


  }


  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }

  public String getLevel() {
    return level;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return "Students{" +
            "username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", email='" + email + '\'' +
            ", level='" + level + '\'' +
            '}';
  }

  public void AllUsers() {


    //String dbHost = "jdbc:mysql://3306/beersDB";
    String dbUser = "root";
    String dbPass = "ekmek";
    try {
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beersDB", dbUser, dbPass);
      // 2. create a statement
      Statement myStatement = connection.createStatement();

      // 3. execute sql query

      myStatement.executeQuery("select * from Beers;");

      ResultSet Datas = myStatement.getResultSet();


      // 4. process the result set

      while (Datas.next()) {
        //System.out.println(Datas.getString("Username"+" "+"Password"+" "+"Email"+" "+"Level"));
        System.out.println(Datas.getString("Name"));
      }


    } catch (Exception ex) {
      ex.printStackTrace();
    }




  }


  // new user func;
  // ,String password,String email,String level
  public void NewUser(String username) {
    this.username = username;
   /*/
    this.password = password;
    this.email = email;
    this.level = level;
    */

    //String dbHost = "jdbc:mysql://3306/beersDB";
    String dbUser = "root";
    String dbPass = "ekmek";
    try {

      // 1. get connection to database

      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/beersDB", dbUser, dbPass);


      // 2. create a statement
      Statement myStatement = connection.createStatement();

      // 3. execute sql query

      String query = " insert into Beers (Name)"
              + " values (?)";
      //myStatement.executeQuery("select * from Beers;");
      PreparedStatement preparedStmt = connection.prepareStatement(query);
      preparedStmt.setString(1, username);
      preparedStmt.execute();

    } catch (Exception ex) {
      ex.printStackTrace();
    }




  }



}

