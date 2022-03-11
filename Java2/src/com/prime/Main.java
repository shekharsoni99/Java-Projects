package com.prime;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,12,5,50,11,14,15,2,1};

        int[] result = findAndReturnPrimeNumbers(arr);

        if(result[0] == 0)
            System.out.println("Prime number not found in the supplied Array");

        else {
            for (int item : result) {
                if (item == 0) {
                    break;
                }
                System.out.println(item);
            }
        }
    }

    public static int[] findAndReturnPrimeNumbers(int[] inputArray) {
        int[] primeNumberArr = new int[inputArray.length];
        int arrCount = 0;

        for (int j = 0; j  < inputArray.length; j++) {
            int count = 0;
            for (int i = 1; i <= inputArray[j]; i++) {
                if(inputArray[j] % i == 0) {
                    count++;
                }
            }
            if(count == 2) {
                primeNumberArr[arrCount++] = inputArray[j];
            }
        }
        return primeNumberArr;
    }
}

