package Exercice18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.List;

public class PersonOutputStream {
	
	
	void writePeople(List<Person> people,File file) 
	{
		
		
		try (OutputStream fos = new FileOutputStream(file);
				 ObjectOutputStream foos = new ObjectOutputStream(fos);) {
				
			
					foos.writeObject(people);
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	

}
