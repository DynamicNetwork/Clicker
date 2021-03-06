import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    public GUI(){
        frame = new JFrame();

        JButton button = new JButton("Click Me!");
        button.addActionListener(this);
        label = new JLabel("Clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Program GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Clicks: " + count);
    }
}
