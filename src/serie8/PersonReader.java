package serie8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonReader {
		
		Function<String,Person> f=
				 	s-> {
					//Person p=new Person();
					String[] chaine= s.split(", ");
					String lastName=chaine[0];
					String firstName=chaine[1];
					int Age=Integer.parseInt(chaine[2]);
					Person p=new Person(lastName,firstName,Age);
					return p;

				};			
	
				
	    public List<Person> read(String file) 
		{
	    	File persons = new File(file);
			
	    	//System.out.println("persons.txt exists ? " + persons.exists());
			
			// try-with-resources
			try (Reader reader = new FileReader(persons);
				 BufferedReader bufferedReader = new BufferedReader(reader);) 
			{
				//récupérer les lignes du fichier
				Stream<String> text=bufferedReader.lines();
				
				//eliminer les lignes avec commentaire en utilisant filter
				List<Person> listeSansComm=text.filter(t->!t.startsWith("#"))
											   .map(s->f.apply(s))
											   .collect(Collectors.toList());
				return listeSansComm;
			}
			catch (IOException fnfe) 
			{
					System.out.println("Erreur : " + fnfe.getMessage());
					
			}
			return null;
			
			
	
}
}

