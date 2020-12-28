package Algorithms;

public class CheckTheConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 44, 1, 9, 3, 5, 55, 79, 99, 99, 12 };
		int temp ,j;
		for (int i = 1; i < a.length; i++) {
			temp =a[i];
			j=i;
			while (j>0 && a[j-1]>temp) {
				a[j] = a[j-1];
				j=j-1;
			}
			a[j]= temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}
