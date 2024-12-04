import java.awt.*;
import javax.swing.*;

public class AngryFaceCanvas extends Canvas {

    @Override
    public void paint(Graphics e) {
        // Draw face outline
        e.setColor(Color.ORANGE);
        e.fillOval(50, 50, 300, 300);

        // Draw eyes
        e.setColor(Color.BLACK);
        e.fillOval(120, 130, 50, 50); // Left eye
        e.fillOval(230, 130, 50, 50); // Right eye

        // Draw eyebrows
        e.setColor(Color.BLACK);
        e.drawLine(110, 110, 170, 140); // Left eyebrow
        e.drawLine(230, 140, 290, 110); // Right eyebrow

        // Draw mouth
        e.setColor(Color.RED);
        e.drawArc(130, 220, 140, 60, 0, 180); // Frowning mouth
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Angry Face");
        AngryFaceCanvas canvas = new AngryFaceCanvas();
        canvas.setSize(400, 400);

        frame.add(canvas);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}