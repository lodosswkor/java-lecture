
public class AccessExample2 {
  
}


class A {
	
	String name = "이종석";
	int age = 10; 
}

class B extends A {
	
	void printAClassMember() {
		this.name = "이종석";
	}

}