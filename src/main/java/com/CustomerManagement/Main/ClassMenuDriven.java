package com.CustomerManagement.Main;

import java.util.Scanner;

import com.CustomerManagement.Data.ClassDataUpdating;
import com.CustomerManagement.Operation.ClassAscendingOrder;
import com.CustomerManagement.Operation.ClassUpdCustAmt;

public class ClassMenuDriven {
	public void custMenuDriven() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Option.");
		System.out.println("1.Display All Customer name in Ascending order.");
		System.out.println("2.Update the Amount of Customer by using ID.");
		System.out.println("3.Exit.");
		
		int option =sc.nextInt();
		
		switch(option) 
		{
		case 1:
			System.out.println("The Data of all Customer in Ascending order of there Name.");
			ClassAscendingOrder clAs=new ClassAscendingOrder();
			clAs.ascendingOrder(new ClassDataUpdating().getCustDList());
			custMenuDriven();
			break;
			
		case 2:
			System.out.println("Updating the Amount of the Customer.");
			try 
			{
				new ClassUpdCustAmt().updateCustAmt(new ClassDataUpdating().getCustDList());
			} 
			
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
				custMenuDriven();
			break;
		
			
		case 3:
			System.out.println("Thank You For Using.");
			System.exit(0);
			break;
			
		default:
			System.out.println("Please Enter the Options from above list.");
			custMenuDriven();
			break;
		}
		sc.close();
	}
}
