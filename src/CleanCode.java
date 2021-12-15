public class CleanCode {
    static class Check {

        int smallestNumber;
        int largestNumber;
    }
//Method For finding Largest and smallest Number
    static Check findLargestSmallestNumber(int []givenArray, int arraySize) {
        Check checkedObject = new Check();
        int i;

        if (arraySize == 1) {
            checkedObject.largestNumber = givenArray[0];
            checkedObject.smallestNumber = givenArray[0];
            return checkedObject;
        }

        if (givenArray[0] > givenArray[1]) {
            checkedObject.largestNumber = givenArray[0];
            checkedObject.smallestNumber = givenArray[1];
        } else {
            checkedObject.largestNumber = givenArray[1];
            checkedObject.smallestNumber = givenArray[0];
        }

        for (i = 2; i < arraySize; i++) {
            if (givenArray[i] > checkedObject.largestNumber) {
                checkedObject.largestNumber = givenArray[i];
            } else if (givenArray[i] < checkedObject.smallestNumber) {
                checkedObject.smallestNumber = givenArray[i];
            }
        }

        return checkedObject;
    }
//MAin Method
    public static void main(String args[]) {
        int [] givenArray = {1000, 11, 445, 1, 330, 3000};
        int arraySize = 6;
//Printing the giver array
        System.out.println("Given array is : ");
        for(int i=0;i<arraySize;i++){
            System.out.print(givenArray[i] + "  ");
        }
        Check checkedObject = findLargestSmallestNumber(givenArray, arraySize);
        System.out.printf("\nSmallest Number is %d", checkedObject.smallestNumber);
        System.out.printf("\nLargest Number is %d", checkedObject.largestNumber);
    }
}