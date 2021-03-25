package Exercice17;

import java.io.BufferedOutputStream;
//import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
//import java.util.function.Function;

public class PersonOutputStream extends OutputStream{
 
	
//	public Function<Person, byte[]> F=
//			p-> {
//	try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
//		             DataOutputStream dos = new DataOutputStream(bos)) {
//
//	            dos.writeUTF(p.getLastName());
//	            dos.writeUTF(p.getFirstName());
//	            dos.writeInt(p.getAge());
//	            return bos.toByteArray();
//	        }
//	catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	return null;
//	
//};
	
	private BufferedOutputStream BufferedOutputStream;
	private DataOutputStream DataOutputStream;
	
	public PersonOutputStream(FileOutputStream fileoutputstream)
	{
		this.BufferedOutputStream=new BufferedOutputStream(fileoutputstream);
		this.DataOutputStream=new DataOutputStream(this.BufferedOutputStream);
		
	}
	public void write(List<Person> people) throws IOException
	{
		this.DataOutputStream.writeInt(people.size());
		for (Person person : people) 
		{
			this.DataOutputStream.writeUTF((person.getFirstName()));
			this.DataOutputStream.writeUTF((person.getLastName()));
			this.DataOutputStream.writeInt((person.getAge()));


		}
	}
	public void flush() throws IOException {
		this.BufferedOutputStream.flush();
		this.DataOutputStream.flush();
	}
	public void close() throws IOException {
		this.BufferedOutputStream.close();
		this.DataOutputStream.close();
	}
	
	@Override
	public void write(int b) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
