import Utils.Pronouns;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionGenerator {
    public static void main(String[] args) {
        JFrame window = new JFrame("Question Generator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,300);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        Pronouns pronouns = new Pronouns();
        JButton button = new JButton("Generate");
        button.setPreferredSize(new Dimension(380,100));
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        ActionListener actionListener = new ActionListenerButton();
        button.addActionListener(actionListener);

        panel.add(button);
        window.setContentPane(panel);

        System.out.println(pronouns.randomPronounRussian());
    }

    public static class ActionListenerButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame();
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(300, 120);

            Pronouns pronouns = new Pronouns();
            frame.setContentPane(new JOptionPane(pronouns.randomPronounRussian()));

            frame.setVisible(true);
        }
    }
}
