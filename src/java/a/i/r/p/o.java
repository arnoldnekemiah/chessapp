/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a.i.r.p;

import a.f.b;
import a.f.g;
import a.i.r.p.m;
import a.i.r.p.n;
import a.i.r.p.o;

public final class o
implements n {
    public final g a;
    public final b b;

    public o(g g5) {
        this.a = g5;
        this.b = new b<m>(this, g5){

            public void a(a.g.a.f.e e6, Object object) {
                m m10 = (m)object;
                java.lang.String string = m10.a;
                if (string == null) {
                    e6.a.bindNull(1);
                } else {
                    e6.a.bindString(1, string);
                }
                java.lang.String string2 = m10.b;
                if (string2 == null) {
                    e6.a.bindNull(2);
                    return;
                }
                e6.a.bindString(2, string2);
            }

            public java.lang.String b() {
                return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
            }
        };
    }
}

