package org.example.jdbcconnection;

import java.sql.DriverManager;

public class jdbcexample {
    public Static void main(String[] args) {
        final String JDBC_driver = "com.mysql.jdbc.Driver";
        final string url="jdbc:mysql://localhost:3306/test";
        final string username="root";
        final String password="route";
        try{
            class.fornamme(JDBC_driver);
            connection connection= DriverManager.getConnection(url,username,password);
            statement stm ="select"* from emp";
                resultset rs = stm.executeQuery(sql);
                while (rs.next()){
                    System.out.println(rs.getString(columnindex1)+ " "+ rs.getstring());

                }
                rs.close();
                stm.close();
                connection.close();
        }
        catch()
    }
}
