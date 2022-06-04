public class Main {
    public static void main(String[] args) {
        System.out.println(minimalDifference(10,1,2));
    }
    public static int minimalDifference (int apples, int oranges, int coins){
        if(apples<oranges){
            for (int i = 0; i < coins; i++) {
                if(apples<oranges){apples++;}
                else {oranges++;}
            }
        } else if (apples==oranges){
            for (int i = 0; i < coins/2; i++) {
                apples++;
                if(i<coins/2) {oranges++;}
            }
        } else {
            for (int i = 0; i < coins; i++) {
                if(apples>oranges){
                    oranges++;
                } else {apples++;}
            }
        }
        return Math.abs(apples-oranges);
    }
}
