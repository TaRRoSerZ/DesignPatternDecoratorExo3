package be.heh.decorator3.kernels;

import be.heh.decorator3.models.Text;

public class SimpleText implements Text {
    private String content;

    public SimpleText(String content) {
        this.content = content;
    }

    @Override
    public String display() {
        return this.content;
    }
}
