package Test;

import javax.swing.*;
import java.awt.*;

/**
 * *v1** *FinalProject**  *ThomasR** *11142013:1707**
 */
public class Button_OpenPicture extends JButton {

    public Button_OpenPicture() {
        Dimension overrideSize = new Dimension(32, 32);
        Insets overrideInsets = new Insets(18, 10, 0, 10);

        this.setText(" ");
        this.setToolTipText("Open Picture");
        this.setMaximumSize(overrideSize);
        this.setMinimumSize(overrideSize);
        this.setPreferredSize(overrideSize);
        this.setMargin(overrideInsets);
        this.setSize(overrideSize);

        try {
            this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Test/assets/open.png")));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
