package rc.unesp.br.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CallTrucoButton extends JButton {

    private boolean pressed = false;

    public void setPressed( boolean pressed ) {
        this.pressed = pressed;
    }
    public boolean isPressed() { return this.pressed; }
    CallTrucoButton() {
        this.setText("Truco");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPressed(true);
            }
        });
    }
}
