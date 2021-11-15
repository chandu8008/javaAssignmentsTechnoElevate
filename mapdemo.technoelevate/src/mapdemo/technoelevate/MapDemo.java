package mapdemo.technoelevate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(308,"chandru");
	map.put(310,"preethi");
	map.put(312,"chandu");
	map.put(302,"chandrakanth");
	map.put(303,"rani");
	System.out.println(map);
	Set<Integer> set = map.keySet();
	System.out.println(set);
	Collection<String> collection = map.values();
	System.out.println(collection);
	Set<Map.Entry<Integer, String>> f = map.entrySet();
	System.out.println(f);
// 	Set entries = map.entrySet();
//	Iterator iterator = entries.iterator();
//	while (iterator,hashset()) {
//		System.out.println(iterator.next());
//	}
	Set<Map.Entry<Integer, String>> entries = map.entrySet();
	for (Map.Entry<Integer, String> entry:entries) {
		System.out.println(entry.getKey()+" "+entry.getValue());
		if(entry.getKey()==308) {
			entry.setValue("preethi");
			System.out.println(map);
		}
	}
}
}

