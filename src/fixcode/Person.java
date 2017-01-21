package fixcode;
/**
 * A simple model of person with name
 * @author Apichaya Tiwcharoensakul
 *
 */

public class Person
{
	/** the person's full name. */
	public String name;
	
	/**
	 * Initialize a new Person object.
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/*
	 * Get the person's name.
	 * @return the person's name
	 */
	public String getName() {
		return name;
	}

	/**
	 *Set or change the person's name.
	 * @param newname is newname to assign to this person.
	 */
	public void setName(String newname) {
		this.name = newname;
	}
	
	/**
	 * Compare person's by name and class.
	 * They are equal if the name is matches.
	 * @param other is another Object to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	@Override
	public boolean equals(Object other) { 
		//don't allow other to be null.
		if (other == null) {
			return false;
		}
		if (other.getClass() != this.getClass()) {
			return false;
		}
		
		//cast other to Person so we can get its attributes.
		Person oth = (Person) other;
		if (name.equalsIgnoreCase(oth.name)) {
			return true;
		}
		return false;
	}

	/**
	 *Get a string representation of this Person.
	 * @return a string representation of the person name
	 */
	public String toString() {
		return "Person " + name;
	}

}
