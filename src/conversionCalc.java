import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class conversionCalc {
	
	// Used later to return the index of character 100 (where we have '.')
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

	public static String toString(char[] n) {
		String m = "";
		for (int i = 0; i < n.length;i++) {
			m += n[i];
		}
		return(m);
	}
	
	// Converting anything TO DECIMAL (input must be Integer Array)
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
			double n = 0;
			int x = findIndex(Num, 100)-1;
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
	
	// Converting LEFT of decimal point to desired base
	public static int[] leftDeciToBase(int[] n, int base) {
		int x = (int) toDeci(n, 10);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (x > 0) {
			arr.add(x%base);
			x = x/base;
		}
		int[] baseOut = new int[arr.size()];
		int m = arr.size()-1;
		for (int i = 0; i < baseOut.length; i++) {
			baseOut[i] = arr.get(m);
			m--;
		}
		return(baseOut);
	}
	
	// Converting RIGHT of decimal point to desired base
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
			x = x - (int) x;
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
	
	// Converting decimal to desired base. Input MUST be a double in decimal!
	public static String toBase(double num, int baseOutput) {
		String n = Double.toString(num);
		int[] x = toArray(n);
		if (num - (int) num == 0 || findIndex(x, 100) == -1) {
			int[] g = new int[findIndex(x, 100)];
			for (int i = 0; i < g.length;i++) {
				g[i] = x[i];
			}
			int[] z1 = leftDeciToBase(g, baseOutput);
			char[] z2 = toHex(z1);
			String s = toString(z2);
			return(s);
		}else {
			int[] x1 = new int[findIndex(x, 100)];
			int[] x2 = new int[x.length - findIndex(x, 100)-1];
			for (int i = 0; i < x1.length; i++) {
				x1[i] = x[i];
			}
			int d = findIndex(x, 100)+1;
			for (int j = 0; j < x2.length; j++) {
				x2[j] = x[d];
				d++;
			}
			int[] y1 = leftDeciToBase(x1, baseOutput);
			int[] y2 = rightDeciToBase(x2, baseOutput);
			char[] y3 = toHex(y1);
			char[] y4 = toHex(y2);
			String a = toString(y3);
			String b = toString(y4);
			String r = a + "." +b;
			return(r);
		}
	}
	public static String removeNegative(String m) {
		String n = "";
		for (int i = 0; i < m.length(); i++) {
			if (m.charAt(i) != '-') {
				n += m.charAt(i);
			}
		}
		return(n);
	}
	
	// BASIC METHOD: Takes input and converts it to desired base
	public static String basicOp(String num, int inputBase, int outputBase) {
		int[] a = toArray(num);
		double x = toDeci(a, inputBase);
		String y = toBase(x, outputBase);
		return(y);
	}
	
	public static void main(String[] args) {
		String s = "0.773";
		System.out.print(basicOp(s, 8, 5));
	}
	
}
