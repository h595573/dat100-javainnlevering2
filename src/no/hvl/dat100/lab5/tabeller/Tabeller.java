package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		for(int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
			System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tab= "[";
		for (int i=0; i <tabell.length; i++) {
			if (i < tabell.length-1) {
				tab += tabell[i]+",";
			}else{
				tab += tabell[i];
				}
		}
		tab +="]";
		return tab;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for(int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) return true;
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i = 0;
		while (i<tabell.length) {
			if (tabell[i]==tall) {
				return i;
			}
			else i++;
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] tab = new int[tabell.length];
		for(int i = 0; i < tabell.length; i++) {
			tab[tabell.length - i - 1] = tabell[i];
		}
		return tab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] tab = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tab.length; i++) { 
			if (i < tabell1.length) tab[i] = tabell1[i];
			else tab[i] = tabell2[i - tabell1.length];
		}
		return tab;
	}
}
