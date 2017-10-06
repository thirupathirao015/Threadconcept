package pack;

class Mythread extends Thread//Runnable
{
	public void run(){
		for(int i=1;i<10;i++)
		{
			System.out.println("child thread");
		}
	}
}

public class Threademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t=new Mythread();
		//Thread t=new Thread();
		t.start();
		System.out.println("name:"+Thread.currentThread().getName());
		Thread.currentThread().setName("pawan kalyan gee");
		System.out.println("name:"+Thread.currentThread().getName());
		for(int i=1;i<10;i++){
			System.out.println("main thread");
		}

	}

}
