public class Fibonacci {

    public void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 2;
        System.out.println(a);
        System.out.println(b);
        while (count < n) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(b);
            count++;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.printFibonacci(20);
    }
}
