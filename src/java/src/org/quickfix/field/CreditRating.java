package org.quickfix.field; 
import org.quickfix.StringField; 
import java.util.Date; 

public class CreditRating extends StringField 
{ 

  public CreditRating() 
  { 
    super(255);
  } 
  public CreditRating(String data) 
  { 
    super(255, data);
  } 
} 