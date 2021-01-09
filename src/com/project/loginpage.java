package com.project;

import java.io.IOException; 
import java.io.PrintWriter;
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
 * Servlet implementation class loginpage
 */
@WebServlet("/loginpage")
public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginpage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     
		 try{  
			 Class.forName("com.mysql.jdbc.Driver");  
			 Connection conn=DriverManager.getConnection(  
			 "jdbc:mysql://localhost:3306/booking","root","temesgen");  
		
			 Statement stmt=  conn.createStatement();
		 String insert="insert into login values ('abc',123)";
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
	
		   String username=request.getParameter("username");
		   String password=request.getParameter("password");
	      // response.getWriter().append("Welcome to regesteration page please enter the followong !");
	     response.sendRedirect("/Airlineproject/Regi.html");

	 
	
	}

	}

