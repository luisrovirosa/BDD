import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Test;

import com.scrum.Problem1;

public class ShorterTest {

	@Test
	public void test() {
		String[] inputs = { "2 b ba",
				"6 facebook hacker cup for studious students",
				"5 k duz q rc lvraw", "5 mybea zdr yubx xe dyroiy",
				"5 jibw ji jp bw jibw", "5 uiuy hopji li j dcyi" };
		String[] responses = { "bab", "cupfacebookforhackerstudentsstudious",
				"duzklvrawqrc", "dyroiymybeaxeyubxzdr", "bwjibwjibwjijp",
				"dcyihopjijliuiuy"

		};
		for (int i = 0; i < inputs.length; i++) {
			Problem1 problem = new Problem1(inputs[i]);
			String solution = problem.sort();
			assertEquals(responses[i], solution);
		}
	}

	@Test
	public void test2() throws FileNotFoundException {
		String[] response = Main
				.getResponse("/home/zilc/workspace/Numeros/src/studious_student.in");

		File f = new File("/home/zilc/workspace/Numeros/src/studious_student.out");
		Scanner s = new Scanner(f);
		int number = response.length;
		for (int i = 0; i < number; i++) {
			String line = s.nextLine();
			assertEquals(line, response[i]);
		}
		
		// File inputFile = new File('file.txt');

	}
}
