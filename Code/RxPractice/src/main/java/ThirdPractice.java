import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class ThirdPractice {
	public static void main(String[] args) {
		Observable os = Observable.just("yello", "green", "blue");
		
		Disposable dp = os.subscribe(
				v -> System.out.println("on Next"), 
				e -> System.err.println("err"),
				() -> System.out.println("complite")
				);
		
		System.out.println("diposit is" + dp);
	}
}
