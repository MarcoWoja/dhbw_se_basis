public class DigitalCommand implements ICommand {
    private DivingWatch divingWatch;

    public DigitalCommand(DivingWatch divingWatch) {
        this.divingWatch = divingWatch;
    }

    public void press() {
        divingWatch.digital();
    }
}
