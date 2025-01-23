//calculatig number of nodes in tree 

public class count_nodes_tree {
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

    //constucting the bynary tree 
    static class construct_bynary{
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
        
//calculating number of nodes 
            public  int count_node(node root){
                if(root==null){
                    return 0;
                }
                int left_childs=count_node(root.left);
                int right_childs=count_node(root.right);
                int total=left_childs+right_childs+1;
                return total;
            }
    }
          
    //main method
        public static void main(String args[]){
            construct_bynary tree=new construct_bynary();
            int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            
         
            node root=tree.construct(nodes);
            System.out.println(root.data);
            
            System.out.println("number of nodes is "+ tree.count_node(root));
        }
    }

