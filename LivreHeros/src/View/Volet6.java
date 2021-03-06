package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.Controleur;

import javax.swing.JTextPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Volet6 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	Controleur controleur = new Controleur();
	private int volet = 6;
	

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 */
	public Volet6() throws FileNotFoundException {
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
		
		JLabel lblNom = new JLabel();
		lblNom.setHorizontalAlignment(SwingConstants.CENTER);
		lblNom.setFont(new Font("Baskerville Old Face", Font.PLAIN, 24));
		lblNom.setBounds(95, 15, 150, 65);
		Personnage.add(lblNom);
		lblNom.setText(controleur.prendreNom());
		
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
		lblPointEndurance.setText(String.valueOf(controleur.prendreEndurance()));
		
		JLabel lblPointHabilite = new JLabel("0");
		lblPointHabilite.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblPointHabilite.setBounds(170, 130, 100, 20);
		Personnage.add(lblPointHabilite);
		lblPointHabilite.setText(String.valueOf(controleur.prendreHabilite()));
		
		JLabel lblPointChance = new JLabel("0");
		lblPointChance.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
		lblPointChance.setBounds(170, 170, 100, 20);
		Personnage.add(lblPointChance);
		lblPointChance.setText(String.valueOf(controleur.prendreChance()));
		
		/* Histoire */
		JTextPane Story = new JTextPane();
		Story.setFont(new Font("Baskerville Old Face", Font.PLAIN, 26));
		Story.setText("Le parchemin est sale. Des t\u00E2ches de graisse de saucisson m\u00E9lang\u00E9es avec de la terre emp\u00EAche de lire la totalit\u00E9 parchemin.\r\n\r\nCependant, vous arrivez \u00E0 lire les mots \"danger\" et \"tr\u00E9sor\". Une carte est dessin\u00E9e dans le bas du parchemin. \r\n\r\nC'est alors que:");
		Story.setBackground(Color.WHITE);
		Story.setBounds(380, 10, 890, 450);
		contentPane.add(Story);
		Story.setLayout(null);
		
		/* Menu */		
		JPanel Menu = new JPanel();
		Menu.setBackground(Color.WHITE);
		Menu.setBounds(10, 350, 340, 200);
		contentPane.add(Menu);
		Menu.setLayout(null);
		
		JButton btnSauvegarde = new JButton("Sauvegarde");
		btnSauvegarde.setBounds(100, 35, 140, 40);
		Menu.add(btnSauvegarde);
		btnSauvegarde.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					controleur.sauvegarde(volet);
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
				controleur.lancerJeu();
				dispose();
			}
		});
		
		/*Les diff�rents choix*/
		final JPanel Choix = new JPanel();
		Choix.setBackground(Color.WHITE);
		Choix.setBounds(380, 480, 890, 70);
		contentPane.add(Choix);
		Choix.setLayout(null);
		
		final JButton btnChoix1 = new JButton("evenement");
		btnChoix1.setBounds(15, 15, 140, 40);
		Choix.add(btnChoix1);
		btnChoix1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(controleur.eventChance() == true) {
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setText("Jet r�ussi");
					lblNewLabel.setBounds(15, 15, 140, 40);
					Choix.add(lblNewLabel);
					
					
					btnChoix1.setText("Suite");
					btnChoix1.setBounds(170, 15, 140, 40);
					Choix.add(btnChoix1);
					btnChoix1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							controleur.Volet8();
							dispose();
						}
					});
				}
				else {
					JLabel lblNewLabel = new JLabel();
					lblNewLabel.setText("Jet rat�");
					lblNewLabel.setBounds(15, 15, 140, 40);
					Choix.add(lblNewLabel);
					
					btnChoix1.setText("Suite");
					btnChoix1.setBounds(170, 15, 140, 40);
					Choix.add(btnChoix1);
					btnChoix1.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							controleur.Volet9();
							dispose();
						}
					});
				}
			}
		});
	}
	
	public static void main(String[] args) {
		
	}
}
		
		
		
		
	


