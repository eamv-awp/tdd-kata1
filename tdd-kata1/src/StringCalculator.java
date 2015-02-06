public class StringCalculator {
	
	public int add(String numbers) {
		if (numbers == null || numbers.length() == 0)
			return 0;
		else if (!numbers.contains(","))
			return Integer.parseInt(numbers);
		else
			return Integer.parseInt(numbers.substring(0, numbers.indexOf(","))) + Integer.parseInt(numbers.substring(numbers.indexOf(",") + 1));
	}

}
