import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class TwentyProject {
	public static void main(String[] args) {
		Function<String, Integer> fc = sr -> {
			switch(sr) {
			case "red" : return 1; 
			case "yello" : return 2; 
			case "blue" : return 3; 
			default : return 4; 
			}
		};
		
		String[] color = {"red", "yello", "blue", "hi"};
		Observable.fromArray(color)
		.map(fc)
		.subscribe(System.out::println);
	}
}
