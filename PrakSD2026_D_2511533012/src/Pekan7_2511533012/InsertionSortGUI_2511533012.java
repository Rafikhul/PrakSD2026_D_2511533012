package Pekan7_2511533012;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511533012 extends JFrame {
	    private static final long serialVersionUID = 1L;
	    private int[] array_3012;
	    private JLabel[] labelArray_3012;
	    private JButton stepButton_3012, resetButton_3012, setButton_3012;
	    private JTextField inputField_3012;
	    private JPanel panelArray_3012;
	    private JTextArea stepArea_3012;

	    private int i = 1, j;
	    private boolean sorting_3012 = false;
	    private int stepCount_3012 = 1;	

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	    public InsertionSortGUI_2511533012() {
	        setTitle("Insertion Sort Langkah per Langkah");
	        setSize(750, 400);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        setLayout(new BorderLayout());

	        // Panel input
	        JPanel inputPanel = new JPanel(new FlowLayout());
	        inputField_3012 = new JTextField(30);
	        setButton_3012 = new JButton("Set Array");
	        inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
	        inputPanel.add(inputField_3012);
	        inputPanel.add(setButton_3012);

	        panelArray_3012 = new JPanel();
	        panelArray_3012.setLayout(new FlowLayout());

	        JPanel controlPanel = new JPanel();
	        stepButton_3012 = new JButton("Langkah Selanjutnya");
	        resetButton_3012 = new JButton("Reset");
	        stepButton_3012.setEnabled(false);
	        controlPanel.add(stepButton_3012);
	        controlPanel.add(resetButton_3012);
	        
	        stepArea_3012 = new JTextArea(8, 60);
	        stepArea_3012.setEditable(false);
	        stepArea_3012.setFont(new Font("Monospaced", Font.PLAIN, 14));
	        JScrollPane scrollPane = new JScrollPane(stepArea_3012);

	        add(inputPanel, BorderLayout.NORTH);
	        add(panelArray_3012, BorderLayout.CENTER);
	        add(controlPanel, BorderLayout.SOUTH);
	        add(scrollPane, BorderLayout.EAST);

	        setButton_3012.addActionListener(e -> setArrayFromInput_3012());

	        stepButton_3012.addActionListener(e -> performStep_3012());

	        resetButton_3012.addActionListener(e -> reset_3012());
		
	    }
	    private void setArrayFromInput_3012() {
	        String text = inputField_3012.getText().trim();
	        if (text.isEmpty()) return;
	        String[] parts = text.split(",");
	        array_3012 = new int[parts.length];
	        try {
	            for (int k = 0; k < parts.length; k++) {
	                array_3012[k] = Integer.parseInt(parts[k].trim());
	            }
	        } catch (NumberFormatException e) {
	            JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
	                    + "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
	            return;
	        }
	        i = 1;
	        stepCount_3012 = 1;
	        sorting_3012 = true;
	        stepButton_3012.setEnabled(true);
	        stepArea_3012.setText("");
	        panelArray_3012.removeAll();
	        labelArray_3012 = new JLabel[array_3012.length];
	        for (int k = 0; k < array_3012.length; k++) {
	            labelArray_3012[k] = new JLabel(String.valueOf(array_3012[k]));
	            labelArray_3012[k].setFont(new Font("Arial", Font.BOLD, 24));
	            labelArray_3012[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	            labelArray_3012[k].setPreferredSize(new Dimension(50, 50));
	            labelArray_3012[k].setHorizontalAlignment(SwingConstants.CENTER);
	            panelArray_3012.add(labelArray_3012[k]);
	        }
	        panelArray_3012.revalidate();
	        panelArray_3012.repaint();
	    }
	    private void performStep_3012() {
	        if (i < array_3012.length && sorting_3012) {
	            int key = array_3012[i];
	            j = i - 1;

	            StringBuilder stepLog = new StringBuilder();
	            stepLog.append("Langkah ").append(stepCount_3012).
	            append(": Memasukkan ").append(key).append("\n");

	            while (j >= 0 && array_3012[j] > key) {
	                array_3012[j + 1] = array_3012[j];
	                j--;
	            }
	            array_3012[j + 1] = key;

	            updateLabels();
	            stepLog.append("Hasil: ").append(arrayToString(array_3012)).append("\n\n");
	            stepArea_3012.append(stepLog.toString());

	            i++;
	            stepCount_3012++;

	            if (i == array_3012.length) { 
	                sorting_3012 = false;
	                stepButton_3012.setEnabled(false);
	                JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        }
	        }
	    }
	            private void updateLabels() {
	                for (int k = 0; k < array_3012.length; k++) {
	                    labelArray_3012[k].setText(String.valueOf(array_3012[k]));
	                }
	            }

	            private void reset_3012() {
	                inputField_3012.setText("");
	                panelArray_3012.removeAll();
	                panelArray_3012.revalidate();
	                panelArray_3012.repaint();
	                stepArea_3012.setText("");
	                stepButton_3012.setEnabled(false);
	                sorting_3012 = false;
	                i = 1;
	                stepCount_3012 = 1;
	            }

	            private String arrayToString(int[] arr_3012) {
	                StringBuilder sb = new StringBuilder();
	                for (int k = 0; k < arr_3012.length; k++) {
	                    sb.append(arr_3012[k]);
	                    if (k < arr_3012.length - 1) sb.append(", ");
	                }
	                return sb.toString();
	            }

	            public static void main(String[] args) {
	                SwingUtilities.invokeLater(() -> {
	                    InsertionSortGUI_2511533012 gui = new InsertionSortGUI_2511533012();
	                    gui.setVisible(true);
	                });
	            }
	        }
	        