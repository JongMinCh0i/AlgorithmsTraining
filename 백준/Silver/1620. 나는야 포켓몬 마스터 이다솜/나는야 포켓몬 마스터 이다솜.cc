#include <bits/stdc++.h>

using namespace std;
map<int , string> mp;
map<string , int> mp2;
int N, M;
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    cin >> N >> M;

    for (int i = 1; i <= N; i++) {
        string str = "";
        cin >> str;
        mp[i] = str;
        mp2[str] = i;
    }

    for (int i = 0; i < M; i++) {
        string str = "";
        cin >> str;

        if (atoi(str.c_str()) > 0) {
            cout << mp[atoi(str.c_str())] << '\n'; //  숫자
        }  else {
            cout << mp2[str] << '\n';                    // 문자
        }
    }
}