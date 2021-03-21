package Exercice18;

import java.io.File;
import java.util.List;

//On utilise les les flux ObjectOutputStream et ObjectInputStream pour écrire
//des objets dans un fichier binaire

public class Exo18 {

	public static void main(String[] args) {
		
		File file =new File("files/person.bin");
		
		List<Person> P= List.of(
				new Person("BEN CHEIKH","Makerem",24),
				new Person("JEDDI","Noor",23),
				new Person("RAYSSI","Eya",22)
				);
		PersonOutputStream per= new PersonOutputStream();
		per.writePeople(P, file);
		System.out.println("Ecriture Réussie");
		
		PersonInputStream per1= new PersonInputStream();
		List<Person> persons=per1.ListeEnLecture(file);
        System.out.println("La liste est \n");
		persons.forEach(System.out::println);
	


		
	}

}
