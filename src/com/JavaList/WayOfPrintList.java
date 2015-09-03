package com.JavaList;

import java.util.Iterator;
import java.util.List;

public class WayOfPrintList {
	public void PringListMethod1(List list1){
		for(int i = 0;i < list1.size();i++){
			System.out.println("list中的元素"+(i+1)+"的值为:"+(String)list1.get(i));
		}
	}
	
	public void PringListMethod2(List list1){
		//迭代计数
		int num = 0;
		for(Iterator iterator = list1.iterator();iterator.hasNext();){
			++num;
			System.out.println("list中的元素"+(num)+"的值为:"+(Object)iterator.next());
		}
	}
	
	//打印数组
	public void printArr(Object [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println("元素 "+i+"的值为: "+arr[i]);
		}
	}
}
