import java.util.Scanner;

public class _01_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		boolean found = false;
		
		Integer[]nums = new Integer[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		if (n>=4) {
			for (int a = 0; a < nums.length; a++) {
				for (int b = 0; b < nums.length; b++) {
					for (int c = 0; c < nums.length; c++) {
						for (int d = 0; d < nums.length; d++) {
							if (   nums[a]!=nums[b] && nums[a]!=nums[c]&& nums[a]!=nums[d] &&
									nums[b]!=nums[c] &&  nums[b]!=nums[d] && nums[c]!=nums[d])
									if (((nums[a]+""+nums[b]).equals((nums[c]+""+nums[d])))) {
										System.out.printf("%d|%d==%d|%d%n",nums[a],nums[b],nums[c],nums[d]);
										found = true;
									}
							}
						}
					}
				}
			
			if (!found) {
				System.out.println("No");
			}
		}
		else {
			System.out.println("No");
		}
		
	}
}
//if (((nums[a]!=nums[b])  &&  (nums[b]!=(nums[c]))  &&  (nums[c]!=(nums[d]))&&(nums[a]!=(nums[d])))