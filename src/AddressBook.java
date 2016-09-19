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
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy("Pat", "123 Def Street", "613-987-6543)");
		addressBook.addBuddy("Liz", "419 Ojoro Way", "062-987-6543)");
		addressBook.removeBuddy("Liz");
	}
}
