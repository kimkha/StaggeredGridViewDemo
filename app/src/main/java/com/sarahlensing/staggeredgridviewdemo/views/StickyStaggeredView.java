package com.sarahlensing.staggeredgridviewdemo.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;

import com.sarahlensing.staggeredgridview.StaggeredGridView;

/**
 * @author kimkha
 * @version 0.2
 * @since 4/21/15
 */
public class StickyStaggeredView extends StaggeredGridView {
    public final static String TAG = "StickyStaggeredView";
    public StickyStaggeredView(Context context) {
        super(context);
    }

    public StickyStaggeredView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StickyStaggeredView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

}
