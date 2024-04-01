package mktprograms;

public class ForLoop_ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
	for(int a=10;a<20;a++) {
		System.out.println(a);
		a++;
		Thread.sleep(2000);
	}

	}

}
