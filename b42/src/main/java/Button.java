public class Button {
    private DivingWatch divingWatch;
    private int id;
    private ICommand command;

    public Button(DivingWatch divingWatch, int id) {
        this.divingWatch = divingWatch;
        this.id = id;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void press() {
        String state = divingWatch.getState().getClass().getName();
        switch(id) {
            case 1:
                System.out.println("Button " + id + " has been pressed");
                if (state.equals("Time")) {
                    this.setCommand(new DigitalCommand(divingWatch));
                } else {
                    this.setCommand(new LeftBottleCommand(divingWatch));
                }
                command.press();
                break;
            case 2:
                System.out.println("Button " + id + " has been pressed");
                divingWatch.toggle();
                break;
            case 3:
                System.out.println("Button " + id + " has been pressed");
                if (state.equals("Time")) {
                    this.setCommand(new AnalogCommand(divingWatch));
                } else {
                    this.setCommand(new RightBottleCommand(divingWatch));
                }
                command.press();
                break;
        }
    }
}
