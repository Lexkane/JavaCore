import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Gui {

	private JFrame frame;

	public Gui() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		// frame.setBounds(100, 100, 450, 300);
		frame.setSize(1100, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea area_L = new JTextArea();
		area_L.setBounds(20,70, 480,630); 
		JTextArea area_R = new JTextArea();
		area_R.setBounds(590, 70, 480, 630);
		
		JScrollPane scroll_pane_L = new JScrollPane(area_L); 
		scroll_pane_L.setBounds(20, 70, 480, 630);
		JScrollPane scroll_pane_R = new JScrollPane(area_R); 
		scroll_pane_R.setBounds(590, 70, 480, 630);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu fileMenu = new JMenu("File");

		JMenuItem openItem = new JMenuItem("Open");
		fileMenu.add(openItem);

		JMenuItem saveItem = new JMenuItem("Save");
		fileMenu.add(saveItem);

		JMenu saveUsItem = new JMenu("Save us");
		fileMenu.add(saveUsItem);

		JMenuItem txtFileItem = new JMenuItem("Text file");
		saveUsItem.add(txtFileItem);

		JMenuItem imgFileItem = new JMenuItem("Image file");
		saveUsItem.add(imgFileItem);

		fileMenu.addSeparator();

		JMenuItem exitItem = new JMenuItem("Exit");
		fileMenu.add(exitItem);

		JMenu fileEdit = new JMenu("Edit");

		JMenuItem cleanItem = new JMenuItem("Clean");
		fileEdit.add(cleanItem);

		JMenu fileSetting = new JMenu("Setting");

		JMenuItem settingItem = new JMenuItem("Setting");
		fileSetting.add(settingItem);

		JMenuItem settingCriptItem = new JMenuItem("Setting Cript");
		fileSetting.add(settingCriptItem);

		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_L.setText(open_file());
			}
		});

		saveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save_file(area_R.getText());
			}
		});

		cleanItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_R.setText("");
				area_L.setText("");
			}
		});

		menuBar.add(fileMenu);
		menuBar.add(fileEdit);
		menuBar.add(fileSetting);

		frame.setJMenuBar(menuBar);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Cript", null, panel_1, null);

		Icon icon_encrypt = new ImageIcon("src/foto/encrypt.png");
		Icon icon_decrypt = new ImageIcon("src/foto/decrypt.png");
		Icon icon_red_arrow_R = new ImageIcon("src/foto/red_arrow_R.png");
		Icon icon_red_arrow_L = new ImageIcon("src/foto/red_arrow_L.png");
		Icon icon_clean = new ImageIcon("src/foto/clean.png");
		Icon icon_open = new ImageIcon("src/foto/open.png");
		Icon icon_save = new ImageIcon("src/foto/save.png");
		Icon icon_copy = new ImageIcon("src/foto/copy.png");
		Icon icon_paste = new ImageIcon("src/foto/paste.png");
		JButton button_encrypt = new JButton(icon_encrypt);
		JButton button_decrypt = new JButton(icon_decrypt);
		JButton button_red_arrow_R = new JButton(icon_red_arrow_R);
		JButton button_red_arrow_L = new JButton(icon_red_arrow_L);
		JButton button_clean = new JButton(icon_clean);
		JButton button_open = new JButton(icon_open);
		JButton button_save = new JButton(icon_save);
		JButton copy_area_L = new JButton(icon_copy);
		JButton copy_area_R = new JButton(icon_copy);
		JButton paste_area_L = new JButton(icon_paste);
		JCheckBox use_cript_setting = new JCheckBox("Use cript setting");
		button_encrypt.setBounds(510, 160, 65, 87);
		button_decrypt.setBounds(510, 270, 65, 87);
		button_red_arrow_L.setBounds(510, 410, 70, 35);
		button_red_arrow_R.setBounds(510, 480, 70, 35);
		button_clean.setBounds(510, 610, 70, 71);
		button_open.setBounds(25, 7, 56, 55);
		button_save.setBounds(1010, 7, 55, 55);
		use_cript_setting.setBounds(475, 30, 150, 15);
		copy_area_L.setBounds(230, 4, 57, 62);
		copy_area_R.setBounds(750, 4, 57, 62);
		paste_area_L.setBounds(310, 4, 57, 62);
		
		
	
		button_red_arrow_L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_L.setText(area_R.getText());
				area_R.setText("");
			}
		});

		button_red_arrow_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_R.setText(area_L.getText());
				area_L.setText("");
			}
		});

		button_clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_R.setText("");
				area_L.setText("");
			}
		});

		button_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				area_L.setText(open_file());
			}
		});

		button_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save_file(area_R.getText());
			}
		});

		copy_area_L.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Clipboard clipboard = toolkit.getSystemClipboard();
				StringSelection strSel = new StringSelection(area_L.getText());
				clipboard.setContents(strSel, null);
			}
		});
		
		copy_area_R.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Clipboard clipboard = toolkit.getSystemClipboard();
				StringSelection strSel = new StringSelection(area_R.getText());
				clipboard.setContents(strSel, null);
			}
		});
		
		paste_area_L.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				//area_L.setText("");
				try {
					area_L.setText( (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor));
				} catch (HeadlessException | UnsupportedFlavorException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				} 
			}
		});

		
		panel_1.setSize(1100, 770);
		panel_1.setLayout(null);
	//	panel_1.setVisible(true);
		panel_1.add(button_encrypt);
		panel_1.add(button_decrypt);
		panel_1.add(button_red_arrow_R);
		panel_1.add(button_red_arrow_L);
		panel_1.add(button_clean);
		panel_1.add(button_open);
		panel_1.add(button_save);
		panel_1.add(use_cript_setting);
		panel_1.add(copy_area_L);
		panel_1.add(copy_area_R);
		panel_1.add(scroll_pane_L);
		panel_1.add(scroll_pane_R);
		panel_1.add(paste_area_L);
		

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Cript Setting", null, panel_2, null);

		 JTextArea generate_key_area = new JTextArea();
		 JButton generate_key_button = new JButton("Generate keys");
		 JButton select_key_button = new JButton("Select keys");
		 JButton save_key_button = new JButton("Save keys");
		 ButtonGroup key_group_button = new ButtonGroup();
		 JRadioButton key_button_generate = new JRadioButton("Generate keys", false);
		 key_group_button.add(key_button_generate);
		 JRadioButton key_button_select = new JRadioButton("Select keys", false);
		 key_group_button.add(key_button_select);
		 JCheckBox use_keys = new JCheckBox("Use this keys");
		 JScrollPane scroll_pane_generate_key_area = new JScrollPane(generate_key_area); 
		 JLabel select_key_label = new JLabel("",SwingConstants.CENTER);

		 generate_key_area.setBounds(30, 110, 100, 300);
		 generate_key_area.setEditable(false); 
		 generate_key_button.setBounds(20, 70, 140, 30);
		 generate_key_button.setEnabled(false);
		 select_key_button.setBounds(170, 70, 120, 30);
		 select_key_button.setEnabled(false);
		 save_key_button.setBounds(150, 300, 110, 30);
		 use_keys.setBounds(140, 360, 170, 50);
		 scroll_pane_generate_key_area.setBounds(30, 110, 100, 300);
		 select_key_label.setBounds(155, 110, 150, 30);
		 select_key_label.setFont(new java.awt.Font("Arial", Font.ITALIC, 16));
		 select_key_label.setOpaque(true);
		 select_key_label.setForeground(Color.BLUE);
		 select_key_label.setBackground(Color.WHITE);
		 key_button_generate.setBounds(30, 10, 200,20);
		 key_button_select.setBounds(30, 30, 200,20);
		 use_keys.setEnabled(false);
		 
		 

		 select_key_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					StringBuilder sb = new StringBuilder(open_file());
					if(Cript.check_selected_key(sb)) {
						generate_key_area.setText(sb.toString());
						select_key_label.setForeground(Color.GREEN);
						select_key_label.setText("Keys added");
						use_keys.setEnabled(true);
					}
					else {
						use_keys.setEnabled(false);
						generate_key_area.setText("");
						select_key_label.setForeground(Color.RED);
						select_key_label.setText("Error. Wrong Keys");
					}
				}
			});
		 
		 key_button_generate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(key_button_generate.isSelected()) {
						use_keys.setEnabled(false);
						use_keys.setSelected(false);
						generate_key_button.setEnabled(true);
						select_key_button.setEnabled(false);
						 select_key_label.setForeground(Color.BLUE);
						select_key_label.setText("");
						generate_key_area.setText("");
					}
				}
			});
		 
		 key_button_select.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(key_button_select.isSelected()) {
						use_keys.setEnabled(false);
						use_keys.setSelected(false);
						select_key_button.setEnabled(true);
						generate_key_button.setEnabled(false);
						 select_key_label.setForeground(Color.BLUE);
						select_key_label.setText("Waiting...");
						generate_key_area.setText("");
					}
				}
			});
		 
		 generate_key_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					generate_key_area.setText(Cript.get_entered_generated_key());
					StringBuilder sb = new StringBuilder(generate_key_area.getText());
					if(generate_key_area.getText().length()>3) {
						use_keys.setEnabled(true);
					}
				}
			});
		 
		 save_key_button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					save_file(Cript.get_entered_generated_key());
				}
			});
		
		panel_2.add(scroll_pane_generate_key_area);
		panel_2.add(generate_key_button);
		panel_2.add(use_keys);
		panel_2.add(select_key_button);
		panel_2.add(save_key_button);
		panel_2.add(select_key_label);
		panel_2.add(key_button_generate);
		panel_2.add(key_button_select);
		panel_2.setSize(1100, 770);
		panel_2.setLayout(null);
	//	panel_2.setVisible(true);

		frame.setVisible(true);
		
		button_encrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!use_cript_setting.isSelected()) {
					area_R.setText(Cript.encrypt(area_L.getText(),Key.getKey()));
				}
				else {
					area_R.setText(Cript.encrypt_whis_setting(area_L.getText(), use_keys.isSelected(), generate_key_area.getText()));
					
					
					
				//area_R.setText(Cript.encrypt(area_L.getText(),Symbols.getSymbols())); 	
				//CriptSetting
				}
			}
		});

		button_decrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!use_cript_setting.isSelected()) {
				area_R.setText(Cript.decrypt(area_L.getText(),Key.getKey()));
				}
				else {
					area_R.setText(Cript.decrypt_whis_setting(area_L.getText(), use_keys.isSelected(), generate_key_area.getText()));
					
					// area_R.setText(Cript.decrypt(area_L.getText(),Symbols.getSymbols()));
					//CriptSetting
				}
			}
		});

	}

	public static String open_file() /* throws Exception */ {
		JFileChooser fileChooser = new JFileChooser();
		StringBuilder string_builder = new StringBuilder();
		if (fileChooser.showOpenDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
			try {
				FileReader file_reader = new FileReader(fileChooser.getSelectedFile());
				Scanner scanner = new Scanner(file_reader);
		//		boolean first_loop = false;
				while (scanner.hasNext()) {
					string_builder.append(scanner.nextLine()+"\n");
					//first_loop = true;
					// if(!(string_builder.substring(0, 6).toString().equals("Hv?0F:"))) {
					// string_builder.append("\n");
					// }
				}
				//if (string_builder.substring(string_builder.length()-2,string_builder.length()).equals("\n")) {
					string_builder.delete(string_builder.length()-1, string_builder.length());
				//}
				file_reader.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return string_builder.toString();
	}

	private void save_file(String output_text) /* throws Exception */ {
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showSaveDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
			try {
				FileWriter file_writer = new FileWriter(fileChooser.getSelectedFile().getPath());
				file_writer.write(output_text);
				file_writer.flush();
				file_writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}