package org.quickfix.field; 
import org.quickfix.StringField; 
import java.util.Date; 

public class LegCurrency extends StringField 
{ 

  public LegCurrency() 
  { 
    super(556);
  } 
  public LegCurrency(String data) 
  { 
    super(556, data);
  } 
} 