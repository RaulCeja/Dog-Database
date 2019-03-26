package KennelDB;

public class DB 
{

	public static void main(String[] args)
	{
		Kennel myHouse=new Kennel(10, 3);
		Dog sparky=new Dog(Breed.LAB,Size.THICC, true);
		Dog rambo= new Dog(Breed.LHASOAPSO,Size.SMALL, true);
		Dog cailan= new Dog(Breed.LHASOAPSO, Size.SMALL, true);
		Dog derek= new Dog(Breed.WOLF,Size.THICC, false);
		myHouse.add(sparky);
		myHouse.add(rambo);
		myHouse.add(cailan);
		myHouse.add(derek);
		myHouse.removeDanger();
		System.out.println(myHouse.contains(tyrone));
	}
	
}
