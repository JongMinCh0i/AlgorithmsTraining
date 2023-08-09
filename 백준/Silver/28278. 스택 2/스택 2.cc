//
// Created by jongmin choi on 2023/08/09.
//

#include <bits/stdc++.h>

using namespace std;
int N;
string bufferflush = "";

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
    cin >> N;
    stack<int> stk;
    cin.ignore();

    for (int i = 0; i < N; i++) {
        string str;
        getline(cin, str);

        int k = (int) str[0] - 48;

        if (k == 1) {
            int y = stoi(str.substr(2));
            stk.push(y);
            continue;
        }

        if (k == 2) {
            if (!stk.empty()) {
                cout << stk.top() << '\n';
                stk.pop();
            } else {
                cout << -1 << '\n';
            }
            continue;
        }

        if (k == 3) {
            cout << stk.size() << '\n';
        }


        if (k == 4) {
            if (stk.empty()) {
                cout << 1 << '\n';
            } else {
                cout << 0 << '\n';
            }
            continue;
        }

        if (k == 5) {
            if (!stk.empty()) {
                cout << stk.top() << '\n';
            } else {
                cout << -1 << '\n';
            }
            continue;
        }
    }
}