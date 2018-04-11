import java.util.ArrayList;

import io.reactivex.Observable;

public class SixthPractice {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hello World");
		arrayList.add("Sung hyun");
		arrayList.add("Sung hun");
		
		Observable.fromIterable(arrayList).subscribe(System.out::println);
	}
}
