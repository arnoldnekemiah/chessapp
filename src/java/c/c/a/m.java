/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  java.lang.Object
 */
package c.c.a;

import android.view.MotionEvent;
import android.view.View;
import c.c.b.i.b;
import c.c.b.i.f;
import com.jetstartgames.chess.MainActivity;
import com.jetstartgames.logic.ChessBoardPlay;

public class m
implements View.OnTouchListener {
    public boolean a = false;
    public boolean b = false;
    public int c = -1;
    public final /* synthetic */ MainActivity d;

    public m(MainActivity mainActivity) {
        this.d = mainActivity;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.d.u != null) {
            int n10 = motionEvent.getActionMasked();
            if (n10 != 0) {
                if (n10 != 1) {
                    return true;
                }
                if (this.a) {
                    int n11;
                    f f10;
                    this.a = false;
                    if (this.b && (n11 = this.d.u.a(motionEvent)) == this.c && MainActivity.E0.b() && (f10 = this.d.u.c(n11)) != null) {
                        MainActivity.E0.b(f10);
                        return true;
                    }
                }
            } else {
                this.a = true;
                this.b = true;
                this.c = this.d.u.a(motionEvent);
                motionEvent.getX();
                motionEvent.getY();
            }
        }
        return true;
    }
}

