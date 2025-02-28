package be.heh.decorator3.models;

public class UnderlineText extends TextDecorator {
    public UnderlineText(Text t) {
        super(t);
    }

    @Override
    public String display() {
        return "<u>" + super.display() + "</u>";
    }


}
