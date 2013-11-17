package Test;

import java.awt.*;

/**
 * *v1**
 * *FinalProject** 
 * *ThomasR**
 * *11142013:1829**
 */
public class drawing_LINE extends ShapeABS {
  @Override
  public void drawShape(Graphics drawnGraphics, int PosX, int PosY, int lengthX, int lengthY, Color shapeColor, BasicStroke shapeStrokeSize, boolean IMG_filled, float IMG_alpha, GradientPaint shapeGradient, TexturePaint shapeTexture) {
    {
      Graphics2D flatImage = (Graphics2D) drawnGraphics;
      flatImage.setColor(shapeColor);
      flatImage.setStroke(shapeStrokeSize);
      //AlphaComposite alphaValue = AlphaComposite.getInstance(3, IMG_alpha);
      //flatImage.setComposite(alphaValue);

      //if (shapeGradient != null) {
        //flatImage.setPaint(shapeGradient);
      //}

      //if (shapeTexture != null) {
        //flatImage.setPaint(shapeTexture);
      //}

      flatImage.drawLine(PosX, PosY, lengthX, lengthY);
    }
  }
}
