package com.bjpowernode;

import java.util.List;

public class bintree {
    public  static void create(int[] datas, List<Node> list) {

        //将数组里面的东西变成节点的形式
        for(int i=0;i<datas.length;i++) {
            Node node=new Node(datas[i]);
            list.add(node);
        }

        //节点关联成树
        for(int index=0;index<list.size()/2-1;index++) {
            list.get(index).setLeft(list.get(index*2+1));
            //编号为n的节点他的左子节点编号为2*n 右子节点编号为2*n+1 但是因为list从0开始编号，所以还要+1
            list.get(index).setRight(list.get(index*2+2));  //与上同理
        }

        //单独处理最后一个父节点 ,list.size()/2-1进行设置，避免单孩子情况
        int index=list.size()/2-1;
        list.get(index).setLeft(list.get(index*2+1));
        if(list.size()%2==1)
            //如果有奇数个节点，最后一个父节点才有右子节点
            list.get(index).setRight(list.get(index*2+2));

    }


}
