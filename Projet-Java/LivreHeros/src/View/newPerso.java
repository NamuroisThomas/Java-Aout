package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controle.controle;

import javax.swing.JTextField;
import javax.swing.JButton;

public class newPerso extends JFrame {
	private JLabel labelNomPersonnage;
	private JTextField textNomPersonnage;
	private JLabel labelEndurance;
	private JTextField textEndurance;
	private JLabel labelHabilite;
	private JTextField textHabilite;
	private JLabel labelChance;
	private JTextField textChance;
	private JButton btnDe;
	private JLabel lblDe = new JLabel("0");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public newPerso() {
		JPanel contentPane = new JPanel();;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 600, 300);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel thumb = new JLabel();
		ImageIcon icon = new ImageIcon("M:/Projet-Java/LivreHeros/personnage.jpg"); 
		contentPane.setLayout(null);
		thumb.setIcon(icon);
		thumb.setBounds(340, 0, 209, 267);
		contentPane.add(thumb);
		
		labelNomPersonnage = new JLabel("Nom:");
		labelNomPersonnage.setBounds(10, 30, 45, 15);
		contentPane.add(labelNomPersonnage);
		
		textNomPersonnage = new JTextField();
		textNomPersonnage.setBounds(113, 27, 96, 20);
		contentPane.add(textNomPersonnage);
		textNomPersonnage.setColumns(10);
		
		labelEndurance = new JLabel("Endurance:");
		labelEndurance.setBounds(10, 65, 67, 15);
		contentPane.add(labelEndurance);
		
		textEndurance = new JTextField();
		textEndurance.setBounds(112, 62, 96, 20);
		contentPane.add(textEndurance);
		textEndurance.setColumns(10);
		
		labelHabilite = new JLabel("Habilit\u00E9: ");
		labelHabilite.setBounds(10, 100, 45, 15);
		contentPane.add(labelHabilite);
		
		textHabilite = new JTextField();
		textHabilite.setBounds(112, 97, 96, 19);
		contentPane.add(textHabilite);
		textHabilite.setColumns(10);
		
		labelChance = new JLabel("Chance:");
		labelChance.setBounds(10, 135, 45, 15);
		contentPane.add(labelChance);
		
		textChance = new JTextField();
		textChance.setBounds(112, 132, 96, 19);
		contentPane.add(textChance);
		textChance.setColumns(10);
		
		btnDe = new JButton("Lancer le d\u00E9");
		btnDe.setBounds(10, 177, 85, 20);
		contentPane.add(btnDe);
		btnDe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controle lancer = new controle();
				lblDe.setText(String.valueOf(lancer.lancerDeSix()));
			}
		});
		
		lblDe.setBounds(113, 180, 45, 12);
		contentPane.add(lblDe);
		
		JButton btnSauvegarde = new JButton("Sauvegarder");
		btnSauvegarde.setBounds(73, 232, 85, 21);
		contentPane.add(btnSauvegarde);
		btnSauvegarde.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				controle sauvegarde = new controle();
				String nom = textNomPersonnage.getText();
				String endu = textEndurance.getText();
				String habi = textHabilite.getText();
				String chance = textChance.getText();
				try {
					sauvegarde.creerFiche(nom, endu, habi,chance);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				controle launch = new controle();
				launch.Volet1();
				dispose();
			}
		});
		
		
	}
}
