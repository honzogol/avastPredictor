package avast;

public class RequestPlayers {

    private final int[] age;
    private final int[] overall;

    public RequestPlayers(int[] age, int[] overall) {
        this.age = age;
        this.overall = overall;
    }

    public int[] getAge() {
        return age;
    }

    public int[] getOverallRating() {
        return overall;
    }
}