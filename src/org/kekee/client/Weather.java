package org.kekee.client;

import java.rmi.RemoteException;

import org.kekee.Weather.WebXml.WeatherWebServiceSoapProxy;

public class Weather {
	public static void main(String[] args) throws RemoteException {

		WeatherWebServiceSoapProxy weatherWebServiceSoapProxy = new WeatherWebServiceSoapProxy();
        String[] weather = weatherWebServiceSoapProxy.getWeatherbyCityName("武汉");
        int i = 0;
        for(String str:weather){
            System.out.println(i++ + ": "+ str);
        }
    }
}
