/**
 * QqOnlineWebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.kekee.QqOnline.WebXml;

public interface QqOnlineWebServiceSoap extends java.rmi.Remote {

    /**
     * <br /><h3>获得腾讯QQ在线状态</h3><p>输入参数：QQ号码 String，默认QQ号码：8698053。返回数据：String，Y
     * = 在线；N = 离线；E = QQ号码错误；A = 商业用户验证失败；V = 免费用户超过数量</p><br />
     */
    public java.lang.String qqCheckOnline(java.lang.String qqCode) throws java.rmi.RemoteException;
}
