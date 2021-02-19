public class RightBottleCommand implements ICommand {
    private DivingWatch divingWatch;

    public RightBottleCommand(DivingWatch divingWatch) {
        this.divingWatch = divingWatch;
    }

    public void press() {
        divingWatch.rightBottle();
    }
}