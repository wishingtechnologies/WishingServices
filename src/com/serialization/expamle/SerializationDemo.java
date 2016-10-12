package com.serialization.expamle;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.omg.PortableInterceptor.ObjectIdHelper;

import com.employee.Address;
import com.employee.Employee;

public class SerializationDemo  {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1=new Employee();
		e1.setEmpId(5210);
		e1.setEmpNmae("cena");
		Address adr1=new Address();
			adr1.setStreet("Shiv colony");
			adr1.setArea("Ameerpet");
			adr1.setDistrict("Hyd");
		e1.setAddr(adr1);
		File file =new File("D://serializedeomo.txt");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("File created");
		}		
		SerializationDemo.Serilaization(e1, file.getPath());
		Employee e=(Employee)SerializationDemo.deserilizaton(file.getPath());
		System.out.println(e.toString());
	}
	
	public static void Serilaization(Object obj,String filename) throws IOException{
		
		System.out.println("Serialization started");
		FileOutputStream fos=new FileOutputStream(filename);
//		BufferedOutputStream bos=new BufferedOutputStream(fos);
//		Object obj=(Object)e1;
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
		System.out.println("Serilization cmplted");
		
	
	}
	
	public static Object deserilizaton(String fileName) throws ClassNotFoundException, IOException{
		
		FileInputStream fis=new FileInputStream(fileName);
		ObjectInputStream ois =new ObjectInputStream(fis);
		Object o=ois.readObject();
		ois.close();
		return o;
	}

}
