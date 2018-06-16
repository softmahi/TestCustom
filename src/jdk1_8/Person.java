package jdk1_8;

import java.io.Serializable;
import java.util.HashMap;

public class Person implements Serializable{
	
	private int a;
	private int b;
	boolean k;
	String id;
	float m ;
	StringBuffer sb;
	Child c;
	protected Integer pro;
	public char pubchar;
	static HashMap hashmapExample;
	double doublenos;
	transient String transientstr;
	volatile int volatileint;
	public Person(String string) {

		
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		long temp;
		temp = Double.doubleToLongBits(doublenos);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (k ? 1231 : 1237);
		result = prime * result + Float.floatToIntBits(m);
		result = prime * result + ((pro == null) ? 0 : pro.hashCode());
		result = prime * result + pubchar;
		result = prime * result + ((sb == null) ? 0 : sb.hashCode());
		result = prime * result + volatileint;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		if (Double.doubleToLongBits(doublenos) != Double.doubleToLongBits(other.doublenos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (k != other.k)
			return false;
		if (Float.floatToIntBits(m) != Float.floatToIntBits(other.m))
			return false;
		if (pro == null) {
			if (other.pro != null)
				return false;
		} else if (!pro.equals(other.pro))
			return false;
		if (pubchar != other.pubchar)
			return false;
		if (sb == null) {
			if (other.sb != null)
				return false;
		} else if (!sb.equals(other.sb))
			return false;
		if (volatileint != other.volatileint)
			return false;
		return true;
	}
	
	
	

}

