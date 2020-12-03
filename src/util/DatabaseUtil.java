package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection(){//db¡¢º”
		try {
			String dbURL = "jdbc:mysql://localhost:3306/LectureEvaluation?characterEncoding=UTF-8&serverTimezone=UTC";
			String dbID = "fake";
			String dbPassword = "fake";
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(dbURL,dbID,dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
