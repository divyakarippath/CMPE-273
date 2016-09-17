package hw1;

public class EvenThread extends Thread{
	

	
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.printf("Even: %d\n",i);
			i++;
		}
	}

}
