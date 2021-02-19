public class On implements IKitchenMachineState {
    public void toggle(KitchenMachine kitchenMachine) {
        kitchenMachine.setState(new Off());
    }
}
