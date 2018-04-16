	
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
		Parent parent = new Child(); // 업 캐스팅 성공
		Child child = new Parent(); // 다운 캐스팅 실패
		
		parent.printHello(); // 자신의 멤버에만 접근 가능
		
		Child child2 = (Child) parent; // 업 캐스팅 후 다시 다운 캐스팅 성공 아마 Heap에 데이터를 올리는 것과 관련이 깊을 듯 하다
		child2.printBye(); // 모든 멤버에 접근 가능
		child2.printHello(); 
	}
}
