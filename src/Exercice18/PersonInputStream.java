package Exercice18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class PersonInputStream {
	
	@SuppressWarnings("unchecked")
	List<Person> ListeEnLecture (File file) 
	{
	try (InputStream fis = new FileInputStream(file);
			ObjectInputStream fiis = new ObjectInputStream(fis);) {
			
		List<Person> read = (List<Person>) fiis.readObject();
		return (read);
				
	} catch (ClassNotFoundException | IOException e) 
	
	{
			e.printStackTrace();
	}
	
			return null ;
}
}
			
			
		



