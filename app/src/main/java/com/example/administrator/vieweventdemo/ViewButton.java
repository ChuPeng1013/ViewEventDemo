package com.example.administrator.vieweventdemo;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by ChuPeng on 2017/1/16.
 */

public class ViewButton extends Button
{

    public ViewButton(Context context)
    {
        super(context);
    }

    public ViewButton(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public ViewButton(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ViewButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public boolean dispatchTouchEvent(MotionEvent event)
    {
        Log.d("Event", "ViewButton     dispatchTouchEvent");
        return super.dispatchTouchEvent(event);
    }

    public boolean onTouchEvent(MotionEvent event)
    {
        Log.d("Event", "ViewButton     onTouchEvent");
        return super.onTouchEvent(event);
    }
}
