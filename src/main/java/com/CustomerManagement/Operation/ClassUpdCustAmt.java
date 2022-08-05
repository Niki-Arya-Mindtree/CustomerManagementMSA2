package com.CustomerManagement.Operation;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.CustomerManagement.Data.ClassStGtMet;
import com.CustomerManagement.Interface.InterUpdCustAmt;


public class ClassUpdCustAmt  implements InterUpdCustAmt  {

	@Override
	public void updateCustAmt(List<ClassStGtMet> custDList) throws Exception  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int IDnew=sc.nextInt();
		int count=0;
		ClassStGtMet oneData=null;
		for(int i=0;i<custDList.size();i++)
			if(IDnew == custDList.get(i).getId())
			{
				count++;
				oneData = custDList.get(i);
			}
		if(count==0)
			throw new Exception("Invalid id provided");
		else
		{
			System.out.println("Enter the Amount to be updated.");
			int Salarynew =sc.nextInt();
			oneData.setAmount(Salarynew);
			System.out.println("Details of the Customer--");
			System.out.println(String.format("%5s","CUST ID")+" "+String.format("%5s","CUST Name")+" "+String.format("%5s","CUST Age")+" "+String.format("%5s","CUST Amount"));
			System.out.println(String.format("%4d",oneData.getId())+"   "+String.format("%-10s", oneData.getName())+" "+String.format("%-8d",oneData.getAge())+" "+String.format("%-8d",oneData.getAmount()));
			System.out.println("Data Updated");
		}
		
	}
	
}
