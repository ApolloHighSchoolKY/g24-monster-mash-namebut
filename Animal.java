/**
 * Inheritance and Polymorphism
 ***********************************************************
 * This file is the original object that we are going to
 * create. All other objects will inherit all of the
 * properties and abilities this object has. In some cases,
 * we will override the existing methods we will create
 * here.
 ***********************************************************
 * @author  Mr. Leohr, February 7th, 2016
 */


public class Animal
{
	private int age;
	private boolean alive;
	private String sound;

	    /**
	     * Create a new animal with age zero (a new born).
	     */
	    public Animal()
	    {
			//default placement variables
			age = 0;
			alive = true;
			sound = "*animal noises*";
	    }

	    /**
	    * Check whether the animal is alive or not.
	    * @return True if the animal is still alive.
	    */
        public boolean isAlive()
    	{
			if(alive == true)
			{
				return true;
			}
			return false;
    	}

     	/**
     	* Make the animal die :(
     	*/
     	public void kill()
     	{
				if(age > 40)
				{	
					alive = false;
				}
				else
				{
					alive = true;
				}
     	}

     	/**
     	* Have the animal make a noise
     	* @return the string that is the animals sound it makes
     	*/
		public void soundType (String soundType)
		{
			sound = soundType;
		}

		public void ageYears (int ageYears)
		{
			age = ageYears;
		}
     	public String speak()
     	{
     		return sound;
     	}

     	/**
     	* If you attempt to print the animal, if the animal is alive print its age and have it make
     	* a sound.  If the animal is dead, have it print how old it was when it died.
     	* @return String to be printed to the console.
     	*/
     	public String toString()
     	{
			if(alive == true)
			{
				return "This animal is " + age + " year(s) old! And goes: " + sound + "\n";
			}
			else
			{
				return "This animal was " + age + " before its passing. R.I.P.\n";
			}
     	}
}