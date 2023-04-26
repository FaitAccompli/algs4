public class WeightedQUPC {
    private int[] id;
    private int[] size;

    public WeightedQUPC(int N) {
        //set the id of each object to itself (N array accesses)
        //i     | 0 1 2 3 4 5 6 7 8 9
        //id[i] | 0 1 2 3 4 5 6 7 8 9
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    private int root(int i) {
        //chase parent pointers until each root (depth of i array accesses)
        while (i != id[i]) {
            //make every other node in path point to its grandparent (thereby halving path length)
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        //check if p and q have the same root (depth of p and q array accesses)
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        //change root of p to point to root of q (depth of p and q array accesses)
        int i = root(p);
        int j = root(q);
        //link root of smaller tree to root of larger tree and update the size[] array
        if (i == j) return;
        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        } else {
            id[j] = i;
            size[i] += size[j];
        }
    }

}
