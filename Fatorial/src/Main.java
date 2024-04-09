//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(fatorial(5, 2));
    }

    public static int fatorial(int x, int n) {
        if (n == 0) {

            return 1;
        }
            return fatorial(x, n - 1) * x;
        }
    }
