public class PracticeProblem {

	
	public static int lettersToFive(String thisString, char findThis) {
		int currentCount = 0;
		int counter = 0;
		int stringlen =  thisString.length();
		while (currentCount < 5 && counter < stringlen) {
			if (thisString.charAt(counter) == findThis) {
				currentCount += 1;
			}
			counter += 1;
		}
		return currentCount >= 5 ? counter : -1;
	}

	public static int countLetter(String thisString, char findThis) {
		int currentCount = 0;
		int stringlen =  thisString.length();
		for (int counter = 0; counter < stringlen; counter++) {
			if (thisString.charAt(counter) == findThis) {
				currentCount += 1;
			}
		}
		return currentCount;
	}

	public static int oddSum(int arg1, int arg2) {
		
		int num1 = Math.min(arg1, arg2);
		int num2 = Math.max(arg1, arg2);
		
		int sum = 0;
		// find a pattern
		// 3, 6
		// 3 + 5
		// = 8
		// 3,9
		// 3, 5, 7, 9
		// pattern not found + I'm too lazy for this especially after failing the CCC
		if (num2 % 2 == 0) { num2 -= 1; }
		if (num1 % 2 == 0) { num1 += 1; }
		int counter = num1;
		while (counter <= num2) {
			sum += counter;
			// System.out.println(counter);
			counter += 2;
			
		}
		return sum;
	}	

	public static void main(String args[]) {
		
		System.out.println(oddSum(1,3));

	}

}

/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18296575)
# Instructions  

  ## Questions

1. 
Create a function called _lettersToFive_ that takes a String and a character as parameters. </br>
Using a while loop, output how many letters into the word it takes to find 5 instances of the character.</br>
If there are no instances of the character, return -1.</br>

Examples:

```
lettersToFive("hello lillian", 'l')
returns: 10
```

```
countLetter("Whatever", 'e')
returns: -1
```

2.

Create a function called _countLetter_ which takes in a String and a character.</br>
Return the amount of occurances of the character in the String.</br>

Examples:

```
countLetter("hello", 'l')
returns: 2
```

```
countLetter("I don't know", 'e')
returns: 0
```

3. 

Create a function called _oddSum_ which takes in two integers as parameters.
returns the sum of all odd integers between the two numbers inclusively.
Order of the integers does not matter

Examples:

```
oddSum(2, 6)
returns: 8
```
Explanation: 3+5 = 8

```
oddSum(0, 10)
returns 25
```
Explanation: 1+3+5+7+9 = 25

```
oddSum(9, 2)
returns 24
```
Explanation: 3+5+7+9 = 24
*/