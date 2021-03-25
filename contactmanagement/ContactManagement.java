package contactmanagement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ContactManagement {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int counter=0;
        String[] email={null}, country={null}, state={null}, streetAddress={null}; 
        String[] gender={null};
        String[] name={null};
        String[] phoneNum={null}, physicalAddress={null};
        Date[] dob={null};
        PersonalDetails myObj = new PersonalDetails();
        Scanner input= new Scanner(System.in);
        boolean islooping =true;
		
        while(islooping==true){
            
            System.out.println("Please enter your full name");
            name[counter]=input.nextLine();
            
            System.out.println("Please enter your gender(M for male or F for female)");
            myObj.setGender(input.nextLine());
            gender[counter]=myObj.getGender();
        
        	System.out.println("Please enter your date of birth(dd/MM/yyyy): ");
        	myObj.setDob(input.nextLine());
            dob[counter] = myObj.getDob();
                
            System.out.println("Please enter your country of origin");
            myObj.setCountry(input.nextLine());
           	country[counter] = myObj.getCountry();
            		
            System.out.println("Please enter your state");
            myObj.setState(input.nextLine());
            state[counter]=myObj.getState();
            
            System.out.println("Please enter your street address");
            myObj.setStreetAddress(input.nextLine());
            streetAddress[counter]=myObj.getStreetAddress();
            
            physicalAddress[counter]=country[counter]+", "+state[counter]+", "+streetAddress[counter];
            
            System.out.println("Please enter your cellphone number: ");
            
            myObj.setPhoneNum(input.nextLine());
            phoneNum[counter]=myObj.getPhoneNum();
            
            System.out.println("do you have an alternative number? (YES OR NO): ");
            String response=input.nextLine();
            /*   
            switch(response){
                case "YES":
	                System.out.println("Enter your office number(Press enter if you do not have a office number) ");
	            	myObj.setPhoneNum(input.nextLine());
	                String officeNum = myObj.getPhoneNum();
	                
	                System.out.println("Enter your home number(Press enter if you do not have a home number) ");
	                myObj.setPhoneNum(input.nextLine());
	                String homeNum = myObj.getPhoneNum();
	                phoneNum[counter] = "M " + phoneNum[counter] + " (H)" + officeNum + " (O)" + homeNum;
                	break;
                case "yes":
	                System.out.println("Enter your office number(Press enter if you do not have a office number) ");
	            	myObj.setPhoneNum(input.nextLine());
	                String officeNum = myObj.getPhoneNum();
	                
	                System.out.println("Enter your home number(Press enter if you do not have a home number) ");
	                myObj.setPhoneNum(input.nextLine());
	                String homeNum = myObj.getPhoneNum();
	                phoneNum[counter] = "M " + phoneNum[counter] + " (H)" + officeNum + " (O)" + homeNum;
	                break;
                default:
                    break;
            }
            */
            if (response=="Yes" || response=="yes"|| response=="YES") {
            	System.out.println("Enter your office number(Press enter if you do not have a office number) ");
            	myObj.setPhoneNum(input.nextLine());
                String officeNum = myObj.getPhoneNum();
                
                System.out.println("Enter your home number(Press enter if you do not have a home number) ");
                myObj.setPhoneNum(input.nextLine());
                String homeNum = myObj.getPhoneNum();
                phoneNum[counter] = "M " + phoneNum[counter] + " (H)" + officeNum + " (O)" + homeNum;
			}
            
            
            System.out.println("Please enter your email address: ");
            myObj.setEmail(input.nextLine());
            email[counter]=myObj.getEmail();
            
            System.out.println("do you have an alternative email address? (YES OR NO):");
            response=input.nextLine();
            /*   
            switch(response){
                case "YES":
                    System.out.println("Enter your alternative email address: ");
                    myObj.setEmail(input.nextLine());
                    email[counter]=email[counter]+", "+myObj.getEmail();
                    break;
                case "yes":
                    System.out.println("Enter your alternative email address: ");
                    eSystem.out.println("Enter your alternative email address: ");
                    myObj.setEmail(input.nextLine());
                    email[counter]=email[counter]+", "+myObj.getEmail();
                    break;
                default:
                    break;
            }
            */
            if (response=="Yes" || response=="yes"|| response=="YES") {
            	System.out.println("Enter your alternative email address: ");
            	myObj.setEmail(input.nextLine());
                email[counter]=email[counter]+", "+myObj.getEmail();
            }
            
            
            System.out.println("Do wish to continue (true or false)");
            islooping=input.nextBoolean();
            
            counter++; 
        }
        
        for (int i = 0; i <= counter-1; i++) {    
            myObj.RetrieveDetails(email[i], country[i], state[i], streetAddress[i], gender[i], name[i], phoneNum[i], dob[i]);
        }
            
            
	}
		
}	

	
