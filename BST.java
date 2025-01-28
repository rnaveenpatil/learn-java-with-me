//constucting a BST

public class BST {

    //class node
   static  class node{
        int data;
        node left_child;
        node right_child;
        node(int data){
            this.data=data;
            this.left_child=null;
            this.right_child=null;

        }
    }
//method for construct a BST
   static  class BST_construct{
        static int idx=-1;
        public void constuct_BST(int value,node root){
            node newnode=new node(value);
           
            if(root==null){
             root=newnode;
            }
            else if(root.data<value){
                constuct_BST(value, root.right_child);
            
            }

            else{
                constuct_BST(value, root.left_child);
            }
        }
    }

//main method 
    public static void main(String[] args) {
        BST_construct tree=new BST_construct();

        int[] values={4,5,3,2,7,8};
       node root=null;
        for(int i=0; i<6; i++){
        tree.constuct_BST(i, root);
        }
        System.out.println("BST is constucted");
       

}
}