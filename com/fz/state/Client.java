package com.fz.state;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.request(new FreeState());//空闲状态
		context.request(new BookedState());//预定状态
		context.request(new CheckedInState());//已入住
		
	}
}
