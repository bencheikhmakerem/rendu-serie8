package serie8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.function.Function;

public class PersonWriter {
	
	Function<Person, String> f1=
			p->p.getLastName()+ ", " + p.getFirstName() +", " + p.getAge();
	
	public void write(List<Person> people, String fileName)
	{
		File file=new File(fileName);
		
		try (Writer writer = new FileWriter(file);
				 BufferedWriter bufferedWriter = new BufferedWriter(writer);) 
		{
			 for (Person p : people) {
	                bufferedWriter.write(f1.apply(p));
	                bufferedWriter.write("\n");
	            }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ecriture terminé");
	}

}
