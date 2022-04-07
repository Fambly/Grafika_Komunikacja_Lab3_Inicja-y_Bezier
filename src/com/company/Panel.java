package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

import static java.lang.Math.pow;

public class Panel extends JPanel {

    //tworzę tablice współrzędnych 4pkt krzywej beziera

    public double[] stroke1x = {72, 118, 135, 174};
    public double[] stroke1y = {59, 23, 90, 51};

    public double[] stroke2x = {171, 151, 135, 174};
    public double[] stroke2y = {375, 322, 90, 51};

    public double[] stroke3x = {171, 122, 113, 30};
    public double[] stroke3y = {375, 344, 334, 377};

    public double[] stroke4x = {225, 198, 113, 30};
    public double[] stroke4y = {144, 194, 334, 377};

    public double[] stroke5x = {288, 282, 281, 281};
    public double[] stroke5y = {55, 111, 311, 370};

    public double[] stroke6x = {281, 278, 446, 440};
    public double[] stroke6y = {370, 385, 377, 272};

    public double[] stroke7x = {440, 430, 405, 275};
    public double[] stroke7y = {272, 220, 198, 210};

    public double[] stroke8x = {275, 330, 390, 420};
    public double[] stroke8y = {210, 210, 200, 110};

    public double[] stroke9x = {420, 430, 240, 220};
    public double[] stroke9y = {110, 15, 25, 50};

    public double[] stroke10x = {480, 510, 540, 560};
    public double[] stroke10y = {160, 160, 160, 160};

    public double[] stroke11x = {572, 618, 635, 674};
    public double[] stroke11y = {59, 23, 90, 51};

    public double[] stroke12x = {671, 651, 635, 674};
    public double[] stroke12y = {375, 322, 90, 51};

    public double[] stroke13x = {671, 622, 613, 530};
    public double[] stroke13y = {375, 344, 334, 377};

    public double[] stroke14x = {725, 698, 613, 530};
    public double[] stroke14y = {144, 194, 334, 377};

    //metoda odpowiadająca za rysowanie
    private void rysowanko(Graphics g){
    Graphics2D g2d = (Graphics2D) g;
    setBackground(Color.lightGray);

    bezio(g2d, stroke1x, stroke1y);
    bezio(g2d, stroke2x, stroke2y);
    bezio(g2d, stroke3x, stroke3y);
    bezio(g2d, stroke4x, stroke4y);
    bezio(g2d, stroke5x, stroke5y);
    bezio(g2d, stroke6x, stroke6y);
    bezio(g2d, stroke7x, stroke7y);
    bezio(g2d, stroke8x, stroke8y);
    bezio(g2d, stroke9x, stroke9y);
    bezio(g2d, stroke10x, stroke10y);
    bezio(g2d, stroke11x, stroke11y);
    bezio(g2d, stroke12x, stroke12y);
    bezio(g2d, stroke13x, stroke13y);
    bezio(g2d, stroke14x, stroke14y);
    }

    //implementacja wzoru na krzywą Bezier
    public void bezio (Graphics2D g, double[] x, double[]y){
        for (double t = 0; t <= 1; t+=0.005){
            double xt = pow(1 - t, 3) * x[0] + 3 * t * pow(1 - t, 2) * x[1] + 3 * pow(t, 2) * (1 - t) * x[2] + pow(t, 3) * x[3];
            double yt = pow(1 - t, 3) * y[0] + 3 * t * pow(1 - t, 2) * y[1] + 3 * pow(t, 2) * (1 - t) * y[2] + pow(t, 3) * y[3];
            g.setColor(Color.blue);
            g.draw(new Line2D.Double(xt, yt, xt, yt));
        }
    }

    //nadpisanie metody i narysowanie krzywych.
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        rysowanko(g);
    }
}
