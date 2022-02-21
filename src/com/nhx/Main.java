package com.nhx;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IConnectionPool pool = ConnectionPool.createPool();
        IConnectionPool pool2 = ConnectionPool.createPool();

        System.out.println(pool.getCreatedConnections().size());
        System.out.println(pool.getStoredConnections().size());

        Connection connection = pool.getConnection();
        Connection connection1 = pool.getConnection();
        Connection connection2 = pool.getConnection();
        Connection connection3 = pool.getConnection();
        Connection connection4 = pool.getConnection();
        Connection connection5 = pool.getConnection();
        Connection connection6 = pool.getConnection();
        Connection connection7 = pool.getConnection();
        Connection connection8 = pool.getConnection();
        Connection connection9 = pool.getConnection();
        Connection connection10 = pool.getConnection();

        System.out.println(pool.getCreatedConnections().size());
        System.out.println(pool.getStoredConnections().size());

        pool.releaseConnection(connection);
        pool.releaseConnection(connection1);
        pool.releaseConnection(connection2);
        pool.releaseConnection(connection3);
        pool.releaseConnection(connection4);
        pool.releaseConnection(connection5);
        pool.releaseConnection(connection6);
        pool.releaseConnection(connection7);
        pool.releaseConnection(connection8);
        pool.releaseConnection(connection9);
        pool.releaseConnection(connection10);

        System.out.println(pool.getCreatedConnections().size());
        System.out.println(pool.getStoredConnections().size());

        // Test projvera kolicine kreiranih objekata ConnectionPool
        Connection connection11 = pool2.getConnection();
        System.out.println(pool2.getCreatedConnections().size());
        System.out.println(pool2.getStoredConnections().size());

    }
}
