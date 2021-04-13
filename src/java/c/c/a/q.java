/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.widget.HorizontalScrollView
 *  com.jetstartgames.chess.MenuActivity
 *  java.lang.Object
 *  java.lang.Runnable
 */
package c.c.a;

import android.widget.HorizontalScrollView;
import com.jetstartgames.chess.MenuActivity;

public final class q
implements Runnable {
    public final /* synthetic */ HorizontalScrollView a;

    public q(HorizontalScrollView horizontalScrollView) {
        this.a = horizontalScrollView;
    }

    public void run() {
        this.a.setSmoothScrollingEnabled(true);
        this.a.smoothScrollTo(MenuActivity.K, 0);
    }
}

