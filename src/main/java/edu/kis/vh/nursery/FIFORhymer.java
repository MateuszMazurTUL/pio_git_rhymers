package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public final defaultCountingOutRhymer countingOut = new defaultCountingOutRhymer();

	public int countOut() {
		while (!callCheck()) {
			countingOut.countIn(super.countOut());
		}

		int ret = countingOut.countOut();

		while (!countingOut.callCheck()) {
			countIn(countingOut.countOut());
		}
		return ret;
	}
}