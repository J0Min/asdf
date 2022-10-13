package hello;
public class Sum {
public static void main(String[] args) {
int i, odd=0, even=0;
for(i=1; i<=100; i++) {
if(i%2 == 0) even = even + i;
else odd = odd + i;
}
System.out.printf("even = %d odd = %d \n", even, odd);
}
}