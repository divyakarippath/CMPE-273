package hw1;

public class OddThread extends Thread{


	public void run(){
		for(int i=1;i<1000;i++){
			System.out.printf("Odd: %d\n",i);
			i++;
		}
	}
}
