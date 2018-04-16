	
class Parent {
	void printHello () {
		System.out.println("Hello!! : Parent");
	}
}

class Child extends Parent {
	
	@Override 
	public void printHello () {
		System.out.println("Hi!! : Child");
	}
	
	void printBye () {
		System.out.println("Bye Bye!!");
	}
}

public class SecondPractice {
	
	public static void main (String[] args) {
		Parent parent = new Child(); // �� ĳ���� ����
		Child child = new Parent(); // �ٿ� ĳ���� ����
		
		parent.printHello(); // �ڽ��� ������� ���� ����
		
		Child child2 = (Child) parent; // �� ĳ���� �� �ٽ� �ٿ� ĳ���� ���� �Ƹ� Heap�� �����͸� �ø��� �Ͱ� ������ ���� �� �ϴ�
		child2.printBye(); // ��� ����� ���� ����
		child2.printHello(); 
	}
}
