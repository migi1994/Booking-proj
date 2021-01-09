package com.project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		 try{  
			 Class.forName("com.mysql.jdbc.Driver");  
			 Connection conn=DriverManager.getConnection(  
			 "jdbc:mysql://localhost:3306/booking","root","temesgen");  
		
			 Statement stmt=  conn.createStatement();
		 String insert="insert into register values ('unitedkingdom','Egypt',1,2020/12/5,2021/1/4)";
		  int count= stmt.executeUpdate(insert); //
		  System.out.println(count +" record inserted in database");
		 
		
		
		  } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();          
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
	
	
		//   String Roundtrip=request.getParameter("Round trip");
		  // String Onetrip=request.getParameter("One trip");
		   //String From =request.getParameter(" From");
		   //String To =request.getParameter("To");
		   //String NumberofPassenger=request.getParameter("Number of Passenger");
		   //String Depart=request.getParameter("Depart");
		   //String Return=request.getParameter("Return");
	     //  response.getWriter().append("<h1>Welcome to regesteration page please enter the followong !</h1>");
	       response.sendRedirect("/Airlineproject/option.html");
}

	
}