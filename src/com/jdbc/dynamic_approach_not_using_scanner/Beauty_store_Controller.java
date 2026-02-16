package com.jdbc.dynamic_approach_not_using_scanner;

public class Beauty_store_Controller {

	public static void main(String[] args) throws Exception {
		//
		Beauty_store_Dao b= new Beauty_store_Dao();
//		b.insertProduct();
//		b.updateProduct();
//		b.deleteProduct();
		b.fetchproduct();
	}
}
