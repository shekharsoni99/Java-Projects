import java.util.Comparator;

public class SortByProductId implements Comparator<ProductBean> {
    @Override
    public int compare(ProductBean e1, ProductBean e2) {

        if (e1.getProductId() > e2.getProductId())
            return 1;
        else if (e1.getProductId() < e2.getProductId())
            return -1;
        else
            return 0;
    }
}
