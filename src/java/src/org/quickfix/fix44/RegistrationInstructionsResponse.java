package org.quickfix.fix44; 
import org.quickfix.FieldNotFound; 
import org.quickfix.Group; 
import org.quickfix.field.*; 

public class RegistrationInstructionsResponse extends Message 
{ 

  public RegistrationInstructionsResponse() 
  { 
    getHeader().setField(new MsgType("p")); 
  } 
  public RegistrationInstructionsResponse(    
    org.quickfix.field.RegistID aRegistID,    
    org.quickfix.field.RegistTransType aRegistTransType,    
    org.quickfix.field.RegistRefID aRegistRefID,    
    org.quickfix.field.RegistStatus aRegistStatus ) 
  {  
    getHeader().setField(new MsgType("p")); 
    set(aRegistID); 
    set(aRegistTransType); 
    set(aRegistRefID); 
    set(aRegistStatus);  
  } 

  public void set(org.quickfix.field.RegistID value) 
  { setField(value); } 
  public org.quickfix.field.RegistID get(org.quickfix.field.RegistID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.RegistID getRegistID() throws FieldNotFound 
  { org.quickfix.field.RegistID value = new org.quickfix.field.RegistID(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.RegistID field) 
  { return isSetField(field); } 
  public boolean isSetRegistID() 
  { return isSetField(513); } 

  public void set(org.quickfix.field.RegistTransType value) 
  { setField(value); } 
  public org.quickfix.field.RegistTransType get(org.quickfix.field.RegistTransType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.RegistTransType getRegistTransType() throws FieldNotFound 
  { org.quickfix.field.RegistTransType value = new org.quickfix.field.RegistTransType(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.RegistTransType field) 
  { return isSetField(field); } 
  public boolean isSetRegistTransType() 
  { return isSetField(514); } 

  public void set(org.quickfix.field.RegistRefID value) 
  { setField(value); } 
  public org.quickfix.field.RegistRefID get(org.quickfix.field.RegistRefID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.RegistRefID getRegistRefID() throws FieldNotFound 
  { org.quickfix.field.RegistRefID value = new org.quickfix.field.RegistRefID(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.RegistRefID field) 
  { return isSetField(field); } 
  public boolean isSetRegistRefID() 
  { return isSetField(508); } 

  public void set(org.quickfix.field.ClOrdID value) 
  { setField(value); } 
  public org.quickfix.field.ClOrdID get(org.quickfix.field.ClOrdID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ClOrdID getClOrdID() throws FieldNotFound 
  { org.quickfix.field.ClOrdID value = new org.quickfix.field.ClOrdID(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.ClOrdID field) 
  { return isSetField(field); } 
  public boolean isSetClOrdID() 
  { return isSetField(11); } 
  public void set(org.quickfix.field.NoPartyIDs value) 
  { setField(value); } 
  public org.quickfix.field.NoPartyIDs get(org.quickfix.field.NoPartyIDs value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound 
  { org.quickfix.field.NoPartyIDs value = new org.quickfix.field.NoPartyIDs(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.NoPartyIDs field) 
  { return isSetField(field); } 
  public boolean isSetNoPartyIDs() 
  { return isSetField(453); } 

public static class NoPartyIDs extends Group { 
  public NoPartyIDs() { 
    super(453, 447, 
    new int[] { 
               448, 
               447, 
               452, 
               0 } 
); 
  } 
  public void set(org.quickfix.field.PartyID value) 
  { setField(value); } 
  public org.quickfix.field.PartyID get(org.quickfix.field.PartyID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.PartyID getPartyID() throws FieldNotFound 
  { org.quickfix.field.PartyID value = new org.quickfix.field.PartyID(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.PartyID field) 
  { return isSetField(field); } 
  public boolean isSetPartyID() 
  { return isSetField(448); } 

  public void set(org.quickfix.field.PartyIDSource value) 
  { setField(value); } 
  public org.quickfix.field.PartyIDSource get(org.quickfix.field.PartyIDSource value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound 
  { org.quickfix.field.PartyIDSource value = new org.quickfix.field.PartyIDSource(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.PartyIDSource field) 
  { return isSetField(field); } 
  public boolean isSetPartyIDSource() 
  { return isSetField(447); } 

  public void set(org.quickfix.field.PartyRole value) 
  { setField(value); } 
  public org.quickfix.field.PartyRole get(org.quickfix.field.PartyRole value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.PartyRole getPartyRole() throws FieldNotFound 
  { org.quickfix.field.PartyRole value = new org.quickfix.field.PartyRole(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.PartyRole field) 
  { return isSetField(field); } 
  public boolean isSetPartyRole() 
  { return isSetField(452); } 

  public void set(org.quickfix.field.NoPartySubIDs value) 
  { setField(value); } 
  public org.quickfix.field.NoPartySubIDs get(org.quickfix.field.NoPartySubIDs value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.NoPartySubIDs getNoPartySubIDs() throws FieldNotFound 
  { org.quickfix.field.NoPartySubIDs value = new org.quickfix.field.NoPartySubIDs(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.NoPartySubIDs field) 
  { return isSetField(field); } 
  public boolean isSetNoPartySubIDs() 
  { return isSetField(802); } 

public static class NoPartySubIDs extends Group { 
  public NoPartySubIDs() { 
    super(802, 523, 
    new int[] { 
               523, 
               803, 
               0 } 
); 
  } 
  public void set(org.quickfix.field.PartySubID value) 
  { setField(value); } 
  public org.quickfix.field.PartySubID get(org.quickfix.field.PartySubID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.PartySubID getPartySubID() throws FieldNotFound 
  { org.quickfix.field.PartySubID value = new org.quickfix.field.PartySubID(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.PartySubID field) 
  { return isSetField(field); } 
  public boolean isSetPartySubID() 
  { return isSetField(523); } 

  public void set(org.quickfix.field.PartySubIDType value) 
  { setField(value); } 
  public org.quickfix.field.PartySubIDType get(org.quickfix.field.PartySubIDType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.PartySubIDType getPartySubIDType() throws FieldNotFound 
  { org.quickfix.field.PartySubIDType value = new org.quickfix.field.PartySubIDType(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.PartySubIDType field) 
  { return isSetField(field); } 
  public boolean isSetPartySubIDType() 
  { return isSetField(803); } 

} 
} 

  public void set(org.quickfix.field.Account value) 
  { setField(value); } 
  public org.quickfix.field.Account get(org.quickfix.field.Account value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.Account getAccount() throws FieldNotFound 
  { org.quickfix.field.Account value = new org.quickfix.field.Account(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.Account field) 
  { return isSetField(field); } 
  public boolean isSetAccount() 
  { return isSetField(1); } 

  public void set(org.quickfix.field.AcctIDSource value) 
  { setField(value); } 
  public org.quickfix.field.AcctIDSource get(org.quickfix.field.AcctIDSource value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.AcctIDSource getAcctIDSource() throws FieldNotFound 
  { org.quickfix.field.AcctIDSource value = new org.quickfix.field.AcctIDSource(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.AcctIDSource field) 
  { return isSetField(field); } 
  public boolean isSetAcctIDSource() 
  { return isSetField(660); } 

  public void set(org.quickfix.field.RegistStatus value) 
  { setField(value); } 
  public org.quickfix.field.RegistStatus get(org.quickfix.field.RegistStatus value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.RegistStatus getRegistStatus() throws FieldNotFound 
  { org.quickfix.field.RegistStatus value = new org.quickfix.field.RegistStatus(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.RegistStatus field) 
  { return isSetField(field); } 
  public boolean isSetRegistStatus() 
  { return isSetField(506); } 

  public void set(org.quickfix.field.RegistRejReasonCode value) 
  { setField(value); } 
  public org.quickfix.field.RegistRejReasonCode get(org.quickfix.field.RegistRejReasonCode value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.RegistRejReasonCode getRegistRejReasonCode() throws FieldNotFound 
  { org.quickfix.field.RegistRejReasonCode value = new org.quickfix.field.RegistRejReasonCode(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.RegistRejReasonCode field) 
  { return isSetField(field); } 
  public boolean isSetRegistRejReasonCode() 
  { return isSetField(507); } 

  public void set(org.quickfix.field.RegistRejReasonText value) 
  { setField(value); } 
  public org.quickfix.field.RegistRejReasonText get(org.quickfix.field.RegistRejReasonText value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.RegistRejReasonText getRegistRejReasonText() throws FieldNotFound 
  { org.quickfix.field.RegistRejReasonText value = new org.quickfix.field.RegistRejReasonText(); 
    getField(value); return value; } 
  public boolean isSet(org.quickfix.field.RegistRejReasonText field) 
  { return isSetField(field); } 
  public boolean isSetRegistRejReasonText() 
  { return isSetField(496); } 
} 
