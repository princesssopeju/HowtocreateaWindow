import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;

    JSlider slider;
    SliderDemo(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("New Romans",Font.BOLD,10));
        label.setFont(new Font("New Romans",Font.BOLD,20));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        label.setText("°C = " + slider.getValue());
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
    }






    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("°C = " + slider.getValue());

    }
}
