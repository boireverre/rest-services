/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServiceReferenceClassGenerator
 * on: Fri Jun 08 00:13:40 CEST 2012
 */

package fr.midix.services.boireverre.api;


public class UserManagerItfFcSR
extends org.ow2.frascati.tinfi.oasis.ServiceReferenceImpl<fr.midix.services.boireverre.api.UserManagerItf>
implements fr.midix.services.boireverre.api.UserManagerItf {

  public UserManagerItfFcSR(Class<fr.midix.services.boireverre.api.UserManagerItf> businessInterface,fr.midix.services.boireverre.api.UserManagerItf service)  {
    super(businessInterface,service);
  }

  public fr.midix.services.boireverre.api.UserManagerItf getService()  {
    return this;
  }

  public boolean checkLoginExists(final java.lang.String arg0)  {
    boolean ret = service.checkLoginExists(arg0);
    return ret;
  }

  public long createUser(final java.lang.String arg0,final java.lang.String arg1,final java.lang.String arg2,final java.lang.String arg3)  {
    long ret = service.createUser(arg0,arg1,arg2,arg3);
    return ret;
  }

  public void modifyUserProfile(final java.lang.String arg0,final java.lang.String arg1,final java.lang.String arg2)  {
    service.modifyUserProfile(arg0,arg1,arg2);
  }

  public long connect(final java.lang.String arg0,final java.lang.String arg1)  {
    long ret = service.connect(arg0,arg1);
    return ret;
  }

  public java.lang.String getUserProfile(final java.lang.String arg0)  {
    java.lang.String ret = service.getUserProfile(arg0);
    return ret;
  }

}
