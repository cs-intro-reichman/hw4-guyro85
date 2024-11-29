public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[n + 1];
        if (primes.length <= 2){
            System.out.println("none");
        }
        else{
            for (int i = 2; i < primes.length; i++){
                primes[i] = true;
            }
            for (int i = 2; i < primes.length; i++){
                for (int j = 2; j < i; j++){
                    if (i % j == 0 && i != j){
                        primes[i] = false;
                        break;
                    }
                }
            }
            int count = 0;
            System.out.println("Prime numbers up to " + n + ":");
            for (int i = 2; i < primes.length; i++){
                if (primes[i]){
                    System.out.println(i);
                    count++;
                }
            }
            int precentage = (int)(100 *((double)count / n));
            System.out.println("There are " + count + " primes between 2 and " + n + " (" + precentage + "% are primes)");
        }
        
    }
}