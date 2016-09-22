import java.util.ArrayList;
import java.util.Iterator;


public class AddressBook 
{
	private ArrayList<BuddyInfo> buddyList;
	
	
	public AddressBook() 
	{
		buddyList = new ArrayList<BuddyInfo>();
	}
	
	private void addBuddy(BuddyInfo buddy) 
	{
		buddyList.add(buddy);
	}
	
	private void removeBuddy(String name) 
	{
		Iterator<BuddyInfo> buds = buddyList.iterator();
		while (buds.hasNext()) {
			if (buds.next().getName().equals(name)) {
				buds.remove();
				return;
			}
		}
	}
	
	public static void main(String[] args)
	{
		AddressBook addressBook = new AddressBook();
		BuddyInfo Liz = new BuddyInfo("Liz", "419 Ojoro Way", "062-987-6543)");
		BuddyInfo Pat = new BuddyInfo("Pat", "123 Def Street", "613-987-6543)");
		BuddyInfo enemy = new BuddyInfo("Red John", "unknown", "000-000-0000");
		addressBook.addBuddy(Pat);
		addressBook.addBuddy(Liz);
		addressBook.addBuddy(enemy);
		addressBook.removeBuddy("Red John");
	}
}
