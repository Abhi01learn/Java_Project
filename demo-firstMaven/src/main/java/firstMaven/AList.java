package firstMaven;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.jar.Attributes.Name;

public class AList {
	public static void main(String[]args) {
		
	
	
	ArrayList<String> name = new ArrayList<String>();
	ArrayList details = new ArrayList();
	
	name.add("Abhishek");
	name.add("Lalla");
	name.add("Lalla");
	name.add("Suman");
	name.add("Rose");
	details.add(1);
	details.add("Abhishek");
	
	System.out.println("List elemet :"+name);
	System.out.println("Details"+details);

	name.set(0, "Rahul");
	System.out.println("List elemet :"+name);
	
	
	System.out.println("==================================");
	for(String str : name) {
		System.out.println("ArrayList :"+str);
	}
	System.out.println("==================================");
	
	System.out.println("========Itertaor===========");
	
	Iterator<String>itr = name.iterator();
	System.out.println(itr.next());
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("========Itertaor===========");
	}
		
	
	
}
