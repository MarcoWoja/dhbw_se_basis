public class Application {
    public static void main(String[] args) {
        DivingWatch divingWatch = new DivingWatch();

        divingWatch.setState(new Time());
        System.out.println("Initial state:");
        System.out.println(divingWatch);

        Button button1 = divingWatch.getButton1();
        Button button2 = divingWatch.getButton2();
        Button button3 = divingWatch.getButton3();

        button2.press();
        System.out.println(divingWatch);
        button1.press();
        button3.press();
        button2.press();
        System.out.println(divingWatch);
        button1.press();
        button3.press();
    }
}
