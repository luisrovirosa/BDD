import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.scrum.Problem1;

public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(args[0]);
		File file = new File(args[0]);
		Scanner s = new Scanner(file);
		int number = Integer.parseInt(s.nextLine());
		for (int i = 0; i < number; i++) {
			String line = s.nextLine();
			Problem1 p = new Problem1(line);
			System.out.println(p.sort());
		}
		s.close();

	}

}
