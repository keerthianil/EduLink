package ui.DonorRole;

import javax.swing.*;
import java.awt.*;

public class PieChartPanel extends JPanel {
    private int[] values;
    private String[] categories;
    private Color[] colors;

    public PieChartPanel(int[] values, String[] categories, Color[] colors) {
        this.values = values;
        this.categories = categories;
        this.colors = colors;
        setPreferredSize(new Dimension(400, 400)); // Optional: Set size for the pie chart
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Calculate total value
        int total = 0;
        for (int value : values) {
            total += value;
        }

        // If no data, display placeholder text
        if (total == 0) {
            g2d.setColor(Color.GRAY);
            g2d.drawString("No Data Available", 150, 200);
            return;
        }

        // Draw pie chart slices
        int startAngle = 0;
        for (int i = 0; i < values.length; i++) {
            int arcAngle = (int) Math.round((values[i] * 360.0) / total);
            g2d.setColor(colors[i % colors.length]);
            g2d.fillArc(50, 50, 300, 300, startAngle, arcAngle);
            startAngle += arcAngle;
        }

        // Draw legend
        int legendX = 400;
        int legendY = 50;
        for (int i = 0; i < categories.length; i++) {
            g2d.setColor(colors[i % colors.length]);
            g2d.fillRect(legendX, legendY + (i * 20), 15, 15);
            g2d.setColor(Color.BLACK);
            g2d.drawString(categories[i] + " - $" + values[i], legendX + 20, legendY + 12 + (i * 20));
        }
    }
}
