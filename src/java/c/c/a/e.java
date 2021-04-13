/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 */
package c.c.a;

import android.view.View;
import c.c.a.t;
import c.c.b.i.b;
import com.jetstartgames.chess.MainActivity;

public class e
implements View.OnClickListener {
    public final /* synthetic */ t a;

    public e(MainActivity mainActivity, t t9) {
        this.a = t9;
    }

    public void onClick(View view) {
        MainActivity.E0.a(0);
        this.a.dismiss();
        MainActivity.I0 = false;
    }
}

