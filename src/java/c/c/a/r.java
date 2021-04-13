/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.jetstartgames.chess.MenuActivity
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package c.c.a;

import c.a.a.a.l;
import c.a.a.a.p;
import com.jetstartgames.chess.MenuActivity;
import java.util.List;
import java.util.Map;

public class r
implements c.a.a.a.r {
    public final /* synthetic */ MenuActivity a;

    public r(MenuActivity menuActivity) {
        this.a = menuActivity;
    }

    @Override
    public void a(l l6, List<p> list) {
        if (l6.a == 0) {
            for (p p10 : list) {
                this.a.i.put((Object)p10.a(), (Object)p10);
            }
        }
    }
}

