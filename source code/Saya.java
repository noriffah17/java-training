class Dog {}

class Saya {

	public static void main(String args[]) {

 	int x = 5;

	int y = 15;
	
	x = y;

	System.out.println(x == y);

	Dog d1 = new Dog();
	Dog d2 = new Dog();

	System.out.println(d1 == d2);

	String s1 = "Malaysia";

	System.out.println(s1 + "is a country");

	System.out.println(s1);

	String x1 = "Korea";
	String x2 = "Korea";
	System.out.println(x1 == x2);

	String x3 = new String ("Korea");
	String x4 = new String ("Japan");	

	System.out.println(x1 == x3);

	System.out.println(x1.equals(x2));
	System.out.println(x3.equals(x4));
	


}

}