public class PrimeNumbers {
    public static void main(String args[]) {

            int count = 0;
            for (int i = 2;count<= 100; i++) {
                int prime=0;
                for (int j = i; j >= i; j--) {
                    if (i % j == 0) {
                        prime=prime+1;

                    }
                    if (prime == 2) {
                        System.out.println(i);
                        count++;
                    }
                }
            }
        }
    }







