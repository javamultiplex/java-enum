package com.javamultiplex.myenum;

public enum ThreadStateEnum {

	START(1) {

		@Override
		public String toString() {
			return "Start state implementation, priority =" + getPriority();
		}

		@Override
		public String getState() {
			return "Start";
		}

	},
	RUNNING(2) {

		@Override
		public String getState() {
			return "Running";
		}

	},
	WAITING(3) {

		@Override
		public String getState() {
			return "Waiting";
		}

	},
	DEAD(4) {

		@Override
		public String getState() {
			return "Dead";
		}

	};

	private int priority;

	public abstract String getState();

	private ThreadStateEnum(int i) {
		setPriority(i);
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Default constructor implementation for all States, Priority : " + getPriority();
	}

}
