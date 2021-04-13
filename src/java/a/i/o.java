/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.b
 *  a.i.r.f
 *  a.i.r.j
 *  a.i.r.q.m.b
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package a.i;

import a.i.h;
import a.i.k;
import a.i.p;
import a.i.r.f;
import a.i.r.j;
import a.i.r.q.d;
import a.i.r.q.m.a;
import a.i.r.q.m.b;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class o {
    public final k a(p p2) {
        List list = Collections.singletonList((Object)p2);
        j j2 = (j)this;
        if (!list.isEmpty()) {
            f f2 = new f(j2, list);
            if (!f2.h) {
                d d2 = new d(f2);
                ((b)f2.a.d).a.execute((Runnable)d2);
                f2.i = d2.b;
            } else {
                h h2 = h.a();
                String string = f.j;
                Object[] arrobject = new Object[]{TextUtils.join((CharSequence)", ", (Iterable)f2.e)};
                h2.d(string, String.format((String)"Already enqueued work ids (%s)", (Object[])arrobject), new Throwable[0]);
            }
            return f2.i;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }
}

