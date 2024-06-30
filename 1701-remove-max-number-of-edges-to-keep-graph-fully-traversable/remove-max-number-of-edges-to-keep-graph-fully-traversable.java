class UnionFind {
    int[] parent;
    int groups;

    UnionFind(int n) {
        parent = new int[n];
        for (int i = 0; i < n; ++i) {
            parent[i] = i;
        }
        groups = n - 1;
    }

    int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    boolean union(int i, int j) {
        int x = find(i);
        int y = find(j);
        if (x == y) {
            return false;
        } else {
            parent[y] = x;
            groups--;
            return true;
        }
    }
}

class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind alice = new UnionFind(n);
        UnionFind bob = new UnionFind(n);
        int count = 0;

        for (int[] edge : edges) {
            int type = edge[0], u = edge[1] - 1, v = edge[2] - 1;
            if (type == 3 && alice.union(u, v) && bob.union(u, v)) {
                ++count;
            }
        }
        for (int[] edge : edges) {
            int type = edge[0], u = edge[1] - 1, v = edge[2] - 1;
            if ((type == 1 && alice.union(u, v)) || (type == 2 && bob.union(u, v))) {
                ++count;
            }
        }

        if (alice.groups == 0 && bob.groups == 0) {
            return edges.length - count;
        } else {
            return -1;
        }
    }
}