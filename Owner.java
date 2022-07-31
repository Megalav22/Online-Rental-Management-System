package tenms;

import java.util.Scanner;
import java.util.HashMap;
import java.io.*;

public class Owner {

	String Locality;
	String City;
	int SquareFeet;
	String Type;
	int Rent;
	int OwnerId;

  static HashMap <Integer,Tenant>TenantList=new HashMap<>();
  static HashMap <Integer,Integer>AlottedHouse=new HashMap<>();
  
public Owner(String Locality,String City,int SquareFeet, String Type, int Rent,int OwnerId) {
	this.Locality=Locality;
	this.City=City;
	this.SquareFeet=SquareFeet;
	this.Type=Type;
	this.Rent=Rent;
	this.OwnerId=OwnerId;
}
}