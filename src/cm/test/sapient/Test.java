package cm.test.sapient;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	
	
	public int hashCode() {
		int result =1;
		
		result = 31+((id==null)?0 :id.hashCode());
		return result;
	}
	public boolean equals(Object obj) {
		Test other = (Test) obj;
		Boolean ret =false;
		if(other.id.equals(this.id)) 
			ret=true;
		return ret;
	}
	Integer id;
	Test(int id){
		this.id=id;
	}
	public String toString() {
		return this.id.toString();
	}
	public static void main(String[] args) {
		Test t1 =new Test(1);
		Test t2 =new Test(1);
		
		Map map1 = new HashMap();
		
		Map m = new TreeMap();
		m.put(t1, 1);
		m.put(t2, 1);
		
		System.out.println(m.size());
		Set s =m.keySet();
		Iterator iter =s.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			Object object = (Object) iter.next();
			
		}
	}

}
