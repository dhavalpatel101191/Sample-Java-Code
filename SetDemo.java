import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub

	Set<String> name= new HashSet<>();   //or   Set<String> name=new TreeSet<>();
	name.add("Dhaval");
	name.add("Hardik");
	name.add("Akash");
	name.add("Bhoomin");
	
	
	name.add("Pratik");
	
	for(String s:name) {System.out.println(s);}
	}

}
