package com.username.bl.DAO;

import java.sql.*;

public abstract class AbstractController<E> {
    protected Connection connection;

    public AbstractController(String database, String user, String password) throws SQLException, ClassNotFoundException {
        connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + database, user, password);
            System.out.println("Connection established!");
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException e) {
            throw e;
        }
    }

    public abstract E getFirstEntity();
}