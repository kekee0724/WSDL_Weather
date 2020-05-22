package org.kekee.Weather.WebXml;

public class WeatherWebServiceSoapProxy implements WeatherWebServiceSoap {
  private String _endpoint = null;
  private WeatherWebServiceSoap weatherWebServiceSoap = null;
  
  public WeatherWebServiceSoapProxy() {
    _initWeatherWebServiceSoapProxy();
  }
  
  public WeatherWebServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWeatherWebServiceSoapProxy();
  }
  
  private void _initWeatherWebServiceSoapProxy() {
    try {
      weatherWebServiceSoap = (new WeatherWebServiceLocator()).getWeatherWebServiceSoap();
      if (weatherWebServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)weatherWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)weatherWebServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (weatherWebServiceSoap != null)
      ((javax.xml.rpc.Stub)weatherWebServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public WeatherWebServiceSoap getWeatherWebServiceSoap() {
    if (weatherWebServiceSoap == null)
      _initWeatherWebServiceSoapProxy();
    return weatherWebServiceSoap;
  }
  
  public java.lang.String[] getSupportCity(java.lang.String byProvinceName) throws java.rmi.RemoteException{
    if (weatherWebServiceSoap == null)
      _initWeatherWebServiceSoapProxy();
    return weatherWebServiceSoap.getSupportCity(byProvinceName);
  }
  
  public java.lang.String[] getSupportProvince() throws java.rmi.RemoteException{
    if (weatherWebServiceSoap == null)
      _initWeatherWebServiceSoapProxy();
    return weatherWebServiceSoap.getSupportProvince();
  }
  
  public GetSupportDataSetResponseGetSupportDataSetResult getSupportDataSet() throws java.rmi.RemoteException{
    if (weatherWebServiceSoap == null)
      _initWeatherWebServiceSoapProxy();
    return weatherWebServiceSoap.getSupportDataSet();
  }
  
  public java.lang.String[] getWeatherbyCityName(java.lang.String theCityName) throws java.rmi.RemoteException{
    if (weatherWebServiceSoap == null)
      _initWeatherWebServiceSoapProxy();
    return weatherWebServiceSoap.getWeatherbyCityName(theCityName);
  }
  
  public java.lang.String[] getWeatherbyCityNamePro(java.lang.String theCityName, java.lang.String theUserID) throws java.rmi.RemoteException{
    if (weatherWebServiceSoap == null)
      _initWeatherWebServiceSoapProxy();
    return weatherWebServiceSoap.getWeatherbyCityNamePro(theCityName, theUserID);
  }
  
  
}