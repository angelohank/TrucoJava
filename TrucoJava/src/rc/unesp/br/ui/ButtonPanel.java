package rc.unesp.br.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class for the panel that will hold all the action buttons.
 * @author lucas Pinheiro @lucaspin
 * @author Dalton Lima @daltonbr
 * @author Bruno Vedovetto @bleandro
 */
public class ButtonPanel extends JPanel {
    private CallTrucoButton callTrucoButton;
    private FoldTrucoButton foldTrucoButton;

    private Color backgroundColor = new Color(32, 120, 85);

    /**
     * Constructor of the class
     */
    ButtonPanel() {
        super();
        this.setInitialOpts();
        this.createCallTrucoButton();
        this.createFoldButton();

        this.add( this.callTrucoButton );
        this.add( this.foldTrucoButton );
    }

    private void setInitialOpts() {
        this.setPreferredSize(new Dimension(GamePanel.DEFAULT_PANEL_WIDTH, GamePanel.DEFAULT_PANEL_HEIGHT));
        this.setBackground(backgroundColor);
    }

    /**
     * Create the call truco button
     */
    private void createCallTrucoButton() {
        this.callTrucoButton = new CallTrucoButton("Truco");
    }

    private void createFoldButton() {
        this.foldTrucoButton = new FoldTrucoButton("Fold");
    }

    public FoldTrucoButton getFoldTrucoButton() { return foldTrucoButton; }

    public CallTrucoButton getCallTrucoButton() { return this.callTrucoButton; }
}
