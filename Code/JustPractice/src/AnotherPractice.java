import java.io.*;

interface Hello {
	void print();
}

class HelloMachine implements Hello{
	
	@Override
	public void print() {
		System.out.println("Hello, World");
	}
}

public class AnotherPractice {

	public static void main (String[] args) {
		Hello hello = new HelloMachine();
		hello.print();
	}
}
