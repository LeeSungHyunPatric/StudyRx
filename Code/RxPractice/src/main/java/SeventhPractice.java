import java.util.concurrent.Callable;

import javax.swing.plaf.SliderUI;

import io.reactivex.Observable;

// 2018 4 15 Callbee 비동기 시스템에 관한 학습 및 RX에서의 비동기 처리 방법

public class SeventhPractice {
	
	public static void main(String[] args) {
		Callable<String> callable = () -> {
			Thread.sleep(1000);
			return "Hello, World";
		};
		
		Observable.fromCallable(callable).subscribe(System.out::println);
	}
}
