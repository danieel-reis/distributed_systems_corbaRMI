package cha8.ShapeListPackage;

/**
* cha8/ShapeListPackage/FullExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cha8/Shape.idl
* Terça-feira, 25 de Outubro de 2016 20h04min39s BRST
*/

public final class FullExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public cha8.ShapeListPackage.FullException value = null;

  public FullExceptionHolder ()
  {
  }

  public FullExceptionHolder (cha8.ShapeListPackage.FullException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = cha8.ShapeListPackage.FullExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    cha8.ShapeListPackage.FullExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return cha8.ShapeListPackage.FullExceptionHelper.type ();
  }

}
