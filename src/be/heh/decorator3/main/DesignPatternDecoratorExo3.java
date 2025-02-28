package be.heh.decorator3.main;

import be.heh.decorator3.kernels.SimpleText;
import be.heh.decorator3.models.BoldText;
import be.heh.decorator3.models.ItalicText;
import be.heh.decorator3.models.Text;
import be.heh.decorator3.models.UnderlineText;

public class DesignPatternDecoratorExo3 {
    public static void main(String[] args) {

        Text text1 = new SimpleText("Hello World");
        System.out.println("Simple text : " + text1.display());

        Text text2 = new BoldText(new SimpleText("Hello World"));
        System.out.println("Bold text : " + text2.display());

        Text text3 = new ItalicText(new UnderlineText(new SimpleText("Hello World")));
        System.out.println("Italic + Underline text : " + text3.display());

        Text text4 = new BoldText(new ItalicText(new UnderlineText(new SimpleText("Hello World"))));
        System.out.println("Bold + Italic + Underline text : " + text4.display());
    }
}