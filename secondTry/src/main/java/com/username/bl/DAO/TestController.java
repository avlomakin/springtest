package com.username.bl.DAO;

import java.sql.*;

public class TestController extends AbstractController<TestEntity> {
    private static final String SELECT_ALL = "SELECT * FROM test_table";

    public TestController(String database, String user, String password) throws SQLException, ClassNotFoundException {
        super(database, user, password);
    }

    @Override
    public TestEntity getFirstEntity() {
        TestEntity result = null;

        try (Statement stm = connection.createStatement()){
            ResultSet resultSet = stm.executeQuery(SELECT_ALL);
            resultSet.next();
            result = new TestEntity();
            result.setData(resultSet.getString("data"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}