//
// Created by jongmin choi on 2023/08/01.
//

#include <bits/stdc++.h>

using namespace std;
#define long long ll;

int arr[100004], psum[100004], M, N;
vector<int> ans (100004);

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> M;

    for (int i = 1; i <= N; i++) {
        cin >> arr[i];
        psum[i] = psum[i - 1] + arr[i];
    }

    for (int i = 0; i <= (N - M); i++) {
        ans[i] = psum[M + i] - psum[i];
    }

    sort(ans.begin(), ans.begin() + (N - M + 1), greater<int>());

    cout << ans[0] << '\n';
}