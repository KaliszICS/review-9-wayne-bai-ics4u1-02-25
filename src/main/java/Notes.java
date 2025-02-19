import java.util.Scanner;

class Notes {
	public static void main(String[] args) {
		//while loops

		int num;
		num = 0;

		//ensure that it will become false
		while (num < 10) {
			System.out.println("Hello");
			System.out.println(num);
			num = num + 1; //makes it eventually false
		}
		//for loops

		//for (intializiation step; condition; increment step)
		for (int i = 0; i < 10; i++) { //runs 10 times
			System.out.println("Hello");
			System.out.println(i);
		}

		//for loops are used when you know how many times you want to run a loop ahead of time
		//while  loops are usually used when you have no idea how many times a loop will run.

		// Counters and accumulators

		//Counters

		Scanner s = new Scanner(System.in);

		int num2 = -1;
		int count = 0;

		while (num2 != 0) {
			System.out.print("In: ");
			num2 = s.nextInt();
			if (num2 == 5) {
				count++;
			}
		}

		System.out.println(count);

		//Accumulators


		num2 = -1;
		int sum = 0;

		while (num2 != 0) {
			System.out.println("IN: ");
			num2 = s.nextInt();
			sum += num2;
		}

		System.out.println(sum);
	}
}
