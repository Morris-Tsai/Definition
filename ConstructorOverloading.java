package ConstructorOverloading;

public class ConstructorOverloading {
	String name;
	ConstructorOverloading(String name){
		this.name=name;
	}
	ConstructorOverloading(){
		this(makeRandomName());
	}
	
	static String makeRandomName() {
		int x=(int)(Math.random()*5);
		String name=new String[] {"morris","ellen","hense","jimmy","joyce"}[x];
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading  a =new ConstructorOverloading();
		System.out.println(a.name);
		ConstructorOverloading  b =new ConstructorOverloading("kevin");
		System.out.println(b.name);
	}

}
