import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class CBalls {
	
	static int getEndRandomNumber(int N){
		double sum=1;
		for (int o=1; o<=N; o++)
			sum = sum + Math.pow(2, o);
		Double d = new Double(sum);
		int sumi = d.intValue();
		return sumi;
	}
	
	static int[] stringToBinary(String[] A, int limit){
		int[] B = null;
		for(int i=1; i<=limit; i++){
			if(A[i].equalsIgnoreCase("B")){
				B[i] = 0;
			}
			if(A[i].equalsIgnoreCase("W")){
				B[i] = 1;
			}
		}
		return B;
	}
	
	static int[] numberToBinary(int A, int N){
		int[] B = null;
		int[] BT = null;
		int C = A;
		int T;
		for(int i=1; i<=N; i++){
			T = C;
			BT[i] = T%2;
			C = T/2;
		}
		for (int i=1, j=N; i<=N; i++, j--)
			B[i] = BT[N];
		return B;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		int T = in.nextInt();
		for(int i=0; i<T; i++){
			String X = in.next();
			String Y = in.next();
			int N = X.length();
			int hd, kx=0, ky=0;
			String[] x = null, y = null;
			for(int j=1; j<=N; j++){
				x[kx++] = X.substring(j, j+1);
				y[ky++] = Y.substring(j, j+1);
			}
			int[] xb;
			int[] yb;
			int[] zb;
			xb = stringToBinary(x, N);
			yb = stringToBinary(y, N);
			
			//loop for random values of Z
			for(int j=1; j<=N; j++){
				int zn = r.nextInt(getEndRandomNumber(N));//nextInt returns 0(inclusive) to N(exclusive)
				zb = numberToBinary(zn, N);
				//compare hd
			}
		}
	}
}