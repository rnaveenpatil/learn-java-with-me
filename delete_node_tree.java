import java.util.*;

public class delete_node_tree {
    static class node{
        int data;
        node left_child;
        node right_child;
        node(int data){
            this.data=data;
            this.right_child=null;
            this.left_child=null;
        
        }
    }

    static class construct_BST{
        public node BST_construct(int value,node root){
            node newnode=new node(value);
            
            if(root==null){
                root=newnode;
            }
            else if(value<root.data){
                BST_construct(value, root.left_child);
            }
            else{
                BST_construct(value, root.right_child);
            }

          
            return newnode;
    }


    public node delete_node(node root, int val){
        //if node is in right sub tree
        if(root.data<val){
            root.right_child=delete_node(root.right_child, val);

    }

    //if node is in left sub tree
    else if(root.data>val){
        root.left_child=delete_node(root.left_child, val);
    }
    //if node ==val
    else if(root.data==val){

        //CASE 1: if node is a leaf node
        if(root.left_child==null && root.right_child==null){
            return null;
        }
        //CASE 2: if root node contins only one child node

        //if node contins right_child
        else if(root.left_child==null){
            return root.right_child;
        }
        //if node contins left_child
        else if(root.right_child==null){
            return root.left_child;
        }

        //CASE 3:if node contins two childs
        else{
            node IS=inorder_Successor(root.right_child);
            root.data=IS.data;
            root.right_child=delete_node(root.right_child, IS.data);
        }

    }
    return root;
    
    }

//function for finding inorderSucccessor for the node containg two childs 
    public node  inorder_Successor(node root){
        while(root.left_child!=null){
            root=root.left_child;
        }
return root;
    }
}

public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    construct_BST tree=new construct_BST();
    //initilaiZing root node null
    node root=null;
    //inputting number of nodes in tree
    System.out.println("enter the no of nodes in tree ");
    int n=s.nextInt();
    //inputting the nodes value in tree
    System.out.println("enter nodes in tree ");
    int[] values=new int[n];
    for (int i=0; i<values.length; i++){
        values[i]=s.nextInt();
    }

//constucing the tree
    for(int j=0; j<values.length; j++){
root=tree.BST_construct(values[j],root);
    }
    System.out.println("BST IS CONSTRUCTED");

    //deleting the node from the tree 
    System.out.println("enter  value you want to delete");
    int val=s.nextInt();
    tree.delete_node(root, val);
    System.out.println("node deleted ");
}
}
