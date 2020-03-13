package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Service.ItemOperation;
import Service.Operations;
import model.ItemDetails;
import model.User;
import Service.validations;
import Service.Excel;

public class Main {
	public static void main(String[] args) throws IOException {
		
		System.out.println("Lets begin .....Diet planner!!");
		System.out.println("Enter your choice");
		System.out.println("1. SIGN UP");
		System.out.println("2. SIGN IN");
		System.out.println("3. Calories Details");
		System.out.println("4.Add Food-items in your list");
		String email=null;
		String password=null;
		String Cpassword=null;
		User user = null;
		
		int choice = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String yes;
		do {
			choice =Integer.parseInt(br.readLine());
		switch(choice) {
		case 1:
			System.out.println("New Sign Up");
			System.out.println("Enter Username:");
			email = br.readLine();
			System.out.println("Enter Password:");
			password = br.readLine();
			System.out.println("Confirm Password:");
			Cpassword = br.readLine();
			validations validate1=new validations();
	
			if(validate1.checkUserDetails1(email,password,Cpassword)){
			user=new User(email,password,Cpassword);
			
			}
			System.out.println("Successfully registered ....!!");
			break;
		case 2:
			System.out.println("Sign in");
			System.out.println("Enter Username:");
			email = br.readLine();
			System.out.println("Enter Password:");
			password = br.readLine();
			
			validations validate2=new validations();
			if(validate2.checkUserDetails2(email,password)){
			User user1 = new User(email,password);
			}
			System.out.println("Access granted !!");
		case 3:
			System.out.println("Lets Know how much Calories you required according to your body");
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your Height");
            int H=sc.nextInt();
            System.out.println("Enter your Weight");
            int W=sc.nextInt();
            System.out.println("Enter your Age");
            int A=sc.nextInt();
            System.out.println("Enter your Gender");
            String G=sc.next();
            if(G.equalsIgnoreCase("male")) {
            	int calories=10*W+6*H-5*A+5;
            	System.out.println("calories required "+calories+" cal");
            }
            else if(G.equalsIgnoreCase("female")) {
            	int calories=10*W+6*H-5*A-161;
            	System.out.println("calories required "+calories+" cal");
            }
            else {
            	 System.out.println("enter correct data");
            }
            
            
            
     case 4:
			System.out.println("Make a Diet list of your own....");
			System.out.println("Add some items:");
			ItemOperation vo = new ItemOperation();
			System.out.println("How many items do u want to add");
			int n = Integer.parseInt(br.readLine());
			for(int i=1;i<=n;i++) {
			      vo.add();
			     
			}
			vo.display();
		
//	   
		break;
     case 5:
    	 System.out.println("remove item");
    	 ItemOperation rem = new ItemOperation();
    	 rem.remove();
//      	vo.display();
	}
		System.out.println("Do you want to continue");
		yes=br.readLine();
		
		}while(yes.equals("yes"));
		
		}	
	
}
