package com.nhx;

import java.sql.Connection;

public interface IConnectionPool {

    Connection getConnection();
    void releaseConnection(Connection connection);
    String getUrl();
    String getUsername();
    String getPassword();
}
