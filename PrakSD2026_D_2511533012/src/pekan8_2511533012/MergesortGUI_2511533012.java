package pekan8_2511533012;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.LinkedList;
import java.util.Queue;

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

public class MergesortGUI_2511533012 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array;
    private JLabel[] labelArray;
    private JButton stepButton, resetButton, setButton;
    private JTextField inputField;
    private JPanel panelArray;
    private JTextArea stepArea;

    private int i_3102, j_3102, k_3102;
    private int left_3102, mid_3102, right_3102;
    private int[] temp_3102;
    private boolean isMerging = false;
    private boolean copying = false;
    private int stepCount = 1;
    private Queue<int[]> mergeQueue = new LinkedList<>();

    public MergesortGUI_2511533012() {
        setTitle("Merge Sort Langkah per Langkah");
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

        setButton.addActionListener(e -> setArrayFromInput_251133012());
        stepButton.addActionListener(e -> performStep_2511533012());
        resetButton.addActionListener(e -> reset_2511533012());
    }

    private void setArrayFromInput_251133012() {
        String text_3102 = inputField.getText().trim();
        if (text_3102.isEmpty()) return;
        String[] parts_3102 = text_3102.split(",");
        array = new int[parts_3102.length];
        try {
            for (int i_3102 = 0; i_3102 < parts_3102.length; i_3102++) {
                array[i_3102] = Integer.parseInt(parts_3102[i_3102].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        labelArray = new JLabel[array.length];
        panelArray.removeAll();
        for (int i_3102 = 0; i_3102 < array.length; i_3102++) {
            labelArray[i_3102] = new JLabel(String.valueOf(array[i_3102]));
            labelArray[i_3102].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray[i_3102].setOpaque(true);
            labelArray[i_3102].setBackground(Color.WHITE);
            labelArray[i_3102].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray[i_3102].setPreferredSize(new Dimension(50, 50));
            labelArray[i_3102].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray.add(labelArray[i_3102]);
        }
        mergeQueue.clear();
        generateMergeSteps_2511533012(0, array.length - 1);
        stepButton.setEnabled(true);
        stepArea.setText("");
        stepCount = 1;
        isMerging = false;
        panelArray.revalidate();
        panelArray.repaint();
    }

    private void generateMergeSteps_2511533012(int l_3102, int r_3102) {
        if (l_3102 >= r_3102) return;
        int m_3102 = (l_3102 + r_3102) / 2;
        generateMergeSteps_2511533012(l_3102, m_3102);
        generateMergeSteps_2511533012(m_3102 + 1, r_3102);
        mergeQueue.add(new int[]{l_3102, m_3102, r_3102});
    }

    private void performStep_2511533012() {
        resetHighlights_2511533012();

        if (!isMerging && !mergeQueue.isEmpty()) {
            int[] range = mergeQueue.poll();
            left_3102 = range[0];
            mid_3102 = range[1];
            right_3102 = range[2];
            temp_3102 = new int[right_3102 - left_3102 + 1];
            i_3102 = left_3102;
            j_3102 = mid_3102 + 1;
            k_3102 = 0;
            copying = false;
            isMerging = true;
            stepArea.append("Langkah " + stepCount++ +
                    ": Mulai merge dari " + left_3102 + " ke " + right_3102 + "\n");
            return;
        }

        if (isMerging && !copying) {
            if (i_3102 <= mid_3102 && j_3102 <= right_3102) {
                labelArray[i_3102].setBackground(Color.CYAN);
                labelArray[j_3102].setBackground(Color.CYAN);
                if (array[i_3102] <= array[j_3102]) {
                    temp_3102[k_3102++] = array[i_3102++];
                } else {
                    temp_3102[k_3102++] = array[j_3102++];
                }
                stepArea.append("Langkah " + stepCount++ + ": Bandingkan dan salin elemen\n");
                return;
            } else if (i_3102 <= mid_3102) {
                temp_3102[k_3102++] = array[i_3102++];
                stepArea.append("Langkah " + stepCount++ + ": Salin sisa kiri\n");
                return;
            } else if (j_3102 <= right_3102) {
                temp_3102[k_3102++] = array[j_3102++];
                stepArea.append("Langkah " + stepCount++ + ": Salin sisa kanan\n");
                return;
            } else {
                copying = true;
                k_3102 = 0;
                return;
            }
        }

        if (copying && k_3102 < temp_3102.length) {
            array[left_3102 + k_3102] = temp_3102[k_3102];
            labelArray[left_3102 + k_3102].setText(String.valueOf(temp_3102[k_3102]));
            labelArray[left_3102 + k_3102].setBackground(Color.GREEN);
            k_3102++;
            stepArea.append("Langkah " + stepCount++ + ": Tempelkan ke array utama\n");
            return;
        }

        if (copying && k_3102 == temp_3102.length) {
            isMerging = false;
            copying = false;
        }

        if (mergeQueue.isEmpty() && !isMerging) {
            stepArea.append("Selesai.\n");
            stepButton.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void resetHighlights_2511533012() {
        if (labelArray == null) return;
        for (JLabel label : labelArray) {
            label.setBackground(Color.WHITE);
        }
    }

    private void reset_2511533012() {
        inputField.setText("");
        panelArray.removeAll();
        panelArray.revalidate();
        panelArray.repaint();
        stepArea.setText("");
        stepButton.setEnabled(false);
        mergeQueue.clear();
        isMerging = false;
        stepCount = 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MergesortGUI_2511533012 gui = new MergesortGUI_2511533012();
            gui.setVisible(true);
        });
    }
}