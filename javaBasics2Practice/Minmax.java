package javaBasics2Practice;

public class Minmax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] array ={1,2,3,4,5,6,7,8,9};
        int max = array[0];
        int min = array[0];

        for(int i = 0; i<9; i++){

//            System.out.print("Enter a number: ");
//            array[i] = input.nextInt();

            if(array[i]>max){
                max = array[i];

            }
            if(array[i]<min){
                min = array[i];
            }

        }

        System.out.print("The maximum number is:" + max);
        System.out.println();
        System.out.print("The minimum number is: " + min);

	}

}
