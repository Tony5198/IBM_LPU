package in.ibm.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Person {

	private String name= "Aayush Sharma";
	private int age =22;
	private boolean isProgrammer = true;
	private Address address;
	
	
	
}
