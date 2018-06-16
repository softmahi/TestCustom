package com.test.immutable;

import java.util.Properties;

public class JavaPassByValue {
	/**
	 * https://howtodoinjava.com/core-java/basics/java-is-pass-by-value-lets-see-how/
	 * 
	 * @author User1
	 *
	 */
	static class Foo {

		String attribute;

		public Foo(String atribute) {
			this.attribute = atribute;
		}

		public String getAttribute() {
			return attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}

	}

	public static void main(String[] args) {
		
		/**
		 * https://howtodoinjava.com/core-java/basics/difference-between-32-bit-java-vs-64-bit-java/
		 */
		Foo f = new Foo("a");
		changeReference(f);
		System.out.println(f.attribute);

		changevalue(f);
		System.out.println(f.attribute);

	      // List all System properties
	      Properties pros = System.getProperties();
	      pros.list(System.out);
	  
	      // Get a particular System property given its key
	      // Return the property value or null
	      System.out.println(System.getProperty("java.home"));
	      System.out.println(System.getProperty("java.library.path"));
	      System.out.println(System.getProperty("java.ext.dirs"));
	      System.out.println(System.getProperty("java.class.path"));
	}

	private static void changevalue(Foo f) {
		f.attribute = "z";

	}

	private static void changeReference(Foo a) {
		// TODO Auto-generated method stub
		Foo b = new Foo("k");
		a = b;

		/**
		 * This is the important point. Here, we have three reference variables and when
		 * statement executes, a and b will point to same instance created inside the
		 * method. Note: f is unchanged and it is continually pointing to instance, it
		 * was pointing originally. NO CHANGE !!
		 */
	}

}
