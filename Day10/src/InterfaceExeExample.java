
public class InterfaceExeExample {
	
	public static void main(String[] args) {
		
		// 1. 추상클래스는 new 로 객체생성 가능? - 불가능 
		// 이유는 구현이 모두 안되어 있다. 
		// 2. 인터페이스는? new 로 객체 생성 가능? - 불가능 
		// 이유는 a) interface 는 class가 아니라서 객체생성이 불가능해요.
		// b) 구현이 없어 -> 객체생성 불가능 
		// !) interface 는 너와 나의 통신규약을 만드는거 
		
		InterfaceExample im = new SKInternet(); 
		InterfaceExample im2 = new LGInternet(); 
		
		im.connect();
		im2.connect();
		
		Father fa = new ImCC(); 
		AA aa = new ImCC();
		BB bb = new ImCC(); 
		CC cc = new ImCC();
		
	}
	
}

class Father {
	
} 

class ImCC extends Father implements AA, BB, CC {
	
	@Override 
	public void aa() {
		
	}
	
	public void bb() {
		
	}
	
	public void cc() {
		
	}
}


interface AA {
	void aa(); 
}
interface BB {
	void bb(); 
} //extends AA {}
interface CC {
	void cc(); 
}//extends BB {}



