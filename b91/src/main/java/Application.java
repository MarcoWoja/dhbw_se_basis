public class Application {
    public static void main(String[] args) {
        KitchenMachine kitchenMachine = new KitchenMachine();

        IMachine kitchenMachine2Pole = new KitchenMachine2PoleAdapter();
        IMachine kitchenMachine4Pole = new KitchenMachine4PoleAdapter();

        System.out.println("Plugging in kitchen machine with 2 pole cable...");
        kitchenMachine2Pole.plugIn();

        System.out.println("Plugging in kitchen machine with 4 pole cable...");
        kitchenMachine4Pole.plugIn();

        kitchenMachine.getButton().toggle();
        System.out.println("Kitchen machine in state " + kitchenMachine.getState());
        kitchenMachine.getButton().toggle();
        System.out.println("Kitchen machine in state " + kitchenMachine.getState());
    }
}
