/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 */
package c.c.a;

import android.content.Context;
import android.view.View;
import c.c.a.a;
import com.jetstartgames.chess.MainActivity;

public class l
implements View.OnClickListener {
    public l(MainActivity mainActivity) {
    }

    public void onClick(View view) {
        if (MainActivity.C0 != null && !MainActivity.I0) {
            a.a((Context)MainActivity.C0);
        }
    }
}

