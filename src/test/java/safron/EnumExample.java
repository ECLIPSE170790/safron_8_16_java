package safron;

public class EnumExample {

    public static void main(String[] args) {
        //Возврат массива у Enam. Будет массив Enum'ов
        Button[] buttons = Button.values();
        for (Button button : buttons) {
            //возврат имени Enum
            System.out.println(button.name());

            //возврат поля в Enum
            System.out.println(button.getButtonName());
        }
    }
}
