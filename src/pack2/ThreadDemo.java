package pack2;

class Mythread extends Thread
{
	public void run(){
		System.out.println("chaild thread");
	}
	public void run(int i){
		System.out.println("int information");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mythread t=new Mythread();
             t.start();
             
	}

}
