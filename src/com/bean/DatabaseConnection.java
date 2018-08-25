package com.bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection{
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/amsystem_sh";
    private static final String user = "root";
    private static final String password = "1998";


    private Connection conn = null;
    public DatabaseConnection(){
        try {
            Class.forName(driver);
            this.conn = DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public Connection getConnection() {
        return conn;
    }

    public void setConnection(Connection conn) {
        this.conn = conn;
    }
public void close()throws Exception{
        if(this.conn!=null){
            try {
                this.conn.close();
            }catch (Exception e){
                throw e;
            }
        }
}
}
