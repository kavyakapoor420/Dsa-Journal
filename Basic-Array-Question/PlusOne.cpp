#include <iostream>
#include <vector>

using namespace std;

vector<int> plusOne(vector<int> digits) {
    int n = digits.size();
    // Traverse the array from the last digit
    for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i] += 1; // Increment the current digit if it's less than 9
            return digits;
        }
        // If the current digit is 9, set it to 0
        digits[i] = 0;
    }
    // If all digits are 9, add a leading 1
    digits.insert(digits.begin(), 1);
    return digits;
}

int main() {
    vector<int> arr;

    arr.push_back(0);
    arr.push_back(9);
    arr.push_back(9);

 
    arr = plusOne(arr);

    
    for (int i = 0; i < arr.size(); i++) {
        cout << arr[i] << " ";
    }

    
}
