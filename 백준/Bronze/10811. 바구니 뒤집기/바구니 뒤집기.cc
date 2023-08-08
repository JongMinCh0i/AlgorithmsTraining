#include <bits/stdc++.h>

using namespace std;

int N, M;
vector<int> vc;

int main() {
    cin >> N >> M;
    vc.resize(N);
    
    
    for (int i = 0; i < N; i++) vc[i] = i + 1;

    for (int i = 0; i < M; i++) {
        int k, w;
        cin >> k >> w;

        reverse(vc.begin() + k - 1, vc.begin() + w);
    }


    for (int i = 0; i < N; i++) {
        cout << vc[i] << " ";
    }
}