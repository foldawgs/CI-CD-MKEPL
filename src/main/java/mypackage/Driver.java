package mypackage;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Hitung:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Hitung:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Hitung:" + counter.getCount());
		
	}

}
