package foo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Map<String, Bandwidth> map = new HashMap<String, Bandwidth>();
    	
    	Person p = new Person("song",12);
    	Person p1 = new Person("song",14);
    	Person p2 = new Person("wang",13);
    	Person p3 = new Person("wang",15);
    	
    	List<Person> list = new ArrayList<Person>();
    	
    	list.add(p1);
    	list.add(p2);
    	list.add(p3);
    	list.add(p);
    	
    	for (int i = 0; i < list.size(); i++) {
    		 String key = list.get(i).getName();
    		   if (map.get(key) == null) {
    		      map.put(key, new Bandwidth());
    		   }
    		   map.get(key).add(list.get(i).getAge());
		
		}
    	System.out.println(map);
        System.out.println( "Hello World!" );
    }
}
