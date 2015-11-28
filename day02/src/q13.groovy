int i = 2;
int j;
boolean prime = true;

while (i <= 1000) {
    j = 2;
    while (j < i) {
        if (i % j == 0) {
            prime = false;
        }
        j++;
    }
    if (prime) {
        println i;
    }
    i++;
    prime = true;
}		