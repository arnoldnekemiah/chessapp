/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.widget.TextView
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.jetstartgames.chess;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import c.c.a.u;

public class CustomTextView
extends TextView {
    public float a;
    public Integer b;
    public Paint.Join c;
    public float d;

    public CustomTextView(Context context) {
        super(context);
        this.a(null);
    }

    public CustomTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a(attributeSet);
    }

    public CustomTextView(Context context, AttributeSet attributeSet, int n10) {
        super(context, attributeSet, n10);
        this.a(attributeSet);
    }

    public void a(AttributeSet attributeSet) {
        TypedArray typedArray;
        if (attributeSet != null && (typedArray = this.getContext().obtainStyledAttributes(attributeSet, u.CoustomTextView)).hasValue(1)) {
            float f10 = typedArray.getDimensionPixelSize(4, 1);
            int n10 = typedArray.getColor(1, -16777216);
            float f11 = typedArray.getDimensionPixelSize(3, 10);
            int n11 = typedArray.getInt(2, 0);
            Object object = n11 != 0 ? (n11 != 1 ? (n11 != 2 ? null : Paint.Join.ROUND) : Paint.Join.BEVEL) : Paint.Join.MITER;
            this.a = f10;
            this.b = n10;
            this.c = object;
            this.d = f11;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int n10 = this.getCurrentTextColor();
        if (this.b != null) {
            TextPaint textPaint = this.getPaint();
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeJoin(this.c);
            textPaint.setStrokeMiter(this.d);
            this.setTextColor(this.b.intValue());
            textPaint.setStrokeWidth(this.a);
            super.onDraw(canvas);
            textPaint.setStyle(Paint.Style.FILL);
            this.setTextColor(n10);
        }
    }
}

