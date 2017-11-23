package methodsignature;

public class Test {
      public void m1(int i){
    	  System.out.println("your are entered value int is:"+i);
      }
      public void m2(String s){
    	  System.out.println("you are entered String value is:"+s);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Test t=new Test();
              t.m1(10);
              t.m2("thirupathi");
              
            	//t.m3(10);//method signature consists of method names fallowed by orgument types.
              
            
	}

}
