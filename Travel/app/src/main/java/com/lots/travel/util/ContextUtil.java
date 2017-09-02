package com.lots.travel.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.AttrRes;

public final class ContextUtil {

    public static int getColor(Context context,@AttrRes int attrId){
        TypedArray a = context.obtainStyledAttributes(new int[]{attrId});
        int color = a.getColor(0,Color.BLACK);
        a.recycle();
        return color;
    }

    public static float getDimen(Context context,@AttrRes int attrId){
        TypedArray a = context.obtainStyledAttributes(new int[]{attrId});
        float value = a.getDimension(0,0f);
        a.recycle();
        return value;
    }

}
