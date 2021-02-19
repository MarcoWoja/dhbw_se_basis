public class LeftBottleCommand implements ICommand {
    private DivingWatch divingWatch;

    public LeftBottleCommand(DivingWatch divingWatch) {
        this.divingWatch = divingWatch;
    }

    public void press() {
        divingWatch.leftBottle();
    }
}