package com.nhx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool implements IConnectionPool {

    private static int POOL_SIZE = 10;

    private List<Connection> createdConnections = new ArrayList<>();


    private List<Connection> storedConnections = new ArrayList<>();

    private static ConnectionPool pool;


    private ConnectionPool() {
            for (int i = 0; i < POOL_SIZE; i++) {
                try (Connection connection = DriverManager.getConnection(getUrl(),getUsername(),getPassword())) {
                    createdConnections.add(connection);
                } catch (SQLException e) {
                    System.out.println("Greska u konekciji sa bazom");
                }
            }
        System.out.println("Pozvan konstruktor");
    }

    public static ConnectionPool createPool() {
        if (pool == null) {
            pool = new ConnectionPool();
        }
        return pool;
    }
    @Override
    public Connection getConnection() {
        if (!createdConnections.isEmpty()) {
            Connection connection = createdConnections.get(createdConnections.size() - 1);
            storedConnections.add(connection);
            createdConnections.remove(connection);
            return connection;
        } else {
            System.out.println("Pool konekcija je prazan, prvo vratite konekciju u pool");
            return null;
        }
    }

    @Override
    public void releaseConnection(Connection connection) {
        if(!storedConnections.isEmpty()) {
            createdConnections.add(connection);
            storedConnections.remove(connection);
            System.out.println("Konekcija je vracena");
        } else {
            System.out.println("Nema konekcija u upotrebi");
        }
    }

    @Override
    public String getUrl() {
        return "jdbc:mysql://localhost:3306/sakila";
    }

    @Override
    public String getUsername() {
        return "root";
    }

    @Override
    public String getPassword() {
        return "root";
    }
    @Override
    public List<Connection> getCreatedConnections() {
        return createdConnections;
    }
    @Override
    public List<Connection> getStoredConnections() {
        return storedConnections;
    }

    public static ConnectionPool getPool() {
        return pool;
    }
}
