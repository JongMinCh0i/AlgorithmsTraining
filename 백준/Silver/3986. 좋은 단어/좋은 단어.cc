//
// Created by jongmin choi on 2023/08/04.
//

#include <bits/stdc++.h>

using namespace std;
int N, cnt;
string s;

int main() {
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> s;
        stack<char> stk; // 매번 빈 스택을 위해서
        for (char c : s) {
            if(stk.size() && stk.top() == c) stk.pop(); // 사이즈 체크 , 레퍼런스 체크
            else stk.push(c);
        }
        if (stk.size() == 0) cnt++;
    }

    cout << cnt << "\n";
}
