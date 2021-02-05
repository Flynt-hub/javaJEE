package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Person;
/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    private final String 	  displayPage 	   = "/WEB-INF/Display.jsp" ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ArrayList< Person > lPersonList = new ArrayList< Person >() ;
		RequestDispatcher   lDispatcher = getServletContext().getRequestDispatcher( displayPage ) ;
		
		lPersonList.add( new Person( "Maurice", "DURANT" ) );
		lPersonList.add( new Person( "André", "DUPONT" ) );
		
		request.setAttribute( "Personnes", lPersonList ) ;
        
		response.getWriter().append("Served at: ").append( request.getContextPath() ) ;
		
		lDispatcher.forward( request, response ) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
