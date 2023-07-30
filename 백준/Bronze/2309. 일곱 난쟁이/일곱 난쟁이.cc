#include <bits/stdc++.h>

using namespace std;
vector<int> vc;
vector<int> ans;
int n = 9, k = 7;

void output(vector<int> v) {
    sort(v.begin(), v.end());
    for (int i: v) {
        cout << i << "\n";
    }
}

void input() {
    for (int i = 0; i < 9; i++) {
        int a;
        cin >> a;
        vc.push_back(a);
    }
}

int calcul(vector<int> vc) {
    int sum = 0;
    for (int i: vc) {
        sum += i;
    }
    return sum;
}

void combi(int start, vector<int> ans) {
    if (calcul(ans) == 100 && ans.size() == k) {
        output(ans);
        exit(0);
    } else if (calcul(ans) < 100) {
        for (int i = start + 1; i < n; i++) {
            ans.push_back(vc.at(i));
            combi(i, ans);
            ans.pop_back();
        }
        return;
    }
}

int main() {
    input();
    combi(-1, ans);
}

