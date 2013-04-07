/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author Lucas
 */
import Main.Test1;
import Main.Test1Remote;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author Lucas
 */
@WebServlet(urlPatterns = {"/TestEJB"})
public class TestEJB extends HttpServlet {
    @EJB
    private Test1Remote test1;
   
    
    


    @Override
    protected void doGet(HttpServletRequest request, 
	HttpServletResponse response) throws ServletException,
	IOException {
	         response.setContentType("text/html;charset=UTF-8");
                 PrintWriter out = response.getWriter();
                 out.println("<html>");
                 out.println("<head>");
                 out.println("<title>Servlet TestServlet</title>");
                 out.println("</head>");
                 out.println("<body>");
                 out.println(test1.getNome("Lucas"));
                 out.println("</body>");
                 out.println("</html>");
         	 }
}
