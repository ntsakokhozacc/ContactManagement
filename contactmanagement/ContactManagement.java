package contactmanagement;
import java.text.DateFormat;
import java.util.*;

public class ContactManagement {

	
	public static void main(String[] args) {
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
            gender[counter]=input.nextLine();
            
            
            /*
            switch(gender[counter]){
            	case "M":
                    gender[counter]="Male";
                    break;
                case "m":
                    gender[counter]="Male";
                    break;
                case "f":
                    gender[counter]="Female";
                    break;
                case "F":
                    gender[counter]="Female";
                    break;
                default:
                    gender[counter]="No gender selected";
                    break;
            
            }
            */
            String genderValue=gender[counter];
        	if(genderValue=="M"){
                gender[counter]="Male";
        	}
        	else if(genderValue=="m"){
                gender[counter]="Male";
        	}    
        	else if(genderValue=="F"){
                gender[counter]="Female";
        	}   
        	else if(genderValue== "f"){
                gender[counter]="Female";
        	}else{
                gender[counter]="No gender selected";
        	}
        
        	System.out.println("Please enter your date of birth(dd/MM/yyyy): ");
            String userDob=input.nextLine();
            
            
            System.out.println("Please enter your country of origin");
            country[counter]=input.nextLine();
            
            System.out.println("Please enter your state");
            state[counter]=input.nextLine();
            
            System.out.println("Please enter your street address");
            streetAddress[counter]=input.nextLine();
            
            physicalAddress[counter]=country[counter]+", "+state[counter]+", "+streetAddress[counter];
            
            System.out.println("Please enter your cellphone number");
            phoneNum[counter]=input.nextLine();
            System.out.println("do you have an alternative number? (YES OR NO)");
            String response=input.nextLine();
            /*   
            switch(response){
                case "YES":
                    System.out.println("Enter your office/home number ");
                    phoneNum[counter]=phoneNum[counter]+" "+input.nextLine();
                    break;
                case "yes":
                    System.out.println("Enter your office/home number ");
                    phoneNum[counter]=phoneNum[counter]+" "+input.nextLine();
                    break;
                default:
                    break;
            }
            */
            if (response=="Yes" || response=="yes"|| response=="YES") {
            	System.out.println("Enter your office/home number ");
                phoneNum[counter]=phoneNum[counter]+" "+input.nextLine();
                
			}
            
            
            System.out.println("Please enter your email address: ");
            
            email[counter]=input.nextLine();
            
            System.out.println("do you have an alternative email address? (YES OR NO):");
            response=input.nextLine();
            /*   
            switch(response){
                case "YES":
                    System.out.println("Enter your alternative email address: ");
                    email[counter]=email[counter]+", "+input.nextLine();
                    break;
                case "yes":
                    System.out.println("Enter your alternative address: ");
                    email[counter]=email[counter]+", "+input.nextLine();
                    break;
                default:
                    break;
            }
            */
            if (response=="Yes" || response=="yes"|| response=="YES") {
            	System.out.println("Enter your alternative email address: ");
                email[counter]=email[counter]+", "+input.nextLine();
            }
            
            
            System.out.println("Do wish to continue (true or false)");
            islooping=input.nextBoolean();
            
            counter++; 
        }
        
        for (int i = 0; i <= counter; i++) {    
            myObj.RetrieveDetails(email[i], country[i], state[i], streetAddress[i], gender[i], name[i], phoneNum[i], dob[i]);
        }
            
            
	}
		
}	

	
