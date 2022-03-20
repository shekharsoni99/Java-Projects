import java.util.Comparator;

public class SortByProductPrice implements Comparator<ProductBean> {

    @Override
    public int compare(ProductBean e1, ProductBean e2) {

        if (e1.getProductPrice() > e2.getProductPrice())
            return 1;
        else if (e1.getProductPrice() < e2.getProductPrice())
            return -1;
        else
            return 0;
    }
}