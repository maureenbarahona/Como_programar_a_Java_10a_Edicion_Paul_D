/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.CerOracleJava;

/**
 *
 * @author maureen
 */
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import static java.awt.Transparency.OPAQUE;
import static java.awt.Transparency.TRANSLUCENT;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fig4 extends JPanel {

    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(900, 600);
        Fig4 panel_pintura = new Fig4();
        ventana.add(panel_pintura);
        ventana.setVisible(true);
    }

    private class RoundGradient implements Paint {

        protected Point2D point;

        protected Point2D mRadius;

        protected Color color1, color2;

        public RoundGradient(double x, double y, Color color1, Point2D radius, Color color2) {
            if (radius.distance(0, 0) <= 0) {
                throw new IllegalArgumentException("Radius must be greater than 0.");
            }
            point = new Point2D.Double(x, y);
            this.color1 = color1;
            mRadius = radius;
            this.color2 = color2;
        }

        @Override
        public int getTransparency() {
            int a1 = color1.getAlpha();
            int a2 = color2.getAlpha();
            return (((a1 & a2) == 0xff) ? OPAQUE
                    : TRANSLUCENT);
        }

        @Override
        public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds,
                AffineTransform xform, RenderingHints hints) {
            Point2D transformedPoint = xform.transform(point, null);
            Point2D transformedRadius = xform.deltaTransform(mRadius, null);
            return new RoundGradientContext(transformedPoint, color1, transformedRadius, color2);
        }

    }

    private class RoundGradientContext implements PaintContext {

        protected Point2D mPoint;

        protected Point2D mRadius;

        protected Color color1, color2;

        public RoundGradientContext(Point2D p, Color c1, Point2D r, Color c2) {
            mPoint = p;
            color1 = c1;
            mRadius = r;
            color2 = c2;
        }

        public void dispose() {
        }

        public ColorModel getColorModel() {
            return ColorModel.getRGBdefault();
        }

        public Raster getRaster(int x, int y, int w, int h) {
            WritableRaster raster = getColorModel().createCompatibleWritableRaster(w, h);

            int[] data = new int[w * h * 4];
            for (int j = 0; j < h; j++) {
                for (int i = 0; i < w; i++) {
                    double distance = mPoint.distance(x + i, y + j);
                    double radius = mRadius.distance(0, 0);
                    double ratio = distance / radius;
                    if (ratio > 1.0) {
                        ratio = 1.0;
                    }

                    int base = (j * w + i) * 4;
                    data[base + 0] = (int) (color1.getRed() + ratio * (color2.getRed() - color1.getRed()));
                    data[base + 1] = (int) (color1.getGreen() + ratio * (color2.getGreen() - color1.getGreen()));
                    data[base + 2] = (int) (color1.getBlue() + ratio * (color2.getBlue() - color1.getBlue()));
                    data[base + 3] = (int) (color1.getAlpha() + ratio * (color2.getAlpha() - color1.getAlpha()));
                }
            }
            raster.setPixels(0, 0, w, h, data);

            return raster;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Color cFondoB = new Color(84, 101, 169);
        Color cFondoD = new Color(203, 210, 231);

        /* Para crear un gradiente circular. */
        RoundGradient roundGradient = new RoundGradient(getWidth() / 2, getHeight() / 2, cFondoD, new Point(0, 300), cFondoB);
        g2d.setPaint(roundGradient);

        g2d.fillRect(0, 0, 900, 600);

        //primer cuadro
        Color cPrimerCuadro = new Color(32, 44, 214);
        Color cDPrimerCuadro = new Color(11, 124, 233);

        g2d.setPaint(new GradientPaint(150, 150, cPrimerCuadro, 100, 200, cDPrimerCuadro));
        g2d.fillRect(75, 20, 200, 510);
        // g.setColor(new Color(45, 60, 251));
        //     g.fillRect(75, 20, 200, 510);

        //estrellas
        g.setColor(Color.white);
        g.fillOval(120, 45, 3, 3);
        g.fillOval(132, 60, 3, 3);
        g.fillOval(145, 49, 3, 3);
        g.fillOval(155, 63, 3, 3);
        g.fillOval(245, 85, 3, 3);
        g.fillOval(165, 53, 3, 3);
        g.fillOval(170, 65, 3, 3);
        g.fillOval(183, 61, 3, 3);
        g.fillOval(147, 80, 3, 3);
        g.fillOval(231, 50, 3, 3);
        g.fillOval(210, 63, 3, 3);

        //luna
        g.setColor(Color.white);
        g.fillOval(120, 100, 90, 90);
        g.setColor(cPrimerCuadro);
        g.fillOval(133, 70, 90, 100);

        //sombra 1
        g.setColor(new Color(4, 57, 31));
        Polygon sombra1 = new Polygon();
        sombra1.addPoint(75, 530);
        sombra1.addPoint(75, 460);
        sombra1.addPoint(275, 500);
        sombra1.addPoint(275, 530);
        sombra1.addPoint(75, 530);
        g.fillPolygon(sombra1);

        //sombra 2
        g.setColor(new Color(22, 108, 40));
        Polygon sombra2 = new Polygon();
        sombra2.addPoint(75, 460);
        sombra2.addPoint(75, 445);
        sombra2.addPoint(275, 405);
        sombra2.addPoint(275, 500);
        sombra2.addPoint(75, 460);
        g.fillPolygon(sombra2);

        //sombra 3
        g.setColor(new Color(43, 85, 21));
        Polygon sombra3 = new Polygon();
        sombra3.addPoint(75, 445);
        sombra3.addPoint(75, 360);
        sombra3.addPoint(275, 395);
        sombra3.addPoint(275, 405);
        sombra3.addPoint(75, 445);
        g.fillPolygon(sombra3);

        //montaña 1
        g.setColor(new Color(136, 187, 230));
        Polygon triang1 = new Polygon();
        triang1.addPoint(75, 360);
        triang1.addPoint(150, 260);
        triang1.addPoint(180, 378);
        triang1.addPoint(75, 360);
        g.fillPolygon(triang1);

        //montaña 2
        g.setColor(new Color(205, 203, 205));
        Polygon triang2 = new Polygon();
        triang2.addPoint(150, 373);
        triang2.addPoint(220, 285);
        triang2.addPoint(275, 360);
        triang2.addPoint(275, 403);
        triang2.addPoint(150, 373);
        g.fillPolygon(triang2);

        //pinitos
        g.setColor(new Color(5, 37, 9));
        Polygon pino1 = new Polygon();
        pino1.addPoint(85, 520);
        pino1.addPoint(100, 456);
        pino1.addPoint(115, 520);
        pino1.addPoint(85, 520);
        g.fillPolygon(pino1);

        g.setColor(new Color(7, 74, 17));
        Polygon pino2 = new Polygon();
        pino2.addPoint(135, 500);
        pino2.addPoint(145, 456);
        pino2.addPoint(155, 500);
        pino2.addPoint(135, 500);
        g.fillPolygon(pino2);

        g.setColor(new Color(10, 124, 28));
        Polygon pino3 = new Polygon();
        pino3.addPoint(200, 530);
        pino3.addPoint(204, 510);
        pino3.addPoint(208, 530);
        pino3.addPoint(200, 530);
        g.fillPolygon(pino3);

        g.setColor(new Color(10, 124, 28));
        Polygon pino4 = new Polygon();
        pino4.addPoint(190, 480);
        pino4.addPoint(200, 440);
        pino4.addPoint(210, 480);
        pino4.addPoint(200, 480);
        g.fillPolygon(pino4);

        g.setColor(new Color(10, 124, 28));
        Polygon pino7 = new Polygon();
        pino7.addPoint(160, 460);
        pino7.addPoint(170, 430);
        pino7.addPoint(180, 460);
        pino7.addPoint(160, 460);
        g.fillPolygon(pino7);

        g.setColor(new Color(15, 41, 20));
        Polygon pino5 = new Polygon();
        pino5.addPoint(85, 420);
        pino5.addPoint(90, 400);
        pino5.addPoint(95, 420);
        pino5.addPoint(85, 420);
        g.fillPolygon(pino5);

        g.setColor(new Color(15, 41, 20));
        Polygon pino6 = new Polygon();
        pino6.addPoint(150, 420);
        pino6.addPoint(155, 400);
        pino6.addPoint(160, 420);
        pino6.addPoint(150, 420);
        g.fillPolygon(pino6);

        g.setColor(new Color(15, 41, 20));
        Polygon pino8 = new Polygon();
        pino8.addPoint(110, 375);
        pino8.addPoint(115, 355);
        pino8.addPoint(120, 375);
        pino8.addPoint(110, 375);
        g.fillPolygon(pino8);

        g.setColor(new Color(15, 41, 20));
        Polygon pino9 = new Polygon();
        pino9.addPoint(210, 390);
        pino9.addPoint(215, 370);
        pino9.addPoint(220, 390);
        pino9.addPoint(210, 390);
        g.fillPolygon(pino9);

        //segundo cuadro
        Color cSegundoCuadro = new Color(119, 251, 253);
        Color cDSegundoCuadro = new Color(136, 213, 190);

        g2d.setPaint(new GradientPaint(110, 80, cSegundoCuadro, 100, 200, cDSegundoCuadro));
        g2d.fillRect(350, 20, 200, 510);

        //sol
        g.setColor(new Color(250, 252, 157));
        g.fillOval(383, 60, 140, 160);
        g.setColor(new Color(250, 243, 130));
        g.fillOval(401, 80, 100, 120);
        g.setColor(new Color(252, 240, 94));
        g.fillOval(419, 105, 65, 75);

        //sombra 4
        g.setColor(Color.green);
        Polygon sombra4 = new Polygon();
        sombra4.addPoint(350, 530);
        sombra4.addPoint(350, 460);
        sombra4.addPoint(550, 500);
        sombra4.addPoint(550, 530);
        sombra4.addPoint(350, 530);
        g.fillPolygon(sombra4);

        //sombra 5
        g.setColor(new Color(71, 135, 37));
        Polygon sombra5 = new Polygon();
        sombra5.addPoint(350, 460);
        sombra5.addPoint(350, 445);
        sombra5.addPoint(550, 405);
        sombra5.addPoint(550, 500);
        sombra5.addPoint(350, 460);
        g.fillPolygon(sombra5);

        //sombra 6
        g.setColor(new Color(70, 71, 6));
        Polygon sombra6 = new Polygon();
        sombra6.addPoint(350, 445);
        sombra6.addPoint(350, 360);
        sombra6.addPoint(550, 395);
        sombra6.addPoint(550, 405);
        sombra6.addPoint(350, 445);
        g.fillPolygon(sombra6);

        //montaña 3
        g.setColor(new Color(188, 222, 216));
        Polygon triang3 = new Polygon();
        triang3.addPoint(350, 360);
        triang3.addPoint(425, 260);
        triang3.addPoint(455, 378);
        triang3.addPoint(350, 360);
        g.fillPolygon(triang3);

        //montaña 4
        g.setColor(new Color(205, 203, 205));
        Polygon triang4 = new Polygon();
        triang4.addPoint(425, 373);
        triang4.addPoint(495, 285);
        triang4.addPoint(550, 360);
        triang4.addPoint(550, 403);
        triang4.addPoint(425, 373);
        g.fillPolygon(triang4);

        //pinitos
        g.setColor(new Color(24, 184, 58));
        Polygon pino11 = new Polygon();
        pino11.addPoint(360, 520);
        pino11.addPoint(375, 456);
        pino11.addPoint(390, 520);
        pino11.addPoint(360, 520);
        g.fillPolygon(pino11);

        Polygon pino12 = new Polygon();
        pino12.addPoint(410, 500);
        pino12.addPoint(420, 456);
        pino12.addPoint(430, 500);
        pino12.addPoint(410, 500);
        g.fillPolygon(pino12);

        Polygon pino13 = new Polygon();
        pino13.addPoint(475, 530);
        pino13.addPoint(479, 510);
        pino13.addPoint(483, 530);
        pino13.addPoint(475, 530);
        g.fillPolygon(pino13);

        g.setColor(new Color(22, 108, 40));
        Polygon pino14 = new Polygon();
        pino14.addPoint(465, 480);
        pino14.addPoint(475, 440);
        pino14.addPoint(485, 480);
        pino14.addPoint(465, 480);
        g.fillPolygon(pino14);

        Polygon pino15 = new Polygon();
        pino15.addPoint(435, 460);
        pino15.addPoint(445, 430);
        pino15.addPoint(455, 460);
        pino15.addPoint(435, 460);
        g.fillPolygon(pino15);

        g.setColor(new Color(33, 88, 4));
        Polygon pino16 = new Polygon();
        pino16.addPoint(360, 420);
        pino16.addPoint(365, 400);
        pino16.addPoint(370, 420);
        pino16.addPoint(360, 420);
        g.fillPolygon(pino16);

        Polygon pino17 = new Polygon();
        pino17.addPoint(425, 420);
        pino17.addPoint(430, 400);
        pino17.addPoint(435, 420);
        pino17.addPoint(425, 420);
        g.fillPolygon(pino17);

        Polygon pino18 = new Polygon();
        pino18.addPoint(385, 375);
        pino18.addPoint(390, 355);
        pino18.addPoint(395, 375);
        pino18.addPoint(385, 375);
        g.fillPolygon(pino18);

        Polygon pino19 = new Polygon();
        pino19.addPoint(485, 390);
        pino19.addPoint(490, 370);
        pino19.addPoint(495, 390);
        pino19.addPoint(485, 390);
        g.fillPolygon(pino19);

        //tercer cuadro cuadro
        Color cTercerCuadro = new Color(170, 0, 156);
        Color cDTercerCuadro = new Color(139, 115, 186);

        g2d.setPaint(new GradientPaint(110, 80, cTercerCuadro, 100, 200, cDTercerCuadro));
        g2d.fillRect(625, 20, 200, 510);
        // g.setColor(new Color(238, 17, 208));
        // g.fillRect(625, 20, 200, 510);

        //sol
        g.setColor(Color.white);
        g.fillOval(710, 135, 35, 45);

        //estrellas
        g.setColor(Color.white);
        g.fillOval(755, 45, 3, 3);
        g.fillOval(767, 60, 3, 3);
        g.fillOval(780, 49, 3, 3);
        g.fillOval(790, 63, 3, 3);
        g.fillOval(730, 85, 3, 3);
        g.fillOval(800, 53, 3, 3);
        g.fillOval(805, 65, 3, 3);
        g.fillOval(720, 61, 3, 3);
        g.fillOval(763, 80, 3, 3);
        g.fillOval(710, 50, 3, 3);
        g.fillOval(700, 63, 3, 3);

        //sombra 7
        g.setColor(new Color(60, 144, 15));
        Polygon sombra7 = new Polygon();
        sombra7.addPoint(625, 530);
        sombra7.addPoint(625, 460);
        sombra7.addPoint(825, 500);
        sombra7.addPoint(825, 530);
        sombra7.addPoint(625, 530);
        g.fillPolygon(sombra7);

        //sombra 8
        g.setColor(new Color(33, 88, 4));
        Polygon sombra8 = new Polygon();
        sombra8.addPoint(625, 460);
        sombra8.addPoint(625, 445);
        sombra8.addPoint(825, 405);
        sombra8.addPoint(825, 500);
        sombra8.addPoint(625, 460);
        g.fillPolygon(sombra8);

        //sombra 9
        g.setColor(new Color(15, 41, 20));
        Polygon sombra9 = new Polygon();
        sombra9.addPoint(625, 445);
        sombra9.addPoint(625, 360);
        sombra9.addPoint(825, 395);
        sombra9.addPoint(825, 405);
        sombra9.addPoint(625, 445);
        g.fillPolygon(sombra9);

        //montaña 5
        g.setColor(new Color(215, 185, 179));
        Polygon triang5 = new Polygon();
        triang5.addPoint(625, 360);
        triang5.addPoint(700, 260);
        triang5.addPoint(730, 378);
        triang5.addPoint(625, 360);
        g.fillPolygon(triang5);

        //montaña 6
        g.setColor(new Color(104, 64, 56));
        Polygon triang6 = new Polygon();
        triang6.addPoint(700, 373);
        triang6.addPoint(770, 285);
        triang6.addPoint(825, 360);
        triang6.addPoint(825, 403);
        triang6.addPoint(700, 373);
        g.fillPolygon(triang6);

        //pinitos
        g.setColor(new Color(73, 105, 61));
        Polygon pino21 = new Polygon();
        pino21.addPoint(635, 520);
        pino21.addPoint(650, 456);
        pino21.addPoint(665, 520);
        pino21.addPoint(635, 520);
        g.fillPolygon(pino21);

        Polygon pino22 = new Polygon();
        pino22.addPoint(685, 500);
        pino22.addPoint(695, 456);
        pino22.addPoint(705, 500);
        pino22.addPoint(685, 500);
        g.fillPolygon(pino22);

        Polygon pino23 = new Polygon();
        pino23.addPoint(750, 530);
        pino23.addPoint(754, 510);
        pino23.addPoint(759, 530);
        pino23.addPoint(750, 530);
        g.fillPolygon(pino23);

        g.setColor(new Color(70, 71, 6));
        Polygon pino24 = new Polygon();
        pino24.addPoint(765, 480);
        pino24.addPoint(775, 440);
        pino24.addPoint(785, 480);
        pino24.addPoint(765, 480);
        g.fillPolygon(pino24);

        Polygon pino25 = new Polygon();
        pino25.addPoint(735, 460);
        pino25.addPoint(745, 430);
        pino25.addPoint(755, 460);
        pino25.addPoint(735, 460);
        g.fillPolygon(pino25);

        g.setColor(new Color(45, 51, 40));
        Polygon pino26 = new Polygon();
        pino26.addPoint(660, 420);
        pino26.addPoint(665, 400);
        pino26.addPoint(670, 420);
        pino26.addPoint(660, 420);
        g.fillPolygon(pino26);

        Polygon pino27 = new Polygon();
        pino27.addPoint(725, 420);
        pino27.addPoint(730, 400);
        pino27.addPoint(735, 420);
        pino27.addPoint(725, 420);
        g.fillPolygon(pino27);

        Polygon pino28 = new Polygon();
        pino28.addPoint(685, 375);
        pino28.addPoint(690, 355);
        pino28.addPoint(695, 375);
        pino28.addPoint(685, 375);
        g.fillPolygon(pino28);

        Polygon pino29 = new Polygon();
        pino29.addPoint(755, 390);
        pino29.addPoint(760, 370);
        pino29.addPoint(765, 390);
        pino29.addPoint(755, 390);
        g.fillPolygon(pino29);
    }
}
