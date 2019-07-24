import java.util.ArrayList;

public class Calculator {

	ArrayList<String> list = new ArrayList<>();
	{

	}

	public String add(String number) {
		
		if (number == null) {
			return "0.0";
		}

		if (number.contains("\n")) {
			number = number.replace('\n', ',');
		}

		double sum = 0.0;
		if (number.isEmpty()) {
			return "0.0";

		} else {
			String[] parts = number.split(","); // String [1.1, 2.2, 1.2]
			for (int i = 0; i < parts.length; i++) {
				sum += Double.parseDouble(parts[i]);
			}
			return Double.toString(sum);
		}

	}

}
