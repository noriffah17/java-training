public class ConstructorExample{
int age;
String name;
//Default constructor
ConstructorExample(){
this.name="Iffah";
this.age=25;
}

//Parameterized constructor
ConstructorExample(String n,int a){
this.name=n;
this.age=a;
}

public static void main(String args[]){
ConstructorExample obj1 = new ConstructorExample();
ConstructorExample obj2 = new ConstructorExample("Iffah",25);
System.out.println(obj1.name+""+obj1.age);
System.out.println(obj2.name+""+obj2.age);
}
}