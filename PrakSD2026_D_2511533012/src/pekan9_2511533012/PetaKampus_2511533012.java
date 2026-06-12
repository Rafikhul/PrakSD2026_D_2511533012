package pekan9_2511533012;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class PetaKampus_2511533012 extends JFrame {

    private Map<String, java.util.List<String>> graph_3012 = new LinkedHashMap<>();
    private Map<String, Point> posisi_3012 = new HashMap<>();
    private Set<String> visited_3012 = new HashSet<>();
    private java.util.List<String> path_3012 = new ArrayList<>();

    private JComboBox<String> startBox_3012;
    private JComboBox<String> goalBox_3012;
    private JTextArea hasilArea_3012;
    private GraphPanel_3012 panelGraph_3012;

    public PetaKampus_2511533012() {
        setTitle("Pencarian Jalur BFS dan DFS - 2511533012");
        setSize(950, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        buatGraph_3012();

        JPanel topPanel_3012 = new JPanel();
        topPanel_3012.add(new JLabel("Lokasi Awal:"));
        startBox_3012 = new JComboBox<>(graph_3012.keySet().toArray(new String[0]));
        topPanel_3012.add(startBox_3012);

        topPanel_3012.add(new JLabel("Lokasi Tujuan:"));
        goalBox_3012 = new JComboBox<>(graph_3012.keySet().toArray(new String[0]));
        topPanel_3012.add(goalBox_3012);

        JButton bfsButton_3012 = new JButton("BFS");
        JButton dfsButton_3012 = new JButton("DFS");
        JButton resetButton_3012 = new JButton("RESET");

        topPanel_3012.add(bfsButton_3012);
        topPanel_3012.add(dfsButton_3012);
        topPanel_3012.add(resetButton_3012);

        panelGraph_3012 = new GraphPanel_3012();

        hasilArea_3012 = new JTextArea(7, 30);
        hasilArea_3012.setEditable(false);
        hasilArea_3012.setFont(new Font("Monospaced", Font.PLAIN, 14));

        add(topPanel_3012, BorderLayout.NORTH);
        add(panelGraph_3012, BorderLayout.CENTER);
        add(new JScrollPane(hasilArea_3012), BorderLayout.SOUTH);

        bfsButton_3012.addActionListener(e -> BFS_3012());
        dfsButton_3012.addActionListener(e -> DFS_3012());
        resetButton_3012.addActionListener(e -> resetGraph_3012());
    }

    private void buatGraph_3012() {
        String[] lokasi_3012 = {
                "Gerbang Utama", "Rektorat", "Perpustakaan", "Fakultas Teknik",
                "Fakultas Ekonomi", "Masjid Kampus", "Kantin", "Labor Komputer",
                "Aula", "Parkiran", "Gedung Kuliah", "Lapangan"
        };

        for (String lokasi : lokasi_3012) {
            graph_3012.put(lokasi, new ArrayList<>());
        }

        tambahEdge_3012("Gerbang Utama", "Rektorat");
        tambahEdge_3012("Gerbang Utama", "Parkiran");
        tambahEdge_3012("Rektorat", "Perpustakaan");
        tambahEdge_3012("Rektorat", "Fakultas Ekonomi");
        tambahEdge_3012("Perpustakaan", "Fakultas Teknik");
        tambahEdge_3012("Perpustakaan", "Gedung Kuliah");
        tambahEdge_3012("Fakultas Teknik", "Labor Komputer");
        tambahEdge_3012("Fakultas Teknik", "Aula");
        tambahEdge_3012("Fakultas Ekonomi", "Kantin");
        tambahEdge_3012("Fakultas Ekonomi", "Masjid Kampus");
        tambahEdge_3012("Masjid Kampus", "Kantin");
        tambahEdge_3012("Kantin", "Lapangan");
        tambahEdge_3012("Labor Komputer", "Gedung Kuliah");
        tambahEdge_3012("Aula", "Lapangan");
        tambahEdge_3012("Parkiran", "Masjid Kampus");
        tambahEdge_3012("Parkiran", "Lapangan");

        posisi_3012.put("Gerbang Utama", new Point(80, 250));
        posisi_3012.put("Rektorat", new Point(220, 150));
        posisi_3012.put("Perpustakaan", new Point(400, 90));
        posisi_3012.put("Fakultas Teknik", new Point(620, 90));
        posisi_3012.put("Fakultas Ekonomi", new Point(360, 250));
        posisi_3012.put("Masjid Kampus", new Point(250, 390));
        posisi_3012.put("Kantin", new Point(480, 370));
        posisi_3012.put("Labor Komputer", new Point(750, 170));
        posisi_3012.put("Aula", new Point(730, 300));
        posisi_3012.put("Parkiran", new Point(120, 430));
        posisi_3012.put("Gedung Kuliah", new Point(570, 220));
        posisi_3012.put("Lapangan", new Point(650, 430));
    }

    private void tambahEdge_3012(String a_3012, String b_3012) {
        graph_3012.get(a_3012).add(b_3012);
        graph_3012.get(b_3012).add(a_3012);
    }

    public void BFS_3012() {
        resetData_3012();

        String start_3012 = (String) startBox_3012.getSelectedItem();
        String goal_3012 = (String) goalBox_3012.getSelectedItem();

        Queue<String> queue_3012 = new LinkedList<>();
        Map<String, String> parent_3012 = new HashMap<>();

        queue_3012.add(start_3012);
        visited_3012.add(start_3012);
        parent_3012.put(start_3012, null);

        while (!queue_3012.isEmpty()) {
            String current_3012 = queue_3012.poll();

            if (current_3012.equals(goal_3012)) {
                break;
            }

            for (String neighbor_3012 : graph_3012.get(current_3012)) {
                if (!visited_3012.contains(neighbor_3012)) {
                    visited_3012.add(neighbor_3012);
                    parent_3012.put(neighbor_3012, current_3012);
                    queue_3012.add(neighbor_3012);
                }
            }
        }

        buatPath_3012(parent_3012, start_3012, goal_3012);
        displayPath_3012("BFS");
    }

    public void DFS_3012() {
        resetData_3012();

        String start_3012 = (String) startBox_3012.getSelectedItem();
        String goal_3012 = (String) goalBox_3012.getSelectedItem();

        Stack<String> stack_3012 = new Stack<>();
        Map<String, String> parent_3012 = new HashMap<>();

        stack_3012.push(start_3012);
        parent_3012.put(start_3012, null);

        while (!stack_3012.isEmpty()) {
            String current_3012 = stack_3012.pop();

            if (!visited_3012.contains(current_3012)) {
                visited_3012.add(current_3012);

                if (current_3012.equals(goal_3012)) {
                    break;
                }

                for (String neighbor_3012 : graph_3012.get(current_3012)) {
                    if (!visited_3012.contains(neighbor_3012)) {
                        stack_3012.push(neighbor_3012);
                        if (!parent_3012.containsKey(neighbor_3012)) {
                            parent_3012.put(neighbor_3012, current_3012);
                        }
                    }
                }
            }
        }

        buatPath_3012(parent_3012, start_3012, goal_3012);
        displayPath_3012("DFS");
    }

    private void buatPath_3012(Map<String, String> parent_3012, String start_3012, String goal_3012) {
        path_3012.clear();

        if (!parent_3012.containsKey(goal_3012)) {
            return;
        }

        String current_3012 = goal_3012;
        while (current_3012 != null) {
            path_3012.add(current_3012);
            current_3012 = parent_3012.get(current_3012);
        }

        Collections.reverse(path_3012);
    }

    public void displayPath_3012(String metode_3012) {
        hasilArea_3012.setText("");
        hasilArea_3012.append("Hasil Pencarian Menggunakan " + metode_3012 + "\n");

        if (path_3012.isEmpty()) {
            hasilArea_3012.append("Jalur: Tidak ditemukan\n");
        } else {
            hasilArea_3012.append("Jalur: " + String.join(" -> ", path_3012) + "\n");
        }

        hasilArea_3012.append("Node Dikunjungi: " + visited_3012 + "\n");
        hasilArea_3012.append("Jumlah Node Dieksplorasi: " + visited_3012.size() + "\n");

        displayGraph_3012();
    }

    public void displayGraph_3012() {
        panelGraph_3012.repaint();
    }

    public void resetGraph_3012() {
        resetData_3012();
        hasilArea_3012.setText("Graph dikembalikan ke kondisi awal.\n");
        displayGraph_3012();
    }

    private void resetData_3012() {
        visited_3012.clear();
        path_3012.clear();
    }

    class GraphPanel_3012 extends JPanel {
        protected void paintComponent(Graphics g_3012) {
            super.paintComponent(g_3012);
            setBackground(Color.WHITE);

            Graphics2D g2_3012 = (Graphics2D) g_3012;
            g2_3012.setStroke(new BasicStroke(2));

            for (String node_3012 : graph_3012.keySet()) {
                Point p1_3012 = posisi_3012.get(node_3012);

                for (String tetangga_3012 : graph_3012.get(node_3012)) {
                    Point p2_3012 = posisi_3012.get(tetangga_3012);
                    g2_3012.setColor(Color.GRAY);
                    g2_3012.drawLine(p1_3012.x, p1_3012.y, p2_3012.x, p2_3012.y);
                }
            }

            for (String node_3012 : graph_3012.keySet()) {
                Point p_3012 = posisi_3012.get(node_3012);

                if (path_3012.contains(node_3012)) {
                    g2_3012.setColor(Color.ORANGE);
                } else if (visited_3012.contains(node_3012)) {
                    g2_3012.setColor(Color.GREEN);
                } else {
                    g2_3012.setColor(Color.CYAN);
                }

                g2_3012.fillOval(p_3012.x - 25, p_3012.y - 25, 50, 50);
                g2_3012.setColor(Color.BLACK);
                g2_3012.drawOval(p_3012.x - 25, p_3012.y - 25, 50, 50);
                g2_3012.drawString(node_3012, p_3012.x - 45, p_3012.y + 45);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaKampus_2511533012().setVisible(true);
        });
    }
}