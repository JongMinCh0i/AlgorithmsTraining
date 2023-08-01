//
// Created by jongmin choi on 2023/08/01.
//

#include <bits/stdc++.h>

using namespace std;
int N;
double avg = 0;
double per = 0.15;
double ans = 0;
int cnt = 0;
int main() {
    cin >> N;
    double pl = round(N * per);

    if (N == 0) {
        cout << 0;
        exit(0);
    }

    int arr[N];

    for (int i = 0; i < N; i++) {
        int num;
        cin >> num;
        arr[i] = num;
    }

    sort(&arr[0], &arr[N]);

    for (int i = (int)pl; i < (int)N - pl; i++) {
        cnt++;
        avg = ans += arr[i];
    }

    int k = round(avg / cnt);
    cout << k;
}