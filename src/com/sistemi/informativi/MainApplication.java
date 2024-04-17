package com.sistemi.informativi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApplication {
	
	private static final  String dbDriver = "com.mysql.cj.jdbc.Driver";
	private static final  String dbUrl = "jdbc:mysql://localhost:3306/openjobmetis";
	private static final  String dbUser = "root";
	private static final  String dbPass = "";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String sqlInsert = "insert into student(first_name,last_name,age) values (?,?,?)";
		
		String sqlUpdate = "update student set age=? where id=?";
		
		String sqlDelete = "delete from student where id=?";
		
		String sqlRead = "select * from student";
		
		
		/*
		 *  STEP 1 (Connessione al database specificandone la tipologia)
		 *  La Stringa di connessione è diversa a seconda della tipologia
		 *  del Database Relazionale al quale vogliamo connetterci
		 *  ad esempio per Oracle o altri database relazionali sarà differente
		 *  secondo le specifiche JDBC
		 */
		Class.forName(dbDriver);
		
		
		/*
		 * STEP 2 (Indicazione dei parametri di connessione al database)
		 * Per la url se usiamo mysql va sempre specificato 
		 * prima il prefisso: jdbc:mysql: 
		 * dbUser e dbPass sono le credenziali di accesso impostate per il db
		 */
		Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		
		
		/*
		 * STEP 3 . OPERAZIONI DI CRUD
		 * 
		 * 
		 */
		
		// STEP 3.1 (INSERIMENTO DI UN NUOVO RECORD sulla tabella student)
		PreparedStatement psInsert = connection.prepareStatement(sqlInsert);
		// sqlInsert "insert into student(first_name,last_name,age) values (?,?,?)";
		psInsert.setString(1, "Ciro");
		psInsert.setString(2, "Esposito");
		psInsert.setInt(3, 32);
		//sqlInsert "insert into student(first_name,last_name,age) values ('Ciro','Esposito',32)";
		
		/*
		 * L'invocazione del metodo executeUpdate
		 * dopo ogni operazione fatta con l'API
		 * PreparedStatement rappresenta una 
		 * sincronizzazione con la struttura
		 * fisica del database
		 */
		psInsert.executeUpdate();
		
		
		// STEP 3.2 (AGGIORNAMENTO DI UN  RECORD già esistente sulla tabella student)
		PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
		// sqlUpdate = "update student age=? where id=?";
		psUpdate.setInt(1, 29);
		psUpdate.setInt(2, 3);
		// sqlUpdate = "update student set age=29 where id=3";
		
		psUpdate.executeUpdate();
		
		
		// STEP 3.3 (CANCELLAZIONE DI UN  RECORD già esistente sulla tabella student)
		PreparedStatement psDelete = connection.prepareStatement(sqlDelete);
		// sqlDelete = "delete from student where id=?"
		psDelete.setInt(1, 2);
		// sqlDelete = "delete from student where id=2"
		
		psDelete.executeUpdate();

		// STEP 3.4 (LETTURA DI TUTTI I RECORD ESISTENTI SULLA TABELLA student)
		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(sqlRead);
		
		while(rs.next()) {
			
			System.out.println(rs.getInt("id") + " " + rs.getString("first_name") + " " + 
			rs.getString("last_name") + " " + rs.getInt("age"));
		}
		

	}
	
	// FINE DELLE OPERAZIONI DI CRUD

}
