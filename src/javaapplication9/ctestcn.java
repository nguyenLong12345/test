package javaapplication9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ctestcn {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=hoadon;encrypt=true;trustServerCertificate=true";

        String user = "sa";
        String password = "12345";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}