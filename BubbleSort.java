import java.util.*;
class BubbleSort {
	public static void main(String []args) {
		int n, i, j;
		String swap;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings to sort: ");
		n = sc.nextInt();
		String str[] = new String[n];
		System.out.println("Enter the strings: ");
                                for (i = 0; i < n; i++) {
		      str[i] = sc.nextLine();
                                }
		for (i = 0; i < n-1; i++) {
			for (j = 0; j < n-i-1; j++) {
				if (str[j].compareTo(str[j+1]) > 0) 
				{
					swap  = str[j];
					str[j]   = str[j+1];
					str[j+1] = swap;
				}
			}
		}
		System.out.println("Strings in sorted order: ");
		for (i = 0; i < n; i++) {
		      System.out.println(str[i]);
                                }
	}
}