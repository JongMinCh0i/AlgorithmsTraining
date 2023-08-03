#include <bits/stdc++.h>

using namespace std;

int N, M, cnt;
int arr[15005];

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    cin >> N;
    cin >> M;

    for (int i = 0; i < N; i++) cin >> arr[i];

    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            if (arr[i] + arr[j] == M) cnt++;
        }
    }

    cout << cnt;
}

