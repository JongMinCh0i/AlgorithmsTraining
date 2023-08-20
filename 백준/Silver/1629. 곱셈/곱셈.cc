//
// Created by jongmin choi on 2023/08/04.
//

#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
ll a, b, c;

int go(ll a, ll b) {
    if(b == 1) return a % c;

    ll ret = go(a, b / 2);
    ret = (ret * ret) % c;
    if(b % 2) ret = (ret * a) % c;
    return ret;
}

int main() {
    cin >> a >> b >> c;
    cout << go(a, b) << "\n";
    return 0;
}