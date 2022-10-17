package com.xworkz.primeminister.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3,urlPatterns = "/pm")
public class PrimeministerServlet extends HttpServlet {

	public PrimeministerServlet() {
		System.out.println("calling defult constructor");
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		System.out.println("Calling doPost Method");
		resp.setContentType("text/html");
		String name = req.getParameter("pName");
		String country = req.getParameter("country");
		String mStatus = req.getParameter("status");
		String party = req.getParameter("party");
		String age = req.getParameter("age");
		String gender = req.getParameter("gender");
		String periodOfTime = req.getParameter("ptime");
		String times = req.getParameter("times");

		System.out.println(name);
		System.out.println(country);
		System.out.println(mStatus);
		System.out.println(party);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(periodOfTime);
		System.out.println(times);

		req.setAttribute("nm", name);
		req.setAttribute("country",country);
		req.setAttribute("marrige", mStatus);
		req.setAttribute("party", party);
		req.setAttribute("age", age);
		req.setAttribute("gender", gender);
		req.setAttribute("pot", periodOfTime);
		req.setAttribute("times", times);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/Success.jsp");
		dispatcher.forward(req, resp);
	}

}
