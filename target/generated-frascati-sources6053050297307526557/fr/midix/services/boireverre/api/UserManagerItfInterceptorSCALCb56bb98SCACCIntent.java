/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.InterceptorClassGenerator
 * on: Fri Jun 08 00:13:40 CEST 2012
 */

package fr.midix.services.boireverre.api;


public class UserManagerItfInterceptorSCALCb56bb98SCACCIntent
extends org.ow2.frascati.tinfi.TinfiComponentInterceptor<fr.midix.services.boireverre.api.UserManagerItf>
implements fr.midix.services.boireverre.api.UserManagerItf,org.objectweb.fractal.julia.Interceptor {

  private juliac.generated.SCALifeCycleControllerImpl _lc;
  private static java.lang.reflect.Method[] METHODS;
  public UserManagerItfInterceptorSCALCb56bb98SCACCIntent()  {
  }

  private UserManagerItfInterceptorSCALCb56bb98SCACCIntent(Object obj)  {
    setFcItfDelegate(obj);
  }

  public void initFcController(org.objectweb.fractal.julia.InitializationContext ic) throws org.objectweb.fractal.api.factory.InstantiationException  {
    super.initFcController(ic);
    Object olc = ic.getInterface("lifecycle-controller");
    if ( !( olc instanceof juliac.generated.SCALifeCycleControllerImpl ) )
    {
      while ( olc instanceof org.objectweb.fractal.julia.Interceptor )
      {
        olc = ((org.objectweb.fractal.julia.Interceptor)olc).getFcItfDelegate();
      }

    }
    _lc = (juliac.generated.SCALifeCycleControllerImpl) olc;
    initIntentHandlersMap(METHODS);
  }

  public Object clone()  {
    UserManagerItfInterceptorSCALCb56bb98SCACCIntent clone = new UserManagerItfInterceptorSCALCb56bb98SCACCIntent(getFcItfDelegate());
    initFcClone(clone);
    clone._lc = _lc;
    clone.initIntentHandlersMap(METHODS);
    return clone;
  }

  public long createUser(final java.lang.String arg0,final java.lang.String arg1,final java.lang.String arg2,final java.lang.String arg3)  {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.incrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter++;
      }

    }

      try {
    fr.midix.services.boireverre.api.UserManagerItf impl = pushFcAndGet("user",fr.midix.services.boireverre.api.UserManagerItf.class,this);
    try {
    java.util.List<org.ow2.frascati.tinfi.api.IntentHandler> handlers = intentHandlersMap.get(METHODS[1]);
    try {
      if( handlers.size() == 0 ) {
        long ret = impl.createUser(arg0,arg1,arg2,arg3);
        return ret;
      }
      else {
        org.objectweb.fractal.api.Component comp = getFcComponent();
        org.objectweb.fractal.api.Interface itf = getFcItf();
        org.ow2.frascati.tinfi.IntentJoinPointImpl<fr.midix.services.boireverre.api.UserManagerItf> ijp = new org.ow2.frascati.tinfi.IntentJoinPointImpl();
        ijp.init(handlers,comp,itf,impl,METHODS[1],(Object)arg0,(Object)arg1,(Object)arg2,(Object)arg3);
    Object proceed = ijp.proceed();
    long ret = (proceed==null) ? 0 : (java.lang.Long)proceed;
    return ret;
      }
    }
    catch( Throwable t ) {
      if( t instanceof RuntimeException ) {
        throw (RuntimeException) t;
      }
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(t);
    }
    }
    finally {
      releaseFcAndPop(impl,false);
    }
      }
      finally {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.decrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter--;
      }

    }

      }
  }

  public java.lang.String getUserProfile(final java.lang.String arg0)  {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.incrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter++;
      }

    }

      try {
    fr.midix.services.boireverre.api.UserManagerItf impl = pushFcAndGet("user",fr.midix.services.boireverre.api.UserManagerItf.class,this);
    try {
    java.util.List<org.ow2.frascati.tinfi.api.IntentHandler> handlers = intentHandlersMap.get(METHODS[3]);
    try {
      if( handlers.size() == 0 ) {
        java.lang.String ret = impl.getUserProfile(arg0);
        return ret;
      }
      else {
        org.objectweb.fractal.api.Component comp = getFcComponent();
        org.objectweb.fractal.api.Interface itf = getFcItf();
        org.ow2.frascati.tinfi.IntentJoinPointImpl<fr.midix.services.boireverre.api.UserManagerItf> ijp = new org.ow2.frascati.tinfi.IntentJoinPointImpl();
        ijp.init(handlers,comp,itf,impl,METHODS[3],(Object)arg0);
    java.lang.String ret = (java.lang.String) ijp.proceed();
    return ret;
      }
    }
    catch( Throwable t ) {
      if( t instanceof RuntimeException ) {
        throw (RuntimeException) t;
      }
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(t);
    }
    }
    finally {
      releaseFcAndPop(impl,false);
    }
      }
      finally {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.decrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter--;
      }

    }

      }
  }

  public long connect(final java.lang.String arg0,final java.lang.String arg1)  {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.incrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter++;
      }

    }

      try {
    fr.midix.services.boireverre.api.UserManagerItf impl = pushFcAndGet("user",fr.midix.services.boireverre.api.UserManagerItf.class,this);
    try {
    java.util.List<org.ow2.frascati.tinfi.api.IntentHandler> handlers = intentHandlersMap.get(METHODS[0]);
    try {
      if( handlers.size() == 0 ) {
        long ret = impl.connect(arg0,arg1);
        return ret;
      }
      else {
        org.objectweb.fractal.api.Component comp = getFcComponent();
        org.objectweb.fractal.api.Interface itf = getFcItf();
        org.ow2.frascati.tinfi.IntentJoinPointImpl<fr.midix.services.boireverre.api.UserManagerItf> ijp = new org.ow2.frascati.tinfi.IntentJoinPointImpl();
        ijp.init(handlers,comp,itf,impl,METHODS[0],(Object)arg0,(Object)arg1);
    Object proceed = ijp.proceed();
    long ret = (proceed==null) ? 0 : (java.lang.Long)proceed;
    return ret;
      }
    }
    catch( Throwable t ) {
      if( t instanceof RuntimeException ) {
        throw (RuntimeException) t;
      }
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(t);
    }
    }
    finally {
      releaseFcAndPop(impl,false);
    }
      }
      finally {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.decrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter--;
      }

    }

      }
  }

  public boolean checkLoginExists(final java.lang.String arg0)  {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.incrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter++;
      }

    }

      try {
    fr.midix.services.boireverre.api.UserManagerItf impl = pushFcAndGet("user",fr.midix.services.boireverre.api.UserManagerItf.class,this);
    try {
    java.util.List<org.ow2.frascati.tinfi.api.IntentHandler> handlers = intentHandlersMap.get(METHODS[2]);
    try {
      if( handlers.size() == 0 ) {
        boolean ret = impl.checkLoginExists(arg0);
        return ret;
      }
      else {
        org.objectweb.fractal.api.Component comp = getFcComponent();
        org.objectweb.fractal.api.Interface itf = getFcItf();
        org.ow2.frascati.tinfi.IntentJoinPointImpl<fr.midix.services.boireverre.api.UserManagerItf> ijp = new org.ow2.frascati.tinfi.IntentJoinPointImpl();
        ijp.init(handlers,comp,itf,impl,METHODS[2],(Object)arg0);
    Object proceed = ijp.proceed();
    boolean ret = (proceed==null) ? false : (java.lang.Boolean)proceed;
    return ret;
      }
    }
    catch( Throwable t ) {
      if( t instanceof RuntimeException ) {
        throw (RuntimeException) t;
      }
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(t);
    }
    }
    finally {
      releaseFcAndPop(impl,false);
    }
      }
      finally {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.decrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter--;
      }

    }

      }
  }

  public void modifyUserProfile(final java.lang.String arg0,final java.lang.String arg1,final java.lang.String arg2)  {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.incrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter++;
      }

    }

      try {
    fr.midix.services.boireverre.api.UserManagerItf impl = pushFcAndGet("user",fr.midix.services.boireverre.api.UserManagerItf.class,this);
    try {
    java.util.List<org.ow2.frascati.tinfi.api.IntentHandler> handlers = intentHandlersMap.get(METHODS[4]);
    try {
      if( handlers.size() == 0 ) {
        impl.modifyUserProfile(arg0,arg1,arg2);
      }
      else {
        org.objectweb.fractal.api.Component comp = getFcComponent();
        org.objectweb.fractal.api.Interface itf = getFcItf();
        org.ow2.frascati.tinfi.IntentJoinPointImpl<fr.midix.services.boireverre.api.UserManagerItf> ijp = new org.ow2.frascati.tinfi.IntentJoinPointImpl();
        ijp.init(handlers,comp,itf,impl,METHODS[4],(Object)arg0,(Object)arg1,(Object)arg2);
    ijp.proceed();
    Object ret = null;
      }
    }
    catch( Throwable t ) {
      if( t instanceof RuntimeException ) {
        throw (RuntimeException) t;
      }
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(t);
    }
    }
    finally {
      releaseFcAndPop(impl,false);
    }
      }
      finally {
    synchronized(_lc)
    {
      if ( _lc.fcState != 2 )
      {
        _lc.decrementFcInvocationCounter();
      }
      else
      {
        _lc.fcInvocationCounter--;
      }

    }

      }
  }

  static  {
    try {
      METHODS = new java.lang.reflect.Method[]{
        fr.midix.services.boireverre.api.UserManagerItf.class.getMethod("connect",java.lang.String.class,java.lang.String.class),
        fr.midix.services.boireverre.api.UserManagerItf.class.getMethod("createUser",java.lang.String.class,java.lang.String.class,java.lang.String.class,java.lang.String.class),
        fr.midix.services.boireverre.api.UserManagerItf.class.getMethod("checkLoginExists",java.lang.String.class),
        fr.midix.services.boireverre.api.UserManagerItf.class.getMethod("getUserProfile",java.lang.String.class),
        fr.midix.services.boireverre.api.UserManagerItf.class.getMethod("modifyUserProfile",java.lang.String.class,java.lang.String.class,java.lang.String.class),
      };
    }
    catch( NoSuchMethodException e ) {
      throw new org.ow2.frascati.tinfi.TinfiRuntimeException(e);
    }
  }

}
