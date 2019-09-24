package dat159.fowler;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private PriceCode _priceCode;

    public Movie(String title, PriceCode priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public PriceCode getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(PriceCode _priceCode) {
        this._priceCode = _priceCode;
    }

    public String getTitle() {
        return _title;
    }
}
