import java.util.Scanner;
public class App1.java {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        a = (int)scanner.nextInt();
        System.out.print("Nhập số thứ hai:");
        b = (int)scanner.nextInt();
        scanner.close();
        while (a != b) {
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.printf("Ước chung lớn nhất là: %d", num2);
    }
}
public class App2.java {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a:");
        a = (double)scanner.nextDouble();
        System.out.print("Nhập cạnh b:");
        b = (double)scanner.nextDouble();
        System.out.print("Nhập cạnh c:");
        c = (double)scanner.nextDouble();
        scanner.close();
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
			System.out.println("Đây là tam giác !");
		}
		if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Đây là tam giác cân !");
		} else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("Đây là tam giác đều !");
		} else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Đây là tam giác vuông !");
		} else {
			System.out.println("Đây không phải tam giác");
		}
    }
}
public class App3.java {
    public static void main(String[] args) {
        int a;
        boolean isPrime=true;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra:");
        int b=scan.nextInt();
        scanner.close();
        for(int i=2;i<=b/2;i++)
        {
            a=b%i;
            if(a==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(b + " Là số nguyên tố!");
        else
            System.out.println(b + " Không phải là số nguyên tố!");
    }
}
public class App4.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
}
public class App5.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //khai báo biến a là số cần kiểm tra, sum là tổng các ước của a
    int sum = 0, a;
    System.out.println("\n\nNhập vào số cần kiểm tra: ");
    a = sc.nextInt();
    for(int i=1;i<=a/2;i++){
      if(a%i==0) 
        //tổng các ước của a
        sum+=i;
    }
    if(sum==a){
      System.out.println(a + " là số hoàn thiện");
    }
    else {
      System.out.println(a + " không phải là số hoàn thiện");
    }
    } 
}
public class App10.java {
    public static void main(String[] args) {
        int a, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên dương bất kỳ: ");
        a = scanner.nextInt();
        while (a <= 0) {
            System.out.println("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
            a = scanner.nextInt();
        }
         
        while (a > 0) {
            a /= 10;
            count++;   
        }
         
        System.out.println("Số các chữ số = " + count);
    }
}