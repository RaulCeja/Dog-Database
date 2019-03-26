package KennelDB;
import java.util.*;
public class Kennel implements Iterator<Dog>
{
	private int maxEnrolled;
	private int maxWaitlist;
	
	private TreeSet<Dog> enrolled;
	private ArrayList<Dog> waitlist;
	private HashSet<Dog> overflow;
	private ArrayList<Dog> allAnimals;

	
	public Kennel(int maxEnrolled, int maxWait)
	{
		this.maxEnrolled=maxEnrolled;
		this.maxWaitlist=maxWait;
		overflow=new HashSet<Dog>();
		enrolled=new TreeSet<Dog>();
		waitlist=new ArrayList<Dog>();
	}
	
	public boolean add(Dog d)
	{
		if(enrolled.size()<maxEnrolled)
		{
			return enrolled.add(d);
		}
		else if(waitlist.size()<maxWaitlist)
		{
			return waitlist.add(d);
		}
		else 
		{
			return overflow.add(d);
		}
	}
	
	public boolean contains(Dog d)
	{
		return enrolled.contains(d)||
				waitlist.contains(d)||
				overflow.contains(d);
		//treeset, hashset, and arraylist come with boolean contains
		//I don't think arraylist has it so this is iffy
		//turns aout arraylist does have contains
	}
	
	public Iterator<Dog> iterator()
	{
		allAnimals=new ArrayList<Dog>(enrolled);
		allAnimals.addAll(waitlist);
		allAnimals.addAll(overflow);
		return allAnimals.iterator();
		/*
		 * to create an iterator
		 * 1) create the method 
		 * "public Iterator<Object> iterator()"
		 * 2) create a new list or set to contain all objects, this is a collection
		 * from multiple sets and lists
		 * smart thing is to start it off with the values of one that already
		 * exists
		 * 3) use addAll to add another set/list to the collection
		 * 4) return the collection.iterator()
		 */
	}
	public void removeDanger()
	{
		Set<Dog> danger=new HashSet<Dog>();
		for (Dog d: allAnimals)
		{
			if(d.getBreed()==Breed.WOLF||d.getBreed()==Breed.COYOTE||
					d.getBreed()==Breed.PUMA)
			{
				danger.add(d);
			}
			
		}
		allAnimals.removeAll(danger);
	}
}
