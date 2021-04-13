/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.text.TextUtils
 *  com.android.billingclient.api.BillingClientImpl
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.Callable
 *  org.json.JSONException
 */
package c.a.a.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import c.a.a.a.l;
import c.a.a.a.m;
import c.a.a.a.n;
import c.a.c.a.a;
import com.android.billingclient.api.BillingClientImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONException;

public class h
implements Callable<n.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ BillingClientImpl b;

    public h(BillingClientImpl billingClientImpl, String string) {
        this.b = billingClientImpl;
        this.a = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object call() {
        BillingClientImpl billingClientImpl = this.b;
        String string = this.a;
        if (billingClientImpl == null) {
            throw null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Querying owned items, item type: ");
        stringBuilder.append(string);
        c.a.a.b.a.b("BillingClient", stringBuilder.toString());
        ArrayList arrayList = new ArrayList();
        boolean bl = billingClientImpl.n;
        boolean bl2 = billingClientImpl.p;
        String string2 = billingClientImpl.b;
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", string2);
        int n2 = 1;
        if (bl && bl2) {
            bundle.putBoolean("enablePendingPurchases", (boolean)n2);
        }
        String string3 = null;
        do {
            l l2;
            Bundle bundle2;
            int n3;
            block14 : {
                String string4;
                block12 : {
                    block15 : {
                        block18 : {
                            ArrayList arrayList2;
                            block17 : {
                                ArrayList arrayList3;
                                block16 : {
                                    block13 : {
                                        block11 : {
                                            try {
                                                bundle2 = billingClientImpl.n ? billingClientImpl.h.a(9, billingClientImpl.e.getPackageName(), string, string3, bundle) : billingClientImpl.h.a(3, billingClientImpl.e.getPackageName(), string, string3);
                                                l2 = m.i;
                                                n3 = 0;
                                                if (bundle2 != null) break block11;
                                            }
                                            catch (Exception exception) {
                                                StringBuilder stringBuilder5 = new StringBuilder();
                                                stringBuilder5.append("Got exception trying to get purchases: ");
                                                stringBuilder5.append((Object)exception);
                                                stringBuilder5.append("; try to reconnect");
                                                c.a.a.b.a.c("BillingClient", stringBuilder5.toString());
                                                return new n.a(m.m, null);
                                            }
                                            Object[] arrobject = new Object[n2];
                                            arrobject[0] = "getPurchase()";
                                            string4 = String.format((String)"%s got null owned items list", (Object[])arrobject);
                                            break block12;
                                        }
                                        int n5 = c.a.a.b.a.b(bundle2, "BillingClient");
                                        String string5 = c.a.a.b.a.a(bundle2, "BillingClient");
                                        l.b b2 = l.a();
                                        b2.a = n5;
                                        b2.b = string5;
                                        l l3 = b2.a();
                                        if (n5 == 0) break block13;
                                        Object[] arrobject = new Object[]{"getPurchase()", n5};
                                        c.a.a.b.a.c("BillingClient", String.format((String)"%s failed. Response code: %s", (Object[])arrobject));
                                        l2 = l3;
                                        break block14;
                                    }
                                    if (!bundle2.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle2.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle2.containsKey("INAPP_DATA_SIGNATURE_LIST")) break block15;
                                    ArrayList arrayList4 = bundle2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                    arrayList3 = bundle2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                    arrayList2 = bundle2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                    if (arrayList4 != null) break block16;
                                    string4 = String.format((String)"Bundle returned from %s contains null SKUs list.", (Object[])new Object[]{"getPurchase()"});
                                    break block12;
                                }
                                if (arrayList3 != null) break block17;
                                string4 = String.format((String)"Bundle returned from %s contains null purchases list.", (Object[])new Object[]{"getPurchase()"});
                                break block12;
                            }
                            if (arrayList2 != null) break block18;
                            string4 = String.format((String)"Bundle returned from %s contains null signatures list.", (Object[])new Object[]{"getPurchase()"});
                            break block12;
                        }
                        l2 = m.l;
                        break block14;
                    }
                    string4 = String.format((String)"Bundle returned from %s doesn't contain required fields.", (Object[])new Object[]{"getPurchase()"});
                }
                c.a.a.b.a.c("BillingClient", string4);
            }
            if (l2 != m.l) {
                return new n.a(l2, null);
            }
            ArrayList arrayList5 = bundle2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList arrayList6 = bundle2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList arrayList7 = bundle2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            while (n3 < arrayList6.size()) {
                n n7;
                String string6 = (String)arrayList6.get(n3);
                String string7 = (String)arrayList7.get(n3);
                String string8 = (String)arrayList5.get(n3);
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Sku is owned: ");
                stringBuilder2.append(string8);
                c.a.a.b.a.b("BillingClient", stringBuilder2.toString());
                try {
                    n7 = new n(string6, string7);
                }
                catch (JSONException jSONException) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Got an exception trying to decode the purchase: ");
                    stringBuilder3.append((Object)jSONException);
                    c.a.a.b.a.c("BillingClient", stringBuilder3.toString());
                    return new n.a(m.i, null);
                }
                if (TextUtils.isEmpty((CharSequence)n7.a())) {
                    c.a.a.b.a.c("BillingClient", "BUG: empty/null token!");
                }
                arrayList.add((Object)n7);
                ++n3;
            }
            string3 = bundle2.getString("INAPP_CONTINUATION_TOKEN");
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("Continuation token: ");
            stringBuilder4.append(string3);
            c.a.a.b.a.b("BillingClient", stringBuilder4.toString());
            if (TextUtils.isEmpty((CharSequence)string3)) {
                return new n.a(m.l, (List<n>)arrayList);
            }
            n2 = 1;
        } while (true);
    }
}

