class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || issym(root.left, root.right);
}

private boolean issym(TreeNode left, TreeNode right){
    if(left==null || right==null)
        return left==right;
    if(left.val!=right.val)
        return false;
    return issym(left.left, right.right) && issym(left.right, right.left);
}
        
    }
