package rc.unesp.br.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CallTruco9Button extends JButton {

    private boolean pressed = false;

    public void setPressed( boolean pressed ) {
        this.pressed = pressed;
    }
    public boolean isPressed() { return this.pressed; }
    CallTruco9Button() {
        this.setText("Trucar 9");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPressed(true);
                setEnabled(false);
            }
        });
    }
}