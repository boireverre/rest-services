/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ClientInterfaceClassGenerator
 * on: Fri May 25 16:20:36 CEST 2012
 */

package fr.midix.services.common;


public class ProviderFcOutItf<T>
extends fr.midix.services.common.ProviderFcInItf<T>
implements fr.midix.services.common.Provider<T>,org.ow2.frascati.tinfi.TinfiComponentOutInterface<fr.midix.services.common.Provider> {

  public ProviderFcOutItf()  {
  }

  public ProviderFcOutItf(org.objectweb.fractal.api.Component component,String s,org.objectweb.fractal.api.Type type,boolean flag,Object obj)  {
    super(component,s,type,flag,obj);
  }

  public org.oasisopen.sca.ServiceReference<fr.midix.services.common.Provider> getServiceReference()  {
    return new fr.midix.services.common.ProviderFcSR(fr.midix.services.common.Provider.class,this);
  }

}
