import java.awt.*;

public abstract class Plotter
    extends java.applet.Applet {
  public abstract double func(double x);
  public void init() {
    d = getSize();
    String att = getParameter("xratio");
    if (att != null)
      xratio = Integer.parseInt(att);
    att = getParameter("yratio");
    if (att != null)
      yratio = Integer.parseInt(att);
    att = getParameter("xorigin");
    if (att != null)
      xorigin = Integer.parseInt(att);
    else
      xorigin = d.width / 2;
    att = getParameter("yorigin");
    if (att != null)
      yorigin = Integer.parseInt(att);
    else
      yorigin = d.height / 2;
  }
  public void paint(Graphics g) {
    drawCoordinates(g);
    plotFunction(g);
  }


  protected Dimension d;


  protected Color color = Color.black;


  protected int xorigin, yorigin;


  protected int xratio = 100, yratio = 100;

  protected void plotFunction(Graphics g) {
    for (int px = 0; px < d.width; px++) {
      try {
        double x = (double)(px - xorigin) / (double)xratio;
        double y = func(x);
        int py = yorigin - (int) (y * yratio);
        g.fillOval(px - 1, py - 1, 3, 3);
      } catch (Exception e) {}
    }
  }
  protected void drawCoordinates(Graphics g) {
    g.setColor(Color.white);
    g.fillRect(0, 0, d.width, d.height);

    g.setColor(color);
    g.drawLine(0, yorigin, d.width, yorigin);
    g.drawLine(xorigin, 0, xorigin, d.height);

    g.setFont(new Font("TimeRoman", Font.PLAIN, 10));
    int px, py;
    int i = 1;
    py = yorigin + 12;
    g.drawString("0", xorigin + 2, py);
    for (px = xorigin + xratio; px < d.width; px += xratio) {
      g.drawString(Integer.toString(i++), px - 2, py);
      g.drawLine(px, yorigin - 2, px, yorigin + 2);
    }

    i = -1;
    for (px = xorigin - xratio; px >= 0; px -= xratio) {
      g.drawString(Integer.toString(i--), px - 2, py);
      g.drawLine(px, yorigin - 2, px, yorigin + 2);
    }

    i = 1;
    px = xorigin + 4;
    for (py = yorigin - yratio; py >= 0; py -= yratio) {
      g.drawString(Integer.toString(i++), px, py + 4);
      g.drawLine(xorigin - 2, py, xorigin + 2, py);
    }

    i = -1;
    for (py = yorigin + yratio; py < d.height; py += yratio) {
      g.drawString(Integer.toString(i--), px, py + 4);
      g.drawLine(xorigin - 2, py, xorigin + 2, py);
    }

  }

}
