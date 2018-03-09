package micheal.cob.pong;

import javax.microedition.khronos.opengles.GL10;

import android.graphics.PointF;

public interface Renderable {

  void draw(GL10 gl);

  PointF getLocation();

}
