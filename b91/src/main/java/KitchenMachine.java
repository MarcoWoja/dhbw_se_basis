public class KitchenMachine {
    private IKitchenMachineState state;
    private Button button;

    public KitchenMachine() {
        this.button = new Button(this);
        this.state = new Off();
    }

    public IKitchenMachineState getState() {
        return state;
    }

    public Button getButton() {
        return button;
    }

    public void setState(IKitchenMachineState state) {
        this.state = state;
    }

    public void plugIn2Pole() {
        System.out.println("2 Pole Cable connected");
    }

    public void plugIn4Pole() {
        System.out.println("4 Pole Cable connected");
    }
}
