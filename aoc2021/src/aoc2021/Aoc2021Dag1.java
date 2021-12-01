package aoc2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Aoc2021Dag1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("aocDag1.txt"));
		ArrayList<String> list = new ArrayList<>();
		while (scan.hasNext()) {
			String s = scan.next();
			list.add(s);
		}
		scan.close();
		int counter = 0;
		for (int i = 0; i < list.size() - 3; i++) {
			int a = Integer.valueOf(list.get(i));
			int b = Integer.valueOf(list.get(i + 3));
			if (a < b) {
				counter++;
			}
		}
		System.out.println(counter);
	}
 // poggers
}

