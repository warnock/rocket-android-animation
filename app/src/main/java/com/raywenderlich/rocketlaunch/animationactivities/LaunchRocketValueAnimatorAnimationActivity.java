package com.raywenderlich.rocketlaunch.animationactivities;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class LaunchRocketValueAnimatorAnimationActivity extends BaseAnimationActivity {

  @Override
  protected void onStartAnimation() {
      ValueAnimator valueAnimator = ValueAnimator.ofFloat(0, -mScreenHeight);
      valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

          @Override
          public void onAnimationUpdate(ValueAnimator animation) {
              float value = (float) animation.getAnimatedValue();
              mRocket.setTranslationY(value);
          }
      });

      valueAnimator.setInterpolator(new LinearInterpolator());
      valueAnimator.setDuration(DEFAULT_ANIMATION_DURATION);

      valueAnimator.start();
      }
}
