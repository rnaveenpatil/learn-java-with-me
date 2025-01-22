//constucing a bynary tree

public class binary_tree{

    //class node for tree nodes
    static class node {
        int data;
        node right_child;
        node left_child;
        node(int data){
            this.data=data;
            this.left_child=null;
            this.right_child=null;
        }
    }
    
    //bynary class for constucting bynary tree
    static class binary{
static int idx=-1;

//method for constucting tree
    public static node construct(int[] nodes){
    idx++;
        if(nodes[idx]==-1){
            return null;
        }
        node newnode=new node(nodes[idx]);
        newnode.left_child=construct(nodes);
        newnode.right_child=construct(nodes);
     
return newnode;
    }
    }  
    

//main method for bynary tree
    public static void main(String args[]){
binary tree=new binary();
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
 node root=tree.construct(nodes);
 System.out.println(root.data);

    }
}
