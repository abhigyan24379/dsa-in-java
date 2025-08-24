package Binary_Search_Tree;

public class Introduction {
    static class Node{
        int data ;
        Node left;
        Node right;

        Node(int data ){
            this.data = data ;
        }
    }
    public static Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data> val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;

    }
    public static void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    public static boolean search(Node root , int key){
        if(root ==null){
            return false;
        }
        if(root.data == key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else{
            return search(root.right, key);
        }

    }
    public static Node delete(Node root, int val ){
        if(root.data < val){
            root.right  = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            // Case 1 - leaf node
            if(root.right == null && root.left == null ){
                return null;
            }
            // case 2 single child
            if(root.right == null)
                return root.left;
            else if(root.left == null)
                return root.right;
            // case 3 both children
            Node Is = FindInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }
    public static Node FindInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void PrintInRange(Node root , int k1, int k2){
        if(root == null){
            return ;
        }
        if(root.data >= k1 && root.data <= k2){
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            PrintInRange(root.right , k1, k2);
        }
        else if( root.data >= k1){
            PrintInRange(root.right, k1, k2);
        }
        else{
            PrintInRange(root.left, k1, k2);
        }
    }

    public static boolean isValid(Node root , Node min , Node max){
        if(root == null){
            return true;
        }
        if(min!= null && root.data <= min.data){
            return false ;
        }
        else if(max!= null && root.data >= max.data){
            return false ;
        }
        return isValid(root.left, min , root) && isValid(root.right, root, max);

    }


    public static void main(String[] args) {
        int values[] = {8,5,3,1,6,10,11,14};
//        int values[] = {1,1,1};

        Node root = null;
        for( int i =0; i < values.length ; i++){
            root = insert(root, values[i]);
        }
        inorder((root));

//        root = delete(root, 10 );
//        System.out.println();
//        inorder(root);
        System.out.println();
        if(isValid(root, null, null)){
            System.out.println("IsValide");
        }
        else{
            System.out.println("Not valid");
        }




    }
}
