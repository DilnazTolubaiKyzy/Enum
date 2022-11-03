public enum Week {
    MONDAY("Дуйшонбу"),
    TUESDAY("Шейшенби"),
    WEDNESDAY("Шаршенби"),
    THURSDAY("Бейшенби"),
    FRIDAY("Жума"),
    SATURDAY("Ишенби"),
    SUNDAY("Жекшенби");

    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }
}
