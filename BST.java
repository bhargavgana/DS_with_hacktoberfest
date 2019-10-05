import java.util.Scanner;

/********* DO NO EDIT BELOW CODE **********/
    public class BST {
        public static void main(String[] args) {
            munna.com.BST b = new munna.com.BST();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i=0; i<n; i++)
                b.insert( sc.nextInt() );
            b.inorder();
            sc.close();
        }
    }
    /********* DO NO EDIT ABOVE CODE **********/

    class insert{
        munna.com.Node root;


        void insert(int key) {
            if (root == null)
                root = new munna.com.Node(key);
            else
                root=root.insert(key);}
        void inorder(){
            if(root==null){
                return;
            }
            else
                root.inorder();
        }


    }

    class Node {

        // You can add your code here

        int data;
        munna.com.Node left;
        munna.com.Node right;
        Node(){
            left=null;
            right=null;
        }
        Node(int key){
            this.data=key;
        }
        public munna.com.Node insert(int key){
            if(key<=this.data){
                if(this.left==null){
                    this.left=new munna.com.Node(key);
                }
                else
                    left=left.insert(key);
            }
            else{
                if(this.right==null){
                    this.right=new munna.com.Node(key);
                }
                else
                    right=right.insert(key);
            }
            return this;
        }
        public void inorder(){
            if(this.left!=null){
                this.left.inorder();
            }
            System.out.println(this.data+"  ");
            if(this.right!=null){
                this.right.inorder();



            }

        }
    }



