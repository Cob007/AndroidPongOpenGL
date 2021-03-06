package micheal.cob.pong;

import javax.microedition.khronos.opengles.GL10;

import micheal.cob.pong.PongSurfaceView.Rules;
import micheal.cob.pong.Rectangle;

import android.graphics.PointF;

public class Paddle extends PongObject {

  private static final PointF DEFAULT_SIZE = new PointF(1.0f, 1.0f);

  private Player mPlayer;


  
  //TODO Remove this and handle rendering ourselves.
  private Rectangle mRectangle;

  public Paddle(Player player, PointF location) {
    mPlayer = player;
    mLocation = location;
    mRectangle = new Rectangle();
    mSize = DEFAULT_SIZE;
  }

  /**
   * Move laterally by delta.
   */
  public void move(float delta) {
    mLocation.offset(delta, 0);

    if (mLocation.x < Rules.MIN_LOCATION.x) {
      mLocation.x = Rules.MIN_LOCATION.x;
    }
    if (mLocation.x > Rules.MAX_LOCATION.x) {
      mLocation.x = Rules.MAX_LOCATION.x;
    }
  }

  public Player getPlayer() {
    return mPlayer;
  }

  public void draw(GL10 gl) {
    // TODO Implement this ourselves.
    mRectangle.draw(gl);
  }

}
