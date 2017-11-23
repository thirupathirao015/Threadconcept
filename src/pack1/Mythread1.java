package pack1;

public class Mythread1 extends Thread {
	
	public void run(){
		for(int i=1;i<10000;i++){
			System.out.println("chaild thread2 exicuted ");
		}
}
}