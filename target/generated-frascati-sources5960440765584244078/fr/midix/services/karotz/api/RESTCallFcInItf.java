/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServerInterfaceClassGenerator
 * on: Wed May 23 23:43:43 CEST 2012
 */

package fr.midix.services.karotz.api;


public class RESTCallFcInItf
extends org.ow2.frascati.tinfi.TinfiComponentInterface<fr.midix.services.karotz.api.RESTCall>
implements fr.midix.services.karotz.api.RESTCall {

  public RESTCallFcInItf()  {
  }

  public RESTCallFcInItf(org.objectweb.fractal.api.Component component,String s,org.objectweb.fractal.api.Type type,boolean flag,Object obj)  {
    super(component,s,type,flag,obj);
  }

  public void sendMail(final java.lang.String arg0)  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    impl.sendMail(arg0);
  }

}
