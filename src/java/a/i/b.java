/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Executors
 */
package a.i;

import a.i.q;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class b {
    public final Executor a;
    public final Executor b;
    public final q c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public b(a a2) {
        Executor executor = a2.a;
        if (executor == null) {
            executor = this.a();
        }
        this.a = executor;
        Executor executor2 = a2.c;
        if (executor2 == null) {
            executor2 = this.a();
        }
        this.b = executor2;
        q q2 = a2.b;
        if (q2 == null) {
            q2 = q.a();
        }
        this.c = q2;
        this.d = a2.d;
        this.e = a2.e;
        this.f = a2.f;
        this.g = a2.g;
    }

    public final Executor a() {
        return Executors.newFixedThreadPool((int)Math.max((int)2, (int)Math.min((int)(-1 + Runtime.getRuntime().availableProcessors()), (int)4)));
    }

    public static final class a {
        public Executor a;
        public q b;
        public Executor c;
        public int d = 4;
        public int e = 0;
        public int f = Integer.MAX_VALUE;
        public int g = 20;
    }

    public static interface b {
        public b a();
    }

}

