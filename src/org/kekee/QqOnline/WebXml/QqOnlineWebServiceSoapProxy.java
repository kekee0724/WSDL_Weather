package org.kekee.QqOnline.WebXml;

public class QqOnlineWebServiceSoapProxy implements QqOnlineWebServiceSoap {
  private String _endpoint = null;
  private QqOnlineWebServiceSoap qqOnlineWebServiceSoap = null;
  
  public QqOnlineWebServiceSoapProxy() {
    _initQqOnlineWebServiceSoapProxy();
  }
  
  public QqOnlineWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initQqOnlineWebServiceSoapProxy();
  }
  
  private void _initQqOnlineWebServiceSoapProxy() {
    try {
      qqOnlineWebServiceSoap = (new QqOnlineWebServiceLocator()).getqqOnlineWebServiceSoap();
      if (qqOnlineWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)qqOnlineWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)qqOnlineWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (qqOnlineWebServiceSoap != null)
      ((javax.xml.rpc.Stub)qqOnlineWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public QqOnlineWebServiceSoap getQqOnlineWebServiceSoap() {
    if (qqOnlineWebServiceSoap == null)
      _initQqOnlineWebServiceSoapProxy();
    return qqOnlineWebServiceSoap;
  }
  
  public java.lang.String qqCheckOnline(java.lang.String qqCode) throws java.rmi.RemoteException{
    if (qqOnlineWebServiceSoap == null)
      _initQqOnlineWebServiceSoapProxy();
    return qqOnlineWebServiceSoap.qqCheckOnline(qqCode);
  }
  
  
}