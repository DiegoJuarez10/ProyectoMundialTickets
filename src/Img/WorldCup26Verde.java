/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Img;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.AlphaComposite;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author DIEGO JUAREZ
 */
public class WorldCup26Verde extends JPanel{
    private Image imagen;

    public WorldCup26Verde() {
        imagen = new ImageIcon(getClass().getResource("/descargas/fondomundial2026.jpg\"")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        // Transparencia (0.0f a 1.0f)
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.35f));

        // Dibujar imagen ajustada al tamaño del panel
        g2d.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
    }
}
