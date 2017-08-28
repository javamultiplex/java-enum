package com.javamultiplex.myenum;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class EnumMapDemo {

	public static void main(String[] args) {

		EnumMap<ThreadStateEnum, String> map = new EnumMap<>(ThreadStateEnum.class);

		map.put(ThreadStateEnum.START, "Thread is in start state.");
		map.put(ThreadStateEnum.RUNNING, "Thread is in running state.");
		map.put(ThreadStateEnum.WAITING, "Thread is in waiting state.");
		map.put(ThreadStateEnum.DEAD, "Thread is in dead state.");

		Set<Entry<ThreadStateEnum, String>> set = map.entrySet();
		Iterator<Entry<ThreadStateEnum, String>> iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry<ThreadStateEnum, String> entry = iterator.next();
			System.out.println("State : " + entry.getKey().getState());
			System.out.println(entry.getValue());
		}

	}

}
