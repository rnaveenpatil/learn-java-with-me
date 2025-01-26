//calcunting the sum of node

public class sum_of_nodes_tree {
   
    //node class 
        static  class node{
             int data;
             node left;
             node right;
             node(int data){
                 this.data=data;
                 this.right=null;
                 this.left=null;
             }
         }
     
         //constuct bynary tree
         static class construct_binary{
             static int idx=-1;
             
             public node construct(int[] nodes){
                 idx++;
                 if(nodes[idx]==-1){
                     return null;
                 }
     
                 node newnode=new node(nodes[idx]);
                 newnode.left=construct(nodes);
                 newnode.right=construct(nodes);
     
                 return newnode;
                 }
//calculating the sum of nodes 
                 public int sum_of_nodes(node root){
                    if(root==null){
                        return 0;
                    }
                    
                    int left_childs=sum_of_nodes(root.left);
                    int right_childs=sum_of_nodes(root.right);
                    int total=left_childs+right_childs+root.data;
                    return total;
                 }
                }

                //main method
                 public static void main(String args[]){
                    construct_binary tree=new construct_binary();
                    int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
                    node root=tree.construct(nodes);
                    System.out.println(root.data);

                    System.out.println("sum of all nodes is   "+tree.sum_of_nodes(root));
                 }
             
}
