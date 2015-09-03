package com.JavaList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class AboutJavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ڹ�˾����(ʵ���ǲ��ԣ���Ȼ��ǰû�нӴ������ԣ����Ǹо����Ի���һ��
		//�൱��Ҫ�Ĺ���������Ҫ֪���Լ�������ʲô��ΪʲôҪ�����ڿ�����Java��List
		//�ӿ��õ��Ǻܶ�ģ����ѧϰ��List�ӿڵ�ʹ�÷�������ʵ���������)
		
		/*
		 * ����ʵ������People��ʵ��
		 */
		Person people1 = new Person("������",25,"��");
		Person people2 = new Person("����",22,"Ů");
		
		//ʵ��һ��List��(ʹ��List��ʵ����ArrayListʵ��)
		List list1 = new ArrayList();
		//ʹ��List�ķ���add()��people1��people2�����list1��
		list1.add(people1);
		list1.add(people2);
		//����List��get������ӡlist�е�Ԫ��
		for(int i=0;i<list1.size();i++){
			//List�ڷ��ص�ʱ�򲻹ܵ����������ʲô���ͣ������ڷ��ص�ʱ���Ƿ�����Object����
			//����ڵ���get�����õ�list�е�Ԫ�ص�ʱ��Ҫ����ǿ��ת��
			Person p1 = (Person)list1.get(i);
			System.out.println("����List��get������ӡList�е�Ԫ��:"+p1.getUserName());
		}
		/*����֪ʶ����ܽ�
		 * 2��List��һ���ӿڣ�����ʵ��������Ҫʵ����һ��ArrayList����LinkedList
			List myList = new ArrayList();
			3��ʹ��myList.add(�κζ���);�Ϳ��Խ�������ˡ�
			4��ȡֵ��ʱ��myList.get(����);ȡ������ֵ����Object��ʹ��ʱ��Ҫ����ת����
			5������Iterator��������List�е�Ԫ�ؽ��е���������
			List �����еĶ�����һ����˳���ŷţ���������ݿ����ظ���
			List�ӿ�ʵ�ֵ��ࣺArrayList(ʵ�ֶ�̬����)�� Vector��ʵ�ֶ�̬���飩 ��LinkedList��ʵ�������� Stack��ʵ�ֶ�ջ��
		 */
		
		/*
		 * ���´�������ʵ�ִ�ӡList��Ԫ�ص���ѷ�����Iterator
		 */
		//���ȶ���һ��list2
		List list2 = new ArrayList();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.add("d");
		//�ڴ����һ���ظ���Ԫ��d�����ڲ���list�е�Ԫ���ظ��Ƿ�ᱨ��
		list2.add("d");
		//ʵ����һ����ӡlist�ķ���
		WayOfPrintList wopl = new WayOfPrintList();
		//���÷�����ӡList��Ԫ��(��ͨ����)
		System.out.println("����1��ӡ(һ���forѭ����)List��Ԫ��:");
		wopl.PringListMethod1(list2);
		//���÷�����ӡList��Ԫ��(Iterator)
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("����1��ӡ(Iterator��ӡ)List��Ԫ��:");
		wopl.PringListMethod2(list2);
		
		
		/*
		 * List������һ��ʵ���ࣺjava.util.Vector���������� ��ArrayList���Ƶ�Ҳ��ʵ��һ����̬�����飬��������������������Դ�Ÿ���Ķ���
		 */
		List list3 = new Vector();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		wopl.PringListMethod2(list3);
		
		
		/*
		 * 3.java.util.LinkedList��ʵ���������ɳ�ʼ����Ϊ�ջ����Ѵ��ڵļ��ϣ�ͨ��ʹ�����·���
		add();������ĩβ��Ӷ���
		addFirst����������ͷ��Ӷ���
		addLast����������ĩβ��Ӷ���
		getFirst�����õ�����ͷ�Ķ���
		getLast�����õ�����ĩβ�Ķ���
		ע������ṩ����������б��е�Ԫ�صķ��������ǵײ���Ȼ�������ȥ����������ʵĶ������������Ȼ����.
		 */
		List list4 = new LinkedList();
		list4.add(11);
		list4.add(12);
		list4.add(13);
		list4.add(14);
		wopl.PringListMethod2(list4);
//		System.out.println("��ȡ����ĵ�һ��Ԫ��:");
//		System.out.println("��ȡ����ĵ�һ��Ԫ��:");
		
		/*
		 * 4.java.util.Stack��ʵ���˶�ջ���ݽṹ���������Ƚ������ԭ�������ݡ�����ʱֻ��Ϊ�ա�
			ʹ��push��������������Ӷ���
		 */
		List list5 = new Stack();
		list5.add(111);
		list5.add(222);
		list5.add(333);
		list5.add(444);
		wopl.PringListMethod2(list5);
	}

}
