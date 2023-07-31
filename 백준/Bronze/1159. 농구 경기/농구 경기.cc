//
// Created by jongmin choi on 2023/07/31.
//

#include <bits/stdc++.h>

using namespace std;
int N, check = 0;
int arr[26];

void input() {
    string s;
    cin >> N;

    for (int i = 0; i < N; i++) {
        cin >> s;
        int idx = (int) s[0] - 97;
        arr[idx]++;
    }

    for (int i = 0; i < 26; i++) {
        if (arr[i] >= 5) {
            char ch = i + 97;
            cout << ch;
            check++;
        } else if (i == 25 && check == 0) {
            cout << "PREDAJA";
        }
    }
}


int main() {
    input();
}

