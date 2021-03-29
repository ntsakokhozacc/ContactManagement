package contactmanagement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ContactManagement {

	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	int counter=0;
        ArrayList<String> email = new ArrayList<String>();
        ArrayList<String> country = new ArrayList<String>();
        ArrayList<String> state = new ArrayList<String>();
        ArrayList<String> streetAddress = new ArrayList<String>();
        ArrayList<String> gender = new ArrayList<String>();
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> phoneNum = new ArrayList<String>();
        ArrayList<Date> dob = new ArrayList<Date>();
        //String[] email={null,null}, country={null,null}, state={null,null}, streetAddress={null,null}; 
        //String[] gender={null,null};
        //String[] name={null,null};
        //String[] phoneNum={null,null}, physicalAddress={null,null};
       // Date[] dob={null,null};
       
        PersonalDetails myObj = new PersonalDetails();
        Scanner input= new Scanner(System.in);
        boolean islooping =true;
        while(islooping==true){
            
            System.out.println("Please enter your full name");
            name.add(counter, input.nextLine());
            //name[counter]=input.nextLine();
            
            System.out.println("Please enter your gender(M for male or F for female)");
            myObj.setGender(input.nextLine());
            gender.add(counter, myObj.getGender());
            //gender[counter]=myObj.getGender();
        
            System.out.println("Please enter your date of birth(dd/MM/yyyy): ");
            myObj.setDob(input.nextLine());
            dob.add(counter, myObj.getDob());
            //dob[counter] = myObj.getDob();
                
            System.out.println("Please enter your country of origin");
            myObj.setCountry(input.nextLine());
            country.add(counter, myObj.getCountry());
            
            		
            System.out.println("Please enter your state");
            myObj.setState(input.nextLine());
            state.add(counter, myObj.getState());
            
            
            System.out.println("Please enter your street address");
            myObj.setStreetAddress(input.nextLine());
            state.add(counter, myObj.getStreetAddress());
            
            
            System.out.println("Please enter your cellphone number: ");
            
            myObj.setPhoneNum(input.nextLine());
            
            String phoneNo = myObj.getPhoneNum();
           
            
            System.out.println("do you have an alternative number? (YES OR NO): ");
            String response=input.nextLine();
            String officeNum=myObj.getPhoneNum();
            String homeNum=myObj.getPhoneNum();
            switch(response){
                case "YES":
	                System.out.println("Enter your office number(Press enter if you do not have a office number) ");
	            	myObj.setPhoneNum(input.nextLine());
	                officeNum = myObj.getPhoneNum();
	                
	                System.out.println("Enter your home number(Press enter if you do not have a home number) ");
	                myObj.setPhoneNum(input.nextLine());
	                homeNum = myObj.getPhoneNum();
                	break;
                case "yes":
	                System.out.println("Enter your office number(Press enter if you do not have a office number) ");
	            	myObj.setPhoneNum(input.nextLine());
	                officeNum = myObj.getPhoneNum();
	                
	                System.out.println("Enter your home number(Press enter if you do not have a home number) ");
	                myObj.setPhoneNum(input.nextLine());
	                homeNum = myObj.getPhoneNum();
	                break;
                default:
                    break;
            }
            phoneNum.add(counter," (M)" + phoneNo  + " (H)" + officeNum + " (O)" + homeNum);
            /*if (response=="yes") {
            	System.out.println("Enter your office number(Press enter if you do not have a office number) ");
            	myObj.setPhoneNum(input.nextLine());
                String officeNum = myObj.getPhoneNum();
            
                System.out.println("Enter your home number(Press enter if you do not have a home number) ");
                myObj.setPhoneNum(input.nextLine());
                String homeNum = myObj.getPhoneNum();
                phoneNum[counter] = "M " + phoneNum[counter] + " (H)" + officeNum + " (O)" + homeNum;
            }
            */
            
            System.out.println("Please enter your email address: ");
            myObj.setEmail(input.nextLine());
            email.add(myObj.getEmail());
            
            
            System.out.println("do you have an alternative email address? (YES OR NO):");
            response=input.nextLine();
              
            switch(response){
                case "YES":
                    System.out.println("Enter your alternative email address: ");
                    myObj.setEmail(input.nextLine());
                    
                    email.add(counter, myObj.getEmail()+", "+myObj.getEmail());
                    break;
                case "yes":
                    System.out.println("Enter your alternative email address: ");
                    myObj.setEmail(input.nextLine());
                    
                    email.add(counter, myObj.getEmail()+", "+myObj.getEmail());
                    break;
                default:
                    break;
            }
            
            /*
            if (response=="Yes" || response=="yes"|| response=="YES") {
            	System.out.println("Enter your alternative email address: ");
            	myObj.setEmail(input.nextLine());
                email[counter]=email[counter]+", "+myObj.getEmail();
            }
            */
            
            System.out.println("Do wish to continue (true or false)");
            islooping=input.nextBoolean();
            
            counter++; 
        }
        
        System.out.println("************************************************************************************");
        for (int i = 0; i <= counter-1; i++) {
            myObj.RetrieveDetails(email.get(i), country.get(i), state.get(i), gender.get(i), name.get(i), phoneNum.get(i), dob.get(i));
        }
        System.out.println("************************************************************************************");
        
	}
		
}	
