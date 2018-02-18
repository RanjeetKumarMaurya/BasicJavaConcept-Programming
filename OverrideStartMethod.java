class MyThread extends Thread{
	public void run(){
		System.out.println("Child thread");
	}

	public void start(){
		System.out.println("Method - start()");
	}
}

class OverrideStartMethod{
	public static void main(String[] args){
		MyThread t= new MyThread();
		t.start();
	}
}