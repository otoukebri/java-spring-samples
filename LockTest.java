package sample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

	private final Lock lock = new ReentrantLock();
	private int value = 0;

	public int increment() {
		//lock.lock();
//		try {
			++value;
			System.out.println(value);
			return value;
//		} finally {
//			lock.unlock();
//			System.out.println(value);
//		}
	}
	
	
	public static void main(String[] args) {
		LockTest t  = new LockTest();
		t.increment();	
		t.increment();	
		t.increment();	
	}

}
