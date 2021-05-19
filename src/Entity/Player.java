package Entity;

public class Player {
	private int id;
	private String nationalityId;
	private String firstName;
	private String lastName;
	private int dateOfBirthYear;
	
	public Player() {
		
	}
	
	public Player(int id, String nationalityId, String firstName, String lastName, int dateOfBirthYear) {
		super();
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthYear = dateOfBirthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public void setDateOfBirthYear(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
		
	}
}
