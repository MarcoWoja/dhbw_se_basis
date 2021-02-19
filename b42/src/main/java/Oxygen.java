public class Oxygen implements IDivingWatchState {
    public void toggle(DivingWatch divingWatch) {
        divingWatch.setState(new Time());
    }
}
