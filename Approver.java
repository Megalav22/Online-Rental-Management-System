package tenms;
import java.util.Scanner;
import java.util.HashMap;

public class Approver {
	static boolean status=false;
	static HashMap<Integer,Integer> Approved = new HashMap<>();
	static HashMap<Integer,Integer> Declined =new HashMap<>();
	static int ApproverCount=1;
	static int DeclinedCount=1;
	public void Approve(Owner o) {
		if((o.Locality!="")&& (o.City!="") && (o.SquareFeet !=0) && (o.Type !="") && (o.Rent!=0) && (o.OwnerId>=1)) {
			Approved.put(ApproverCount++, o.OwnerId);
		}
		else
		{
			Declined.put(DeclinedCount++, o.OwnerId);
		}
	}
	boolean checktheStatus(int id) {
	 boolean status=false;
	 if(Approved.containsValue(id))status=true;
	 return status;
	}

	public void  ApprovedList(Owner o) {
		for(int i=0;i<Approved.size();i++) {
			if(o.OwnerId==Approved.get(i)) {
				System.out.println("OwnerId: "+o.OwnerId);
				System.out.println("Locality: "+o.Locality);
				System.out.println("city: "+o.City);
				System.out.println("squareFeet: "+o.SquareFeet);
				System.out.println("Type: "+o.Type);
				System.out.println("rent: "+o.Rent+" /month");
			}
		}
	}
	public void DeclinedList(Owner o) {
		for(int i=0;i<Declined.size();i++) {
			if(o.OwnerId==Declined.get(i));{
				System.out.println("OwnerId: "+o.OwnerId);
				System.out.println("Locality: "+o.Locality);
				System.out.println("city: "+o.City);
				System.out.println("squareFeet: "+o.SquareFeet);
				System.out.println("Type: "+o.Type);
				System.out.println("rent: "+o.Rent+" /month");
			}
		}
	}
}
