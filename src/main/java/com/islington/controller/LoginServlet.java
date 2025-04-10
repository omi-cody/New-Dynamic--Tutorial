package com.islington.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.islington.util.RedirectionalUtil;
import com.islington.util.ValidationUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(asyncSupported = true, urlPatterns = {"/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final ValidationUtil validationUtil;
	private final RedirectionalUtil redirectionUtil;
	private final String rootURL = "WEB-INF/pages";
	private final String loginURL = rootURL+"/login";
	private final String homeURL = rootURL+"/home";
	
	public LoginServlet(ValidationUtil validationUtil, RedirectionalUtil redirectionUtil) {
		this.validationUtil = validationUtil;
		this.redirectionUtil = redirectionUtil;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher(loginURL).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		if (validationUtil.isNullOrEmpty("username") || validationUtil.isNullOrEmpty("password")) {
			redirectionUtil.setMsgAndRedirect(req, resp, "error", "Please fill all the fields!", loginURL);
		} else {
			if (username.equals("admin") && password.equals("admin")) {
				redirectionUtil.setMsgAndRedirect(req, resp, "success", "Successfully Logged In!", homeURL);
			} else {
				redirectionUtil.setMsgAndRedirect(req, resp, "error", "Either username or password is mistake!", loginURL);
			}
		}

	}
}
