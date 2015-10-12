package com.skyline.sms.caster.test;

import java.util.Arrays;
import java.util.regex.Pattern;

import com.skyline.sms.caster.connector.JsscPort;
import com.skyline.sms.caster.connector.JsscPortList;
import com.skyline.sms.caster.service.PortService;

import jssc.SerialPortList;



public class GetPortsTest {
	public static void main(String[] args) {

		String[] portNames=JsscPortList.getPortNames();
		System.out.println(Arrays.toString(portNames));

		int rowCount=portNames.length;
		int columnCount=3;
		
		String[] status=new String[rowCount];
		for(int j=0;j<rowCount;j++){
			try {
				status[j]=PortService.getInstance(JsscPort.getInstance(portNames[j])).getPortStatus(); //线性执行,会被阻塞死锁
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}