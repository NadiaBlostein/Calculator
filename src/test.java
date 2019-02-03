import java.util.ArrayList;
import java.util.Arrays;

public class test {
	public static int findIndex(int[] array, int element) {
		if (array == null) {
			return -1;
		}else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == element) {
					return(i);
				}
			}
			return(-1);
		}
	}
	
	public static int[] toArray(String Num) {
		int[] arr = new int[Num.length()];
		for (int i = 0; i < Num.length(); i++) {
			if (Num.charAt(i) == 'A' || Num.charAt(i) == 'B' || Num.charAt(i) == 'C' || Num.charAt(i) == 'D'
					|| Num.charAt(i) == 'E' || Num.charAt(i) == 'F') {
						arr[i] = (int) Num.charAt(i) - 55;
			}else if (Num.charAt(i) == '.'){
				arr[i] = 100;
			}else{
				arr[i] = (int) Num.charAt(i) - 48;
			}
		}
		return(arr);
	}
	
	public static String toString(int[] n) {
		String m = "";
		for (int i = 0; i < n.length;i++) {
			m += Integer.toString(n[i]);
		}
		return(m);
	}
	
	// INPUT MUST BE STRING
	public static double toDeci(int[] Num, int base) {
		if (findIndex(Num, 100) == -1) {
			double n = 0;
			int x = Num.length-1;
			for (int i = 0; i < Num.length; i++) {
				n += Math.pow(base, x)*(Num[i]);
				x--;
			}
			return(n);
		}else{
			int y = findIndex(Num, 100);
			System.out.println(y);
			double n = 0;
			int x = findIndex(Num, 100)-1;
			System.out.println(x);
			for (int i = 0; i < findIndex(Num, 100); i++) {
				n += Math.pow(base, x)*(Num[i]);
				x--;
			}
			int z = -1;
			for (int j = findIndex(Num, 100)+1; j < Num.length; j++) {
				n += Math.pow(base, z)*(Num[j]);
				z--;
			}
			return(n);
		}
	}
	public static int[] leftDeciToBase(int[] n, int base) {
		int x = (int) toDeci(n, 10);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (x > 0) {
			arr.add(x%base);
			x = x/2;
		}
		int[] baseOut = new int[arr.size()];
		int m = arr.size()-1;
		for (int i = 0; i < baseOut.length; i++) {
			baseOut[i] = arr.get(m);
			m--;
		}
		return(baseOut);
	}
	public static int[] rightDeciToBase(int[] n, int base) {
		double x = 0;
		int y = -1;
		for (int i = 0; i < n.length; i++) {
			x += Math.pow(10, y)*n[i];
			y --;
		}
		int[] arr = new int[n.length];
		for (int i = 0; i < arr.length; i++) {
			x = x*base;
			arr[i] = (int) x;
			x = x -  (int) x;
		}
		return(arr);
	}
	public static char[] toHex(int[] n) {
		char[] ar = new char[n.length];
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 10) {
				ar[i] = 'A';
			}else if (n[i] == 11) {
				ar[i] = 'B';
			}else if (n[i] == 12) {
				ar[i] = 'C';
			}else if (n[i] == 13) {
				ar[i] = 'D';
			}else if (n[i] == 14) {
				ar[i] = 'E';
			}else if (n[i] == 15) {
				ar[i] = 'F';
			}else{
				ar[i] = (char) (n[i]+48);
			}
		}
		return(ar);
	}
	public static String toString(char[] n) {
		String m = "";
		for (int i = 0; i < n.length;i++) {
			m += n[i];
		}
		return(m);
	}
	public static void main(String[] args) {
		double x = 0.444;
		
		//System.out.print(toDeci(x, 10));
	}
}
