package be.heh.decorator3.models;

public abstract class TextDecorator implements Text{
    private Text t;

    public TextDecorator(Text t) {
        this.t = t;
    }

    @Override
    public String display() {
        return this.t.display();
    }
}
