package KennelDB;
//import java.util.*;
public class Dog 
{

	private boolean cute;
	//enums were chosen so the user cannot enter an invalid dog breed
	//breed could have easily been a string but enums were chosen as an exercise
	public Dog(Breed breed, Size size, boolean cute)
	{

		this.cute=cute;
	}
	//enums come with their own getters so no need to make them!
	//UPDATE: still need to make one to call it in a different class
	public Size getSize()
	{
		return getSize();
	}
	public Breed getBreed()
	{
		return getBreed();
	}
	public boolean isCute()
	{
		return cute;
	}

}
