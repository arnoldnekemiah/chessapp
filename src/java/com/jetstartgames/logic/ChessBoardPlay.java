/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  c.c.b.a
 *  c.c.b.e
 *  c.c.b.i.f
 *  c.c.b.i.g
 *  c.c.b.i.j
 *  java.lang.Object
 *  java.util.ArrayList
 */
package com.jetstartgames.logic;

import android.content.Context;
import android.util.AttributeSet;
import c.c.b.a;
import c.c.b.e;
import c.c.b.i.f;
import c.c.b.i.g;
import c.c.b.i.j;
import java.util.ArrayList;

public class ChessBoardPlay
extends a {
    public ChessBoardPlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public float a(int n9) {
        float f10 = this.t;
        float f11 = this.v;
        if (this.y) {
            n9 = 7 - n9;
        }
        return f10 + f11 * (float)n9;
    }

    public float b(int n9) {
        float f10 = this.u;
        float f11 = this.v;
        if (!this.y) {
            n9 = 7 - n9;
        }
        return f10 + f11 * (float)n9;
    }

    public f c(int n9) {
        block17 : {
            block16 : {
                int n10;
                block15 : {
                    if (n9 < 0) {
                        return null;
                    }
                    this.s = false;
                    if (this.m != -1 && !this.p) {
                        this.setSelection(-1);
                    }
                    this.setHintTo(-1);
                    a.g0 = new ArrayList();
                    if (n9 != -1) {
                        for (f f10 : new g().a(this.a)) {
                            if (f10.a != n9) continue;
                            a.g0.add((Object)f10);
                        }
                    }
                    n10 = this.a.a[n9];
                    int n11 = this.m;
                    boolean bl = true;
                    if (n11 == -1) break block15;
                    if (n9 == n11) {
                        if (this.A) {
                            this.setSelection(-1);
                            a.g0 = new ArrayList();
                        }
                        return null;
                    }
                    if (n10 == 0 || a.c.a.a.f(n10) != this.a.b) {
                        bl = false;
                    }
                    if (!bl) {
                        f f11 = new f(this.m, n9, 0);
                        if (!this.B) {
                            n9 = -1;
                        }
                        this.setSelection(n9);
                        this.p = false;
                        return f11;
                    }
                    break block16;
                }
                boolean bl = false;
                if (n10 != 0) {
                    boolean bl2 = a.c.a.a.f(n10);
                    boolean bl3 = this.a.b;
                    bl = false;
                    if (bl2 == bl3) {
                        bl = true;
                    }
                }
                if (!bl) break block17;
            }
            this.setSelection(n9);
        }
        return null;
    }

    public int getMaxHeightPercentage() {
        return 75;
    }

    public int getMaxWidthPercentage() {
        return 65;
    }

    public void setPgnOptions(e e10) {
    }
}

