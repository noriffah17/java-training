class Testing{

	int x = 10;
	static int y = 20;

	void doIt(){
	System.out.println("Hi");
	}

	static void dontDo(){
	System.out.println("Bye");
	}

	public static void main(String x[]){
	System.out.println("x:"+x);
	Testing t1 = new Testing();
		t1.doIt();
		// doIt();
		dontDo();
	}
}