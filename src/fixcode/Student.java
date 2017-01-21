package fixcode;
/**
 * A simple model of student with name and id which is a sub-class of Person.
 * @author Apichaya Tiwcharoensakul
 *
 */
public class Student extends Person
{
	/**the student's id*/
	private long id;
	
	/**
	 * constructor initialize the attributes using parameters
	 * @param name is managed by Person class
	 * @param copy the mutable id parameter to preserve encapsulation
	 */
	public Student(String name, long id) {
		super(name); 
		this.id = id;
	}

	/** 
	 *Return a string representation of this Student. 
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	/**
	 * Compare student's by name and id. They are equal if the name, and id are matches.
	 * @param other is another Object to compare to this one.
	 * @return true if the name, and id are same, false otherwise.
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
		
		//cast other to Student so we can get its attributes.
		Student oth = (Student) other;
		if (name.equalsIgnoreCase(oth.name) && this.id == oth.id) {
			return true;
		}
		return false;
	}

	/**
	 * accessor method for a long attribute id
	 * @return the person's id
	 */
	public long getId()
	{
		return id;
	}

	/**
	 * set or change the person's id
	 * @param id is id to assign to this student.
	 */
	public void setId(long id)
	{
		this.id = id;
	}


}
