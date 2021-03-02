package receiver;

public class Light {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void on(){
        this.state="on";
        System.out.println(this.state);
    }

    public void off(){
        this.state = "off";
        System.out.println(this.state);
    }
}
