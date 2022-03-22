import java.util.Comparator;

public class SortByProductName implements Comparator<ProductBean> {
    @Override
    public int compare(ProductBean e1, ProductBean e2) {
        return e1.getProductName().compareTo(e2.getProductName());
    }
}
