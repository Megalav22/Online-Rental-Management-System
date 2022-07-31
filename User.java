package tenms;

import java.util.Scanner;
import java.io.*;
import java.util.HashMap;

public class User {
 public static void main(String args[]) {
	 Owner o=new Owner("Kodambakkam","chennai",798,"2BHK",6000,1);
	 Approver ap=new Approver();
	 ap.Approve(o);
	 Owner o2=new Owner("Goripalayam","Madurai",560,"1BHK",5500,1);
	 ap.Approve(o);
	 Owner o3=new Owner("AnnaNagar","chennai",1200,"3BHK",15000,1);
	 ap.Approve(o);
	 Admin adm=new Admin();
	 Scanner sc=new Scanner(System.in);
	 boolean exiting=true;
	 while(exiting) {
		 System.out.println("1.Owner \n 2.Admin \n 3.Approver \n 4.Tenant\n");
		 int userchoice=sc.nextInt();
		 switch(userchoice) {
		 case 1:
			 boolean value=true;
			 while(value) {
				 System.out.println("1.Add \n 2.Remove \n 3.View \n 4.Exit");
				 int val=sc.nextInt();
				 switch(val) {
				 case 1:
					 System.out.println("Enter the Locality");
					 String Locality=sc.nextLine();
					 System.out.println("Enter the City");
					 String City=sc.nextLine();
					 System.out.println("Enter the SquareFeet");
					 int SquareFeet=sc.nextInt();
					 System.out.println("Enter the type of house");
					 String Type=sc.nextLine();
					 System.out.println("Enter the Rent");
					 int Rent=sc.nextInt();
					 System.out.println("Enter your OwnerId");
					 int OwnerId=sc.nextInt();
					 Owner o=new Owner(Locality,City,SquareFeet,Type,Rent,OwnerId);
					 ap.Approve(o);
				 }
				 break;
				 case 2:
				 {
					 o.removead();
				 }
				 break;
				 case 3:
				 {
					 o.view();
				 }
				 case 4:
				 {
					 value=false;
				 }
				 break;
			 }
		 }
		 break;
		 case 2:
		 {
			 //owner
		 }
		 break;
		 case 3;
		 {
			 //tenant
		 }
		 break;
		 case 4:
		 {
			 boolean exitTenant=true;
				while(exitTenant) {
				System.out.println("1.enter Details \n 2.send Request \n 3.Exit");
				int choice=sc.nextInt();
				switch(choice) {
				case 1 :{
					System.out.println("Enter your name: ");
					String userName=sc.next();
					System.out.println("Enter your email: ");
					String email=sc.next();
					System.out.println("enter your mobile number: ");
					String mobile=sc.next();
					System.out.println("enter your Aadhaar number: ");
					String Aadhar=sc.next();
					Tenant t=new Tenant(userName,email,mobile,Aadhar);
				}
				break;
				case 2:
				{

				}
				}
			}
			}
			break;
			case 5:
			{
				//overAll exit
				exiting=false;
			}
			break;
			}//switch end
		 }
	 
	 }
 }
}
