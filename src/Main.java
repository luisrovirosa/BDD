import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.scrum.Problem1;

public class Main {

	public static String[] getResponse(String fileName)
			throws FileNotFoundException {
		File file = new File(fileName);
		Scanner s = new Scanner(file);
		int number = Integer.parseInt(s.nextLine());
		String[] response = new String[number];
		for (int i = 0; i < number; i++) {
			String line = s.nextLine();
			Problem1 p = new Problem1(line);
			response[i] = p.sort();
			// System.out.println(p.sort());
		}
		s.close();
		return response;
	}

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(args[0]);
		String[] response = Main.getResponse(args[0]);

		for (String lineResponse : response) {
			System.out.println(lineResponse);
		}
	}

}
