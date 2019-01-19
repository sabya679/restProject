package com.nikky.restDemo;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("friends")
public class FriendResource {
	
	FriendRepository repo = new FriendRepository();

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Friend> getFriends() {
				
		return repo.getFriends();
	}
	
	@GET
	@Path("friend/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getFriend(@PathParam("id") int id) {
		
		Friend friend = repo.getFriend(id);
				
		return "Name of employee is "+friend.getName()
				+", Contact number is "+ friend.getNumber()+" and he is staying at "
				+friend.getAddress();
	}
}
