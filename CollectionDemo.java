import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<Integer> value =new ArrayList<>();
		value.add(2);
		value.add(4);
		value.add(6);
		value.add(8);
		value.add(10);
		//collection does not support index number
		//to get value need to go with iterator
		//Iterator is interface and iterator is method(small i)
		Iterator<Integer> it=value.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
