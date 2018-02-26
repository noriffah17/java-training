class ExampleAppend {

	public static void main(String args[]) {
	StringBuilder sb1 = new StringBuilder ();
	sb1.append("Go");
	sb1.append(new java1 ("Iffah"));
	System.out.println(sb1);

  }
}
class java1 {

	String name;
	java1(String str) { name = str; }

}
	