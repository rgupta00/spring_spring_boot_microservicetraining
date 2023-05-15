package com.dp.creational.a.singleton.sol;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//oops--ex handling--colletion and threads

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, CloneNotSupportedException, FileNotFoundException, IOException {
		
		//Student student=new Student(1, "raj");//static class loading
		
		//dynamic class loading
		
		Class<?> clazz=Class.forName("com.dp.creational.a.singleton.Student");
		
		Method[]methods=clazz.getDeclaredMethods();
		
		for(Method m: methods) {
			System.out.println(m.getName()+" : "+m.getModifiers()+" : "+Modifier.toString(m.getModifiers()));
		}
		
		
		
		
		Singleton singleton=Singleton.getSingleton();
		System.out.println(singleton.hashCode());
		
		//java reflection!
		
		
		
		
//		//ser
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo.txt")));
//
//		oos.writeObject(singleton);
//		
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("demo.txt")));
//		
//		Singleton singleton2=(Singleton) ois.readObject();
//	
//		System.out.println(singleton2.hashCode());
		
		
//		Class<?> clazz=Class.forName("com.dp.creational.a.singleton.Student");
//		
//		Method method[]=clazz.getMethods();
//		
//		for(Method m: method) {
//			System.out.println(m.getName());
//		}
		
		
//		
//		Singleton singleton=Singleton.getSingleton();
//		
//		Singleton singleton2=(Singleton) singleton.clone();
//		
//		System.out.println(singleton.hashCode());
//		System.out.println(singleton2.hashCode());
//		
		
		
		
	}
}
