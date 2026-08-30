int largest = arr[0];
int secondLargest = Integer.MIN_VALUE;

for (int i = 1; i < n; i++) {

    if (arr[i] > largest) {

        secondLargest = largest;
        largest = arr[i];

    } else if (arr[i] > secondLargest && arr[i] != largest) {

        secondLargest = arr[i];
    }
}
