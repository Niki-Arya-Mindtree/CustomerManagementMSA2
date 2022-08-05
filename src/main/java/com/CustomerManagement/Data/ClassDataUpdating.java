package com.CustomerManagement.Data;

import java.util.*;
import java.util.List;



public class ClassDataUpdating {
	
	static List<ClassStGtMet> custDList = new ArrayList<>();
	static 
	{
		int IdArr[]= {0,1,2,3,4,5,6,7,8,9};
		String NameArr[]= {"Nikhil","Abhi","Teja","Mahesh","Raga","Rakshith","Yeshanth","Cheathan","Ravi","Neeraj"};
		int ageArr[]= {24,24,23,25,23,24,22,23,21,23};
		int AmountArr[]= {2000,600,1000,5000,630,7800,2800,2100,2400,210};
		
		for(int i=0;i<IdArr.length;i++)
			custDList.add(new ClassStGtMet(IdArr[i], NameArr[i], ageArr[i], AmountArr[i]));
		
		System.out.println("Data Added to List");
	}
	
	public static List<ClassStGtMet> getCustDList(){return custDList;}
}
