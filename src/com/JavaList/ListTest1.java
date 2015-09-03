package com.JavaList;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����List��ʵ����ArrayList�ķ���
		 */
		//ʵ��List�Ľӿ�ʵ����ArrayList��һ��ʵ��
		List<String> list = new ArrayList();
		//ʵ��һ����ӡList�ڲ�Ԫ�ص���ʵ����
		WayOfPrintList wopl = new WayOfPrintList();
		//��ʱ��List�ڲ�û��Ԫ�أ����Բ���һ�£����Ե���ArrayList��isEmpty�����в�ѯ
		System.out.println("����ArrayList�ڲ��ǲ���û��Ԫ�أ��������򷵻�True:  "+list.isEmpty());
		//������List�ڲ����Ԫ�أ���ʱ����ArrayList��add����ʵ�����Ԫ�ص�Ŀ��
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("e");
		//�����ٴβ���List�ڲ��ǲ�����Ԫ��
		System.out.println("�����Ԫ��֮���ѯ�ڲ��ǲ���Ϊ��(����False,��Ϊ��Ϊ��):"+list.isEmpty());
		
		//���б��ָ��λ�ò���ָ��Ԫ��
		list.add(0, "insertElement");
		//��ӡ�����Ԫ��
		System.out.println("��list��λ�ò���Ԫ��֮��Ԫ��Ϊ:"+(String)list.get(0));
		//ʵ��һ��Array
		int [] arr = new int[4];
		for(int i=0;i<4;i++){
			arr[i] = i+1;
		}
		for(int j=0;j<4;j++){
			System.out.println(arr[j]);
		}
		//ʹ��List��addAll()������listĩβ���Ԫ��
		//list.addAll(arr);
		//��ʵ��һ��List2���ڲ���list��addAll()����
		List list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		//����List��addAll()����
		//�ֱ��ӡlist��list2�ĳ���
		System.out.println("list�ĳ���Ϊ:"+list.size());
		System.out.println("list2�ĳ���Ϊ:"+list2.size());
		list.addAll(list2);
		//ִ��List��addAll֮��List2�ĳ���Ϊ
		System.out.println("list�ĳ���Ϊ:"+list.size());
		//��ӡ��list������Ԫ��
		wopl.PringListMethod2(list);
		/**
		 * ����list��addAll()�������ܽ�:
		 * ������list�����һ��list�����֮��List��Ԫ�ؾ���(list+list2)��Ԫ�ص��ܺ�
		 */
		//���б����Ƴ�����Ԫ��
		System.out.println("���Ƴ�����Ԫ��֮ǰ�鿴�Ƿ���Ԫ��: "+list2.isEmpty());
		//ִ���Ƴ�Ԫ�صĲ���
//		list2.clear();
		System.out.println("�ڵ���List��clear()�����Ƴ�Ԫ��֮��鿴�ǲ��ǻ���Ԫ��: "+list2.isEmpty());
		
		//����б����ָ����Ԫ�أ��򷵻� true��
		System.out.println("�鿴List���ǲ�����aԪ��: "+list.contains("a"));
		System.out.println("�鿴List���ǲ�����fԪ��: "+list.contains("f"));
		System.out.println("�鿴List���ǲ�����List2Ԫ��: "+ list.containsAll(list2));
		
		//�ж�ָ���б��ǲ��Ǻ͵�ǰ�б������
		List list3 = new ArrayList();
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list3.add(4);
		System.out.println("�ж�List2��List3�ǲ�����ȵ�(�����б�ȷʵ����ȵ�): "+list2.equals(list3));
		System.out.println("�ж�List2��List�ǲ�����ȵ�(�����б�ȷʵ������ȵ�): "+list2.equals(list));
		/*
		 * ��������:���ж�����List�ǲ�����ȵ�ʱ���������򷵻�true���򷵻�false
		 */
		// ���ش��б��������ֵ�ָ��Ԫ�ص�����������б�������Ԫ�أ��򷵻� -1��
		System.out.println(" ���ش��б��������ֵ�ָ��Ԫ�ص�����������б�������Ԫ�أ��򷵻� -1: "+list.lastIndexOf("c"));
		System.out.println(" ���ش��б��������ֵ�ָ��Ԫ�ص�����������б�������Ԫ�أ��򷵻� -1: "+list.lastIndexOf("f"));
		// ���ش��б��е�һ�γ��ֵ�ָ��Ԫ�ص�������������б�������Ԫ�أ��򷵻� -1��
		System.out.println(" ���ش��б��е�һ�γ��ֵ�ָ��Ԫ�ص�������������б�������Ԫ�أ��򷵻� -1: "+list.indexOf("a"));
		System.out.println(" ���ش��б��е�һ�γ��ֵ�ָ��Ԫ�ص�������������б�������Ԫ�أ��򷵻� -1: "+list.indexOf("g"));
		// �����б�Ĺ�ϣ��ֵ��
		System.out.println("�б�Ԫ��Ϊ: "+list.get(0)+" �����б�Ĺ�ϣ��ֵ:"+list.hashCode());
		wopl.PringListMethod2(list2);
		
		System.out.println("�Ƴ��б��е�һ��Ԫ��֮���ӡ�б��е�����Ԫ��: ");
		//�Ƴ��б��е�Ԫ��:�˷�����ͨ��ָ������ʵ�ֵ��Ƴ�����
		list2.remove(0);
		wopl.PringListMethod2(list2);
		System.out.println();
		//ͨ��ָ��Ԫ����һ��list�еĵ�һ�γ��ֵ�Ԫ��
		System.out.println("ͨ��ָ��Ԫ����һ��list�еĵ�һ�γ��ֵ�Ԫ��: ");
		list2.remove(2);
		wopl.PringListMethod2(list2);
		System.out.println();
		//�Ƴ��б��е�����Ԫ��
		System.out.println("�Ƴ��б��е�����Ԫ��: ");
		list2.removeAll(list2);
		System.out.println("�Ƴ��б��е�����Ԫ��֮���ж��б���: "+list2.size());
		wopl.PringListMethod2(list2);
		//���б�
		List list4 = new ArrayList();
		list4 = list.subList(1, 3);
		System.out.println("subList�ĳ���: "+list4.size());
		
		String [] str = new String[list.size()];
		list.toArray(str);
		//��ӡstr������Ԫ��
		wopl.printArr(str);
		
	}

}
