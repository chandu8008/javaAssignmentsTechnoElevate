package javacollectionshashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PersonsCollections {
public static void main(String[] args) {
	HashSet<person> set = new HashSet<person>();
	set.add(new person("chandru",22,"kadapa"));
	set.add(new person("chandru",21,"kadapa"));
	set.add(new person("chandru",23,"kadapa"));
	set.add(new person("chandru",25,"kadapa"));
	set.add(new person("chandru",26,"kadapa"));
	ArrayList<person> list = new ArrayList<person>(set);
	Collections.sort(list,new PersonsCollections());
	System.out.println(list);
}
}