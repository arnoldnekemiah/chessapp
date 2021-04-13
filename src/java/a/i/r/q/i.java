/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.c
 *  a.i.r.j
 *  androidx.work.WorkerParameters
 *  androidx.work.WorkerParameters$a
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package a.i.r.q;

import a.i.r.c;
import a.i.r.j;
import androidx.work.WorkerParameters;

public class i
implements Runnable {
    public j a;
    public String b;
    public WorkerParameters.a c;

    public i(j j2, String string, WorkerParameters.a a2) {
        this.a = j2;
        this.b = string;
        this.c = a2;
    }

    public void run() {
        this.a.f.a(this.b, this.c);
    }
}

