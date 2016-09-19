import java.util.ArrayList;
import java.util.Iterator;


public class AddressBook 
{
	private ArrayList<BuddyInfo> buddyList = new ArrayList<BuddyInfo>();
	
	
	public AddressBook() 
	{
		//do nothing
	}
	
	private void addBuddy(String name, String address, String phoneNumber) 
	{
		BuddyInfo buddy = new BuddyInfo();
		buddy.setName(name);
		buddy.setAddress(address);
		buddy.setPhoneNumber(phoneNumber);
		buddyList.add(buddy);
	}
	
	private void removeBuddy(String name) 
	{
		Iterator<BuddyInfo> buds = buddyList.iterator();
		BuddyInfo buddy = new BuddyInfo();
		while (buds.hasNext()) {
			buddy = buds.next();
			if (buddy.getName().equals(name)) {
				buds.remove();
				return;
			}
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Address Book.");
	}
}
