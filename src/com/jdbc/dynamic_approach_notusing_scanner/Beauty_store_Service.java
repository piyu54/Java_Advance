package com.jdbc.dynamic_approach_notusing_scanner;

public class Beauty_store_Service {

	
	public void Insertproductdata() throws Exception
	{
		Beauty_store_Dao b=new Beauty_store_Dao();
		b.insertProduct();
	}
	
	public void updateproductdata() throws Exception
	{
		Beauty_store_Dao b=new Beauty_store_Dao();
		b.updateProduct();
	}
	
	public void deleteproductdata() throws Exception
	{
		Beauty_store_Dao b=new Beauty_store_Dao();
		b.deleteProduct();
	}
	
	public void fetchproductdata() throws Exception
	{
		Beauty_store_Dao b=new Beauty_store_Dao();
		b.fetchproduct();
	}
}
