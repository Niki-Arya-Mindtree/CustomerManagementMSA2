package com.CustomerManagement.Main;


import com.CustomerManagement.Data.ClassDataUpdating;
import com.CustomerManagement.Operation.ClassAscendingOrder;
import com.CustomerManagement.Operation.ClassUpdCustAmt;

public class ClassMain {
	public static void main(String[] args) {
//		ClassAscendingOrder clAs=new ClassAscendingOrder();
//		clAs.ascendingOrder(new ClassDataUpdating().getCustDList());
//		try {
//			new ClassUpdCustAmt().updateCustAmt(new ClassDataUpdating().getCustDList());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		new ClassMenuDriven().custMenuDriven();
	}
}
