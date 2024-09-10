public class Multiples {
    public static void main(String[] args) {
        int upperBound = 1000; // This sets the number we are testing up to

//        int multiplesOfThree = upperBound/3;
//        int multiplesOfFive = upperBound/5;
//        int multiplesOfFifteen = upperBound/15;

        int multiplesOfThree, multiplesOfFive, multiplesOfFifteen;

        if(upperBound % 3 == 0) {
            multiplesOfThree = (upperBound / 3) - 1;
        } else {
            multiplesOfThree = (upperBound / 3);
        }

        if(upperBound % 5 == 0) {
            multiplesOfFive = (upperBound / 5) - 1;
        } else {
            multiplesOfFive = (upperBound / 5);
        }

        if(upperBound % 15 == 0) {
            multiplesOfFifteen = (upperBound / 15) - 1;
        } else {
            multiplesOfFifteen = (upperBound / 15);
        }

        System.out.println(multiplesOfFive + multiplesOfThree - multiplesOfFifteen);
    }
}
