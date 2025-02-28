package com.hw1.run;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.dto.Friend;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Friend> futaba = new ArrayList<Friend>();
		
		futaba.add(new Friend("짱구"));
		futaba.add(new Friend("철수"));
		futaba.add(new Friend("훈이"));
		futaba.add(new Friend("맹구"));
		futaba.add(new Friend("유리"));
		int index = (int)(Math.random() * 5);
		futaba.get(index).pickLeader();
		
	}

}
