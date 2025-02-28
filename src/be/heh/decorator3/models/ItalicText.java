package be.heh.decorator3.models;

public class ItalicText extends TextDecorator {
    public ItalicText(Text t) {
        super(t);
    }

    @Override
    public String display() {
        return "<i>" + super.display() + "</i>";
    }


}
