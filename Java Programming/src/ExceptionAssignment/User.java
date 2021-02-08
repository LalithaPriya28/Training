package ExceptionAssignment;



class User{
	void CheckAge(int age) throws AgeException{
		
	 if(age<18) {
		 throw new AgeException("You cannot vote");
	}
	 else
		System.out.println("You are eligible to vote");
	}
}
