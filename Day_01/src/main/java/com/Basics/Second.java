package com.Basics;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second.cdac")
public class Second extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		String date1 = request.getParameter("d1").toString();
		String date2 = request.getParameter("d2").toString();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		StringTokenizer stz1 = new StringTokenizer(date1,"-");
		StringTokenizer stz2 = new StringTokenizer(date2,"-");
		
		int dy1 = Integer.parseInt(stz1.nextToken());
		int dm1 = Integer.parseInt(stz1.nextToken());
		int dd1 = Integer.parseInt(stz1.nextToken());
		out.write(dd1+"/"+dm1+"/"+dy1);
		out.write("<br>");
		int dy2 = Integer.parseInt(stz2.nextToken());
		int dm2= Integer.parseInt(stz2.nextToken());
		int dd2 = Integer.parseInt(stz2.nextToken());
		out.write(dd2+"/"+dm2+"/"+dy2);
		out.write("<br>");
		out.write("Difference is : ");
		Period diff = Period.between(LocalDate.of(dy1,dm1,dd1), LocalDate.of(dy2,dm2,dd2));
		
		out.write((diff).getYears()+" "+"years"+" ");
		out.write((diff).getMonths()+" "+"months"+" ");
		out.write((diff).getDays()+" "+"days"+" ");
		
		}catch(NoSuchElementException e) {
			PrintWriter out = response.getWriter();
			out.write("Date field can't be empty...");
		}
			
	}
}