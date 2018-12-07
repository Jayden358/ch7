package ch7;

public class Arrays {
	public static void main(String[] args) {
		String[] gamelist = {"Red Dead Redemption 2","Detroit become human","zelda botw","Final Fantasy XV","Metal Gear Solid 5","zero escape games","Battlefield 1/4","Forza horizon 3","last of us","RDR 1",};
		for (int i=0; i<3; i++) {
			System.out.println("top 3");
			System.out.println(gamelist[i]);
		}
	
		for (int i=4; i<8; i++) {
			System.out.println("middle");
			System.out.println(gamelist[i]);
		}
		for (int i=7; i<10; i++) {
			System.out.println("bottom3");
			System.out.println(gamelist[i]);
		}
		
		double[] nums;
		nums = new double[100];
		System.out.println(nums[1]);
		char[] charlist = new char[10];
		System.out.println(charlist[0]);
	
		int numintlist[] = new int[11];
		System.out.println(numintlist[0]);
		
		boolean boollist[] = new boolean[10];
		System.out.println(boollist[9]);
		for (int i=0; i<100 ; i++){
		
			nums[i] = Math.random() * 100;
		}
		for (int i=0; i<100 ; i++){
			
			System.out.println(nums[i]+" ");
		}
		int x=nums.length;
		System.out.println(x);
		for (int i=0; i<100 ; i++){
			
			System.out.println(nums[i]+" ");
}
		char[] city= {'s','a','l','t',' ','l','a','k','e'};
		System.out.println(city);
		double total = 0;
		for(int i=0; i<nums.length ; i++) {
			
			total = total+nums[i];
		
		}
		System.out.println(total);
		
		int[] myList = new int[10];
		for (int i=0; i<100 ; i++){
			
			myList[i] = (int) (Math.random() * 100);
		}
		for (int i=0; i<10; i++) {
			if(myList[i]==5) {
			System.out.println("true");
			break;
			
		}
		else {
			System.out.println("false");
		}
		}
		int min = myList[0];
		for (int i=0; i<myList.length ; i++) {
			if (myList[i] <min){
				min = myList[i];
			}
			System.out.println(min);
			for (int i=0; i<10 ; i++) {
				myList[i] = i;
			}
			for (int i = myList.length -1; i>0 ; i--) {
				int j = (int)(Math.random()*(i+1));
				int temp = myList[i];
				myList[i]= myList [j];
				myList[j] = temp;
			}
			for (int i=0; i<10 ; i++) {
				System.out.println(myList[i]);
				
			}
			for(int e: myList) {
				System.out.println(e);
			}
			
	}
	}
	}
