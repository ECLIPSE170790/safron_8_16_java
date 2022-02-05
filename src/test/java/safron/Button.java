package safron;

public enum Button {
    // Если известно количество элементов. Строгая последовательность, изменить нельзя в другом классе.
    OK("Кнопка ок"),
    CANCEL("Кнопка cancel"),
    APPLY("Кнопка apply");

    private String buttonName;

    Button(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }

}
