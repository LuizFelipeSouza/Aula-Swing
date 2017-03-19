package gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AulaSwing extends JPanel implements MouseListener, ActionListener {

	// Instâncias
	private static final long serialVersionUID = 1L;

	private static JTextArea textArea = new JTextArea("textArea");
	private JButton button = new JButton("Button");

	// Construtor
	public AulaSwing(JTextArea textArea) {

		Dimension dim = new Dimension(200, 75);

		textArea.setEditable(false);
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setPreferredSize(dim);

		JPanel panel = new JPanel();
		panel.add(scroll);

		addMouseListener(this);
		
		dim.setSize(450, 450);
		setPreferredSize(dim);

		setBorder(BorderFactory.createEmptyBorder(200, 20, 20, 20));

		button.addActionListener((ActionListener) this);

	}

	// Métodos
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		System.out.println("Clique do mouse");
		System.out.printf("Coordenadas: (%d, %d) \n", x, y);
;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		System.out.println("Entrada do mouse");
		System.out.printf("Coordenadas: (%d, %d) \n", x, y);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		System.out.println("Saída do mouse");
		System.out.printf("Coordenadas: (%d, %d) \n", x, y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		System.out.println("Mouse pressionado");
		System.out.printf("Coordenadas: (%d, %d) \n", x, y);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();

		System.out.println("Mouse solto");
		System.out.printf("Coordenadas: (%d, %d) \n", x, y);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void mostrarInterface() {
				JFrame frame = new JFrame("Janela");
				frame.setSize(800, 800);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				JComponent component = new AulaSwing(textArea);
				frame.setContentPane(component);
				frame.pack();
			}

			@Override
			public void run() {
				mostrarInterface();
			}
		});
	}
}
