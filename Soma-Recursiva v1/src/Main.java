//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    float[] a = {5, 2, 3, 4, 3};

        System.out.println(soma(a, a.length));

    }

    public static float soma(float[] a, int t) {
        if (t == 0) {
            return 0;
        }
        return a[t -1] + soma(a, t - 1);
    }
}