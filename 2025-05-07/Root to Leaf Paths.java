

/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static void findPaths(ArrayList<ArrayList<Integer>> paths , ArrayList<Integer> path , Node root){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            paths.add(new ArrayList<>(path));
        }
        else{
            findPaths(paths,path,root.left);
            findPaths(paths,path,root.right);
        }
        path.remove(path.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        findPaths(paths,path,root);
        return paths;
    }
}
