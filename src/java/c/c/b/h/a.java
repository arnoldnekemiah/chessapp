/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package c.c.b.h;

import c.c.b.h.c;
import c.c.b.h.d;
import c.c.b.h.g.b;

public class a
implements Runnable {
    public final /* synthetic */ d a;
    public final /* synthetic */ c.c.b.h.b b;

    public a(c.c.b.h.b b10, d d10) {
        this.b = b10;
        this.a = d10;
    }

    public void run() {
        c.c.b.h.b b10 = this.b;
        d d10 = this.a;
        do {
            String string;
            int n10 = b10.c();
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            b b11 = (b)d10;
            Thread thread = b11.i;
            if (thread != null && !thread.isAlive()) {
                string = null;
            } else {
                String string2 = b11.h.a(n10);
                if (string2 == null) {
                    string = null;
                } else {
                    string2.length();
                    string = string2;
                }
            }
            if (string == null) break;
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            b10.a(d10, string);
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            b10.g();
        } while (!Thread.currentThread().isInterrupted());
    }
}

