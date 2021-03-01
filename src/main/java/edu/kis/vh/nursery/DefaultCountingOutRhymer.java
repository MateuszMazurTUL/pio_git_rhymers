package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int FULL_NUMBERS_ELEMENTS = 12;
	public static final int FULL = FULL_NUMBERS - 1;
	public static final int DEFAULT = -1;
	public static final int EMPTY = -1;
	private final int[] numbers = new int[FULL_NUMBERS];
	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == -1;
		}
		
			public boolean isFull() {
				return total == EMPTY;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return DEFAULT;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return DEFAULT;
						return NUMBERS[total--];
					}

}
