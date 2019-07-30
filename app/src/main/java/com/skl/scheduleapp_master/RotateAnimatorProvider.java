package com.skl.scheduleapp_master;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.github.nukc.stateview.AnimatorProvider;

/**
 * Created by hl on 2018/4/2.
 */

public class RotateAnimatorProvider implements AnimatorProvider {
    @Override
    public Animator showAnimation(View view) {
        ViewGroup emptyView = (ViewGroup) view;
        ImageView ivState = (ImageView) emptyView.findViewById(R.id.bl_stateview_iv);

        AnimatorSet set = new AnimatorSet();
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(ivState, "rotation", 0f, 360f)
                .setDuration(1200);
        objectAnimator.setRepeatCount(-1);
        set.setInterpolator(new LinearInterpolator());
        set.playTogether(objectAnimator );

        return set;
    }

    @Override
    public Animator hideAnimation(View view) {
        //        AnimatorSet set = new AnimatorSet();
        //            set.playTogether(
        //                    ObjectAnimator.ofFloat(view, "rotation", 0f, 0f)
        //            );
        //        return set;
        return null;
    }
}
