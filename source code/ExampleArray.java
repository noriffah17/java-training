class ExampleArray {

	public static void main(String args[]) {

	int intArray[];
	intArray = new int [20];

	for (int i=1; i<intArray.length; i++) {

	intArray[i] = i + 5;

	System.out.println(intArray[i]); 

	}

    }

}