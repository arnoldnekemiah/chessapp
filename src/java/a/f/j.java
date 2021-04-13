/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.g.a.f.e
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package a.f;

import a.f.g;
import a.g.a.f.e;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class j {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final g b;
    public volatile e c;

    public j(g g2) {
        this.b = g2;
    }

    public e a() {
        this.b.a();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                String string = this.b();
                this.c = this.b.a(string);
            }
            return this.c;
        }
        String string = this.b();
        return this.b.a(string);
    }

    public void a(e e2) {
        if (e2 == this.c) {
            this.a.set(false);
        }
    }

    public abstract String b();
}

