import java.util.*;


//traversing and constructing a tree
public class tree_travers{

    //node class for node in tree
static class node{
    int data;
    node right_child;
    node left_child;
    node(int data){
        this.data=data;
        this.right_child=null;
        this.left_child=null;
    }
}

//class for constucting and traversing tree
static class bynary_tree {
    static int idx=-1;

    //function for consructing three 
    public  static node construct_tree(int[] nodes){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
node newnode=new node(nodes[idx]);
    
        newnode.left_child=construct_tree(nodes);
        
        newnode.right_child=construct_tree(nodes);
    
return newnode;
        
    
}

//method for preorder
public void preorder(node root){
   
    if(root==null){
        return;
    }
   
System.out.print(root.data+" ");
    preorder(root.left_child);
    preorder(root.right_child);

}
//method for inorder
public void inorder(node root){
    
    if(root==null){
        return;
    }
   
    inorder(root.left_child);
    System.out.print(root.data+" ");
    inorder(root.right_child);

}
//method for postorder
public void postorder(node root){
   
    if(root==null){
        return;

    }
    
    postorder(root.left_child);
    postorder(root.right_child);
    System.out.print(root.data+" ");

}
//method for level order travers  
public void levelorder(node root){
    Queue<node> q=new LinkedList<>();
q.add(root);

q.add(null);

while(!q.isEmpty()){
node cur=q.remove();
if(cur==null){
    System.out.println();
    if(q.isEmpty()){
        break;
    }
    else{
        q.add(null);
    }
}
else{
    System.out.print(cur.data+" ");

    if(cur.left_child!=null){
q.add(cur.left_child);
    }
    if(cur.right_child!=null){
        q.add(cur.right_child);
    }
}
}
}

//main method   
    public static void main(String args[]){
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        bynary_tree tree=new bynary_tree();

      node root= tree.construct_tree(nodes);
       System.out.println("three constructed ");
       System.out.println(root.data);
       System.out.println("preorder ");
       tree.preorder(root);
       System.out.println();
       System.out.println("inorder ");
       tree.inorder(root);
       System.out.println();
       System.out.println("post order");
       tree.postorder(root);
       System.out.println();
       System.out.println("level order ");
    tree.levelorder(root);
    }
}
}

