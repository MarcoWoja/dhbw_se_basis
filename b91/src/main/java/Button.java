public class Button {
    private KitchenMachine kitchenMachine;

    public Button(KitchenMachine kitchenMachine) {
        this.kitchenMachine = kitchenMachine;
    }

    public void toggle() {
        System.out.println("Button pushed");
        kitchenMachine.getState().toggle(kitchenMachine);
    }
}
