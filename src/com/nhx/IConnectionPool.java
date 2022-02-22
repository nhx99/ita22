package com.nhx;

import java.sql.Connection;
import java.util.List;

public interface IConnectionPool {

    Connection getConnection();
    void releaseConnection(Connection connection);
    String getUrl();
    String getUsername();
    String getPassword();
    List<Connection> getCreatedConnections();
    List<Connection> getStoredConnections();
}
