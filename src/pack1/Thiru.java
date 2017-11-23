package pack1;

public class Thiru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	try{	
		Mythread t=new Mythread();
       t.setName("first thread");
       t.start();
               
      Mythread t1=new Mythread();
      t1.setName("second");
      t1.start();
      
      Mythread t2=new Mythread();
      t2.setName("three");
      t2.start();
      
      Mythread t3=new Mythread();
      t3.setName("four");
      t3.start();
      
      Mythread t4=new Mythread();
      t4.setName("five");
      t4.start();
      
      Mythread t5=new Mythread();
      t5.setName("six");
      t5.start();
      
      Mythread t6=new Mythread();
      t6.setName("seven");
      t6.start();
      
      t.sleep(1000000000);
      t1.sleep(1000000000);
      t2.sleep(1000000000);
      t3.sleep(1000000000);
      t4.sleep(1000000000);
      t5.sleep(1000000000);
      t6.sleep(1000000000);
      
	}catch(Throwable e){
		e.printStackTrace();
		
	}
	}

}
