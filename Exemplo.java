package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Exemplo implements ActionListener, MouseListener {

	private JFrame frame;
	private String s;
	private int raio;
	private double area;

	public static void main(String[] args) {
		Exemplo ex = new Exemplo();
		ex.init();
	}

	private void init() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addMouseListener(this);

		JButton circulo = new JButton("Círculo");
		
		circulo.addActionListener(this);

		Painel painel = new Painel();

		frame.getContentPane().add(BorderLayout.SOUTH, circulo);
		frame.getContentPane().add(BorderLayout.CENTER, painel);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		InputStream in = System.in;
		s = JOptionPane.showInputDialog(frame, "Digite o raio do círculo", in);
		raio = Integer.parseInt(s);
		area = Math.PI * (raio*raio);
		System.out.println("Área: " + area);
		frame.repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// falta dizer que o frame é um mouse listener
		int x = e.getX();
		int y = e.getY();
		frame.repaint(x, y, raio, raio);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class Painel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		/*
		int red = (int) (Math.random() * 255); 
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);

		Color c1 = new Color(red, green, blue);

		red = (int) (Math.random() * 255);
		green = (int) (Math.random() * 255);
		blue = (int) (Math.random() * 255);

		Color c2 = new Color(red, green, blue);

		GradientPaint gradient = new GradientPaint(70, 70, c1, 150, 150, c2);
		g2d.setPaint(gradient);
		g2d.fillOval(70, 70, 100, 100);
		
		*/
	}

}
