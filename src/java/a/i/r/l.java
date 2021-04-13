/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  a.i.r.q.l.c
 *  android.annotation.SuppressLint
 *  androidx.work.ListenableWorker
 *  androidx.work.ListenableWorker$a
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.ExecutionException
 */
package a.i.r;

import a.i.h;
import a.i.r.m;
import a.i.r.p.j;
import a.i.r.q.l.c;
import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public class l
implements Runnable {
    public final /* synthetic */ c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ m c;

    public l(m m2, c c2, String string) {
        this.c = m2;
        this.a = c2;
        this.b = string;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"SyntheticAccessor"})
    public void run() {
        Throwable throwable22222;
        block9 : {
            block8 : {
                void var6_11;
                try {
                    ListenableWorker.a a2 = (ListenableWorker.a)this.a.get();
                    if (a2 == null) {
                        h h2 = h.a();
                        String string = m.s;
                        Object[] arrobject = new Object[]{this.c.e.c};
                        h2.b(string, String.format((String)"%s returned a null result. Treating it as a failure.", (Object[])arrobject), new Throwable[0]);
                    } else {
                        h h4 = h.a();
                        String string = m.s;
                        Object[] arrobject = new Object[]{this.c.e.c, a2};
                        h4.a(string, String.format((String)"%s returned a %s result.", (Object[])arrobject), new Throwable[0]);
                        this.c.g = a2;
                    }
                    break block8;
                }
                catch (Throwable throwable22222) {
                    break block9;
                }
                catch (ExecutionException executionException) {
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                h h5 = h.a();
                String string = m.s;
                Object[] arrobject = new Object[]{this.b};
                h5.b(string, String.format((String)"%s failed because it threw an exception/error", (Object[])arrobject), new Throwable[]{var6_11});
                break block8;
                catch (CancellationException cancellationException) {
                    h h6 = h.a();
                    String string2 = m.s;
                    Object[] arrobject2 = new Object[]{this.b};
                    h6.c(string2, String.format((String)"%s was cancelled", (Object[])arrobject2), cancellationException);
                }
            }
            this.c.a();
            return;
        }
        this.c.a();
        throw throwable22222;
    }
}

