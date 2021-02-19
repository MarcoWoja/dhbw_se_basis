public class Time implements IDivingWatchState {
    public void toggle(DivingWatch divingWatch) {
        divingWatch.setState(new Oxygen());
    }
}