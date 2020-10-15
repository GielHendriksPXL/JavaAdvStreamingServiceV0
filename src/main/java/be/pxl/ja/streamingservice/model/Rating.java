package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLEKIDS,
    OLDERKIDS(7),
    TEENS(12),
    MATURE(16);

    private static final int DEFAULT_AGE = 0;
    private int age;

    Rating(int age) {
        this.age = age;
    }

    Rating() {
        this(DEFAULT_AGE);
    }

    public int getAge() {
        return age;
    }
}
