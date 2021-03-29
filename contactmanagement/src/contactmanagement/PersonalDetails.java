package contactmanagement;
import java.util.*;
import java.text.*;


public class PersonalDetails {
	private String email, country, state, streetAddress, gender;
    private String name, phoneNum;
    private Date dob;
    
    public PersonalDetails() {
        this.email = "not specified";
        this.country = "not specified";
        this.state = "not specified";
        this.streetAddress = "not specificed";
        this.gender = "not specified";
        this.name = "not specified";
        this.phoneNum = "00000000000";
        this.dob= null;
    }
    
	public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public Date getDob() {
        return dob;
    }

    public void setEmail(String email) {
    	int intIndex = email.indexOf("@");
		if(intIndex == 0) {
			this.email = "Invalid email address";
		} else {
			this.email = email;
		}
        
    }

    public void setCountry(String country) {
    	if (country!=null) {
			this.country = country ;
		}else{
			this.country = "Not specified";
		}
    }

    public void setState(String state) {
    	if (state!=null) {
			this.state = state ;
		}else{
			this.state = "Not specified";
		}
    }

    public void setStreetAddress(String streetAddress) {
    	if (streetAddress!=null) {
			this.streetAddress = streetAddress ;
		}else{
			this.streetAddress = "Not specified";
		}
    }

    public void setGender(String gender) {
    	
    	switch(gender){
	    	case "M":
	            this.gender="Male";
	            break;
	        case "m":
	        	this.gender="Male";
	            break;
	        case "f":
	        	this.gender="Female";
	            break;
	        case "F":
	        	this.gender="Female";
	            break;
	        default:
	        	this.gender="No gender selected";
	            break;
    	}
        
    	/*
        if(gender=="M"){
            this.gender="Male";
    	}
    	else if(gender=="m"){
            this.gender="Male";
    	}    
    	else if(gender=="F"){
            this.gender="Female";
    	}   
    	else if(gender== "f"){
            this.gender="Female";
    	}
    	else{
            this.gender="No gender specified";
    	}
    	*/
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        boolean isNumber;
        if (phoneNum == "") {
			isNumber=false;
			this.phoneNum="Not specified";
		}
    	try {
            int convertString = Integer.parseInt(phoneNum); 
        } catch (NumberFormatException nfe) {
            isNumber = false;
        }
        
        isNumber=true;
    	if (isNumber==true) {
    		this.phoneNum = phoneNum;
		}else{
			this.phoneNum = "Invalid Phone number";
		}
        
    }

    public void setDob(String dob) throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    	this.dob = date;
    }
    
    public void RetrieveDetails(String email, String country, String state,  String gender, String name, String phoneNum, Date dob) {
        System.out.println(name+"'s details are listed below: ");
        System.out.println("Name & Surname\t: "+name);
        System.out.println("Gender\t: "+gender);
        System.out.println("Date of birth\t: "+dob);
        System.out.println("Mobile,office and Home phone number(separated by common)\t: "+phoneNum);
        System.out.println("Country\t: "+country);
        System.out.println("State\t: "+state);
        System.out.println("Street Address\t: "+streetAddress);
        System.out.println("Email address and alternative email(separated by common)\t: "+email);
        System.out.println();
    }
    
   
    
}
