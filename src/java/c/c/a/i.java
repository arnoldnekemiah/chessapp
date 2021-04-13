/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  java.lang.Object
 *  java.lang.String
 */
package c.c.a;

import a.c.a.a;
import android.content.DialogInterface;
import com.jetstartgames.chess.MainActivity;

public class i
implements DialogInterface.OnClickListener {
    public final /* synthetic */ MainActivity a;

    public i(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public void onClick(DialogInterface dialogInterface, int n10) {
        dialogInterface.cancel();
        a.a("Later.xml", String.valueOf((int)0));
        MainActivity.I0 = false;
        this.a.onPause();
        this.a.onResume();
    }
}

