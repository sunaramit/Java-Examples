/*
import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample extends Frame{
    Button Buttons[];

    public BoxLayoutExample(){
        Buttons = new Buttons[5];

        for(int i=0; i<5; i++){
            Buttons[i] = new Button("button"+(i+1));
            add(Buttons[i]);
        }
        setLayout(new BoxLayoutExample(this, BoxLayout.Y_AXIS));
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String() args){
        BoxLayoutExample b = new BoxLayoutExample();
    }
}
*/

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample extends JFrame {
    JButton[] buttons;

    public BoxLayoutExample() {
        buttons = new JButton[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            add(buttons[i]);
        }

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutExample();
    }
}
