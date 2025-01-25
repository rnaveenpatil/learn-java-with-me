//calculate the hight of tree

public class hight_of_tree {
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

    //constuct binary tree
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
//calculate the hight of tree 
            public int hight_of_tree(node root){
                if(root==null){
                    return 0;
                }
                int left_childs=hight_of_tree(root.left);
                int right_childs=hight_of_tree(root.right);
                if(left_childs<right_childs){
                    return right_childs+1;
                }

                return left_childs+1;
            }
        }

        //main method  

            public static void main(String args[]){
                int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
construct_binary tree=new construct_binary();
node root=tree.construct(nodes);

System.out.println("the hight of thee is "+tree.hight_of_tree(root));
            }
}
