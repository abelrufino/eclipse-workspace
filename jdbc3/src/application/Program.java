package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = DB.getConnection();

			st = conn.prepareStatement("INSERT INTO seller " + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES " + "(?, ?, ?, ?, ?)");

			st.setString(1, "Abel Neto");
			st.setString(2, "anetosib@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("27/05/1981").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 1);

			int rowsAffected = st.executeUpdate();

			System.out.println("Done ! Rows affected: " + rowsAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}