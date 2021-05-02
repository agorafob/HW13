public class Pair {
    private String key;
    private String data;

    Pair(String key, String data) {
        setKey(key);
        setData(data);
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{'" + key + '\'' +
                ":'" + data + '\'' +
                '}';
    }
}
