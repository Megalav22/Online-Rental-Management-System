package tenms;

import java.util.Scanner;
import java.io.*;

public class Tenant {
 
	int TenantId;
    String Tenantname;
    String eMail;
    String Mobile;
    String Aadhar;
    static  int id=1;
    
    public Tenant(String TenantName,String eMail,String Mobile,String Aadhar)
    {
    	this.Tenantname=TenantName;
    	this.eMail=eMail;
    	this.Mobile=Mobile;
    	this.Aadhar=Aadhar;
    	this.TenantId=id++;
    }
    
    public void viewAd() {
    	Approver ap=new Approver();
    	ap.showad();//showad is used in admin;
    	
    }
    public void reqHouse(){
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your Tenant Id");
    	int TenantId=sc.nextInt();
    	System.out.println("Enter the owner Id of the house you want to rent ");
    	int OwnerId=sc.nextInt();
    	System.out.println("Enter the Location you want to live in");
    	String Location=sc.nextLine();
    	
    }

}