package com.CustomerManagement.Operation;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.CustomerManagement.Data.ClassStGtMet;
import com.CustomerManagement.Interface.InterAscendingOrder;

public class ClassAscendingOrder implements Comparator<ClassStGtMet>,InterAscendingOrder{

	@Override
	public void ascendingOrder( List<ClassStGtMet> custDList) {
		// TODO Auto-generated method stub
		Collections.sort(custDList, new ClassAscendingOrder());
		for(int i=0;i<custDList.size();i++)
			System.out.println(String.format("%4d",custDList.get(i).getId())+"   "+String.format("%-10s", custDList.get(i).getName())+" "+String.format("%-8d",custDList.get(i).getAge())+" "+String.format("%-8d",custDList.get(i).getAmount()));
	}
	
	@Override
	public int compare(ClassStGtMet o1, ClassStGtMet o2) {
		// TODO Auto-generated method stub
		if(o1.getName().equals(o2.getName()))
			return 0;
		else if(o1.getName().compareTo(o2.getName())>0)
			return 1;
		else 
			return-1;
	}
	

	

	
	
	
}
