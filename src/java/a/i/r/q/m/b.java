/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Object
 *  java.util.concurrent.Executor
 */
package a.i.r.q.m;

import a.i.r.q.h;
import a.i.r.q.m.b;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class b
implements a.i.r.q.m.a {
    public final Executor a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final Executor c = new Executor(this){
        public final /* synthetic */ b a;
        {
            this.a = b2;
        }

        public void execute(java.lang.Runnable runnable) {
            this.a.b.post(runnable);
        }
    };

    public b(Executor executor) {
        this.a = new h(executor);
    }
}

