/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServiceReferenceClassGenerator
 * on: Fri Jun 08 00:13:40 CEST 2012
 */

package juliac.generated.javax.servlet;


public class ServletFcSR
extends org.ow2.frascati.tinfi.oasis.ServiceReferenceImpl<javax.servlet.Servlet>
implements javax.servlet.Servlet {

  public ServletFcSR(Class<javax.servlet.Servlet> businessInterface,javax.servlet.Servlet service)  {
    super(businessInterface,service);
  }

  public javax.servlet.Servlet getService()  {
    return this;
  }

  public void destroy()  {
    service.destroy();
  }

  public java.lang.String getServletInfo()  {
    java.lang.String ret = service.getServletInfo();
    return ret;
  }

  public void service(final javax.servlet.ServletRequest arg0,final javax.servlet.ServletResponse arg1) throws javax.servlet.ServletException,java.io.IOException  {
    service.service(arg0,arg1);
  }

  public javax.servlet.ServletConfig getServletConfig()  {
    javax.servlet.ServletConfig ret = service.getServletConfig();
    return ret;
  }

  public void init(final javax.servlet.ServletConfig arg0) throws javax.servlet.ServletException  {
    service.init(arg0);
  }

}
