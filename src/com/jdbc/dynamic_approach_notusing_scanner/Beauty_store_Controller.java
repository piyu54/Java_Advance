package com.jdbc.dynamic_approach_notusing_scanner;

import java.util.Scanner;


public class Beauty_store_Controller {

	public static void main(String[] args) throws Exception {
		Beauty_store_Service s = new Beauty_store_Service();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("-----------BEAUTY STORE MENU------------");
            System.out.println("1. Insert Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    s.Insertproductdata();
                    break;

                case 2:
                    s.fetchproductdata();
                    break;

                case 3:
                    s.updateproductdata();
                    break;

                case 4:
                    s.deleteproductdata();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }	
	
}
