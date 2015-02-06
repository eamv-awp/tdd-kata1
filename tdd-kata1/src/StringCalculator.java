public class StringCalculator {
	public int add(String numbers) {
		String delimiter = ",";
		
		if (numbers == null || numbers.length() == 0)
			return 0;
		else if (!numbers.contains(delimiter))
			return Integer.parseInt(numbers);
		else {
			int indexOfDelimiter = numbers.indexOf(delimiter);
			return Integer.parseInt(numbers.substring(0, indexOfDelimiter)) + Integer.parseInt(numbers.substring(indexOfDelimiter + 1));
		}
	}

}
