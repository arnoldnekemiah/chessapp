/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 *  android.widget.RelativeLayout
 *  com.google.android.gms.ads.AdView
 */
package c.c.a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import c.c.a.b;
import com.google.android.gms.ads.AdView;
import com.jetstartgames.chess.MainActivity;

public class t
extends Dialog {
    public Context a;
    public boolean b;
    public int c = Build.VERSION.SDK_INT;

    public t(Context context) {
        super(context);
        this.a = context;
        this.b = false;
    }

    public t(Context context, int n10) {
        super(context, n10);
        this.a = context;
        this.b = true;
    }

    public void onWindowFocusChanged(boolean bl) {
        RelativeLayout relativeLayout;
        super.onWindowFocusChanged(bl);
        if (this.c >= 19 && bl) {
            this.getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        if (!this.b && bl && (relativeLayout = (RelativeLayout)this.findViewById(2131165296)) != null) {
            int n10 = relativeLayout.getHeight();
            int n11 = MainActivity.f0;
            if (MainActivity.d0) {
                n11 = MainActivity.e0;
            }
            int n12 = b.b(this.a, n10);
            int n13 = b.b(this.a, n11) - n12;
            if (MainActivity.n0 != null && !MainActivity.S) {
                AdView adView;
                int n14;
                int n15 = n13 / 2;
                int n16 = MainActivity.d0 ? 50 : 70;
                if (n15 > n16) {
                    adView = MainActivity.n0;
                    n14 = 0;
                } else {
                    adView = MainActivity.n0;
                    n14 = 8;
                }
                adView.setVisibility(n14);
            }
        }
    }

    public void show() {
        if (this.c >= 19) {
            this.getWindow().setFlags(8, 8);
        }
        super.show();
        if (this.c >= 19) {
            this.getWindow().getDecorView().setSystemUiVisibility(5894);
            this.getWindow().clearFlags(8);
        }
    }
}

