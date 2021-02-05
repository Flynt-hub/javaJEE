package model;

import java.util.ArrayList;

public class Customer 
{
	private int mNumber ;
	private String mName ;
	private String mSurname ;
	private String mAddress1 ;
	private String mAddress2 ;
	private String mZipCode ;
	private String mCity ;
	private String mPhone ;
	private String mEmail ;
	private ArrayList<Order> mOrdersList ;
	
	public Customer(int pNumber, String pName, String pSurname, String pAddress1, String pAddress2, String pZipCode, String pCity, String pPhone, String pEmail)
	{
		this.mNumber   = pNumber ;
		this.mName 	   = pName ;
		this.mSurname  = pSurname ;
		this.mAddress1 = pAddress1 ;
		this.mAddress2 = pAddress2 ;
		this.mZipCode  = pZipCode ;
		this.mCity 	   = pCity ;
		this.mPhone    = pPhone ;
		this.mEmail	   = pEmail ;
	}
	public int getNumber() 				   {return this.mNumber ;}
	public String getName() 			   {return this.mName ;}
	public String getSurname() 			   {return this.mSurname ;}
	public String getFirstAddress()		   {return this.mAddress1 ;}
	public String getSecondAddress()	   {return this.mAddress2 ;}
	public String getZipCode() 		 	   {return this.mZipCode ;}
	public String getCity() 		 	   {return this.mCity ;}
	public String getPhone() 		 	   {return this.mPhone ;}
	public String getEmail()			   {return this.mEmail ;}
	public ArrayList<Order> getOrderList() {return this.mOrdersList ;}
	
	public void AddNewOrder(Order pOrder)
	{
		this.mOrdersList.add(pOrder) ;
	}
}
