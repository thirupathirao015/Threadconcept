package typecasting;

public class AutoBoxing {
     static  Integer I=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int a=I;
            System.out.println("Auto_unboxing"+a);
            Integer b=new Integer(a);
            System.out.println("Auto_boxing"+b);
	}

}
