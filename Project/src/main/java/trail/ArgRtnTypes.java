package trail;

public class ArgRtnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArgRtnTypes add=new ArgRtnTypes();
		int O1=add.addition(30, 40);
		int O2=add.addition(50, 60);
		add.subtaction(O1, O2);
	}
	
	public int addition(int a, int b){
		int c=a+b;
		System.out.println(c);
		return c;
	}
	
	public void subtaction(int a, int b){
		int c=a-b;
		System.out.println(c);
	}

}
