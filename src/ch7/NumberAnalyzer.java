package ch7;

public class NumberAnalyzer {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;

		
		System.out.print("Enter the numbers: ");
		for (int i = 0 ; i<n; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		
		double average = sum/numbers.length;
		int lower=0;
		int high=0;
		for(double element:numbers) {
			if (element < average) {
				lower++;
			}
			else {
				high++;
			}
		}
		double min = numbers[0];
		double max = numbers[0];
		for (double element:numbers) {
			if(element<min) {
				min=element;
				
			}
			if(element>max) {
				max = element;
			}
			
		}
		System.out.println("min "+min);
		System.out.println("max "+max);
		System.out.println("avg "+average);
		double temp;
		
		for (int i =0;i<n-1; i++)
			
			for (int j=0; j<n-i-1; j++) 
				if (numbers[j] > numbers[j+1]) { 
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1]=temp;
				}
		
			
	}

}
