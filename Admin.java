package tenms;

import java.util.Scanner;
import java.io.*;
import java.util.HashMap;


public class Admin {

	static HashMap<Integer,Owner>rentDetails=new HashMap<Integer,Owner>();
	static HashMap<Integer,Integer>advertisementdetails=new HashMap<>();
	static int id=1;
	static int advertiseCount=1;
	
	public void addToList(Owner o) {
		rentDetails.put(id++, o);
	}
	
	public void viewDetails() {
		for(Owner o:rentDetails.values()) {
		System.out.println("Locality"+o.Locality);
		System.out.println("City"+o.City);
		System.out.println("SquareFeet"+o.SquareFeet);
		System.out.println("Type"+o.Type);
		System.out.println("Rent"+o.Rent);
		System.out.println("OwnerId"+o.OwnerId);
	}
	}
	
	public void addad(int advId) {
		Approver ap=new Approver();
		if(ap.checkStatus(id)advertisementdetails.put(advertiseCount++,advId));
	}
	
	public void showad() {
		for(int i=0;i<advertisementdetails.size();i++) {
			for(Owner o:rentDetails.values()) {
				System.out.println("Locality"+o.Locality);
				System.out.println("City"+o.City);
				System.out.println("SquareFeet"+o.SquareFeet);
				System.out.println("Type"+o.Type);
				System.out.println("Rent"+o.Rent);
				System.out.println("OwnerId"+o.OwnerId);
			}	
		}
	}
	
	public void removead() {
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		advertisementdetails.remove(id);
		System.out.println("The corresponding advertisement is removed successfully");
	}
}
