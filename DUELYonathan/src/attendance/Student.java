package attendance;

public class Student implements Attendee {
	String firstName;
	String lastName;
	private boolean ispresent = false;
	public Student(String first,String last){
		firstName = first;
		lastName = last;
	}
	
	@Override
	public boolean isPresent() {
		// TODO Auto-generated method stub
		return ispresent;
	}

	@Override
	public void setPresent(boolean present) {
		// TODO Auto-generated method stub 
	
		ispresent = present;
		
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	@Override
	public boolean mathces(String first, String last) {
		// TODO Auto-generated method stub
		if(first.toLowerCase().equals(firstName) && last.toLowerCase().equals(lastName) ) {
			return true;
		}
		return false;
	}

	@Override
	public boolean matches(String last) {
		// TODO Auto-generated method stub
		if(last.toLowerCase().equals(lastName)) {
			return true;
		}
		return false;
	}

	@Override
	public String getReportString() {
		// TODO Auto-generated method stub
		while(firstName.length()<20) {
			firstName+= " ";
		}
		while(lastName.length()<20) {
			firstName+= " ";
		}
		return firstName + lastName + ispresent;
	}
// implements attendee
}
