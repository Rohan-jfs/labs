package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbinsert")
public class DBInsertServlet extends HttpServlet {
	Connection connection = null;
	@Override
	public void init() throws ServletException {
		try {
			System.out.println("INIT INVOKED");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}		
	}
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int bookId = Integer.parseInt(req.getParameter("bookId"));
	String bookName = req.getParameter("bookName");
	
	PrintWriter out=resp.getWriter();
	insertDetails(bookId, bookName);
	fetchBookDetailsAsTable(out);
	
}

public void insertDetails(int bookId, String bookName) {
	// Get ojdbc14.jar
	// Load the driver
	try {
		//Create the statement
		Statement statement = connection.createStatement();
		//Execute the query
		int noOfRowsInserted = statement.executeUpdate("insert into book values(" + bookId + ", '" + bookName + "')" );
		if(noOfRowsInserted ==1) {
			System.out.println("NO OF ROWS INSERTED : " + noOfRowsInserted);
			
		}
		else {
			System.out.println("No rows inserted!");
		}
	} catch (SQLException e) {
		System.out.println(e);
	}
}

public void fetchBookDetailsAsTable(PrintWriter out) {
	// Get ojdbc14.jar
	// Load the driver
	try {
		
		//Create the statement
		Statement statement = connection.createStatement();
		//Execute the query
		ResultSet resultSet = statement.executeQuery("select * from book");
		out.println("<table border='2'><tr>");
		out.println("<td>book_id</td>");
		out.println("<td>bookname</td>");
		
		out.println("</tr>");
		while(resultSet.next()) {
			out.println("<tr>");
			out.println("<td>" + resultSet.getInt("book_id") + "</td>");
			out.println("<td>" + resultSet.getString("bookname") + "</td>");
			
			out.println("</tr>");
		}
		out.println("</table>");
	} catch (SQLException e) {
		System.out.println(e);
	}
}
}