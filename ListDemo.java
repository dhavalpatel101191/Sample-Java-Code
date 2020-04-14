import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.Iterator;

public class ListDemo{
	public static void main(String args[]) throws Exception
	{
		List<Integer> value = new ArrayList();
		System.out.println(value.add(12)); // write true or false depend on value added or not
		value.add(4);
		value.add(6);
		value.add(8);
		value.add(10);
		
		/*    int s=value.size();
		System.out.println("Size is "+s);    */
		value.add(3,55);
	//Collections.sort(value);
//Iterator ab=value.iterator();
//while(ab.hasNext()) {System.out.println(ab.next());}

		for(Integer s:value)
		{System.out.println(s);}
	}
	
}