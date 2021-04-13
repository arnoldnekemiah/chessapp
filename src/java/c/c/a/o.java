/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  java.lang.Object
 */
package c.c.a;

import android.content.DialogInterface;
import com.jetstartgames.chess.MainActivity;

public class o
implements DialogInterface.OnCancelListener {
    public o(MainActivity mainActivity) {
    }

    public void onCancel(DialogInterface dialogInterface) {
        MainActivity.I0 = false;
    }
}

