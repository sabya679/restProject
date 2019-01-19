package com.nikky.restDemo;

import java.util.ArrayList;
import java.util.List;

public class FriendRepository {

	List<Friend> friends;
	
	public FriendRepository() {
		friends = new ArrayList<>();
		
		Friend f1 = new Friend();
		f1.setName("Sabyasachi");
		f1.setNumber("7205193959");
		f1.setAddress("Megapolis");
		
		Friend f2 = new Friend();
		f2.setId(1);
		f2.setNumber("000000000");
		f2.setAddress("Bhosdi");
		f2.setName("Nikky");
		
		friends.add(f1);
		friends.add(f2);
	}
	
	public List<Friend> getFriends(){
		return friends;
	}
	
	public Friend getFriend(int id) {
		for(Friend f: friends) {
			if(f.getId()==id) {
				return f;
			}
		}
		
		return null;
	}
}
