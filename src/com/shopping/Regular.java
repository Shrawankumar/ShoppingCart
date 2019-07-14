package com.shopping;

import java.util.ArrayList;
import java.util.List;

public class Regular implements CustomerType {

	@Override
	public List<DiscountRange> getDiscountRate() {
		// TODO Auto-generated method stub
		
		List<DiscountRange>  list= new ArrayList<DiscountRange>();
		list.add(new DiscountRange(5000, 0));
		list.add(new DiscountRange(10000, 10));
		list.add(new DiscountRange(Integer.MAX_VALUE, 20));
		return list;
	}

}
