#include <bits/stdc++.h>

using namespace std;

int temp;
bool cmp(string a, string b) {
    if ( a[temp] != b[temp] ) return a[temp] < b[temp] ;
    else return a < b ;
}

vector <string> solution(vector <string> v, int n) {

    temp = n ;
    sort(v.begin(), v.end(), cmp) ;

    return v ;
}

// vector <string> solution(vector <string> v, int n) {
//     vector <pair <char, string>> temp ;

//     for ( string s: v ) {
//         temp.push_back({s[n], s}) ;
//     }
    
//     sort(temp.begin(), temp.end()) ;
    
//     vector <string> ans ;
//     for ( int i = 0 ; i < temp.size() ; i ++ ) {
//         ans.push_back(temp[i].second) ;
//     }

//     return ans ;
// }


/**
 * 두 가지 방법으로 풀어봤는데요,..
 * 문제 풀 때 이런 간단한 정렬은 비교 함수 안 만들려고 해서
 * 아래 방법으로 주로 푸는 편이지만
 * 이 문제는 비교 함수 만들어주는 게 가독성이 좋긴 하네용
 */
