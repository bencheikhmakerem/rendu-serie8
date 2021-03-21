package serie8;

import java.util.List;


public class Exo16 {
	public static void main(String[] args)
	{
		PersonReader PR=new PersonReader();
		PersonWriter PW =new PersonWriter();

        List<Person> persons = PR.read("files/person.txt");
        System.out.println("le fichier lu : ");
        persons.forEach(System.out::println);
        
        List<Person> listP= List.of(
        		new Person("Jacquet", "Aimé", 79),
        		new Person("Deschamps", "Didier", 51),
        		new Person("Thuram", "Lilian", 48),
        		new Person("Barthez", "Fabien", 49),
        		new Person("Zidane", "Zinedine", 47)
        		);
        
        PW.write(listP,"files/PersonEcrit.txt");
        
        		
        		
        		
        		
        		
        


	
	}

}
