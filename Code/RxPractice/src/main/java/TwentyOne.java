import java.awt.List;
import java.util.ArrayList;

import org.apache.commons.math3.util.Pair;

import io.reactivex.Observable;

public class TwentyOne {
	public static void main (String[] args) {
		ArrayList<Pair<Integer, String>> data = new ArrayList<>();
		
		data.add(Pair.create(3000, "TV"));
		data.add(Pair.create(1000, "Computer"));
		data.add(Pair.create(3000, "TV"));
		
		Observable.fromIterable(data)
		.filter(it -> it.getSecond().equals("TV"))
		.map(it -> it.getFirst())
		.reduce((one, two) -> one+two)
		.subscribe(System.out::println);
	}
}
