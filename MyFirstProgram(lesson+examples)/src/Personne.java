
public class Personne {
	
	//ATTRIBUTES
	private String name;
	private double height;
	private int age;
	private String dateOfBirth;
	private String eyeColor;
	
	//CONSTRUCTOR
	public Personne (String name, double height, int age, String dateOfBirth, String eyeColor) {
		this.setName(name);
		this.setHeight(height);
		this.setAge(age);
		this.setDateOfBirth(dateOfBirth);
		this.setEyeColor(eyeColor);
	}
	
	//METHODES
	 public void walk() {
		 System.out.printf("My name is %s, I am %.1f m tall and I am %d years old!", name, height, age);
	 }
	
	//GETTER & SETTER
	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

}
