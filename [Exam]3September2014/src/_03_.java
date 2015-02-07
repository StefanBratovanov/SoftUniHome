import java.util.Scanner;
import java.util.TreeSet;

public class _03_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().replaceFirst("^[(,),\\s+]+", "")
				.split("[(,),\\s+]+");
		Integer[] numbers = new Integer[input.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.valueOf(input[i]);
		}
		TreeSet<Integer> listNums = new TreeSet<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			boolean isPrime = checkIfPrime(numbers[i]);
			if (isPrime) {
				listNums.add(numbers[i]);
			}
		}

		Integer[] primes = (Integer[]) listNums.toArray(new Integer[listNums
				.size()]);
		if (primes.length>=3) {
			int maxSum = primes[primes.length - 1] + primes[primes.length - 2]
					+ primes[primes.length - 3];

			System.out.println(maxSum);
		}
		else {
			System.out.println("No");
		}

	}

	private static boolean checkIfPrime(Integer num) {
		if (num < 0) {
			return false;
		}
		if (num == 1) {
			return false;
		}
		int devider = 2;
		int maxDevider = (int) Math.sqrt(num);
		boolean prime = true;
		while ((devider <= maxDevider) && prime) {
			if (num % devider == 0) {
				prime = false;
			}
			devider++;
		}
		return prime;
	}
}
