package classesNobjects;
import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
	
	/*Create a Custom Class (anything you want - car, phone, holiday, etc.).
	 * Requirements:
	 * 
	 * Minimum 3 private instance variables
	 * An empty constructor
	 * A constructor that uses only 2 of your 3 variables
	 * A constructor that uses all 3 of your instance variables
	 * Get methods for all 3 of your instance variables
	 * Set methods for all 3 of your instance variables
	 * A method that returns a Boolean
	 * A method that returns a String
	 * 
	 * For example, if I created a Santa Custom Class, my code would 
	 * look something like the attached Santa.java file.*/	
	ArrayList<Integer> numbersToMessage = new ArrayList<Integer>();
	private int phoneNumber = 000_000_0000;
	private String text = "";
	private boolean hasApp = false;
	Scanner info = new Scanner(System.in);
	 int number2 = 0;
	  int number3 = 0;
	  int number4 = 0;
	  int number5 = 0;
	  int number6 = 0;
	  int number7 = 0;
	  int number8 = 0;
	  int number9 = 0;
	
	//default constructor
	public Phone() {
		int number = 0; 
		String message = "";
		boolean appsInphone = true;
		phoneNumber = number;
		text = message;
		hasApp = appsInphone;
		
	}
	public Phone(int number, String message) {
		phoneNumber = number;
		text = message;
	}
	public Phone(int number, String message, boolean appsInphone) {
		phoneNumber = number;
		text = message;
		hasApp = appsInphone;
	}
	/*Create a Custom Class (anything you want - car, phone, holiday, etc.).
	 * Requirements:
	 * 
	 * Minimum 3 private instance variables
	 * An empty constructor
	 * A constructor that uses only 2 of your 3 variables
	 * A constructor that uses all 3 of your instance variables
	 * Get methods for all 3 of your instance variables
	 * Set methods for all 3 of your instance variables
	 * A method that returns a Boolean
	 * A method that returns a String
	 * 
	 * For example, if I created a Santa Custom Class, my code would 
	 * look something like the attached Santa.java file.*/	
	public int getNumber() {
		setNumber();
	   	return phoneNumber;
	}
	public int setNumber() {
		for(int number = 0; number <= 1000000000; number++) {
			boolean isTaken = true;
			while(isTaken == true) {
				Integer.compareUnsigned(number, (int) phoneNumber);
				number++;
				if(isTaken == false) {
					phoneNumber = number;
					break;
				}
			}
		}
		return phoneNumber;
	}//end of setNumber method
	
	public String getMessage() {
	   	return text;
	}
	public void setMessage() {
		System.out.println("What's your number?");
		phoneNumber = Integer.parseInt(info.nextLine());
		System.out.println("How many people are you messaging?");
		int people = Integer.parseInt(info.nextLine());
		//added here so I can use them later	
		  numbersToMessage.add(phoneNumber);
		  numbersToMessage.add(number2);
		  numbersToMessage.add(number3);
		  numbersToMessage.add(number4);
		  numbersToMessage.add(number5);
		  numbersToMessage.add(number6);
		  numbersToMessage.add(number7);
		  numbersToMessage.add(number8);
		  numbersToMessage.add(number9);
		  
		switch(people) {
		    case 1:
		    	System.out.println("What's the number you want to send the message to?");
				number2 = Integer.parseInt(info.nextLine());
				break;
		    case 2:
		    	System.out.println("What's the number you want to send the message to?");
				number2 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number3 = Integer.parseInt(info.nextLine());
				break;
		    case 3:
		    	System.out.println("What's the number you want to send the message to?");
				number2 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number3 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number4 = Integer.parseInt(info.nextLine());
				break;
		    case 4:
		    	System.out.println("What's the number you want to send the message to?");
				number2 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number3 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number4 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number5 = Integer.parseInt(info.nextLine());
				break;
		    case 5:
		    	System.out.println("What's the number you want to send the message to?");
				number2 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number3 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number4 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number5 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number6 = Integer.parseInt(info.nextLine());
				break;
		    case 6:
		    	System.out.println("What's the number you want to send the message to?");
				number2 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number3 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number4 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number5 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number6 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number7 = Integer.parseInt(info.nextLine());
				break;
		    case 7:
		    	System.out.println("What's the number you want to send the message to?");
				number2 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number3 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number4 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number5 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number6 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number7 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number8 = Integer.parseInt(info.nextLine());
				break;
		    case 8:
		    	System.out.println("What's the number you want to send the message to?");
				number2 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number3 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number4 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number5 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number6 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number7 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number8 = Integer.parseInt(info.nextLine());
				System.out.println("What's the number you want to send the message to?");
				number9 = Integer.parseInt(info.nextLine());
				break;
			default:
				System.out.println("No more than 8 people per messaging");
				break;
		}//end of switch statement
	  System.out.println("What's the message?");
	  text = info.nextLine();
	  System.out.println("Are ypu ready to send?");
	  boolean sendMessage = Boolean.getBoolean(info.nextLine());
	  if(sendMessage == true) {
		  System.out.println("Message sent");
	  } 
	  int resendLoop = 0;
	  while(sendMessage == false && resendLoop == 0) {
		  System.out.println("Message failed to send..Resend it?");
		  boolean resendText = Boolean.getBoolean(info.nextLine());
		  if(resendText == true) {
			  System.out.println("Message sent" + numbersToMessage);
			  break;
		  }
		  resendLoop++;
	  }//end of while loop
	}//end of setMessage method
	
	public boolean getApp() {
		setApp();
	   	return hasApp;
	}
	public boolean setApp() {
		for(int number = 0; number < numbersToMessage.size(); number++) {
			boolean hasApp = true;
			while(hasApp == true) {
				System.out.println("The app is installed");
				number++;
				if(hasApp == false) {
					System.out.println("You don't have the app");
					break;
				}
			}
		}
		return hasApp;
	}//end of setNumber method
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone = new Phone();
		
		myPhone.setNumber();
		myPhone.getNumber();
		
		myPhone.setMessage();
		myPhone.getMessage();
		
		myPhone.setApp();
		myPhone.getApp();
	}

}
