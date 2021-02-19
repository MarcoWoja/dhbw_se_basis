public class Off implements IKitchenMachineState {
    public void toggle(KitchenMachine kitchenMachine) {
        kitchenMachine.setState(new On());
    }
}
