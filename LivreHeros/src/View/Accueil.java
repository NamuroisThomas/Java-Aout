package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.Controleur;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Accueil extends JFrame {

	/**
	 * Create the frame.
	 */
	public Accueil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 770, 470);
		
		JPanel contentPane;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton nouvellePartie = new JButton("Nouvelle Partie");
		nouvellePartie.setBounds(20, 20, 200, 40);
		contentPane.add(nouvellePartie);
		nouvellePartie.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Controleur controle = new Controleur();
				controle.creationPersonnage();
				dispose();
			}
		});
		
		JButton chargerPartie = new JButton("Charger Partie");
		chargerPartie.setBounds(20, 80, 200, 40);
		contentPane.add(chargerPartie);
		chargerPartie.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Controleur lancer = new Controleur();
				try {
					lancer.charger();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		
		
		JButton quitter = new JButton("Quitter");
		quitter.setBounds(20, 140, 200, 40);
		contentPane.add(quitter);
		quitter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				dispose();
			}
		});
		
		JLabel thumb = new JLabel();
		ImageIcon icon = new ImageIcon("C:\\Users\\User\\Documents\\GitHub\\Java-Aout\\LivreHeros\\image\\Roleplaying01.jpg"); 
		thumb.setIcon(icon);
		thumb.setBounds(240, 0, 540, 433);
		contentPane.add(thumb);
		return;
	}
	
	public static void main(String[] args) {
		
	}
}
