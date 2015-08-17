import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import busca.BuscaLargura;
import busca.AEstrela;
import busca.BuscaProfundidade;
import busca.BuscaIterativo;
import busca.Nodo;
import exemplos.Numeros;
import exemplos.Estado8Puzzle;

import java.awt.Panel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;


@SuppressWarnings("unused")
public class Labirinto extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPanel;
	private JTable JTable;
	private JButton JButton;
	private JPanel Panel;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Labirinto frame = new Labirinto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
	/**
	 * Create the frame.
	 */
	public Labirinto() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 451);
		contentPanel = new JPanel();
		contentPanel.setForeground(Color.WHITE);
		contentPanel.setBackground(Color.GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(new BorderLayout(1, 1));
		setContentPane(contentPanel);
		
		Panel panel = new Panel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(100, 100, 400, 400);
		contentPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 5, 5));
		panel.setVisible(true);
		
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		panel.add(btn1);
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub	
			}
		});
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		panel.add(btn9);
				
		
		
		
	}
}
