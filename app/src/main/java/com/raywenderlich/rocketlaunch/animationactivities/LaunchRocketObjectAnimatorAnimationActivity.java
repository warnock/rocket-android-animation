package com.raywenderlich.rocketlaunch.animationactivities;

import android.animation.ObjectAnimator;

public class LaunchRocketObjectAnimatorAnimationActivity extends BaseAnimationActivity {
  @Override
  protected void onStartAnimation() {
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(mRocket, "translationY",
            0, -mScreenHeight);

    objectAnimator.setDuration(DEFAULT_ANIMATION_DURATION);
    objectAnimator.start();

  }
}
