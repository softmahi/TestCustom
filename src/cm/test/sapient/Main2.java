package cm.test.sapient;

public class Main2 {
	public Main2() {
		System.out.println("foo");
	}

	public int Main(int i) {
		// TODO Auto-generated constructor stub
		return i;
	}

	public static void main(String[] args) {
		stud s = new stud(10);
		stud s1 = new stud(35);
		Change(s);
		System.out.println(stud.sid);
		Change1(35);
		System.out.println(stud.sid);

	}

	private static void Change1(int i) {
		// TODO Auto-generated method stub
		stud.sid = stud.sid + 10;
	}

	private static void Change(stud s) {
		// TODO Auto-generated method stub
		stud.sid = stud.sid + 10;
	}

}

class stud {

	static int sid;

	stud(int sid) {
		this.sid = sid;
	}

}
