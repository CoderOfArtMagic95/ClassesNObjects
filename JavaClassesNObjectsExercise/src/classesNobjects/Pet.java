package classesNobjects;

import java.util.Scanner;

public class Pet {
   //start back on Custom java instuctions on this exercise
	Scanner getInfo = new Scanner(System.in); 
	
	private String Name;
	private String Name2;
	
	private int Age;
	private int Age2;
	
	private String Location;
	private String Location2;
	
	private String Type;
	private String Type2;
	//default constructor
	public Pet() {
		String name = "";
		int age = 0;
		String location = "";
		String type = "";
		
		Name = name;
		Age = age;
		Location = location;
		Type = type;
	}
	//method overloasd constructor
	public Pet(String name, int age, String location, String breed) {
		Name2 = name;
		Age2 = age;
		Location2 = location;
		Type2 = breed;
	}
	
	public String getName() {
		
		return Name;
	}
    public int getAge() {
		
		return Age;
	}
    public void setType() throws Exception {
    	 System.out.println("What's your type of pet do you have?");
         Type = getInfo.nextLine();
         System.out.println("Do you have another pet, if so what type are they?");
         Type2 = getInfo.nextLine();
         if(Type == "" || Type == null) {
        	 throw new Exception("Please input at least 1 pet type");
         }
         else if(Type2 == "" || Type2 == null) {
        	 Type2 = "None";
         }
        
	}
	public void setName() throws Exception {
		System.out.println("What's your pet's name");
		Name = getInfo.nextLine();
		System.out.println("What's your 2nd pet's name");
		Name2 = getInfo.nextLine();
		if(Name == "" || Name == null) {
       	throw new Exception("Please input at least 1 pet");
        }
		else if(Name2 == ""|| Name2 == null) {
        	 Name2 = "No pet";
         }
	}
	
	public void setAge() throws Exception {
		System.out.println("How old is your pet?");
		String age = getInfo.nextLine();
		System.out.println("How old is your 2nd pet?");
	    String age2 = getInfo.nextLine();
		if(age == null || age == "") {
       	 throw new Exception("Please put in your pet's age");
        } 
		else if(age2 == "" || age2 == null) {
        	 age2 = "0";
         }
		 Age = Integer.parseInt(age);
		 Age2 = Integer.parseInt(age2);
	}
	public void setLocation() throws Exception { 
		System.out.println("And your address?");
		Location = getInfo.nextLine();
		System.out.println("And your address?");
		Location2 = getInfo.nextLine();
		if(Location == "" || Location == null) {
			throw new Exception("Please input your address!");
		}
		else if(Location2 == "" || Location2 == null) {
			Location2 = "None";
		}
		getInfo.close();
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        //object made with default constructor
		Pet fido = new Pet();  
        /* String name ="";
        int age = 0;
        String location =""; */
        
        fido.setName();
        fido.setAge();
        fido.setType();
        fido.setLocation();
        
        //info from first constructor
        System.out.println();
        System.out.println("Pet Info 1");
        System.out.println("Pet #1's Name: " + fido.getName());
        System.out.println("Pet #1's Age: " + fido.getAge());
        System.out.println("Pet #1's Species: " + fido.Type);
        System.out.println("Pet #1's Address: "+ fido.Location);
        
        String name ="";
        int age = 0;
        String location ="";
        String type = "";
        
        //uses first constructor and set methods to reset the info for another pet
        Pet chika = new Pet(fido.Name2,fido.Age2,fido.Location2,fido.Type2);
        		
        name = chika.Name2;
        age = chika.Age2;
        location = chika.Location2;
      
        System.out.println();
        System.out.println("Pet Info 2");
        System.out.println("Pet #2's Name: " + name);
        System.out.println("Pet #2's Age: " + age);
        System.out.println("Pet #2's Species: " + chika.Type2);
        System.out.println("Pet #2's Address: " + location);
        
	}

}
