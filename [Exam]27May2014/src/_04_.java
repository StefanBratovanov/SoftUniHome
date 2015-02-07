import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();

		// ArrayList for products
		ArrayList<String> products = new ArrayList<String>();
		// TreeMap for all the elements ordered in the same way like the input
		TreeMap<String, TreeMap<String, Integer>> AllOrders = new TreeMap<String, TreeMap<String, Integer>>();

		for (int i = 0; i < n; i++) {
			String[] input = scan.nextLine().split("[\\W,\\s]+"); 	
			if (!products.contains(input[2])) {        // Fill the list of products with no duplicates
				products.add(input[2]);
			}
			String name = input[0];
			Integer Amount = Integer.valueOf(input[1]);
			String product = input[2];
													   //If no match for the Key-> product
			if (!AllOrders.containsKey(product)) {     //Fill the Map by Key-> product; Value -> empty Map<name,amount>
				AllOrders.put(product, new TreeMap<String, Integer>());
			}
			TreeMap<String, Integer> customerAmount = AllOrders.get(product); // Get the Map<name,amount> by Key-> product;
			Integer oldValue = 0;
			if (customerAmount.containsKey(name)) {	      //If there already is a Key-> name in that Map
				oldValue = customerAmount.get(name);      // Get the Value by Key-> name 
			}
			customerAmount.put(name, oldValue + Amount);  //update the value on Key->name with (oldValue + Amount).

		}
		for (String product : products) {    
											
			System.out.println(product
					+ ": "
					+ AllOrders.get(product).toString().replace("{", "")   // Key -> from the list of products original input;
							.replace("}", "").replace("=", " "));			// Value -> Get from Map eqivalent to Key
		}
	}

}

// import java.io.ObjectInputStream.GetField;
// import java.util.ArrayList;
// import java.util.Map;
// import java.util.Map.Entry;
// import java.util.Scanner;
// import java.util.TreeMap;
// import java.util.jar.Attributes.Name;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
//
// public class _04_ {
//
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// int n = scan.nextInt();
// scan.nextLine();
//
// ArrayList<String> products = new ArrayList<String>();
// TreeMap<String, TreeMap<String, Integer>> AllOrders = new TreeMap<String,
// TreeMap<String, Integer>>();
//
// for (int i = 0; i < n; i++) {
// String[] input = scan.nextLine().split("[\\W,\\s]+");
// if (!products.contains(input[2])) {
// products.add(input[2]);
// }
// TreeMap<String, Integer> customerAmount = new TreeMap<String, Integer>();
// String name = input[0];
// Integer Amount = Integer.valueOf(input[1]);
// String product = input[2];
// customerAmount.put(name, Amount);
// if (!AllOrders.containsKey(product)) {
// AllOrders.put(product, customerAmount);
// } else {
// for (TreeMap<String, Integer> entry : AllOrders.values()) {
// if (entry.keySet().contains(name)) {
// Integer oldValue = entry.get(name);
// entry.put(name, Amount + oldValue);
// } else
// AllOrders.get(product).put(name, Amount);
// break;
// }
//
// }
// }
// for (String product : products) {
// System.out.println(product + ": " +
// AllOrders.get(product).toString().replace("{",
// "").replace("}", "").replace("="," "));
// }
//
// }
// }
//
//
