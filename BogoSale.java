import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BogoSale {
    public static void main(String[] args) {

        int[] p1 = {10, 20, 30, 40, 50, 60};
        int[] p2 = {10, 20, 30, 40, 50, 50, 60};

        process(p1);

        process(p2);
    }

    private static void process(int[] prices) {
        List<Integer> pl = new ArrayList<>();
        for (int price : prices) {
            pl.add(price);
        }
        Collections.sort(pl, Collections.reverseOrder());

        List<Integer> d = new ArrayList<>();
        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < pl.size(); i++) {
            p.add(pl.get(i));
            if (i + 1 < pl.size()) {
                d.add(pl.get(i + 1));
                i++;
            }
        }
        System.out.println("discount things" + d);
        System.out.println("payable things"+ p);
    }

}
