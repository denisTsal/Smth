package Mains;

import java.sql.*;

public class JDBStarter {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/education_system";
        String username = "root";
        String password = "ltybcvbycr2002";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from Teacher");
        while (resultSet.next()) {
            int age = resultSet.getInt("age");
            String subj = resultSet.getString("subj");
            System.out.println("age" + " " + age);
            System.out.println("subj" + " " + subj);
        }
        connection.close();
    }
}

