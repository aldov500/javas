package javas;

public class Graphics {
	
	public void error(String e) {
		p("[Error] " + e);
	}
	public void succ(String s) {
		p("[OK] " + s);
	}
	public void p(String s) { System.out.println(s); }
	public void p(int s) { System.out.println(s); }
	
}
