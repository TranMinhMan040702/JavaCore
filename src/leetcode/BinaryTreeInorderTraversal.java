package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	public static void main(String[] args) {
		
	}
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack =  new Stack<>();
        
        TreeNode curr = root;
        
        while (curr != null || !stack.isEmpty()) {
        	while (curr != null) {
        		stack.push(curr);
            	curr = curr.left;
        	}
        	
        	curr = stack.pop();
        	result.add(curr.val);
        	curr = curr.right;
        	
        }
        
        return result;
    }
}
