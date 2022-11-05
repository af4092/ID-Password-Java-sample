import java.util.Scanner; 

class IdPasswordSample{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in); 
    String name;
    Double ID, password;

    System.out.println("What is Your name?:");                                 // ask for user's name
    name = input.nextLine();

    System.out.println("Enter your ID: ");                                    // check for ID
    ID = input.nextDouble();
    if (ID == 12345){                                                         // if ID is 12345 then it asks for the password 
        System.out.println("Welcome Mr." + name);      
        System.out.println("Now enter your password please: ");               //after successful verification of the ID then asks for PW
    password = input.nextDouble();
    if(password == 2022){                    
        System.out.println("You are logged in " + "Welcome back Mr." + name); //if pw is 2022 then it displays following lines
    }else {
        System.out.println("2 out of 3 attempts left!");                      //in case of wrong pw it shows error message
    }

    }else{
        System.out.println("WRONG ID");                                       //if ID is wrong, in our case ID = 12345
    }
  }
}