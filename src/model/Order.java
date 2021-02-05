package model;

public class Order 
{
	private int    mStatementNumber ;
	private int    mStatementDate ;
	private double mStatementValue ;
	private String mPaymentMethod ;
	private String mPaymentStatus ;
	private String mDeliveryMethod ;
	private String mDeliveryMethodStatus ;
	
	public Order(int pStatementNumber, int pStatementDate, double pStatementValue, String pPaymentMethod, String pPaymentStatus, String pDeliveryMethod, String pDeliveryMethodStatus)
	{
		this.mStatementNumber 	   = pStatementNumber ;
		this.mStatementDate 	   = pStatementDate ;
		this.mStatementValue 	   = pStatementValue ;
		this.mPaymentMethod 	   = pPaymentMethod ;
		this.mPaymentStatus 	   = pPaymentStatus ;
		this.mDeliveryMethod 	   = pDeliveryMethod ;
		this.mDeliveryMethodStatus = pDeliveryMethodStatus ;
	}
	public int getStatementNumber() 		{return this.mStatementNumber ;}
	public int getStatementDate() 			{return this.mStatementDate ;}
	public double getStatementStatus() 		{return this.mStatementValue ;}
	public String getPaymentMethod() 		{return this.mPaymentMethod ;}
	public String getPaymentStatus() 		{return this.mPaymentStatus ;}
	public String getDeliveryMethod() 		{return this.mDeliveryMethod ;}
	public String getDeliveryMethodStatus() {return this.mDeliveryMethodStatus ;}
}
