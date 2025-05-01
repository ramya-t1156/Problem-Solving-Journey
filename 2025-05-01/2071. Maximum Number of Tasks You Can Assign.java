class Solution {
public:
    bool canAssign(int mid, vector<int>& workers, vector<int>& tasks, int pills,
                   int strength) {
        // choosing the best workers
        multiset<int> usable_workers(workers.end() - mid, workers.end());

        for (int i = mid - 1; i >= 0; --i) {
            auto curr_worker = --usable_workers.end();

            if (*curr_worker < tasks[i]) {
                if (pills <= 0)
                    return false;

                // optimal statergy : assign weakest worker to get the current
                // task done
                auto weakest_worker =
                    usable_workers.lower_bound(tasks[i] - strength);
                if (weakest_worker == usable_workers.end()) {
                    return false; // no one can be assigned the current job
                                  // (even using the pill)
                }
                pills--;
                usable_workers.erase(weakest_worker);
            } else {
                usable_workers.erase(curr_worker);
            }
        }
        return true;
    }

    int maxTaskAssign(vector<int>& tasks, vector<int>& workers, int pills,
                      int strength) {
        sort(workers.begin(), workers.end());
        sort(tasks.begin(), tasks.end());
        int low = 0;
        int high = min(tasks.size(), workers.size());
        int mid;

        int assigned = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (canAssign(mid, workers, tasks, pills, strength)) {
                assigned = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return assigned;
    }
};
