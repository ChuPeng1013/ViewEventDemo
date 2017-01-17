package com.example.administrator.vieweventdemo;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by ChuPeng on 2017/1/16.
 */

public class MyViewGroupB extends LinearLayout
{

    public MyViewGroupB(Context context)
    {
        super(context);
    }

    public MyViewGroupB(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public MyViewGroupB(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyViewGroupB(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    //事件分发
    public boolean dispatchTouchEvent(MotionEvent ev)
    {

        Log.d("Event", "MyViewGroupB   dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    //事件拦截
    public boolean onInterceptTouchEvent(MotionEvent ev)
    {
        Log.d("Event", "MyViewGroupB   onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    //事件处理
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.d("Event", "MyViewGroupB   onTouchEvent");
        return super.onTouchEvent(event);
    }
}
