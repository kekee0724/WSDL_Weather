package org.kekee.client;

import java.rmi.RemoteException;
import org.kekee.QqOnline.WebXml.QqOnlineWebServiceSoapProxy;

public class QqOnline {
	public static void main(String[] args) throws RemoteException {

		String enpoint="http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx?wsdl";
		QqOnlineWebServiceSoapProxy qqOnlineWebServiceSoapProxy = new QqOnlineWebServiceSoapProxy(enpoint);
		String result = qqOnlineWebServiceSoapProxy.qqCheckOnline("11468843");
		System.out.println("result: " + result+"\nY=在线; N=离线");
	}
}
