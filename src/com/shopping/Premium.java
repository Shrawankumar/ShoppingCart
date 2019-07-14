package com.shopping;

import java.util.ArrayList;
import java.util.List;

public class Premium  implements CustomerType{

	@Override
	public List<DiscountRange> getDiscountRate() {
		// TODO Auto-generated method stub
		
		
		List<DiscountRange>  list= new ArrayList<DiscountRange>();
		list.add(new DiscountRange(4000, 10));
		list.add(new DiscountRange(8000, 15));
		list.add(new DiscountRange(12000, 20));
		list.add(new DiscountRange(Integer.MAX_VALUE, 30));
		return list;
	}

	

}
