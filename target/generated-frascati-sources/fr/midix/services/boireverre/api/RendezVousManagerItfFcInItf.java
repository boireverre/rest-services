/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServerInterfaceClassGenerator
 * on: Fri May 25 16:20:37 CEST 2012
 */

package fr.midix.services.boireverre.api;


public class RendezVousManagerItfFcInItf
extends org.ow2.frascati.tinfi.TinfiComponentInterface<fr.midix.services.boireverre.api.RendezVousManagerItf>
implements fr.midix.services.boireverre.api.RendezVousManagerItf {

  public RendezVousManagerItfFcInItf()  {
  }

  public RendezVousManagerItfFcInItf(org.objectweb.fractal.api.Component component,String s,org.objectweb.fractal.api.Type type,boolean flag,Object obj)  {
    super(component,s,type,flag,obj);
  }

  public void createRDV(final long arg0,final long arg1,final int arg2,final int arg3,final int arg4,final java.lang.String arg5)  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    impl.createRDV(arg0,arg1,arg2,arg3,arg4,arg5);
  }

  public void init()  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    impl.init();
  }

}
