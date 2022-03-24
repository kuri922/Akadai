import java.util.Scanner;

class Sample6_2 {
public static void main(String[] args) {
Scanner stdIn = new Scanner(System.in);
int[] s = {9, 2, 5};
int[] n = new int[3];
int t;
int sum = 0;

for (int i = 0; i < 3; i++) {
n [i]= stdIn.nextInt();
}

for (int i = 0; i < 2; i++){
for (int j = i + 1; j < 3; j ++) {
if (n[i] == n[j])
n[j] = 0;
}
}

for (int i = 0; i < 3; i++) {
for (int j =0; j < 3; j++) {
if (s[i] == n[j]) {
if (i == j) {
t = 2;
sum = sum + t;
} else {
t = 1;
sum = sum + t;
}
}
}

System.out.println("合計点は" + sum + "です。");
}
}



        
    }
