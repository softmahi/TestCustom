package cm.test.ncr;

import java.util.Scanner;

public class MinValue {
	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
	    String nos [] = scanner.nextLine().split(" ");
	    int [] actualnos = new int[nos.length];
	    for (int k = 0; k < nos.length; k++) {
			actualnos[k] =Integer.parseInt(nos[k]);
		}
	    
	    int mimimunIndex = getMin(actualnos);
	    
	    int sliceDNos =sliceDown(actualnos, mimimunIndex,actualnos.length);
	    
	}

	private static int sliceDown(int[] actualnos, int mimimunIndex, int length) {
		
		
		int new_range = -1;
		int new_smallestindex = 0;
		
		int smallestNo = actualnos[mimimunIndex];
		
		int newSmallestNos = 0;
		for (int i = 0; i < actualnos.length; i++) {
			if(actualnos[i] != smallestNo) {
				
				actualnos[new_smallestindex] = actualnos[i]-smallestNo;
				
				
			if(actualnos[new_smallestindex] > actualnos[i]) {
				newSmallestNos = i;
				
			}
		}	
		}
		
		return length;
		
		
	
		
	}

	private static int getMin(int[] actualnos) {
		// TODO Auto-generated method stub
		
		int small = 0;
			for (int i = 1; i < actualnos.length; i++) {
				if(actualnos[small] > actualnos[i]) {
					small = i;
					
				}
			}	
			System.out.println("Smallest::"+actualnos[small]);
		return small;
	}
	
	

}
