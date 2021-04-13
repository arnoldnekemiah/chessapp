/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  c.c.b.a
 *  c.c.b.a$b
 *  c.c.b.i.b
 *  c.c.b.i.f
 *  c.c.b.i.j
 *  java.lang.Math
 */
package c.c.a;

import android.view.MotionEvent;
import c.c.b.a;
import c.c.b.i.b;
import c.c.b.i.f;
import c.c.b.i.j;
import com.jetstartgames.chess.MainActivity;
import com.jetstartgames.logic.ChessBoardPlay;

public class n
extends a.b {
    public final /* synthetic */ MainActivity a;

    public n(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public void a(MotionEvent motionEvent) {
        if (MainActivity.E0.b()) {
            ChessBoardPlay chessBoardPlay = this.a.u;
            if (chessBoardPlay != null) {
                f f10;
                if (motionEvent.getAction() != 0) {
                    float f11;
                    float f12;
                    float f13;
                    int n9;
                    float f14;
                    chessBoardPlay.s = n9 = 1;
                    if (chessBoardPlay.y) {
                        n9 = -1;
                    }
                    float f15 = chessBoardPlay.q;
                    float f16 = n9;
                    chessBoardPlay.q = f15 + f16 * motionEvent.getX();
                    chessBoardPlay.r -= f16 * motionEvent.getY();
                    if (chessBoardPlay.q < 0.0f) {
                        chessBoardPlay.q = 0.0f;
                    }
                    if ((f13 = chessBoardPlay.q) > (f12 = (float)7)) {
                        chessBoardPlay.q = f12;
                    }
                    if ((f14 = chessBoardPlay.r) < (f11 = (float)false)) {
                        chessBoardPlay.r = f11;
                    }
                    if (chessBoardPlay.r > 7.0f) {
                        chessBoardPlay.r = 7.0f;
                    }
                    chessBoardPlay.invalidate();
                    f10 = null;
                } else {
                    chessBoardPlay.invalidate();
                    boolean bl = chessBoardPlay.s;
                    f10 = null;
                    if (bl) {
                        int n10 = Math.round((float)chessBoardPlay.q);
                        int n11 = Math.round((float)chessBoardPlay.r);
                        chessBoardPlay.q = n10;
                        chessBoardPlay.r = n11;
                        f10 = chessBoardPlay.c(j.b((int)n10, (int)n11));
                    }
                }
                if (f10 != null) {
                    MainActivity.E0.b(f10);
                    return;
                }
            } else {
                throw null;
            }
        }
    }
}

