package Enums;

public enum KorotiskType {
    BIG("большой"),
    BABY("Малой"),
    NORMAL("Норм!");

    String translate;

    KorotiskType(String translate) {
        this.translate = translate;
    }
}
