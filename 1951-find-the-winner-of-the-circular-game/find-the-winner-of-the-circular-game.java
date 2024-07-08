class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> friends = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            friends.add(i);
        }
        int cur_ind = 0;

        while (friends.size() > 1) {
            int next_to_remove = (cur_ind + k - 1) % friends.size();
            friends.remove(next_to_remove);
            cur_ind = next_to_remove;
        }

        return friends.get(0);
    }
}