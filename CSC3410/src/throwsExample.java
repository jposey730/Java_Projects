
public class throwsExample {

	public void start(){
		System.out.println("Example Started...");
	}
	public void sleep() throws InterruptedException {
		Thread.sleep(1000);
	}
	public void a() throws InterruptedException{
		b();
	}
	public void b() throws InterruptedException{
		sleep();
	}
	public static void main(String[] args){
		throwsExample t=new throwsExample();
		t.start();
		t.b();
		t.a();
		t.sleep();
	}
}
