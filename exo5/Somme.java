package training.exo5;

public class Somme {
    public static void main(String[] args) throws InterruptedException {
        int[] tabInt = {1,2,3,4,5,6,7,8,9,9};
        int somme,halfS1,halfS2 ;

        // Diviser le tableau en deux parties
        int[] firstHalf = getFirstHalf(tabInt);
        int[] secondHalf = getSecondHalf(tabInt);

        SommeRunnable s1 = new SommeRunnable(firstHalf);
        SommeRunnable s2 = new SommeRunnable(secondHalf);

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        halfS1 = s1.getSum();
        halfS2 = s2.getSum();

        somme = halfS1+halfS2;

        System.out.println(
                "La somme des elements du 1er moitie est  : "+ halfS1 + "\n"+
                "La somme des elements du 2e moitie est  : "+ halfS2 + "\n"+
                "La somme des elements des deux tableaux est : "+ somme
        );
    }

    public static int[] getFirstHalf(int[] tabInt){
        int halfTabLength = tabInt.length / 2;
        int [] halfTabInt = new int[halfTabLength];
        System.arraycopy(tabInt, 0, halfTabInt, 0, halfTabLength);
        return halfTabInt;
    }
    public static int[] getSecondHalf(int[] tabInt){
        int halfTabLength = tabInt.length/2;
        int [] halfTabInt = new int[halfTabLength];
        for (int i = 0; i < halfTabLength; i++) {
            halfTabInt[i] = tabInt[halfTabLength+i];
        }
        return halfTabInt;
    }
}
