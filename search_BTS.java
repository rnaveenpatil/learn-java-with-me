import java.util.*;

public class search_BTS{
//constucting a BST

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
   
        
        public node construct_BST(int value,node root){
            node newnode=new node(value);
           
            if(root==null){
             root=newnode;
            }
            else if(root.data<value){
                construct_BST(value, root.right_child);
            
            }

            else{
                construct_BST(value, root.left_child);
            }
            return newnode;
        }

        //to search an element in a tree 
     static public boolean search(int key,node root){
         if(root==null){
            return false;
         }
            if(key==root.data){
                return true;
            }     
            if(key>root.data){
                return search(key,root.right_child);
            }
            else if(key<root.data){
                return search(key, root.left_child);
            }
           
        return false;
    }
   }
    public static void main(String args[]){


       //input the size of tree 
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of nodes ");
        int n=s.nextInt();
        int[] values=new int[n];

        //entering the elements in tree
        System.out.println("enter the tree data ");
     for(int i=0; i<n; i++){
        values[i]=s.nextInt();
     }

     //initializing root node is eqale to null
node root=null;
//constucting the tree
        BST_construct tree=new BST_construct();
 for (int i = 0; i < values.length; i++) {
root=tree.construct_BST(values[i],root);
     
 }
 System.out.println("BST is consrtucted ");
    

 //input the key element
 System.out.println("enter key");
 int key=s.nextInt();
 //search the elements in tree 
 boolean tr=tree.search(key,root);
 if(tr==true){
    System.out.println("key found");
 }
 else if(tr==false){
    System.out.println("key not found");
 }
}
}