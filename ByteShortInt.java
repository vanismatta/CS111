
public class ByteShortInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myMinValue= -2147483648;
		int myMaxValue= 2147483647;
		int myTotal = (myMinValue/2);
		// we are typing in a literal (fixed number)
		//you can put underscores to make the number more legible
		
		byte myByteValue = -128;
		byte myNewByteValue = (byte) (myByteValue/2);
		// we did casting by putting byte before.
		// can fit a much smaller number in byte. if you have lots of calculations, its better to use a byte to use less space
		short myShortValue = 32767;
		short myNewShortValue = (short) (myShortValue/2);
		
		
		/* int has a width of 32
		 byte has a width of 8
		 short has a width of 16
		 long has a width of 64
		 */
		
		long myLongValue = -9223372036854775807L;
		
		// use the integer by default when dealing with whole numbers
		// put the L at the end
		
	}

}
