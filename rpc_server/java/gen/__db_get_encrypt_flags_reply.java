/*
 * Automatically generated by jrpcgen 0.95.1 on 8/2/05 1:49 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://acplt.org/ks/remotetea.html for details
 */
package com.sleepycat.db.rpcserver;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class __db_get_encrypt_flags_reply implements XdrAble {
    public int status;
    public int flags;

    public __db_get_encrypt_flags_reply() {
    }

    public __db_get_encrypt_flags_reply(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(status);
        xdr.xdrEncodeInt(flags);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        status = xdr.xdrDecodeInt();
        flags = xdr.xdrDecodeInt();
    }

}
// End of __db_get_encrypt_flags_reply.java
