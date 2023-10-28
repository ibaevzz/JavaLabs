import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {}

    private static void printImage(String path){
        JFrame frame = new JFrame("AC Milan : Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);

        ImagePanel panel = new ImagePanel(path);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
    private static void match(){
        AtomicInteger realS = new AtomicInteger(0);
        AtomicInteger milanS = new AtomicInteger(0);

        JFrame frame = new JFrame("AC Milan : Real Madrid");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);

        JPanel panelVertical = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        panelVertical.setSize(1000, 700);
        panel1.setSize(1000, 100);
        panel2.setSize(1000, 300);

        panelVertical.setLayout(new GridLayout(2, 1));

        JLabel score = new JLabel("Result: 0 X 0");
        JButton real = new JButton("Real Madrid");
        JButton milan = new JButton("AC Milan");
        JLabel winner = new JLabel("Winner: DRAW");

        real.addActionListener(e -> {
            realS.addAndGet(1);
            score.setText("Result: "+milanS.get()+" X "+realS.get());
            if(realS.get()>milanS.get()){
                winner.setText("Winner: Real Madrid");
            } else if (realS.get()<milanS.get()) {
                winner.setText("Winner: AC Milan");
            }else{
                winner.setText("Winner: DRAW");
            }
        });
        milan.addActionListener(e -> {
            milanS.addAndGet(1);
            score.setText("Result: "+milanS.get()+" X "+realS.get());
            if(realS.get()>milanS.get()){
                winner.setText("Winner: Real Madrid");
            } else if (realS.get()<milanS.get()) {
                winner.setText("Winner: AC Milan");
            }else{
                winner.setText("Winner: DRAW");
            }
        });

        real.setPreferredSize(new Dimension(300, 50));
        milan.setPreferredSize(new Dimension(300, 50));

        Font bigFont = new Font("TimesRoman", Font.BOLD, 30);

        real.setFont(bigFont);
        milan.setFont(bigFont);
        winner.setFont(bigFont);
        score.setFont(bigFont);

        panel1.add(milan);
        panel1.add(score);
        panel1.add(real);
        panel2.add(winner);

        panelVertical.add(panel1);
        panelVertical.add(panel2);

        frame.getContentPane().add(panelVertical);

        frame.setVisible(true);
    }

    public static class ImagePanel extends JPanel{

        private BufferedImage image;

        public ImagePanel(String path) {
            try {
                image = ImageIO.read(new File(path));
            } catch (IOException ignored) {
                System.out.println(ignored.getMessage());
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters
        }

    }
}