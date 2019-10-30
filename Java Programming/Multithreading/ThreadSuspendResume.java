package Multithreading;

import java.util.*;

class ThreadOne extends Thread{
	public void run(){
		try{
			System.out.println("First Thread running");
			sleep(10000);
			System.out.println("First Thread Finishes Running");
		}
		catch(Exception e){

		}
	}
}
class ThreadTwo extends Thread{
	public void run(){
		System.out.println("Second Thread starts running");
		System.out.println("Second Thread suspended");
		suspend();
		System.out.println("Second Thread runs again");
	}
}
class ThreadSuspendeResume{
	public static void main(String[] args) {
		try{
			ThreadOne t1=new ThreadOne();
			ThreadTwo t2=new ThreadTwo();

			t1.start();
			t2.start();

			System.out.println("Second Thread revived");
			t2.resume();

			System.out.println("Second thead went for 10 seconds sleep");
			t2.sleep(10000);

			System.out.println("Wake up second thread and finishes running");
		}
		catch(Exception e){
			
		}
	}
}