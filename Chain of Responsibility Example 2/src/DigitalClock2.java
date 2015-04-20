//package ChainResp;

import java.awt.*;
import java.util.Calendar;

public class DigitalClock2 extends AnimationApplet {
  public DigitalClock2() {
    setDelay(1000);
  }
  public void paint(Graphics g) {
    Calendar calendar = Calendar.getInstance();
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    int minute = calendar.get(Calendar.MINUTE);
    int second = calendar.get(Calendar.SECOND);
    g.setFont(font);
    g.setColor(color);
    g.drawString(hour + ":" + minute / 10 + minute % 10 +
                        ":" + second / 10 + second % 10, 10, 60);
  }
  protected Font font = new Font("Monospaced", Font.BOLD, 60);
  protected Color color = Color.red;
}


