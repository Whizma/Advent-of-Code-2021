package aoc2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aoc2021Dag2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("aocDag2.txt"));
		int depth = 0;
		int horizontal = 0;
		int aim = 0;
		while (scan.hasNext()) {
			String s = scan.next();
			if (s.equalsIgnoreCase("forward")) {
				System.out.println(s);
				int cp = scan.nextInt();
				horizontal+=cp;
				depth+= (aim * cp);
				
			}
			else if (s.equalsIgnoreCase("down")) {
				System.out.println(s);
				aim+=scan.nextInt();
			}
			else {
				System.out.println(s);
				aim-=scan.nextInt();
			}
		}
		scan.close();
		System.out.println("depth = " + depth);
		System.out.println("horizontal = " + horizontal);
		System.out.println("aim = " + aim);
	}

}
