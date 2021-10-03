/*
 * Copyright (C) 2021, FPT University<br>
 * SWP391<br>
 * ChildrenCareProject<br>
 *
 * Record of change:<br>
 * DATE          Version    Author           DESCRIPTION<br>
 * 2021-09-21    1.0        DucNT           First Version<br>
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;



public class DBContext {
    /**
     * DBContext initial
     */
    private InitialContext initial;
    /**
     * DBContext context
     */
    private Context context;
    /**
     * DBContext dbName
     */
    /**
     * DBContext host
     */
    final private String HOST = "Duke";
    /**
     * DBContext port
     */
    final private int PORT = 1433;
    /**
     * DBContext database name
     */
    final private String DBName = "ChildCare";
    /**
     * DBContext image
     */
    private String image;
    /**
    /**
     * DBContext host username
     */
    String username = "sa";
    /**
     * DBContext host password
     */
    String password = "123456";
    
    
    /**
     * Constructor
     */
    public DBContext() {
        try {
            this.initial = new InitialContext();
            this.context = (Context) initial.lookup("java:comp/env");
            this.image = context.lookup("imagePath").toString();
        } catch (NamingException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Get connection of your database
     *
     * @return connection
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        String url = "jdbc:sqlserver://" + HOST + ":" + PORT + ";databaseName=" + DBName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection(url, username, password);
        return con;
    }
    
    /**
     * When you are done with using your connection, you need close in order to
     * release any other database resource
     *
     * @param ps it is a object of <code>java.sql.PreparedStatement</code>
     * @throws Exception
     */
    public void closePreparedStatement(PreparedStatement ps) throws Exception {
        if (ps != null && !ps.isClosed()) {
            ps.close();
        }
    }

    /**
     * When you are done with using your connection, you need close in order to
     * release any other database resource
     *
     * @param con it is a object of <code>java.sql.Connection</code>
     * @throws Exception
     */
    public void closeConnection(Connection con) throws Exception {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    /**
     * When you are done with using your connection, you need close in order to
     * release any other database resource
     *
     * @param rs it is a object of <code>java.sql.ResultSet</code>
     * @throws Exception
     */
    public void closeResultSet(ResultSet rs) throws Exception {
        if (rs != null && !rs.isClosed()) {
            rs.close();
        }
    }
    /**
     * Get path of image store in file context
     *
     * @return path of image
     * @throws Exception
     */
    public String getImagePath() throws Exception {
        return image;
    }
}
