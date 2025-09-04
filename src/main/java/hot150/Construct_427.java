package hot150;

/**
 * @Time: 2025/9/4 21:02
 * @Author: guo_x
 * @File: Construct_427
 * @Description:
 */
public class Construct_427 {

    public static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }

    public Node construct(int[][] grid) {
        return subTask(grid, 0, grid[0].length - 1, 0, grid.length - 1);
    }

    public Node subTask(int[][] grid, int left, int right, int top, int bottom) {
        // base case
        if (left == right && top == bottom) {
            Node tmp = new Node();
            tmp.val = grid[top][left] == 1;
            tmp.isLeaf = true;
            return tmp;
        }
        // 检查当前块是否为全0或全1
        boolean equal = true;
        int origin = grid[top][left];
        for (int i = left; i <= right; i++) {
            for (int j = top; j <= bottom; j++) {
                if (origin != grid[j][i]) {
                    equal = false;
                    break;
                }
            }
            if (!equal) {
                break;
            }
        }

        // 如果为全0或者全1 则返回当前结点，并标记当前结点为叶子结点
        if (equal) {
            Node tmp = new Node();
            tmp.val = origin == 1;
            tmp.isLeaf = true;
            return tmp;
        }
        // 如果为假，则构建新的结点, 并对其余位置进行递归创建
        else {
            Node subNode = new Node();
            subNode.topLeft = subTask(grid, left, (left + right) / 2, top, (top + bottom) / 2);
            subNode.topRight = subTask(grid, (left + right) / 2 + 1, right, top, (top + bottom) / 2);
            subNode.bottomLeft = subTask(grid, left, (left + right) / 2, (top + bottom) / 2 + 1, bottom);
            subNode.bottomRight = subTask(grid, (left + right) / 2 + 1, right, (top + bottom) / 2 + 1, bottom);
            return subNode;
        }
    }
}
