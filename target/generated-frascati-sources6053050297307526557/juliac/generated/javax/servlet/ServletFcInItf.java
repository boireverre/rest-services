/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.ServerInterfaceClassGenerator
 * on: Fri Jun 08 00:13:40 CEST 2012
 */

package juliac.generated.javax.servlet;


public class ServletFcInItf
extends org.ow2.frascati.tinfi.TinfiComponentInterface<javax.servlet.Servlet>
implements javax.servlet.Servlet {

  public ServletFcInItf()  {
  }

  public ServletFcInItf(org.objectweb.fractal.api.Component component,String s,org.objectweb.fractal.api.Type type,boolean flag,Object obj)  {
    super(component,s,type,flag,obj);
  }

  public void destroy()  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    impl.destroy();
  }

  public java.lang.String getServletInfo()  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    java.lang.String ret = impl.getServletInfo();
    return ret;
  }

  public void init(final javax.servlet.ServletConfig arg0) throws javax.servlet.ServletException  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    impl.init(arg0);
  }

  public void service(final javax.servlet.ServletRequest arg0,final javax.servlet.ServletResponse arg1) throws javax.servlet.ServletException,java.io.IOException  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    impl.service(arg0,arg1);
  }

  public javax.servlet.ServletConfig getServletConfig()  {
    if ( impl == null )
    {
      throw new java.lang.NullPointerException("Trying to invoke a method on a client or server interface whose complementary interface is not bound.");
    }
    javax.servlet.ServletConfig ret = impl.getServletConfig();
    return ret;
  }

}
