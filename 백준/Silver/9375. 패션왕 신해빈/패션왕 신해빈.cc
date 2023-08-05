#include <bits/stdc++.h>
using namespace std;

int TC, N;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    cin >> TC;

    for (int t = 0; t < TC; t++) {
        cin >> N;
        unordered_map<string, int> clothes;

        // 의상의 종류별로 개수를 HashMap에 카운팅
        for (int i = 0; i < N; i++) {
            string name, type;
            cin >> name >> type;
            clothes[type]++;
        }

        int ans = 1;

        // 조합 계산
        for (auto it = clothes.begin(); it != clothes.end(); it++) {
            ans *= (it->second + 1); // 해당 종류의 의상을 선택하지 않은 경우도 고려
        }

        // 모든 의상을 입지 않은 경우 1가지를 빼주기
        ans--;

        cout << ans << '\n';
    }

    return 0;
}
