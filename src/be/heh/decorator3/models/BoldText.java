package be.heh.decorator3.models;

public class BoldText extends TextDecorator {
    public BoldText(Text t) {
        super(t);
    }

    @Override
    public String display() {
        return "<b>" + super.display() + "</b>";
    }


}
