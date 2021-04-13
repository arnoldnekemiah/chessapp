/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteStatement
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package a.f;

import a.f.g;
import a.f.j;
import a.g.a.f.e;
import android.database.sqlite.SQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b<T>
extends j {
    public b(g g5) {
        super(g5);
    }

    public abstract void a(e var1, T var2);

    public final void a(T t4) {
        block2 : {
            e e6 = this.a();
            try {
                this.a(e6, t4);
                e6.b.executeInsert();
                if (e6 != this.c) break block2;
            }
            catch (Throwable throwable) {
                ((j)this).a(e6);
                throw throwable;
            }
            this.a.set(false);
        }
    }
}

