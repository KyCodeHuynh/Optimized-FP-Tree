import java.util.Comparator;

public class PairElement {
    private String item1;
    private String item2;

    public PairElement()
    {
        item1 = null;
        item2 = null;
    }

    public PairElement(String item1, String item2)
    {
        this.item1 = item1;
        this.item2 = item2;
    }

    public String getFirst()
    {
        return item1;
    }

    public String getSecond()
    {
        return item2;
    }

    public void setFirst(String first) {
        this.item1 = first;
    }

    public void setSecond(String second) {
        this.item2 = second;
    }

    // Flips the first and second item if necesssary
    // Externally check the order of the items and then call this function.
    public void flipOrder() {
        String temp = this.item1;
        this.item1 = this.item2;
        this.item2 = temp;
    }

    @Override
    public String toString()
    {
        // Example result: (item1, item2)
        return "(" + item1 + "," + item2 + ")";
    }

    // Compares items setwise (ab = ba)
    // NOTE: Hashtable will compare keys for equality
    // using hashCode() and then equals()
    // This allows us to quickly distinguish (a, b) vs (d, e) (via hashCode()),
    // while still not being confused by (1, 23) vs. (12, 3) (via equals()),
    // and treating (a, b) as equivalent to (b, a) (via equals())
    @Override
    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof PairElement) {
            PairElement that = (PairElement) other;
            result = (this.item1.equals(that.item1) && this.item2.equals(that.item2)) ||
                     (this.item1.equals(that.item2) && this.item2.equals(that.item1));
        }
        return result;
    }
    @Override
    public int hashCode() {
        return item1.hashCode() + item2.hashCode();
    }
}
