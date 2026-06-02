package pekan8_2511533012;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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

public class BubblesortGUI_2511533012 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array;
    private JLabel[] labelArray;
    private JButton stepButton, resetButton, setButton;
    private JTextField inputField;
    private JPanel panelArray;
    private JTextArea stepArea;

    private int i_3012, j_3012;
    private boolean sorting = false;
    private int stepCount = 1;

    public BubblesortGUI_2511533012() {
        setTitle("Bubble Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputField = new JTextField(30);
        setButton = new JButton("Set Array");
        inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel.add(inputField);
        inputPanel.add(setButton);

        panelArray = new JPanel();
        panelArray.setLayout(new FlowLayout());

        JPanel controlPanel = new JPanel();
        stepButton = new JButton("Langkah Selanjutnya");
        resetButton = new JButton("Reset");
        stepButton.setEnabled(false);
        controlPanel.add(stepButton);
        controlPanel.add(resetButton);

        stepArea = new JTextArea(8, 60);
        stepArea.setEditable(false);
        stepArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(stepArea);

        add(inputPanel, BorderLayout.NORTH);
        add(panelArray, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        setButton.addActionListener(e -> setArrayFromInput());
        stepButton.addActionListener(e -> performStep_2511533012());
        resetButton.addActionListener(e -> reset_2511533012());
    }

    private void setArrayFromInput() {
        String text_3012 = inputField.getText().trim();
        if (text_3012.isEmpty()) return;
        String[] parts_3012 = text_3012.split(",");
        array = new int[parts_3012.length];
        try {
            for (int i_3012 = 0; i_3012 < parts_3012.length; i_3012++) {
                array[i_3012] = Integer.parseInt(parts_3012[i_3012].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        i_3012 = 0;
        j_3012 = 0;
        stepCount = 1;
        sorting = true;
        stepButton.setEnabled(true);
        stepArea.setText("");
        panelArray.removeAll();
        labelArray = new JLabel[array.length];
        for (int k_3012 = 0; k_3012 < array.length; k_3012++) {
            labelArray[k_3012] = new JLabel(String.valueOf(array[k_3012]));
            labelArray[k_3012].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray[k_3012].setOpaque(true);
            labelArray[k_3012].setBackground(Color.WHITE);
            labelArray[k_3012].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray[k_3012].setPreferredSize(new Dimension(50, 50));
            labelArray[k_3012].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray.add(labelArray[k_3012]);
        }
        panelArray.revalidate();
        panelArray.repaint();
    }

    private void performStep_2511533012() {
        if (!sorting || i_3012 >= array.length - 1) {
            sorting = false;
            stepButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }
        resetHighlights_2511533012();
        StringBuilder stepLog = new StringBuilder();
        labelArray[j_3012].setBackground(Color.CYAN);
        labelArray[j_3012 + 1].setBackground(Color.CYAN);
        if (array[j_3012] > array[j_3012 + 1]) {
            // Swap
            int temp_3012 = array[j_3012];
            array[j_3012] = array[j_3012 + 1];
            array[j_3012 + 1] = temp_3012;
            labelArray[j_3012].setBackground(Color.RED);
            labelArray[j_3012 + 1].setBackground(Color.RED);
            stepLog.append("Langkah ").append(stepCount).append(": Menukar elemen ke-")
                   .append(j_3012).append(" (").append(array[j_3012 + 1]).append(") dengan ke-")
                   .append(j_3012 + 1).append(" (").append(array[j_3012]).append(")\n");
        } else {
            stepLog.append("Langkah ").append(stepCount).append(": Tidak ada pertukaran antara ke-")
                   .append(j_3012).append(" dan ke-").append(j_3012 + 1).append("\n");
        }
        stepLog.append("Hasil: ").append(arrayToString_2511533012(array)).append("\n\n");
        stepArea.append(stepLog.toString());
        updateLabels_2511533012();
        j_3012++;
        if (j_3012 >= array.length - i_3012 - 1) {
            j_3012 = 0;
            i_3012++;
        }
        stepCount++;
        if (i_3012 >= array.length - 1) {
            sorting = false;
            stepButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void resetHighlights_2511533012() {
        if (labelArray == null) return;
        for (JLabel label : labelArray) {
            label.setBackground(Color.WHITE);
        }
    }

    private void updateLabels_2511533012() {
        for (int k_3012 = 0; k_3012 < array.length; k_3012++) {
            labelArray[k_3012].setText(String.valueOf(array[k_3012]));
        }
    }

    private void reset_2511533012() {
        inputField.setText("");
        panelArray.removeAll();
        panelArray.revalidate();
        panelArray.repaint();
        stepArea.setText("");
        stepButton.setEnabled(false);
        sorting = false;
        i_3012 = 0;
        j_3012 = 0;
        stepCount = 1;
    }

    private String arrayToString_2511533012(int[] arr_3012) {
        StringBuilder sb = new StringBuilder();
        for (int k_3012 = 0; k_3012 < arr_3012.length; k_3012++) {
            sb.append(arr_3012[k_3012]);
            if (k_3012 < arr_3012.length - 1) sb.append(", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BubblesortGUI_2511533012 gui = new BubblesortGUI_2511533012();
            gui.setVisible(true);
        });
    }
}