#include <stdio.h>

int main() {
    int arr[10] = {1,2,3,4,5,6,7,8,9,10};
    int N = sizeof(arr);
    int sum = 0, i;
    
    for (i = 0; i < N; i++) {
        if (arr[i] % 2 == 0) {
            sum += arr[i];
        }
    }

    printf("sum of even numbers is %d \n" , sum);

    return 0;
}


