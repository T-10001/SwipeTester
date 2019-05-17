package com.example.swipetester;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.google.android.exoplayer2.ui.PlayerView;

public class MyPlayerView extends PlayerView {
	private boolean isTouching;

	public MyPlayerView(Context context) {
		super(context);
	}

	public MyPlayerView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MyPlayerView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
			case MotionEvent.ACTION_DOWN:
				isTouching = true;
				return true;
			case MotionEvent.ACTION_UP:
				if (isTouching) {
					isTouching = false;
					performClick();
					return true;
				}
				return false;
			default:
				return false;
		}
	}

}
