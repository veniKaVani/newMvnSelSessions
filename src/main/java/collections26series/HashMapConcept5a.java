package collections26series;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept5a {

	public static void main(String[] args) {
		/*
		 * HashMap: is a class which implements Map interface
		 *          it extends AbstractMap
		 *          it contains only unique eles
		 *          stores values on the basis of key and value pair
		 *          it may have one null key and multiple null values
		 *          it maintains no order
		 *          to fetch the values-has to use the concept of entrySet,entryConcept
		 *          =>Entry en:hm.entrySet()
		 *          is non-synchronized hence multiple threads can access it at a time
		 *          =>not thread safe
		 *          usually used in multi-threading envs where we want to improve the
		 *          performance of the appn
		 *          
		 * Non-Synchronized: since HashMap is non-synchronized and not thread safe
		 * Multiple can access it at a time which leads to fail fast condition-concurrent
		 * modification exception is thrown=>if any tries to modify the hm by adding/removing
		 * ------------gives CONCURRENT MODIFICATION EXCEPTION------------------
		 * the structure of hash map is modified==>the particular value/data gone from object
		 * 
		 * simply getting the values by both the threads has no issue:
		 * only if adding/removing the value by one thread creates this exception
		 * 
		 * key will be removed completely BUT it will not shift the keys
		 * 
		 * ==> when two threads t1 and t2 access/attack the hashmap at the same time
		 * t1 modifies the data of the hashmap 
		 * and when the second thread t2 tries to access the same data-the data is modified
		 * and so it just gets the updated value-this condition is called fail fast condition
		 * 
		 */
		
		HashMap<Integer, String>hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "qtp");
		hm.put(3, "TestComplete");
		
		System.err.println(hm.get(2));
		System.out.println(hm.get(4));
		
		//to print all values-use for loop with Map.entryInterface
		for(Entry<Integer, String> en:hm.entrySet()) {
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		//to print particular value: cannot use this code as it goes into infinite loop
		while(hm.containsKey(2)) {
			System.out.println(hm);
			break;
		}
		
		hm.put(4, "UFT");
		hm.put(5, null);
		hm.put(null, null);
		
		hm.remove(5);
		System.out.println("--after removal(5)--");
		System.out.println(hm);
		
		System.out.println("---------employees----------");
		HashMap<Integer,Employee>emp=new HashMap<Integer,Employee>();
		Employee e1 = new Employee("Tom",15,"admin");
		Employee e2 = new Employee("Peter",25,"QA");
		Employee e3 = new Employee("Steve",35,"Dev");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> ent:emp.entrySet()) {
			Integer key = ent.getKey();
			Employee e = ent.getValue();
			System.out.println(key+" info ");
			
			System.out.println(e.name+" "+e.age+" "+e.age);
		}
	    System.out.println("---------students----------");
	    
	    HashMap<Integer, Student>stud=new HashMap<Integer, Student>();
	    Student s1 = new Student("KiranMayee",27,"ComputerScience");
	    Student s2 = new Student("EstherSugandi",28,"MCA");
	    Student s3 = new Student("Bindu",11,"B.Sc");
	    
	    stud.put(1, s3);
	    stud.put(2, s2);
	    stud.put(3, s1);
	    
	    for(Entry<Integer, Student> entr:stud.entrySet()) {
	    	Integer key1 = entr.getKey();
	    	Student e = entr.getValue();
	    	System.out.println(key1+" information");
	    	
	    	System.out.println(e.name+" "+e.rollNo+" "+e.group);
	    }
		

	}

	

}
