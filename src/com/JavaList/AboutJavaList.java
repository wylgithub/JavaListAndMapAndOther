package com.JavaList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class AboutJavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//现在在公司开发(实际是测试，虽然以前没有接触过测试，但是感觉测试还是一份
		//相当重要的工作，但是要知道自己做的事什么，为什么要做，在开发中Java的List
		//接口用的是很多的，因此学习好List接口的使用方法和其实现类很有用)
		
		/*
		 * 首先实现两个People类实例
		 */
		Person people1 = new Person("吴彦龙",25,"男");
		Person people2 = new Person("罗婷",22,"女");
		
		//实现一个List类(使用List的实现类ArrayList实现)
		List list1 = new ArrayList();
		//使用List的方法add()将people1和people2添加在list1中
		list1.add(people1);
		list1.add(people2);
		//调用List的get方法打印list中的元素
		for(int i=0;i<list1.size();i++){
			//List在返回的时候不管当初定义的是什么类型，但是在返回的时候都是返回了Object类型
			//因此在调用get方法得到list中的元素的时候要进行强制转换
			Person p1 = (Person)list1.get(i);
			System.out.println("调用List的get方法打印List中的元素:"+p1.getUserName());
		}
		/*以上知识点的总结
		 * 2、List是一个接口，不能实例化，需要实例化一个ArrayList或者LinkedList
			List myList = new ArrayList();
			3、使用myList.add(任何对象);就可以进行添加了。
			4、取值的时候myList.get(索引);取出来的值都是Object，使用时需要类型转换。
			5、可用Iterator迭代器对List中的元素进行迭代操作。
			List 集合中的对象按照一定的顺序排放，里面的内容可以重复。
			List接口实现的类：ArrayList(实现动态数组)， Vector（实现动态数组） ，LinkedList（实现链表）， Stack（实现堆栈）
		 */
		
		/*
		 * 以下代码用于实现打印List中元素的最佳方法：Iterator
		 */
		//首先定义一个list2
		List list2 = new ArrayList();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		//在此添加一个重复的元素d，用于测试list中的元素重复是否会报错
		list2.add("d");
		//实例化一个打印list的方法
		WayOfPrintList wopl = new WayOfPrintList();
		//调用方法打印List的元素(普通方法)
		System.out.println("方法1打印(一般的for循环！)List的元素:");
		wopl.PringListMethod1(list2);
		//调用方法打印List的元素(Iterator)
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("方法1打印(Iterator打印)List的元素:");
		wopl.PringListMethod2(list2);
		
		
		/*
		 * List的另外一个实现类：java.util.Vector（向量）类 与ArrayList类似的也是实现一个动态的数组，该向量可以随意的增长以存放更多的对象
		 */
		List list3 = new Vector();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		wopl.PringListMethod2(list3);
		
		
		/*
		 * 3.java.util.LinkedList类实现了链表，可初始化化为空或者已存在的集合，通常使用以下方法
		add();向链表末尾添加对象。
		addFirst（）在链表开头添加对象。
		addLast（）在链表末尾添加对象。
		getFirst（）得到链表开头的对象。
		getLast（）得到链表末尾的对象。
		注意该类提供了随机访问列表中的元素的方法，但是底层依然必须遍历去查找随机访问的对象，因此性能依然有限.
		 */
		List list4 = new LinkedList();
		list4.add(11);
		list4.add(12);
		list4.add(13);
		list4.add(14);
		wopl.PringListMethod2(list4);
//		System.out.println("获取链表的第一个元素:");
//		System.out.println("获取链表的第一个元素:");
		
		/*
		 * 4.java.util.Stack类实现了堆栈数据结构，即按照先进后出的原则存放数据。创建时只能为空。
			使用push（）方法进行添加对象
		 */
		List list5 = new Stack();
		list5.add(111);
		list5.add(222);
		list5.add(333);
		list5.add(444);
		wopl.PringListMethod2(list5);
	}

}
