package MyPackage;

public enum USCurrency {
    // most declare on the top!!
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25),
    SHELDON(80);
    private int value;

    private USCurrency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
