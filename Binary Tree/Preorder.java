public class Preorder{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return  null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }

          public static void Preordertraversal(Node root){
            if(root == null){
                // System.out.print("-1 ");
                return;
            }
               System.out.print(root.data+" ");
               Preordertraversal(root.left);
               Preordertraversal(root.right);
          }
            public static void Postordertraversal(Node root){
            if(root == null){
                return;
            }
               Postordertraversal(root.left);
               Postordertraversal(root.right);
               System.out.print(root.data+" ");
          }
            public static void Inordertraversal(Node root){
            if(root == null){
                return;
            }
               Inordertraversal(root.left);
               System.out.print(root.data+" ");
               Inordertraversal(root.right);
               
          }
    }
  
public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree Tree1 = new BinaryTree();
    Node root = Tree1.buildtree(nodes);


    // Tree1.Preordertraversal(root); // 1 2 4 5 3 6 

    // Tree1.Postordertraversal(root); // 4 5 2 6 3 1

    Tree1.Inordertraversal(root); // 4 2 5 1 3 6
}
}
