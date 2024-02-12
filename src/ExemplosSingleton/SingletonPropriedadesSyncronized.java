package Mod15;

public class SingletonPropriedadesSyncronized {
    private static SingletonPropriedadesSyncronized singleton;
    private String value;

    private SingletonPropriedadesSyncronized(String value) {
        this.value = value;
    }

    public static synchronized SingletonPropriedadesSyncronized getInstance (String value) {
        if (singleton == null) {
            singleton = new SingletonPropriedadesSyncronized(value);
        }
        return singleton;
    }

    public String getValue() {
        return value;
    }
}
