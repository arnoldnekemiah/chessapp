/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.work.ListenableWorker
 *  androidx.work.OverwritingInputMerger
 *  java.lang.Class
 *  java.lang.String
 *  java.util.Set
 *  java.util.UUID
 */
package a.i;

import a.i.p;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import java.util.Set;
import java.util.UUID;

public final class j
extends p {
    public j(a a5) {
        super(a5.b, a5.c, a5.d);
    }

    public static final class a
    extends p.a<a, j> {
        public a(Class<? extends ListenableWorker> class_) {
            super(class_);
            this.c.d = OverwritingInputMerger.class.getName();
        }
    }

}

