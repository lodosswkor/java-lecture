// final 
// Ŭ����, �޼���, �Ӽ� 
// ex) Ŭ������ final = ��� ���ϰڴ�. 
// ex) �޼��忡 final = �������̵�(��ø)�� ��� ���ϰڴ�. 
// ex) �Ӽ�/������ final = ���� ������ �� �����ϰڴ�. 
// final class Ŭ������ 
// final ����Ÿ�� �޼���� (�Ű�����) 
// final ������Ÿ�� ������ = ��

//--- ����� 
// final static ������Ÿ�� ����� = 10;
// final static double PI = 3.145121323;
// static final double PI = 3.14213321;
public class FinalExample {
	
	public static void main(String[] args) {
//		AO ao = new BO(); 
//		ao.printName();
	}
}

// -- final �޼ҵ� ���� 
//
//class AO {
//	void printName() {
//		System.out.println("������");
//	}
//}
//
//class BO extends AO {
//	final void printName() {
//		System.out.println("������");
//	}
//}

// �ƹ��� BO�� �޼��尡 final �̹Ƿ�, �޼��� ��ø(�������̵�)�� �� �� ���� 
//class CO extends BO {
//  void printName() { // Error 
//	  
//  }
//}

//-- final �Ӽ�(����) ���� 
// final �Ӽ�/������ �ѹ� �ʱ�ȭ(���� ������) ������ �Ұ����ϴ�.
// �ٸ� �����ڸ� ���� �ʱ�ȭ�� ��츸 ���ܷ� �Ѵ�. 
//class AO {
//	final int grade; 
//	AO(int grade) {
//		this.grade = grade;
//	} 
//}
//
//class BO extends AO {
//	
//	void chnageGrade() {
//		// �� �����Է��� �Ұ��� 
//		//this.grade = 100;
//	}
//}

//-- final Ŭ���� ���� 
//final class AO {
//	String name = "������";
//}
//
////final class�� ����� �� �������Ƿ� ������ �߻���Ų��. 
//class BO extends AO {}

