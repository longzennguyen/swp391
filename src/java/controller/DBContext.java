package controller;




import java.sql.Connection;
import java.sql.DriverManager;


public class DBContext {
    
    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
    /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
     public Connection getConnection()throws Exception {
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        Class.forName("org.postgresql.Driver");
         System.out.println("Connect dtb successful!");
        return DriverManager.getConnection(url, userID, password);
    }
    
    /*Insert your other code right after this comment*/
    
    
    
    /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private final String serverName = "127.0.0.1";
    private final String dbName = "postgres";
    private final String portNumber = "5432";
    private final String instance="";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final String userID = "postgres";
    private final String password = "123123";
}
 