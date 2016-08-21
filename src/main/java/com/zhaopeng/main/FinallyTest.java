package com.zhaopeng.main;

public class FinallyTest {

	public static void main(String args[]) {

		FinallyTest ft = new FinallyTest();
		System.out.println("test out is "+ft.test3());

	}

	public int test1() {

		int i = 1;
		try {
			return i;
		} finally {
			i=i++;
		}

	}

	public User test2() {
		 User u=new User("王");
		
	     try{
	    	
	    	
	    	 
	    	 return u;
	     }finally{
	    	 
	    	// u=new User("宋");
	    	u.setName("宋");
	     }

	}
	
	public String test3() {
		
		String msg="aa";
	     try{
	    	
	    	
	    	 
	    	 return msg;
	     }finally{
	    	 
	    	 msg="bb";
	     }

	}

}

class User{
	private String name;

	
	
	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}



