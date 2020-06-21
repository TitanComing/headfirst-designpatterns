package headfirst.learndesignpatterns.observer.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by peng on 2020/6/20.
 */
public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        headfirst.designpatterns.observer.swing.SwingObserverExample example = new headfirst.designpatterns.observer.swing.SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should I do it?");

        // Without lambdas
        //button.addActionListener(new AngelListener());
        //button.addActionListener(new DevilListener());

        // With lambdas
        button.addActionListener(event ->
                System.out.println("Don't do it, you might regret it!")
        );
        button.addActionListener(event ->
                System.out.println("Come on, do it!")
        );
        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

	/*
	 * Remove these two inner classes to use lambda expressions instead.
	 *
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/
}
