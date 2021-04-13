/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.jetstartgames.chess.SetActivity
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package c.c.a;

import c.a.a.a.l;
import c.a.a.a.p;
import c.a.a.a.r;
import com.jetstartgames.chess.SetActivity;
import java.util.List;
import java.util.Map;

public class v
implements r {
    public final /* synthetic */ SetActivity a;

    public v(SetActivity setActivity) {
        this.a = setActivity;
    }

    @Override
    public void a(l l6, List<p> list) {
        if (l6.a == 0) {
            for (p p10 : list) {
                this.a.j.put((Object)p10.a(), (Object)p10);
            }
        }
    }
}

