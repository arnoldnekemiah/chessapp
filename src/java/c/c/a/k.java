/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 */
package c.c.a;

import a.c.a.a;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.jetstartgames.chess.MainActivity;

public class k
implements DialogInterface.OnClickListener {
    public final /* synthetic */ MainActivity a;

    public k(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public void onClick(DialogInterface dialogInterface, int n10) {
        a.a("Later.xml", String.valueOf((int)1));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((String)"https://play.google.com/store/apps/details?id=com.jetstartgames.chess"));
        this.a.startActivity(intent);
        MainActivity.I0 = false;
    }
}

