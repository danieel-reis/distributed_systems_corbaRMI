package cha8;


/**
* cha8/Rectangle.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from cha8/Shape.idl
* Terça-feira, 25 de Outubro de 2016 20h04min39s BRST
*/

public final class Rectangle implements org.omg.CORBA.portable.IDLEntity
{
  public int width = (int)0;
  public int height = (int)0;
  public int x = (int)0;
  public int y = (int)0;

  public Rectangle ()
  {
  } // ctor

  public Rectangle (int _width, int _height, int _x, int _y)
  {
    width = _width;
    height = _height;
    x = _x;
    y = _y;
  } // ctor

} // class Rectangle
