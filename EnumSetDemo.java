package com.javamultiplex.myenum;

import java.util.EnumSet;

public class EnumSetDemo {

	public static void main(String[] args) {

		EnumSet<ThreadStateEnum> set = EnumSet.allOf(ThreadStateEnum.class);
		for (ThreadStateEnum myEnum : set) {
			System.out.println("State : " + myEnum.getState() + " | Priority : " + myEnum.getPriority());
		}

	}

}
