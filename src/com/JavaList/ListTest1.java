package com.JavaList;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 测试List的实现类ArrayList的方法
		 */
		//实现List的接口实现类ArrayList的一个实例
		List<String> list = new ArrayList();
		//实现一个打印List内部元素的类实例化
		WayOfPrintList wopl = new WayOfPrintList();
		//此时的List内部没有元素，可以测试一下：可以调用ArrayList的isEmpty来进行查询
		System.out.println("测试ArrayList内部是不是没有元素，假如是则返回True:  "+list.isEmpty());
		//现在向List内部添加元素：此时调用ArrayList的add方法实现添加元素的目的
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("e");
		//现在再次测试List内部是不是有元素
		System.out.println("在添加元素之后查询内部是不是为空(返回False,因为不为空):"+list.isEmpty());
		
		//在列表的指定位置插入指定元素
		list.add(0, "insertElement");
		//打印插入的元素
		System.out.println("在list首位置插入元素之后，元素为:"+(String)list.get(0));
		//实现一个Array
		int [] arr = new int[4];
		for(int i=0;i<4;i++){
			arr[i] = i+1;
		}
		for(int j=0;j<4;j++){
			System.out.println(arr[j]);
		}
		//使用List的addAll()方法在list末尾添加元素
		//list.addAll(arr);
		//再实现一个List2用于测试list的addAll()方法
		List list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		//测试List的addAll()方法
		//分别打印list和list2的长度
		System.out.println("list的长度为:"+list.size());
		System.out.println("list2的长度为:"+list2.size());
		list.addAll(list2);
		//执行List的addAll之后List2的长度为
		System.out.println("list的长度为:"+list.size());
		//打印出list的所有元素
		wopl.PringListMethod2(list);
		/**
		 * 关于list的addAll()方法的总结:
		 * 可以向list内添加一个list，添加之后List的元素就是(list+list2)的元素的总和
		 */
		//从列表中移除所有元素
		System.out.println("在移除所有元素之前查看是否有元素: "+list2.isEmpty());
		//执行移除元素的操作
//		list2.clear();
		System.out.println("在调用List的clear()方法移除元素之后查看是不是还有元素: "+list2.isEmpty());
		
		//如果列表包含指定的元素，则返回 true。
		System.out.println("查看List中是不是有a元素: "+list.contains("a"));
		System.out.println("查看List中是不是有f元素: "+list.contains("f"));
		System.out.println("查看List中是不是有List2元素: "+ list.containsAll(list2));
		
		//判断指定列表是不是和当前列表想相等
		List list3 = new ArrayList();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		System.out.println("判断List2和List3是不是相等的(两个列表确实是相等的): "+list2.equals(list3));
		System.out.println("判断List2和List是不是相等的(两个列表确实不是相等的): "+list2.equals(list));
		/*
		 * 综上所述:当判断两个List是不是相等的时候假如相等则返回true否则返回false
		 */
		// 返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。
		System.out.println(" 返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1: "+list.lastIndexOf("c"));
		System.out.println(" 返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1: "+list.lastIndexOf("f"));
		// 返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
		System.out.println(" 返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1: "+list.indexOf("a"));
		System.out.println(" 返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1: "+list.indexOf("g"));
		// 返回列表的哈希码值。
		System.out.println("列表元素为: "+list.get(0)+" 返回列表的哈希码值:"+list.hashCode());
		wopl.PringListMethod2(list2);
		
		System.out.println("移除列表中第一个元素之后打印列表中的所有元素: ");
		//移除列表中的元素:此方法是通过指定索引实现的移除操作
		list2.remove(0);
		wopl.PringListMethod2(list2);
		System.out.println();
		//通过指定元素来一处list中的第一次出现的元素
		System.out.println("通过指定元素来一处list中的第一次出现的元素: ");
		list2.remove(2);
		wopl.PringListMethod2(list2);
		System.out.println();
		//移除列表中的所有元素
		System.out.println("移除列表中的所有元素: ");
		list2.removeAll(list2);
		System.out.println("移除列表中的所有元素之后判断列表长度: "+list2.size());
		wopl.PringListMethod2(list2);
		//子列表
		List list4 = new ArrayList();
		list4 = list.subList(1, 3);
		System.out.println("subList的长度: "+list4.size());
		
		String [] str = new String[list.size()];
		list.toArray(str);
		//打印str的所有元素
		wopl.printArr(str);
		
	}

}
