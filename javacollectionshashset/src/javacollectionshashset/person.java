package javacollectionshashset;

public class person {
	String name;
	int age;
	String place;

	public person(String name, int age, String place) {
		this.name = name;
		this.place = place;
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", place=" + place + "]";
	}

	public int compareTo(person p) {
		// TODD Auto-generated method stud
		return this.age - p.age;
	}
}
