#include <bits/stdc++.h>
using namespace std;
int arr[26];
string s;

int main() {
    cin >> s;
    for (int i = 0; i < s.length(); i++) {
        int idx = (int) s[i] - 97;
        arr[idx]++;
    }

    for (int i = 0; i < 26; i++) {
        cout << arr[i] << " ";
    }
}