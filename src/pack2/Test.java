package pack2;
class A extends Thread{
	public void start(){
		//super.start();
		System.out.println("start method exicuted");
	}
	public void run(){
		System.out.println("run method exicuted");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a=new A();
         a.start();
        
         System.out.println("main thread");
        
	}

}
