//
// Created by jongmin choi on 2023/07/31.
//

#include <bits/stdc++.h>

using namespace std;
char ori[104];
char cpy[104];

int check(string s1, string s2) {
    reverse(s2.begin(), s2.end());

    for (int i = 0; i < s1.length(); i++) {
        if (s1[i] != s2[i]) {
            return 0;
        }
    }

    return 1;
}

int main() {
    cin >> ori;
    strcpy(cpy, ori);
    int ans = check(cpy, ori);
    cout << ans;
}