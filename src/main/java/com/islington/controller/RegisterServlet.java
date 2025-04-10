package com.islington.controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Servlet implementation class RegisterServlet
 * @author Om Shankar Sah
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/register" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/pages/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userName = request.getParameter("userName");
		LocalDate birthday = LocalDate.parse(request.getParameter("dob")) ;
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String retypePassword = request.getParameter("retypePassword");
		String error =null;
		
		// 1. Name Format Validation
        if (!isValidName(firstName) || !isValidName(lastName)) {
            // Redirect to the registration page with an error message
            response.sendRedirect(request.getContextPath() + "WEB-INF/pages/register.html?error=name");
            return;
        }

        // 2. Minimum Username Length Requirement and Special Character Validation
        if (!isValidUsername(userName)) {
            // Redirect to the registration page with an error message
            response.sendRedirect(request.getContextPath() + "WEB-INF/pages/register.html?error=username");
            return;
        }

        // 3. Birthday Date Restriction
        if (birthday.isAfter(LocalDate.now())){
            // Redirect to the registration page with an error message
            response.sendRedirect(request.getContextPath() +"WEB-INF/pages/register.html?error=birthday");
            return;
        }

   

        // 5. Password Complexity Requirement and Matching Passwords
        if (!isValidPassword(password, retypePassword)) {
            // Redirect to the registration page with an error message
            response.sendRedirect(request.getContextPath() + "WEB-INF/pages/register.html?error=password");
            return;
        }

		
		
		
		
		
		}
    // Helper methods for validations
	private boolean isValidName(String name) {
        // Implement name validation logic
        return !name.matches(".*\\d.*") && !name.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }
	
	
	

    private boolean isValidUsername(String username) {
        // Implement username validation logic
        return username.length() > 6 && !username.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
    }


    private boolean isValidPassword(String password, String retypePassword) {
        // Implement password validation logic
        return password.length() > 6 && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")
                && password.matches(".*[A-Z].*") && password.equals(retypePassword);
    }

    

	}
		

