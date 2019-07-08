
class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

//		throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
		boolean isArmstrongNumber = false;
		int numberOfDigits = String.valueOf(numberToCheck).length();
		int temporaryHolder = numberToCheck;
		int computationResult =0;
		
		while(temporaryHolder>0) {
			computationResult += Math.pow((temporaryHolder%10), numberOfDigits);
			temporaryHolder = temporaryHolder/10;
		}
		System.out.println(computationResult);
		if(computationResult == numberToCheck)
			isArmstrongNumber = true;
		return isArmstrongNumber;
	}
	
	public static void main(String[] args) {
		ArmstrongNumbers a = new ArmstrongNumbers();
		System.out.println(a.isArmstrongNumber(9926315));
	}

}
