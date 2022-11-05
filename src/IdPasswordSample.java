import java.util.Scanner;

class IdPasswordTest{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String name;
    Double ID, password;

    System.out.println("What is Your name?:");
    name = input.nextLine();

    System.out.println("Enter your ID: ");
    ID = input.nextDouble();
    if (ID == 12345){
        System.out.println("Welcome Mr." + name);
        System.out.println("Now enter your password please: ");
    password = input.nextDouble();
    if(password == 2022){
        System.out.println("You are logged in " + "Welcome back Mr." + name);
    }else {
        System.out.println("2 out of 3 attempts left!");
    }

    }else{
        System.out.println("WRONG ID");
    }

    

    }
}