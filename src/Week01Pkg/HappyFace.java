/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week01Pkg;
import javax.swing.JApplet;
import java.awt.Graphics;
/**
 *
 * @author Chike
 */
public class HappyFace extends JApplet 
{
    public void paint(Graphics canvas) 
    {
        canvas.drawOval(100, 50, 200, 200);
        canvas.fillOval(155, 100, 10, 20);
        canvas.fillOval(230, 100, 10, 20);
        canvas.drawArc(150, 160, 100, 50, 180, 180);
    }
}