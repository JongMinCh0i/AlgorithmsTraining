#include <bits/stdc++.h>

using namespace std;
int n;
string s, ori, pre, suf;

vector<string> split(string input, string deli) {
    vector<string> result;
    long long pos;
    string token = "";

    while ((pos = input.find(deli)) != string::npos) {
        token = input.substr(0, pos);
        result.push_back(token);
        input.erase(0, pos + deli.length());
    }
    result.push_back(input);
    return result;
}


int main() {
    cin >> n;
    cin >> ori;
//    int pos = ori.find('*');
    vector<string> splits = split(ori, "*");
//    pre = ori.substr(0, pos);
//    suf = ori.substr(pos + 1);
    pre = splits[0];
    suf = splits[1];

    for (int i = 0; i < n; i++) {
        cin >> s;
        if (pre.size() + suf.size() > s.size()) {
            cout << "NE\n";
        } else {
            if (pre == s.substr(0, pre.size()) && suf == s.substr(s.size() - suf.size())) cout << "DA\n";
            else cout << "NE\n";
        }
    }
    return 0;
}