public class diameter_of_tree {
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
    static class bynary{
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

    public int hight(node root){
        if(root==null){
            return 0;
        }
        int left_hight=hight(root.left_child);
        int right_hight=hight(root.right_child);
        //this function gives the maximum among the two values (Math.max(num1,num2))
        int maxhight=Math.max(left_hight,right_hight);
        return maxhight;
    }

    public int diameter_of_tree(node root){
        if(root==null){
            return 0;
        }
        int left_diameter=diameter_of_tree(root.left_child);
        int right_diameter=diameter_of_tree(root.right_child);
        int total=hight(root.left_child)+hight(root.right_child)+1;
 //this function gives the maximum among the two values (Math.max(num1,num2))
        int maxpath=Math.max(total,Math.max(left_diameter,right_diameter));

        return maxpath;  
    }

    }  


    public static void main(String args[]){
        bynary tree=new bynary();

        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        node root=tree.construct(nodes);
    
    
    System.out.println("the diameter of tree "+tree.diameter_of_tree(root));
    }
}
