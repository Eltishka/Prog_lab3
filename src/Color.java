public enum Color {
    GOLD("Золотой"), GREEN("Зеленый"), GOLDENEST("Золотистый"), PURPLE("Фиолетовый"), LIGHT_BLUE("Голубой"), DARK("Темный");

    private String colorName;
    Color(String s) {
        this.colorName = s;
    }

    @Override
    public String toString() {
        return this.colorName;
    }
}
