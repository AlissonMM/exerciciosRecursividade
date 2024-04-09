import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float[] a = {3, 6, 9, 10, 11, 18, 20};

        multiplos(a, a.length-1);

    }

    public static void multiplos(float[] a, int t) {
        if (t >= 0) {
           multiplos(a, t - 1);

            if (a[t] % 3 == 0) {
                System.out.println(a[t]);
            }
        }


    }
}