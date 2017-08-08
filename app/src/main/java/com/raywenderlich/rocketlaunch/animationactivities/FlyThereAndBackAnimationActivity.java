package com.raywenderlich.rocketlaunch.animationactivities;

import android.animation.ValueAnimator;

public class FlyThereAndBackAnimationActivity extends BaseAnimationActivity {
  @Override
  protected void onStartAnimation() {
    ValueAnimator animator = ValueAnimator.ofFloat(0, -mScreenHeight);

    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
      @Override
      public void onAnimationUpdate(ValueAnimator animation) {
        float value = (float) animation.getAnimatedValue();
        mRocket.setTranslationY(value);
        mDoge.setTranslationY(value);
      }
    });

    animator.setRepeatMode(ValueAnimator.REVERSE);

    animator.setRepeatCount(3);

    animator.setDuration(500L);
    animator.start();
  }
}
