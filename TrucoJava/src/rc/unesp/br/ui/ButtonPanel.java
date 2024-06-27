package rc.unesp.br.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import rc.unesp.br.beans.Player;

/**
 * Class for the panel that will hold all the action buttons.
 * Authors:
 * Lucas Pinheiro @lucaspin
 * Dalton Lima @daltonbr
 * Bruno Vedovetto @bleandro
 */
public class ButtonPanel extends JPanel {
    private CallTrucoButton callTrucoButton;
    private FoldTrucoButton foldTrucoButton;
    private JButton acceptTrucoButton;
    private JButton requestSixButton;

    private Color backgroundColor = new Color(32, 120, 85);
    private Player player;

    /**
     * Constructor of the class
     * @param player {Player} the player to handle the game logic
     */
    public ButtonPanel(Player player) {
        super();
        this.player = player;
        this.setInitialOpts();
        this.createCallTrucoButton();
        this.createFoldButton();
        this.createAcceptTrucoButton();
        this.createRequestSixButton();

        this.add( this.callTrucoButton );
        this.add( this.foldTrucoButton );

        this.add(this.acceptTrucoButton);
        this.add(this.requestSixButton);

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

        this.callTrucoButton = new CallTrucoButton();
        this.callTrucoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.callTruco();
            }
        });

    }

    private void createFoldButton() {
        this.foldTrucoButton = new FoldTrucoButton("Fold");
    }

    public FoldTrucoButton getFoldTrucoButton() { return foldTrucoButton; }

        this.foldButton = new JButton("Fold");
        this.setFoldButtonOpts();
        this.foldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.fold();
            }
        });
    }

    /**
     * Create the accept truco button
     */
    private void createAcceptTrucoButton() {
        this.acceptTrucoButton = new JButton("Accept Truco");
        this.setAcceptTrucoButtonOpts();
        this.acceptTrucoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.acceptTruco();
            }
        });
    }

    /**
     * Create the request six button
     */
    private void createRequestSixButton() {
        this.requestSixButton = new JButton("Request Six");
        this.setRequestSixButtonOpts();
        this.requestSixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.requestSix();
            }
        });
    }

    /**
     * Set the accept truco button layout options
     */
    private void setAcceptTrucoButtonOpts() {
        // Set layout options for the accept truco button
        this.acceptTrucoButton.setPreferredSize(new Dimension(120, 40));
        this.acceptTrucoButton.setBackground(new Color(34, 139, 34));
        this.acceptTrucoButton.setForeground(Color.WHITE);
    }

    /**
     * Set the request six button layout options
     */
    private void setRequestSixButtonOpts() {
        // Set layout options for the request six button
        this.requestSixButton.setPreferredSize(new Dimension(120, 40));
        this.requestSixButton.setBackground(new Color(30, 144, 255));
        this.requestSixButton.setForeground(Color.WHITE);
    }

    public CallTrucoButton getCallTrucoButton() {
        return this.callTrucoButton;
    }
}