/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServiceReferenceClassGenerator
 * on: Fri May 25 16:20:36 CEST 2012
 */

package fr.midix.services.common;


public class ProviderFcSR<T>
extends org.ow2.frascati.tinfi.oasis.ServiceReferenceImpl<fr.midix.services.common.Provider<T>>
implements fr.midix.services.common.Provider<T> {

  public ProviderFcSR(Class<fr.midix.services.common.Provider<T>> businessInterface,fr.midix.services.common.Provider<T> service)  {
    super(businessInterface,service);
  }

  public fr.midix.services.common.Provider getService()  {
    return this;
  }

  public T get()  {
    T ret = service.get();
    return ret;
  }

}
