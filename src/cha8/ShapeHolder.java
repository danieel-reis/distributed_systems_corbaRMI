package cha8;

/**
* cha8/ShapeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cha8/Shape.idl
* Terça-feira, 25 de Outubro de 2016 20h04min39s BRST
*/

public final class ShapeHolder implements org.omg.CORBA.portable.Streamable
{
  public cha8.Shape value = null;

  public ShapeHolder ()
  {
  }

  public ShapeHolder (cha8.Shape initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = cha8.ShapeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    cha8.ShapeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return cha8.ShapeHelper.type ();
  }

}