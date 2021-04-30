package com.bjpowernode;

import java.util.Stack;

public class find {
    public void preTraversal(Node node){
        if (node == null) //很重要，必须加上 当遇到叶子节点用来停止向下遍历
            return;
        System.out.print(node.getValue()+" ");
        preTraversal(node.getLeft());
        preTraversal(node.getRight());
    }

    public void preOrderTraversalbyLoop(Node node){
        Stack<Node> stack = new Stack();
        Node p = node;
        while(p!=null || !stack.isEmpty()){
            while(p!=null){
                //当p不为空时，就读取p的值，并不断更新p为其左子节点，即不断读取左子节点
                System.out.print(p.getValue()+" ");
                stack.push(p); //将p入栈
                p = p.getLeft();
            }
            if(!stack.isEmpty()){
                p = stack.pop();
                p = p.getRight();
            }
        }
    }

}
