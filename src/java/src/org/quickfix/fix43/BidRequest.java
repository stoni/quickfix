package org.quickfix.fix43; 
import org.quickfix.FieldNotFound; 
import org.quickfix.Group; 
import org.quickfix.field.*; 

public class BidRequest extends Message 
{ 

  public BidRequest() 
  { 
    getHeader().setField(new MsgType("k")); 
  } 
  public BidRequest(    
    org.quickfix.field.ClientBidID aClientBidID,    
    org.quickfix.field.BidRequestTransType aBidRequestTransType,    
    org.quickfix.field.TotalNumSecurities aTotalNumSecurities,    
    org.quickfix.field.BidType aBidType,    
    org.quickfix.field.TradeType aTradeType,    
    org.quickfix.field.BasisPxType aBasisPxType ) 
  {  
    getHeader().setField(new MsgType("k")); 
    set(aClientBidID); 
    set(aBidRequestTransType); 
    set(aTotalNumSecurities); 
    set(aBidType); 
    set(aTradeType); 
    set(aBasisPxType);  
  } 

  public void set(org.quickfix.field.BidID value) 
  { setField(value); } 
  public org.quickfix.field.BidID get(org.quickfix.field.BidID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BidID getBidID() throws FieldNotFound 
  { org.quickfix.field.BidID value = new org.quickfix.field.BidID(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ClientBidID value) 
  { setField(value); } 
  public org.quickfix.field.ClientBidID get(org.quickfix.field.ClientBidID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ClientBidID getClientBidID() throws FieldNotFound 
  { org.quickfix.field.ClientBidID value = new org.quickfix.field.ClientBidID(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.BidRequestTransType value) 
  { setField(value); } 
  public org.quickfix.field.BidRequestTransType get(org.quickfix.field.BidRequestTransType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BidRequestTransType getBidRequestTransType() throws FieldNotFound 
  { org.quickfix.field.BidRequestTransType value = new org.quickfix.field.BidRequestTransType(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ListName value) 
  { setField(value); } 
  public org.quickfix.field.ListName get(org.quickfix.field.ListName value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ListName getListName() throws FieldNotFound 
  { org.quickfix.field.ListName value = new org.quickfix.field.ListName(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.TotalNumSecurities value) 
  { setField(value); } 
  public org.quickfix.field.TotalNumSecurities get(org.quickfix.field.TotalNumSecurities value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.TotalNumSecurities getTotalNumSecurities() throws FieldNotFound 
  { org.quickfix.field.TotalNumSecurities value = new org.quickfix.field.TotalNumSecurities(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.BidType value) 
  { setField(value); } 
  public org.quickfix.field.BidType get(org.quickfix.field.BidType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BidType getBidType() throws FieldNotFound 
  { org.quickfix.field.BidType value = new org.quickfix.field.BidType(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.NumTickets value) 
  { setField(value); } 
  public org.quickfix.field.NumTickets get(org.quickfix.field.NumTickets value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.NumTickets getNumTickets() throws FieldNotFound 
  { org.quickfix.field.NumTickets value = new org.quickfix.field.NumTickets(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.Currency value) 
  { setField(value); } 
  public org.quickfix.field.Currency get(org.quickfix.field.Currency value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.Currency getCurrency() throws FieldNotFound 
  { org.quickfix.field.Currency value = new org.quickfix.field.Currency(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.SideValue1 value) 
  { setField(value); } 
  public org.quickfix.field.SideValue1 get(org.quickfix.field.SideValue1 value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.SideValue1 getSideValue1() throws FieldNotFound 
  { org.quickfix.field.SideValue1 value = new org.quickfix.field.SideValue1(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.SideValue2 value) 
  { setField(value); } 
  public org.quickfix.field.SideValue2 get(org.quickfix.field.SideValue2 value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.SideValue2 getSideValue2() throws FieldNotFound 
  { org.quickfix.field.SideValue2 value = new org.quickfix.field.SideValue2(); 
    getField(value); return value; } 

public static class NoBidDescriptors extends Group { 
  public NoBidDescriptors() { 
    super(398, 1, 
    new int[] { 
               399, 
               400, 
               401, 
               404, 
               441, 
               402, 
               403, 
               405, 
               406, 
               407, 
               408, 
               66, 
               54, 
               336, 
               625, 
               430, 
               63, 
               64, 
               1, 
               0 } 
); 
  } 
  public void set(org.quickfix.field.BidDescriptorType value) 
  { setField(value); } 
  public org.quickfix.field.BidDescriptorType get(org.quickfix.field.BidDescriptorType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BidDescriptorType getBidDescriptorType() throws FieldNotFound 
  { org.quickfix.field.BidDescriptorType value = new org.quickfix.field.BidDescriptorType(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.BidDescriptor value) 
  { setField(value); } 
  public org.quickfix.field.BidDescriptor get(org.quickfix.field.BidDescriptor value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BidDescriptor getBidDescriptor() throws FieldNotFound 
  { org.quickfix.field.BidDescriptor value = new org.quickfix.field.BidDescriptor(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.SideValueInd value) 
  { setField(value); } 
  public org.quickfix.field.SideValueInd get(org.quickfix.field.SideValueInd value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.SideValueInd getSideValueInd() throws FieldNotFound 
  { org.quickfix.field.SideValueInd value = new org.quickfix.field.SideValueInd(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.LiquidityValue value) 
  { setField(value); } 
  public org.quickfix.field.LiquidityValue get(org.quickfix.field.LiquidityValue value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LiquidityValue getLiquidityValue() throws FieldNotFound 
  { org.quickfix.field.LiquidityValue value = new org.quickfix.field.LiquidityValue(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.LiquidityNumSecurities value) 
  { setField(value); } 
  public org.quickfix.field.LiquidityNumSecurities get(org.quickfix.field.LiquidityNumSecurities value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LiquidityNumSecurities getLiquidityNumSecurities() throws FieldNotFound 
  { org.quickfix.field.LiquidityNumSecurities value = new org.quickfix.field.LiquidityNumSecurities(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.LiquidityPctLow value) 
  { setField(value); } 
  public org.quickfix.field.LiquidityPctLow get(org.quickfix.field.LiquidityPctLow value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LiquidityPctLow getLiquidityPctLow() throws FieldNotFound 
  { org.quickfix.field.LiquidityPctLow value = new org.quickfix.field.LiquidityPctLow(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.LiquidityPctHigh value) 
  { setField(value); } 
  public org.quickfix.field.LiquidityPctHigh get(org.quickfix.field.LiquidityPctHigh value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LiquidityPctHigh getLiquidityPctHigh() throws FieldNotFound 
  { org.quickfix.field.LiquidityPctHigh value = new org.quickfix.field.LiquidityPctHigh(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.EFPTrackingError value) 
  { setField(value); } 
  public org.quickfix.field.EFPTrackingError get(org.quickfix.field.EFPTrackingError value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.EFPTrackingError getEFPTrackingError() throws FieldNotFound 
  { org.quickfix.field.EFPTrackingError value = new org.quickfix.field.EFPTrackingError(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.FairValue value) 
  { setField(value); } 
  public org.quickfix.field.FairValue get(org.quickfix.field.FairValue value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.FairValue getFairValue() throws FieldNotFound 
  { org.quickfix.field.FairValue value = new org.quickfix.field.FairValue(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.OutsideIndexPct value) 
  { setField(value); } 
  public org.quickfix.field.OutsideIndexPct get(org.quickfix.field.OutsideIndexPct value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.OutsideIndexPct getOutsideIndexPct() throws FieldNotFound 
  { org.quickfix.field.OutsideIndexPct value = new org.quickfix.field.OutsideIndexPct(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ValueOfFutures value) 
  { setField(value); } 
  public org.quickfix.field.ValueOfFutures get(org.quickfix.field.ValueOfFutures value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ValueOfFutures getValueOfFutures() throws FieldNotFound 
  { org.quickfix.field.ValueOfFutures value = new org.quickfix.field.ValueOfFutures(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ListID value) 
  { setField(value); } 
  public org.quickfix.field.ListID get(org.quickfix.field.ListID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ListID getListID() throws FieldNotFound 
  { org.quickfix.field.ListID value = new org.quickfix.field.ListID(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.Side value) 
  { setField(value); } 
  public org.quickfix.field.Side get(org.quickfix.field.Side value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.Side getSide() throws FieldNotFound 
  { org.quickfix.field.Side value = new org.quickfix.field.Side(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.TradingSessionID value) 
  { setField(value); } 
  public org.quickfix.field.TradingSessionID get(org.quickfix.field.TradingSessionID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound 
  { org.quickfix.field.TradingSessionID value = new org.quickfix.field.TradingSessionID(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.TradingSessionSubID value) 
  { setField(value); } 
  public org.quickfix.field.TradingSessionSubID get(org.quickfix.field.TradingSessionSubID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound 
  { org.quickfix.field.TradingSessionSubID value = new org.quickfix.field.TradingSessionSubID(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.NetGrossInd value) 
  { setField(value); } 
  public org.quickfix.field.NetGrossInd get(org.quickfix.field.NetGrossInd value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound 
  { org.quickfix.field.NetGrossInd value = new org.quickfix.field.NetGrossInd(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.SettlmntTyp value) 
  { setField(value); } 
  public org.quickfix.field.SettlmntTyp get(org.quickfix.field.SettlmntTyp value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.SettlmntTyp getSettlmntTyp() throws FieldNotFound 
  { org.quickfix.field.SettlmntTyp value = new org.quickfix.field.SettlmntTyp(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.FutSettDate value) 
  { setField(value); } 
  public org.quickfix.field.FutSettDate get(org.quickfix.field.FutSettDate value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.FutSettDate getFutSettDate() throws FieldNotFound 
  { org.quickfix.field.FutSettDate value = new org.quickfix.field.FutSettDate(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.Account value) 
  { setField(value); } 
  public org.quickfix.field.Account get(org.quickfix.field.Account value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.Account getAccount() throws FieldNotFound 
  { org.quickfix.field.Account value = new org.quickfix.field.Account(); 
    getField(value); return value; } 

} 

public static class NoBidComponents extends Group { 
  public NoBidComponents() { 
    super(420, 1, 
    new int[] { 
               399, 
               400, 
               401, 
               404, 
               441, 
               402, 
               403, 
               405, 
               406, 
               407, 
               408, 
               66, 
               54, 
               336, 
               625, 
               430, 
               63, 
               64, 
               1, 
               0 } 
); 
  } 
  public void set(org.quickfix.field.BidDescriptorType value) 
  { setField(value); } 
  public org.quickfix.field.BidDescriptorType get(org.quickfix.field.BidDescriptorType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BidDescriptorType getBidDescriptorType() throws FieldNotFound 
  { org.quickfix.field.BidDescriptorType value = new org.quickfix.field.BidDescriptorType(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.BidDescriptor value) 
  { setField(value); } 
  public org.quickfix.field.BidDescriptor get(org.quickfix.field.BidDescriptor value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BidDescriptor getBidDescriptor() throws FieldNotFound 
  { org.quickfix.field.BidDescriptor value = new org.quickfix.field.BidDescriptor(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.SideValueInd value) 
  { setField(value); } 
  public org.quickfix.field.SideValueInd get(org.quickfix.field.SideValueInd value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.SideValueInd getSideValueInd() throws FieldNotFound 
  { org.quickfix.field.SideValueInd value = new org.quickfix.field.SideValueInd(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.LiquidityValue value) 
  { setField(value); } 
  public org.quickfix.field.LiquidityValue get(org.quickfix.field.LiquidityValue value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LiquidityValue getLiquidityValue() throws FieldNotFound 
  { org.quickfix.field.LiquidityValue value = new org.quickfix.field.LiquidityValue(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.LiquidityNumSecurities value) 
  { setField(value); } 
  public org.quickfix.field.LiquidityNumSecurities get(org.quickfix.field.LiquidityNumSecurities value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LiquidityNumSecurities getLiquidityNumSecurities() throws FieldNotFound 
  { org.quickfix.field.LiquidityNumSecurities value = new org.quickfix.field.LiquidityNumSecurities(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.LiquidityPctLow value) 
  { setField(value); } 
  public org.quickfix.field.LiquidityPctLow get(org.quickfix.field.LiquidityPctLow value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LiquidityPctLow getLiquidityPctLow() throws FieldNotFound 
  { org.quickfix.field.LiquidityPctLow value = new org.quickfix.field.LiquidityPctLow(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.LiquidityPctHigh value) 
  { setField(value); } 
  public org.quickfix.field.LiquidityPctHigh get(org.quickfix.field.LiquidityPctHigh value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LiquidityPctHigh getLiquidityPctHigh() throws FieldNotFound 
  { org.quickfix.field.LiquidityPctHigh value = new org.quickfix.field.LiquidityPctHigh(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.EFPTrackingError value) 
  { setField(value); } 
  public org.quickfix.field.EFPTrackingError get(org.quickfix.field.EFPTrackingError value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.EFPTrackingError getEFPTrackingError() throws FieldNotFound 
  { org.quickfix.field.EFPTrackingError value = new org.quickfix.field.EFPTrackingError(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.FairValue value) 
  { setField(value); } 
  public org.quickfix.field.FairValue get(org.quickfix.field.FairValue value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.FairValue getFairValue() throws FieldNotFound 
  { org.quickfix.field.FairValue value = new org.quickfix.field.FairValue(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.OutsideIndexPct value) 
  { setField(value); } 
  public org.quickfix.field.OutsideIndexPct get(org.quickfix.field.OutsideIndexPct value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.OutsideIndexPct getOutsideIndexPct() throws FieldNotFound 
  { org.quickfix.field.OutsideIndexPct value = new org.quickfix.field.OutsideIndexPct(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ValueOfFutures value) 
  { setField(value); } 
  public org.quickfix.field.ValueOfFutures get(org.quickfix.field.ValueOfFutures value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ValueOfFutures getValueOfFutures() throws FieldNotFound 
  { org.quickfix.field.ValueOfFutures value = new org.quickfix.field.ValueOfFutures(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ListID value) 
  { setField(value); } 
  public org.quickfix.field.ListID get(org.quickfix.field.ListID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ListID getListID() throws FieldNotFound 
  { org.quickfix.field.ListID value = new org.quickfix.field.ListID(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.Side value) 
  { setField(value); } 
  public org.quickfix.field.Side get(org.quickfix.field.Side value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.Side getSide() throws FieldNotFound 
  { org.quickfix.field.Side value = new org.quickfix.field.Side(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.TradingSessionID value) 
  { setField(value); } 
  public org.quickfix.field.TradingSessionID get(org.quickfix.field.TradingSessionID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound 
  { org.quickfix.field.TradingSessionID value = new org.quickfix.field.TradingSessionID(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.TradingSessionSubID value) 
  { setField(value); } 
  public org.quickfix.field.TradingSessionSubID get(org.quickfix.field.TradingSessionSubID value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound 
  { org.quickfix.field.TradingSessionSubID value = new org.quickfix.field.TradingSessionSubID(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.NetGrossInd value) 
  { setField(value); } 
  public org.quickfix.field.NetGrossInd get(org.quickfix.field.NetGrossInd value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.NetGrossInd getNetGrossInd() throws FieldNotFound 
  { org.quickfix.field.NetGrossInd value = new org.quickfix.field.NetGrossInd(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.SettlmntTyp value) 
  { setField(value); } 
  public org.quickfix.field.SettlmntTyp get(org.quickfix.field.SettlmntTyp value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.SettlmntTyp getSettlmntTyp() throws FieldNotFound 
  { org.quickfix.field.SettlmntTyp value = new org.quickfix.field.SettlmntTyp(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.FutSettDate value) 
  { setField(value); } 
  public org.quickfix.field.FutSettDate get(org.quickfix.field.FutSettDate value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.FutSettDate getFutSettDate() throws FieldNotFound 
  { org.quickfix.field.FutSettDate value = new org.quickfix.field.FutSettDate(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.Account value) 
  { setField(value); } 
  public org.quickfix.field.Account get(org.quickfix.field.Account value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.Account getAccount() throws FieldNotFound 
  { org.quickfix.field.Account value = new org.quickfix.field.Account(); 
    getField(value); return value; } 

} 

  public void set(org.quickfix.field.LiquidityIndType value) 
  { setField(value); } 
  public org.quickfix.field.LiquidityIndType get(org.quickfix.field.LiquidityIndType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.LiquidityIndType getLiquidityIndType() throws FieldNotFound 
  { org.quickfix.field.LiquidityIndType value = new org.quickfix.field.LiquidityIndType(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.WtAverageLiquidity value) 
  { setField(value); } 
  public org.quickfix.field.WtAverageLiquidity get(org.quickfix.field.WtAverageLiquidity value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.WtAverageLiquidity getWtAverageLiquidity() throws FieldNotFound 
  { org.quickfix.field.WtAverageLiquidity value = new org.quickfix.field.WtAverageLiquidity(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ExchangeForPhysical value) 
  { setField(value); } 
  public org.quickfix.field.ExchangeForPhysical get(org.quickfix.field.ExchangeForPhysical value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ExchangeForPhysical getExchangeForPhysical() throws FieldNotFound 
  { org.quickfix.field.ExchangeForPhysical value = new org.quickfix.field.ExchangeForPhysical(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.OutMainCntryUIndex value) 
  { setField(value); } 
  public org.quickfix.field.OutMainCntryUIndex get(org.quickfix.field.OutMainCntryUIndex value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.OutMainCntryUIndex getOutMainCntryUIndex() throws FieldNotFound 
  { org.quickfix.field.OutMainCntryUIndex value = new org.quickfix.field.OutMainCntryUIndex(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.CrossPercent value) 
  { setField(value); } 
  public org.quickfix.field.CrossPercent get(org.quickfix.field.CrossPercent value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.CrossPercent getCrossPercent() throws FieldNotFound 
  { org.quickfix.field.CrossPercent value = new org.quickfix.field.CrossPercent(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ProgRptReqs value) 
  { setField(value); } 
  public org.quickfix.field.ProgRptReqs get(org.quickfix.field.ProgRptReqs value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ProgRptReqs getProgRptReqs() throws FieldNotFound 
  { org.quickfix.field.ProgRptReqs value = new org.quickfix.field.ProgRptReqs(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ProgPeriodInterval value) 
  { setField(value); } 
  public org.quickfix.field.ProgPeriodInterval get(org.quickfix.field.ProgPeriodInterval value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ProgPeriodInterval getProgPeriodInterval() throws FieldNotFound 
  { org.quickfix.field.ProgPeriodInterval value = new org.quickfix.field.ProgPeriodInterval(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.IncTaxInd value) 
  { setField(value); } 
  public org.quickfix.field.IncTaxInd get(org.quickfix.field.IncTaxInd value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.IncTaxInd getIncTaxInd() throws FieldNotFound 
  { org.quickfix.field.IncTaxInd value = new org.quickfix.field.IncTaxInd(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.ForexReq value) 
  { setField(value); } 
  public org.quickfix.field.ForexReq get(org.quickfix.field.ForexReq value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.ForexReq getForexReq() throws FieldNotFound 
  { org.quickfix.field.ForexReq value = new org.quickfix.field.ForexReq(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.NumBidders value) 
  { setField(value); } 
  public org.quickfix.field.NumBidders get(org.quickfix.field.NumBidders value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.NumBidders getNumBidders() throws FieldNotFound 
  { org.quickfix.field.NumBidders value = new org.quickfix.field.NumBidders(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.TradeDate value) 
  { setField(value); } 
  public org.quickfix.field.TradeDate get(org.quickfix.field.TradeDate value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.TradeDate getTradeDate() throws FieldNotFound 
  { org.quickfix.field.TradeDate value = new org.quickfix.field.TradeDate(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.TradeType value) 
  { setField(value); } 
  public org.quickfix.field.TradeType get(org.quickfix.field.TradeType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.TradeType getTradeType() throws FieldNotFound 
  { org.quickfix.field.TradeType value = new org.quickfix.field.TradeType(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.BasisPxType value) 
  { setField(value); } 
  public org.quickfix.field.BasisPxType get(org.quickfix.field.BasisPxType value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.BasisPxType getBasisPxType() throws FieldNotFound 
  { org.quickfix.field.BasisPxType value = new org.quickfix.field.BasisPxType(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.StrikeTime value) 
  { setField(value); } 
  public org.quickfix.field.StrikeTime get(org.quickfix.field.StrikeTime value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.StrikeTime getStrikeTime() throws FieldNotFound 
  { org.quickfix.field.StrikeTime value = new org.quickfix.field.StrikeTime(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.Text value) 
  { setField(value); } 
  public org.quickfix.field.Text get(org.quickfix.field.Text value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.Text getText() throws FieldNotFound 
  { org.quickfix.field.Text value = new org.quickfix.field.Text(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.EncodedTextLen value) 
  { setField(value); } 
  public org.quickfix.field.EncodedTextLen get(org.quickfix.field.EncodedTextLen value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound 
  { org.quickfix.field.EncodedTextLen value = new org.quickfix.field.EncodedTextLen(); 
    getField(value); return value; } 

  public void set(org.quickfix.field.EncodedText value) 
  { setField(value); } 
  public org.quickfix.field.EncodedText get(org.quickfix.field.EncodedText value) throws FieldNotFound 
  { getField(value); return value; } 
  public org.quickfix.field.EncodedText getEncodedText() throws FieldNotFound 
  { org.quickfix.field.EncodedText value = new org.quickfix.field.EncodedText(); 
    getField(value); return value; } 
} 