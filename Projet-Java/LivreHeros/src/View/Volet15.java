package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import Controle.controle;

import javax.swing.JTextPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Volet15 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	controle infos = new controle();
	String volet = "15";
	
	
	
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public Volet15() throws FileNotFoundException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(125, 50, 1300, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* Infos personnage*/
		JPanel Personnage = new JPanel();
		Personnage.setBackground(Color.WHITE);
		Personnage.setBounds(10, 10, 340, 300);
		contentPane.add(Personnage);
		Personnage.setLayout(null);
		Border lineborder = BorderFactory.createLineBorder(Color.black, 1);
		Personnage.setBorder(lineborder);
		
		JLabel lblNom = new JLabel();
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setFont(new Font("Baskerville Old Face", Font.PLAIN, 24));
		lblNom.setBounds(95, 15, 150, 65);
		Personnage.add(lblNom);
		lblNom.setText(infos.prendreNom());
		
		JLabel lblEndurance = new JLabel("Endurance:");
		lblEndurance.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblEndurance.setBounds(10, 90, 150, 20);
		Personnage.add(lblEndurance);
		
		JLabel lblHabilite = new JLabel("Habilit\u00E9:");
		lblHabilite.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblHabilite.setBounds(10, 130, 150, 20);
		Personnage.add(lblHabilite);
		
		JLabel lblChance = new JLabel("Chance:");
		lblChance.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblChance.setBounds(10, 170, 150, 20);
		Personnage.add(lblChance);
		
		JLabel lblPointEndurance = new JLabel("0");
		lblPointEndurance.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblPointEndurance.setBounds(170, 90, 100, 20);
		Personnage.add(lblPointEndurance);
		lblPointEndurance.setText(infos.prendreEndurance());
		
		JLabel lblPointHabilite = new JLabel("0");
		lblPointHabilite.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblPointHabilite.setBounds(170, 130, 100, 20);
		Personnage.add(lblPointHabilite);
		lblPointHabilite.setText(infos.prendreHabilite());
		
		JLabel lblPointChance = new JLabel("0");
		lblPointChance.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblPointChance.setBounds(170, 170, 100, 20);
		Personnage.add(lblPointChance);
		lblPointChance.setText(infos.prendreChance());
		
		/* Histoire */
		JTextPane Story = new JTextPane();
		Story.setFont(new Font("Baskerville Old Face", Font.PLAIN, 26));
		Story.setText("L'enthousiasme d'une nouvelle qu\u00EAte monte en vous, surtout lorsqu'il y un tr\u00E9sor \u00E0 la cl\u00E9. Vous rangez la carte et partez \r\nen direction du nord afin de rejoindre la clairi\u00E8re avant la tomb\u00E9e de la nuit. \r\n\r\nCeci est le d\u00E9but d'une histoire. Une histoire dont vous \u00EAtes le h\u00E9ros.\r\n\r\nFin de la partie, merci d'avoir jou\u00E9.");
		Story.setBackground(Color.WHITE);
		Story.setBounds(380, 10, 890, 450);
		contentPane.add(Story);
		Story.setLayout(null);
		Story.setBorder(lineborder);
		
		/* Menu */		
		JPanel Menu = new JPanel();
		Menu.setBackground(Color.WHITE);
		Menu.setBounds(10, 350, 340, 200);
		contentPane.add(Menu);
		Menu.setLayout(null);
		Menu.setBorder(lineborder);
		
		JButton btnSauvegarde = new JButton("Sauvegarde");
		btnSauvegarde.setBounds(100, 35, 140, 40);
		Menu.add(btnSauvegarde);
		btnSauvegarde.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controle launch = new controle();
				try {
					launch.sauvegardeVolet(volet);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(100, 95, 140, 40);
		Menu.add(btnQuitter);
		btnQuitter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controle launch = new controle();
				launch.start();
				dispose();
			}
		});
		
		/*Les différents choix*/
		JPanel Choix = new JPanel();
		Choix.setBackground(Color.WHITE);
		Choix.setBounds(380, 480, 890, 70);
		contentPane.add(Choix);
		Choix.setLayout(null);
		Choix.setBorder(lineborder);
		

	}
}
