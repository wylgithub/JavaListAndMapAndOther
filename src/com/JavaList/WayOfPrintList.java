package com.JavaList;

import java.util.Iterator;
import java.util.List;

public class WayOfPrintList {
	public void PringListMethod1(List list1){
		for(int i = 0;i < list1.size();i++){
			System.out.println("list�е�Ԫ��"+(i+1)+"��ֵΪ:"+(String)list1.get(i));
		}
	}
	
	public void PringListMethod2(List list1){
		//��������
		int num = 0;
		for(Iterator iterator = list1.iterator();iterator.hasNext();){
			++num;
			System.out.println("list�е�Ԫ��"+(num)+"��ֵΪ:"+(Object)iterator.next());
		}
	}
	
	//��ӡ����
	public void printArr(Object [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println("Ԫ�� "+i+"��ֵΪ: "+arr[i]);
		}
	}
}
