/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a.i.r.p;

import a.f.b;
import a.i.r.p.g;
import a.i.r.p.h;
import a.i.r.p.i;

public final class i
implements h {
    public final a.f.g a;
    public final b b;

    public i(a.f.g g5) {
        this.a = g5;
        this.b = new b<g>(this, g5){

            public void a(a.g.a.f.e e6, Object object) {
                g g5 = (g)object;
                java.lang.String string = g5.a;
                if (string == null) {
                    e6.a.bindNull(1);
                } else {
                    e6.a.bindString(1, string);
                }
                java.lang.String string2 = g5.b;
                if (string2 == null) {
                    e6.a.bindNull(2);
                    return;
                }
                e6.a.bindString(2, string2);
            }

            public java.lang.String b() {
                return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
            }
        };
    }
}

