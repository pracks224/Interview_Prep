package DesignPatterns.ConnectionPool;

import java.sql.*;

public class Connection {
    private String url;
    private String username;
    private String password;
    private java.sql.Connection connection;

    public Connection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public java.sql.Connection open() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return open().prepareStatement(sql);
    }

    public void commit() throws SQLException {
        open().commit();
    }

    public void rollback() throws SQLException {
        open().rollback();
    }

    public void setAutoCommit(boolean autoCommit) throws SQLException {
        open().setAutoCommit(autoCommit);
    }

    // other methods for managing the connection, executing SQL statements, etc.
}

