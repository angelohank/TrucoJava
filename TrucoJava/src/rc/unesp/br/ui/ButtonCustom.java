package rc.unesp.br.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCustom extends JButton {
    private boolean pressed = false;

    public void setPressed( boolean state ) {
        this.pressed = state;
    }
    public boolean isPressed() { return this.pressed; }

    ButtonCustom( String description ) {
        this.setText(description);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setPressed(true);
                setEnabled(false);
            }
        });
    }

}
