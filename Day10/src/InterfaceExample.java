// �������̽��� 
// ���������� interface �������̽� �� 

//--- ���ͳ� ���ӿ� �������̽� 
public interface InterfaceExample {
	void connect(); 
	void close(); 
	void speedUp(); 
	void speedDown(); 
}


class SKInternet implements InterfaceExample {
	
	@Override 
	public void connect() {
	  System.out.println("�����ϱ� �����߾��.(SK)"); 	
	}

	@Override
	public void close() {
		System.out.println("�ݾƿ�(SK)");
	}

	@Override
	public void speedUp() {
		System.out.println("�ӵ� �÷���(SK)");
	}

	@Override
	public void speedDown() {
		System.out.println("�ӵ� ������(SK)");
	}
}


class LGInternet implements InterfaceExample {
	
	@Override 
	public void connect() {
	  System.out.println("�����ϱ� �����߾��.(LG)"); 	
	}

	@Override
	public void close() {
		System.out.println("�ݾƿ�(LG)");
	}

	@Override
	public void speedUp() {
		System.out.println("�ӵ� �÷���(LG)");
	}

	@Override
	public void speedDown() {
		System.out.println("�ӵ� ������(LG)");
	}
	
}



