package com.test.immutable;

final class Immutable {
	private final int a;
	private final String s;
	private final Chirag ss;

	public Immutable(int a1, String s1, Chirag ss1) {
		this.a = a1;
		this.s = s1;
		this.ss = new Chirag(ss1.getAge());
	}

	public Integer geta() {
		return a;
	}

	public String gets() {
		return s;
	}


	public Chirag getSs() {
		return new Chirag(ss.getAge());
	}
	

	@Override
	public String toString() {
		return "Immutable [a=" + a + ", s=" + s + ", ss=" + ss + "]";
	}

	private static void modification(int a2, String s2, Chirag ss2) {
		a2 = 20;
		ss2.age = 11;
		s2 = "changed";
	}

	public static void main(String[] args) {
		Immutable im = new Immutable(14, "age", new Chirag(20));
		System.out.println(im);
		modification(im.a, im.s, im.ss);
		System.out.println(im);
	}
}

class Chirag {
	int age;

	Chirag(int s) {
		this.age = s;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Chirag [age=" + age + "]";
	}
	

}