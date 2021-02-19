public class AnalogCommand implements ICommand {
    private DivingWatch divingWatch;

    public AnalogCommand(DivingWatch divingWatch) {
        this.divingWatch = divingWatch;
    }

    public void press() {
        divingWatch.analog();
    }
}