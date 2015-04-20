import java.awt.Color;

public class PlotSineCosine extends MultiPlotter {
  public void initMultiPlotter() {
    addFunction(new Sine(), Color.green);
    addFunction(new Cosine(), Color.blue);
  }
}
