package firstPackage;

public class firstClass {
	// primitive data types
	/* 
	 * byte - 	 [whole number]
	 * short -   [whole number]
	 * long - 	 [whole number]
	 * int - 	 [whole number]
	 * double -  [decimal number]
	 * float -   [decimal number]
	 * char - 	 [single alpha-numeric character]
	 * boolean - [true or false]
	*/

	// need a main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling the system class
		// using the *out* method
		// 'println' is print-line, it prints the string and creates a new line
		
		String firstName = "Nicholas";
		System.out.println("Hello my name is: " + firstName);
		
		// byte
		byte minByte = Byte.MIN_VALUE; // -128
		byte maxByte = Byte.MAX_VALUE; // 127
		System.out.println(minByte + " " + maxByte);
		
		// short
		short minShort = Short.MIN_VALUE; // -32768
		short maxShort = Short.MAX_VALUE; // 32767
		System.out.println(minShort + " " + maxShort);
		
		// double
		double doubleNum = Double.MAX_VALUE; // 1.7976931348623157E308
		double doubleRandom = 45.34;
		System.out.println(doubleNum);
		
		// float
		float floatNum = Float.MAX_VALUE; // 3.4028235E38
		float floatRandom = 45.34f; // need f for float
		System.out.println(floatNum + " " + floatRandom);
		
		boolean niceWeather = true; // 1
		boolean isRaining = false; //  0
		
		
		
	}

}
