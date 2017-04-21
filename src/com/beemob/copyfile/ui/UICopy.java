package com.beemob.copyfile.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UICopy {

	public UICopy() {
		init();
	}

	private void init() {

		JFrame frame = new JFrame();
		frame.setTitle("Copy File");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(1000, 700));
		frame.setLocation(200, 20);
		frame.setResizable(false);
		BorderLayout border = new BorderLayout();
		frame.setLayout(border);

		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(Color.WHITE);
		panelNorth.setPreferredSize(new Dimension(1000, 180));

		JLabel labelAvatar = new JLabel("");
		labelAvatar.setBounds(50, 10, 250, 80);
		ImageIcon iconAvatar = new ImageIcon("images/avatar.png");
		labelAvatar.setIcon(iconAvatar);
		frame.getContentPane().add(labelAvatar);

		JLabel labelTitle = new JLabel("Copy File");
		labelTitle.setFont(new Font("Arial", Font.BOLD, 38));
		labelTitle.setBounds(50, 80, 200, 100);
		frame.getContentPane().add(labelTitle);

		JLabel labelVertical = new JLabel("");
		labelVertical.setBounds(250, 25, 10, 120);
		ImageIcon iconVertical = new ImageIcon("images/vertical.png");
		labelVertical.setIcon(iconVertical);
		frame.getContentPane().add(labelVertical);

		JLabel labelVersionFree = new JLabel("Phiên bản miễn phí");
		labelVersionFree.setFont(new Font("Arial", Font.BOLD, 15));
		labelVersionFree.setBounds(280, 55, 200, 30);
		frame.getContentPane().add(labelVersionFree);

		JLabel labelVersionYear = new JLabel("2017");
		labelVersionYear.setFont(new Font("Arial", Font.BOLD, 15));
		labelVersionYear.setBounds(335, 75, 100, 30);
		frame.getContentPane().add(labelVersionYear);

		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(Color.WHITE);
		panelSouth.setPreferredSize(new Dimension(1000, 30));

		JLabel labelVersion = new JLabel("Ver 1.0.0-20/4/2017");
		labelVersion.setBounds(800, 640, 200, 30);
		frame.getContentPane().add(labelVersion);

		JPanel panelWest = new JPanel();
		panelWest.setBackground(Color.WHITE);
		panelWest.setPreferredSize(new Dimension(50, 700));

		JPanel panelEast = new JPanel();
		panelEast.setBackground(Color.WHITE);
		panelEast.setPreferredSize(new Dimension(50, 700));

		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.WHITE);
		panelCenter.setPreferredSize(new Dimension(900, 490));
		ImageIcon iconLogo = new ImageIcon("images/logo.png");
		panelCenter.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, iconLogo));

		frame.add(panelNorth, BorderLayout.NORTH);
		frame.add(panelSouth, BorderLayout.SOUTH);
		frame.add(panelEast, BorderLayout.EAST);
		frame.add(panelWest, BorderLayout.WEST);
		frame.add(panelCenter, BorderLayout.CENTER);

		frame.pack();
		frame.show();
	}
}
