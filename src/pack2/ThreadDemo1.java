package pack2;
class MyRunnableThread  implements Runnable
{
	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++){
			System.out.println("child thread");
		}
		
	}
	
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnableThread t=new MyRunnableThread();
		 Thread t1=new Thread(t);
		   t1.start();
		   System.out.println("hi Main thread ");

	}

}

 