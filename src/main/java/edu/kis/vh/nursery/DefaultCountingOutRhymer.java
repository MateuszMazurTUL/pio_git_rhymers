package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	private static final int TABLE_SIZE = 12;
	private static final int CHECKED = -1;
	private static final int FULL_CHECK = 11;
	private final int[] NUMBERS = new int[TABLE_SIZE];
	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

		public boolean callCheck() {
			return total == CHECKED;
		}
		
			public boolean isFull() {
				return total == FULL_CHECK;
			}
		
				protected int peekaBoo() {
					if (callCheck())
						return CHECKED;
					return NUMBERS[total];
				}
			
					public int countOut() {
						if (callCheck())
							return CHECKED;
						return NUMBERS[total--];
					}

}
