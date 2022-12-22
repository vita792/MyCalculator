package frame;

import panel.PanelCalculator;

import javax.swing.*;
import java.awt.*;

public class FrameCalculator extends JFrame {
    public FrameCalculator() {
        calculatorSizeAndAlign();
        calculatorVisibleAndChangeable();
        calculatorView();
        PanelCalculator panelCalculator = new PanelCalculator();
        add(panelCalculator);
        pack();
    }

    private final Toolkit toolkit = Toolkit.getDefaultToolkit();
    private final Dimension dimension = toolkit.getScreenSize();
    private final Image image = toolkit.getImage("icon.png");
    private final int screenWidth = dimension.width;
    private final int screenHeight = dimension.height;

    private int getCalculatorAlignX() {
        return screenWidth / 3;
    }

    private int getCalculatorAlignY() {
        return screenHeight / 4;
    }

    private int getCalculatorWidth() {
        return screenWidth / 3;
    }

    private int getCalculatorHeight() {
        return screenHeight / 2;
    }

    private void calculatorSizeAndAlign() {
        setBounds(getCalculatorAlignX(), getCalculatorAlignY(), getCalculatorWidth(), getCalculatorHeight());
    }

    private void calculatorVisibleAndChangeable() {
        setVisible(true);
        setResizable(false);
        toFront();
    }

    private void calculatorView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CALCULATOR");
        setIconImage(image);
    }
}
