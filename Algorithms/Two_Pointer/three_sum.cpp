// Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
// Find all unique triplets in the array which gives the sum of zero.

// Notice that the solution set must not contain duplicate triplets.

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]

// Input: nums = [0]
// Output: []


#include<bits/stdc++.h>
using namespace std;

vector<vector<int>> three_sum_opt(vector<int> v)
{
    int n = v.size();
    

}

vector<vector<int>> three_sum_brute(vector<int> v)
{
    int n = v.size();
    vector<vector <int>> res;
    for(int i=0; i<n; i++)
    {
        for(int j=i+1; j<n; j++)
        {
            for(int k=j+1; k<n; k++)
            {
                if((v[i] + v[j] + v[k]) == 0)
                {
                    vector <int> temp;
                    temp.push_back(v[i]);
                    temp.push_back(v[j]);
                    temp.push_back(v[k]);
                    res.push_back(temp);
                }
            }
        }
    }
    return res;
}

int main(int argc, char const *argv[])
{
    vector <int> v = {-1, 0, 1, 2, -1, -4};
    auto res = three_sum_brute(v);


    return 0;
}
