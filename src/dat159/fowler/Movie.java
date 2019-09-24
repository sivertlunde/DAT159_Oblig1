package dat159.fowler;

public class Movie {

    private String _title;
    private MovieType _type;

    public Movie(String title, MovieType type) {
        _title = title;
        _type = type;
    }

    public MovieType getMovieType() {
        return _type;
    }

    public void setMovieType(MovieType _type) {
        this._type = _type;
    }

    public String getTitle() {
        return _title;
    }
}
