#include <bits/stdc++.h>

using namespace std;

const int mx = 104;
int A, B, C, a, b, ans;
int cnt[mx];

int main() {
    cin >> A >> B >> C;

    for (int i = 0; i < 3; i++) {
        cin >> a >> b;
        for (int j = a; j < b; j++) cnt[j]++;
    }

    for (int i = 0; i < 100; i++) {
        if (cnt[i] == 1) ans += (A * cnt[i]);
        else if(cnt[i] == 2) ans += (B * cnt[i]);
        else if(cnt[i] == 3) ans += (C * cnt[i]);
    }

    cout << ans << "\n";

    return 0;
}
