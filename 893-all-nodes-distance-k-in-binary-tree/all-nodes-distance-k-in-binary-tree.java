/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void parentNode(TreeNode root,HashMap<TreeNode,TreeNode> map){
        if(root==null)return ;
       
        if(root.left!=null){
            map.put(root.left,root); //child node parent node
        }
        if(root.right!=null){
            map.put(root.right,root);
        }
         parentNode(root.left,map);
        parentNode(root.right,map);
    }
 
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
      parentNode(root,map);
      Queue<TreeNode> q = new LinkedList<>();
      HashSet<TreeNode> visited = new HashSet<>();

      q.add(target);
      visited.add(target);
      int dist=0;

      while(!q.isEmpty()){
        if(dist==k) break;

        int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode curr=q.poll();

            if(curr.left!=null && !visited.contains(curr.left)){
                visited.add(curr.left);
                q.add(curr.left);
            }

             if(curr.right!=null && !visited.contains(curr.right)){
                visited.add(curr.right);
                q.add(curr.right);
            }

            //now parent of curr is
            TreeNode parent=map.get(curr);
            if(parent!=null && !visited.contains(parent)){
                visited.add(parent);
                q.add(parent);
            }
        }
        dist++;

      }
      //now here dist ==k
    List<Integer> ans = new ArrayList<>();
    while(!q.isEmpty()){
        ans.add(q.poll().val);

    }
    return ans;



    
    }
}