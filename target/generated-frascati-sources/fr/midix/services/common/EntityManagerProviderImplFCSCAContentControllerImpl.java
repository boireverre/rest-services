/*
 * Generated by: org.ow2.frascati.tinfi.opt.oo.SCAContentControllerClassGenerator
 * on: Fri May 25 16:20:37 CEST 2012
 */

package fr.midix.services.common;


public class EntityManagerProviderImplFCSCAContentControllerImpl
extends juliac.generated.SCAContentControllerImpl {

  public void setPropertyValue(String name,Object value)  {
    Object[] contents = sm.getFcCurrentContents();
    for ( Object content : contents )
    {
      if ( name.equals("persistenceUnitName") )
      {
        ((fr.midix.services.common.EntityManagerProviderImpl)content). persistenceUnitName = (java.lang.String)value;
      }
    }

  }

}
