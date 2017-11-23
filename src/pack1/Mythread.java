package pack1;

import java.util.ArrayList;

public class Mythread extends Thread {
	
int finalval=0;	
ArrayList<Integer> listval= new ArrayList<Integer>();
ArrayList<Integer> listval1= new ArrayList<Integer>();
ArrayList<Integer> listval2= new ArrayList<Integer>();
ArrayList<Integer> listval3= new ArrayList<Integer>();
ArrayList<Integer> listval4= new ArrayList<Integer>();
ArrayList<Integer> listval5= new ArrayList<Integer>();
ArrayList<Integer> listval6= new ArrayList<Integer>();
ArrayList<Integer> listval7= new ArrayList<Integer>();
public void run(){
	for(int i=1;i<1000000000;i++){
		System.out.println("chaild thread1 exicuted"+i);
		
		int k=i;
		k=k*i;
		k=k-1;
		k=k+k;
		finalval=finalval+k;
		listval.add(finalval);
		listval1.add(finalval);
		listval2.add(finalval);
		listval3.add(finalval);
		listval4.add(finalval);
		listval5.add(finalval);
		listval6.add(finalval);
		listval7.add(finalval);
	}
}
}
