int i = 2;
int j;
boolean prime = true;
int count = 1;
while (count <= 1000) {
    j = 2;
    while (j < i) {
        if (i % j == 0) {
            prime = false;
        }
        j++;
    }
    if (prime) {
        println i;
        count++;
    }
    i++;
    prime = true;
}		