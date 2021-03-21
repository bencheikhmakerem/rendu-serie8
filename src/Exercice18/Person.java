package Exercice18;

import java.io.Serializable;
import java.util.Objects;

@SuppressWarnings("serial")
public class Person implements Serializable { //La classe doit implementer Serializable pour qu'on puisse écrire 
	//ses instances dans un fichier binaire
	
	String LastName;
	String FirstName;
	int age;
	
	public Person(String lastName, String firstName, int age) {
		LastName = lastName;
		FirstName = firstName;
		this.age = age;
	}

	public Person() {}


	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(FirstName, LastName, age);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(FirstName, other.FirstName) && Objects.equals(LastName, other.LastName)
				&& age == other.age;
	}

	@Override
	public String toString() {
		return "Person [LastName=" + LastName + ", FirstName=" + FirstName + ", age=" + age + "]";
	}

	
	
	
}
