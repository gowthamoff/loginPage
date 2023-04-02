package server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			int check;
				String Name=request.getParameter("name");
				String Email=request.getParameter("email");
				String Password=request.getParameter("password");
				 
				
				Customer customer=new Customer();
				customer.setName(Name);
				customer.setEmail(Email);
				customer.setPassword(Password); 
				check=DBcrud.insert(customer);
				
				
				if(check!=0)
				{
					RequestDispatcher re=request.getRequestDispatcher("Success.html");
					re.forward(request,response);
					
				}
				else
				{

					RequestDispatcher re=(RequestDispatcher) request.getRequestDispatcher("Fail.html");
					re.include(request,response);
				}
				
				
				
			}

	

}
