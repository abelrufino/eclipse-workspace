package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		try {
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			
			st = conn.createStatement();

			int rows1 = st.executeUpdate("Update seller Set BaseSalary = 5050 Where DepartmentId = 1");
			
		//	int x = 1;
		//	if(x < 2) {
		//		throw new SQLException("Fake error");
		//	}
			
			int rows2 = st.executeUpdate("Update seller Set BaseSalary = 4040 Where DepartmentId = 2");

			conn.commit();
			
			System.out.println("Rows 1 " + rows1);
			System.out.println("Rows 2 " + rows2);

		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException el) {
				throw new DbException("Error trying to roolback Caused by: " + el.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}