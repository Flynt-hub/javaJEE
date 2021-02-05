package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cstes;
import model.Customer;

/**
 * Servlet implementation class Customers
 */
@WebServlet("/Customers")
public class Customers extends HttpServlet {
	private static final long   serialVersionUID = 1L;
	private final String 	    mCustomersPage 	   = "/WEB-INF/Customers.jsp" ;
    private ArrayList<Customer> mCustomerList ;
    private int 				mCustomerIncrement ;
    private boolean 			mCustomerExist ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customers() 
    {
        super();
        this.mCustomerList 		= new ArrayList<Customer>() ;
        this.mCustomerIncrement = 0 ;
        this.mCustomerExist 	= false ;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher lDispatcher = getServletContext().getRequestDispatcher( mCustomersPage ) ;
		if(this.mCustomerExist)
		{
			request.setAttribute( "LastCustomer", this.mCustomerList.get( this.mCustomerList.size() - 1 ) ) ;
		}
		request.setAttribute( "CustomerExist", this.mCustomerExist ) ;
		request.setAttribute( "CityList", Cstes.maListeDeVille ) ;
		request.setAttribute( "CityListLength", Cstes.maListeDeVille.length - 1 ) ;
		response.getWriter().append("Served at: ").append( request.getContextPath() ) ;
		lDispatcher.forward( request, response ) ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		Customer lCustomer = new Customer(
				this.mCustomerIncrement,
				request.getParameter("nomClient"),
				request.getParameter("prenomClient"),
				request.getParameter("adresseClient1"),
				request.getParameter("adresseClient2"),
				request.getParameter("cpClient"),
				request.getParameter("villeClient"),
				request.getParameter("telephoneClient"),
				request.getParameter("emailClient")
				) ;
		request.setAttribute("LastCustomer", lCustomer);
		//this.mCustomerList.add(lCustomer) ;
		this.mCustomerExist = true ;
		request.setAttribute( "CustomerExist", this.mCustomerExist ) ;
		request.setAttribute( "CityList", Cstes.maListeDeVille ) ;
		//request.setAttribute( "CityListLength", Cstes.maListeDeVille.length - 1 ) ;
		RequestDispatcher lDispatcher = getServletContext().getRequestDispatcher( mCustomersPage ) ;
		response.getWriter().append("Served at: ").append( request.getContextPath() ) ;
		lDispatcher.forward( request, response ) ;
/*
		RequestDispatcher lDispatcher = getServletContext().getRequestDispatcher( mCustomersPage ) ;
		if( request.getParameter("commande") != null )
		{
			goToOrderPage(request, response) ;
		}
		
		request.setAttribute( "CustomerExist", this.mCustomerExist ) ;
		request.setAttribute( "CityList", Cstes.maListeDeVille ) ;
		request.setAttribute( "CityListLength", Cstes.maListeDeVille.length - 1 ) ;
		request.setAttribute( "LastCustomer", this.mCustomerList.get( this.mCustomerList.size() - 1 ) ) ;
		this.mCustomerIncrement++ ;		
		lDispatcher.forward( request, response ) ;
*/
	}
	protected void goToOrderPage(HttpServletRequest pRequest, HttpServletResponse pResponse) throws ServletException, IOException
	{
		String 			  lOrderPage  = "/WEB-INF/Orders.jsp" ;		
		RequestDispatcher lDispatcher = getServletContext().getRequestDispatcher( lOrderPage ) ;
		
		pRequest.setAttribute("CustomerList", this.mCustomerList) ;
		
		lDispatcher.forward(pRequest, pResponse);
	}

}
