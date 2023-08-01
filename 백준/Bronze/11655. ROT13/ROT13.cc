//
// Created by jongmin choi on 2023/07/31.
//

#include <bits/stdc++.h>

const int ROT = 13;
using namespace std;
string s;

void input() {
    getline(cin, s);
}

void logic() {
    for (int i = 0; i < s.length(); i++) {
        char ch = s[i];

        // 대문자
        if ((int) 'A' <= ch && ((int) ch <= 'Z')) {
            char ch2 = (char) ((ch + 13));
            if (ch2 > 'Z') {
                ch2 = 64 + (ch2 % 'Z');
            }
            cout << ch2;
            continue;
        }

            // 소문자
        else if ((int) 'a' <= ch && ((int) ch <= 'z')) {
            char ch2 = (char) ((ch + 13));

            if (ch2 > 'z') {
                ch2 = 96 + (ch2 % 'z');
            }

            if (ch2 < 0) {
                s[i] -= 13;
                cout << s[i];
                continue;
            }

            cout << ch2;
            continue;
        } else cout << s[i];
    }
}


int main() {
    input();
    logic();
}