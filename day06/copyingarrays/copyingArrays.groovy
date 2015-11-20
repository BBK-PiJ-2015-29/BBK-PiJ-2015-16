package copyingarrays

int[] arrayA;
int[] arrayB;

System.out.print("How long first array: ");
int a = Integer.parseInt(System.console().readLine());
arrayA = new int[a];

for (int i = 0; i < a; i++) {
    arrayA[i] = i + 11;
}



System.out.print("How long second array: ");
int b = Integer.parseInt(System.console().readLine());
arrayB = new int[b];


for (int i = 0; i < b; i++) {
    arrayB[i] = i + 21;
}


ArrayCopier test = new ArrayCopier();
test.copy(arrayA, arrayB);
