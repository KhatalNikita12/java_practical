/*Write a Program to print all Prime numbers in an array of ‘n’ elements. 
 (use command line arguments)*/
 public class prime {
    public static void main(String[] args) {
      int[] numbers = new int[args.length];

        for (int i = 0; i < args.length; i++) {
           numbers[i] = Integer.parseInt(args[i]);
        }

        System.out.print("Prime numbers in the array: ");
        for (int num : numbers) {
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= num/2; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
