package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] tab : matrise) {	
			System.out.print("[");
			for(int element : tab) {
				System.out.print(element + " ");
			}
			System.out.println("]");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String strengRep = "";
		for (int[] tab : matrise) {
			for (int tall : tab) {
				strengRep += (tall + " ");
			}
			strengRep += "\n";
		}
		return strengRep;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] mat = new int[matrise.length][];
		for(int i = 0; i < matrise.length; i++) {
			mat = new int[matrise.length][matrise[i].length];
		}
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				mat[i][j] = matrise[i][j] * tall;
			}
		}
		return mat;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		for(int i = 0; i < a.length; i++) {
			for(int lik = 0; lik < a[i].length; lik++) {
				if(a[lik] == b[lik]) {
					return true;
				}
			}
		}
	return false;
	}
}
	
