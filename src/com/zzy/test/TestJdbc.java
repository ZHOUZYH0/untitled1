package com.zzy.test;

import com.zzy.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJdbc {

    public static void main(String[] args){

        Connection conn = JDBCUtil.getConnection();
        System.out.println(conn);
        try {
            PreparedStatement pst = conn.prepareStatement("select * from user ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()){
                String name = rs.getString(2);
                System.out.println(name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
