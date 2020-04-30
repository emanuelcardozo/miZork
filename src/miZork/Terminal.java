package miZork;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Terminal extends Canvas {

	/**
	 * Recommended for Canvas import
	 */
	private static final long serialVersionUID = 1L;

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	private JFrame window;
	private JTextArea textArea;

	Terminal() {

		window = new JFrame();
		window.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLayout(new BorderLayout());
		window.add(this, BorderLayout.CENTER);

		buildTextArea();
		window.add(textArea, BorderLayout.CENTER);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}

	private void buildTextArea() {
		textArea = new JTextArea(1, 10);
//		textArea.setPreferredSize(new Dimension(WIDTH / 2, HEIGHT / 2));
	}

}
