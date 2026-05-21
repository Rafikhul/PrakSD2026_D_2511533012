package Pekan7_2511533012;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class SortingMahasiswaGUI_2511533012 extends JFrame {

    private JTextField tfNama_3012;
    private JTextField tfNim_3012;
    private JTextField tfProdi_3012;

    private JButton btnTambah_3012;
    private JButton btnHapus_3012;
    private JButton btnSort_3012;

    private JComboBox<String> cbSorting_3012;

    private JTable table_3012;

    private DefaultTableModel model_3012;

    private JTextArea areaProses_3012;

    private ArrayList<MahasiswaADT_2511533012> listMahasiswa_3012 = new ArrayList<>();

    public SortingMahasiswaGUI_2511533012() {

        setTitle("Sorting Mahasiswa");
        setSize(750, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelInput_3012 = new JPanel(new GridLayout(4, 2, 5, 5));

        panelInput_3012.add(new JLabel("Nama"));

        tfNama_3012 = new JTextField();

        panelInput_3012.add(tfNama_3012);

        panelInput_3012.add(new JLabel("NIM"));

        tfNim_3012 = new JTextField();

        panelInput_3012.add(tfNim_3012);

        panelInput_3012.add(new JLabel("Program Studi"));

        tfProdi_3012 = new JTextField();

        panelInput_3012.add(tfProdi_3012);

        btnTambah_3012 = new JButton("Tambah Data");

        panelInput_3012.add(btnTambah_3012);

        btnHapus_3012 = new JButton("Hapus Data");

        panelInput_3012.add(btnHapus_3012);

        add(panelInput_3012, BorderLayout.NORTH);

        model_3012 = new DefaultTableModel();

        model_3012.addColumn("Nama");
        model_3012.addColumn("NIM");
        model_3012.addColumn("Program Studi");

        table_3012 = new JTable(model_3012);

        add(new JScrollPane(table_3012), BorderLayout.CENTER);

        JPanel panelBottom_3012 = new JPanel(new BorderLayout());

        JPanel panelKontrol_3012 = new JPanel();

        cbSorting_3012 = new JComboBox<>();

        cbSorting_3012.addItem("Insertion Sort");

        cbSorting_3012.addItem("Selection Sort");

        cbSorting_3012.addItem("Bubble Sort");

        btnSort_3012 = new JButton("Mulai Sorting");

        panelKontrol_3012.add(new JLabel("Pilih Sorting"));

        panelKontrol_3012.add(cbSorting_3012);

        panelKontrol_3012.add(btnSort_3012);

        panelBottom_3012.add(panelKontrol_3012, BorderLayout.NORTH);

        areaProses_3012 = new JTextArea(10, 50);

        areaProses_3012.setEditable(false);

        panelBottom_3012.add(new JScrollPane(areaProses_3012), BorderLayout.CENTER);

        add(panelBottom_3012, BorderLayout.SOUTH);

        btnTambah_3012.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                tambahData_3012();
            }
        });

        btnHapus_3012.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                hapusData_3012();
            }
        });

        btnSort_3012.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e) {

                prosesSorting_3012();
            }
        });
    }

    private void tambahData_3012() {

        String nama_3012 = tfNama_3012.getText();

        String nim_3012 = tfNim_3012.getText();

        String prodi_3012 =
                tfProdi_3012.getText();

        MahasiswaADT_2511533012 mhs_3012 = new MahasiswaADT_2511533012(
                        nama_3012,
                        nim_3012,
                        prodi_3012);

        listMahasiswa_3012.add(mhs_3012);

        model_3012.addRow(new Object[] {
                nama_3012,
                nim_3012,
                prodi_3012
        });

        tfNama_3012.setText("");
        tfNim_3012.setText("");
        tfProdi_3012.setText("");
    }

    private void hapusData_3012() {

        int row_3012 =
                table_3012.getSelectedRow();

        if (row_3012 >= 0) {

            listMahasiswa_3012.remove(row_3012);

            model_3012.removeRow(row_3012);
        }
    }

    private void prosesSorting_3012() {

        areaProses_3012.setText("");

        String pilihan_3012 =
                cbSorting_3012
                        .getSelectedItem()
                        .toString();

        ArrayList<MahasiswaADT_2511533012>
                temp_3012 =
                new ArrayList<>(
                        listMahasiswa_3012);

        if (pilihan_3012.equals(
                "Insertion Sort")) {

            insertionSort_3012(temp_3012);

        } else if (pilihan_3012.equals(
                "Selection Sort")) {

            selectionSort_3012(temp_3012);

        } else {

            bubbleSort_3012(temp_3012);
        }

        model_3012.setRowCount(0);

        for (MahasiswaADT_2511533012 m_3012
                : temp_3012) {

            model_3012.addRow(new Object[] {

                    m_3012.getNama_3012(),
                    m_3012.getNim_3012(),
                    m_3012.getProdi_3012()
            });
        }
    }

    private void insertionSort_3012(
            ArrayList<MahasiswaADT_2511533012>
                    data_3012) {

        areaProses_3012.append(
                "=== INSERTION SORT ===\n");

        for (int i_3012 = 1;
             i_3012 < data_3012.size();
             i_3012++) {

            MahasiswaADT_2511533012 key_3012 =
                    data_3012.get(i_3012);

            int j_3012 = i_3012 - 1;

            while (j_3012 >= 0 &&
                    data_3012.get(j_3012)
                            .getNama_3012()
                            .compareToIgnoreCase(
                                    key_3012
                                            .getNama_3012())
                            > 0) {

                data_3012.set(
                        j_3012 + 1,
                        data_3012.get(j_3012));

                j_3012--;
            }

            data_3012.set(
                    j_3012 + 1,
                    key_3012);

            areaProses_3012.append(
                    "Langkah "
                            + i_3012
                            + " : "
                            + tampilNama_3012(
                                    data_3012)
                            + "\n");
        }
    }

    private void selectionSort_3012(
            ArrayList<MahasiswaADT_2511533012>
                    data_3012) {

        areaProses_3012.append(
                "=== SELECTION SORT ===\n");

        for (int i_3012 = 0;
             i_3012 < data_3012.size() - 1;
             i_3012++) {

            int min_3012 = i_3012;

            for (int j_3012 = i_3012 + 1;
                 j_3012 < data_3012.size();
                 j_3012++) {

                if (data_3012.get(j_3012)
                        .getNama_3012()
                        .compareToIgnoreCase(
                                data_3012
                                        .get(min_3012)
                                        .getNama_3012())
                        < 0) {

                    min_3012 = j_3012;
                }
            }

            MahasiswaADT_2511533012 temp_3012 =
                    data_3012.get(i_3012);

            data_3012.set(
                    i_3012,
                    data_3012.get(min_3012));

            data_3012.set(
                    min_3012,
                    temp_3012);

            areaProses_3012.append(
                    "Pass "
                            + (i_3012 + 1)
                            + " : "
                            + tampilNama_3012(
                                    data_3012)
                            + "\n");
        }
    }

    private void bubbleSort_3012(
            ArrayList<MahasiswaADT_2511533012>
                    data_3012) {

        areaProses_3012.append(
                "=== BUBBLE SORT ===\n");

        for (int i_3012 = 0;
             i_3012 < data_3012.size() - 1;
             i_3012++) {

            for (int j_3012 = 0;
                 j_3012 < data_3012.size()
                         - i_3012 - 1;
                 j_3012++) {

                if (data_3012.get(j_3012)
                        .getNama_3012()
                        .compareToIgnoreCase(
                                data_3012
                                        .get(j_3012 + 1)
                                        .getNama_3012())
                        > 0) {

                    MahasiswaADT_2511533012 temp_3012 =
                            data_3012.get(j_3012);

                    data_3012.set(
                            j_3012,
                            data_3012.get(j_3012 + 1));

                    data_3012.set(
                            j_3012 + 1,
                            temp_3012);
                }
            }

            areaProses_3012.append(
                    "Pass "
                            + (i_3012 + 1)
                            + " : "
                            + tampilNama_3012(
                                    data_3012)
                            + "\n");
        }
    }

    private String tampilNama_3012(
            ArrayList<MahasiswaADT_2511533012>
                    data_3012) {

        String hasil_3012 = "[";

        for (int i_3012 = 0;
             i_3012 < data_3012.size();
             i_3012++) {

            hasil_3012 +=
                    data_3012.get(i_3012)
                            .getNama_3012();

            if (i_3012 !=
                    data_3012.size() - 1) {

                hasil_3012 += ", ";
            }
        }

        hasil_3012 += "]";

        return hasil_3012;
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                new Runnable() {

            @Override
            public void run() {

                new SortingMahasiswaGUI_2511533012()
                        .setVisible(true);
            }
        });
    }
}
