package com.javamultiplex.myenum;

public class ThreadStateEnumDemo {

	public static void main(String[] args) {

		// Example of values() method
		for (ThreadStateEnum state : ThreadStateEnum.values()) {
			System.out.println("State : " + state);
			System.out.println(state.getState());
		}
		// Example of value() method
		ThreadStateEnum myEnum = ThreadStateEnum.valueOf("WAITING");
		System.out.println("Priority : " + myEnum.getPriority());

		ThreadStateEnum myNewEnum = Enum.valueOf(ThreadStateEnum.class, "RUNNING");
		System.out.println("State : " + myNewEnum.getState());
	}

}
