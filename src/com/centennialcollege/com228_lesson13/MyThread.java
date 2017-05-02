package com.centennialcollege.com228_lesson13;

public class MyThread extends Thread {

	private String _name;
	
	public MyThread(String name) {
		this._name = name;
	}
	
	@Override
	public void run() {

		// Task
		for (int index = 0; index < 10; index++) {
			System.out.println("Thread " + this._name + " Count: " + index);
			try {
				sleep(1000);  // wait for 1000 ms = 1 sec
			} catch (InterruptedException exception) {
				System.err.println("Thread Interrupted: " + exception);
			}
		}

		super.run();
	}

}
