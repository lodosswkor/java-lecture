
public class InterfaceExeExample {
	
	public static void main(String[] args) {
		
		// 1. �߻�Ŭ������ new �� ��ü���� ����? - �Ұ��� 
		// ������ ������ ��� �ȵǾ� �ִ�. 
		// 2. �������̽���? new �� ��ü ���� ����? - �Ұ��� 
		// ������ a) interface �� class�� �ƴ϶� ��ü������ �Ұ����ؿ�.
		// b) ������ ���� -> ��ü���� �Ұ��� 
		// !) interface �� �ʿ� ���� ��űԾ��� ����°� 
		
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



