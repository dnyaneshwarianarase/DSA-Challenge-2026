class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> arr = new ArrayList<>();

        preorder(root, arr);

        return arr;
    }

    public void preorder(TreeNode root, List<Integer> arr) {

        if (root == null) {
            return;
        }

    
        arr.add(root.val);

    
        preorder(root.left, arr);

        
        preorder(root.right, arr);
    }
}