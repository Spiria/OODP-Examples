import java.awt.*;

public abstract class MultiPlotter extends Plotter {

  abstract public void initMultiPlotter();

  public void init() {
    super.init();
    initMultiPlotter();
  }

  final public void addFunction(Function f, Color c) {
    if (numOfFunctions < MAX_FUNCTIONS && f  !=  null) {
      functions[numOfFunctions] = f;
      colors[numOfFunctions++] = c;
    }
  }

  protected void plotFunction(Graphics g) {
    for (int i = 0; i < numOfFunctions; i++) {
       if (functions[i] != null) {
         Color c = colors[i];
         if (c != null)
           g.setColor(c);
         else
           g.setColor(Color.black);
           for (int px = 0; px < d.width; px++) {
              try {
                double x = (double) (px - xorigin) / (double) xratio;
                double y = functions[i].apply(x);
                int py = yorigin - (int) (y * yratio);
                g.fillOval(px - 1, py - 1, 3, 3);
              } catch (Exception  e) {}
           }
       }
    }
  }


  public double func(double x) {
    return 0.0;
  }

  protected static int MAX_FUNCTIONS = 5;
  protected int numOfFunctions = 0;
  protected Function functions[] = new Function[MAX_FUNCTIONS];
  protected Color colors[] = new Color[MAX_FUNCTIONS];
}
