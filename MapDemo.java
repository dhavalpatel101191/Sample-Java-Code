import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> value=new HashMap<>();
		value.put("Name","Dhaval");
		value.put("Actor","Akki");
		value.put("Ceo","Tata");
		//System.out.println(value);
		
		Set<String> keys=value.keySet();
		for(String key:keys)
		{
			System.out.println(key+" "+value.get(key));
		}

	}

}
