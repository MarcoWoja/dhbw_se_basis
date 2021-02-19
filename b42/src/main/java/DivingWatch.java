import java.text.SimpleDateFormat;

public class DivingWatch {
    private Button button1;
    private Button button2;
    private Button button3;
    private OxygenBottle leftOxygenBottle;
    private OxygenBottle rightOxygenBottle;
    private IDivingWatchState state;

    public DivingWatch() {
        this.button1 = new Button(this, 1);
        this.button2 = new Button(this, 2);
        this.button3 = new Button(this, 3);
        this.leftOxygenBottle = new OxygenBottle();
        this.rightOxygenBottle = new OxygenBottle();
    }

    public void analog() {
        System.out.println("Analog (but not really analog because how am I supposed to do this?) time: " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()));
    }

    public void digital() {
        System.out.println("Digital time: " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()));
    }

    public void leftBottle() {
        System.out.println("Left oxygen bottle is full to " + leftOxygenBottle.getOxygenLevel() + "%");
    }

    public void rightBottle() {
        System.out.println("Right oxygen bottle is full to " + rightOxygenBottle.getOxygenLevel() + "%");
    }

    public void setState(IDivingWatchState state) {
        this.state = state;
    }

    public void toggle() {
        state.toggle(this);
    }

    public Button getButton1() {
        return button1;
    }

    public Button getButton2() {
        return button2;
    }

    public Button getButton3() {
        return button3;
    }

    public IDivingWatchState getState() {
        return state;
    }

    public String toString() {
        return "{ Diving watch | state = " + state + " }";
    }
}
