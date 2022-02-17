import java.util.Scanner;
public class Baitapslide30 {
    public static void main(String[] args) {
        int n;
        int res;
        Scanner sc;
        do {
            System.out.println("Nhập số n = ");
            Scanner scanner = new Scanner(System.in);
            n = sc.nextInt();
        }while(n <= 0);
        res = sum_digit_of_num(n);
        System.out.println("Tổng các chữ số của " + n + " là " + res);
        sc.close();
    }
    public static int sum_digit_of_num(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
} 
public class Baitapslide35 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        a = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        b = scanner.nextInt();
        int min = a;//Gán giá trị của biến a cho min
        if(a>b)
        min=b;
        System.out.println("Số nhỏ nhất trong 2 số "+a+" và "+b+"là"+min);
    }
}
public class Baitapslide40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ngay = scan.nextInt();
        switch(ngay) {
            Case 0:system.out.println("Thu hai");
            break;
            Case 1:system.out.println("Thu ba");
            break;
            Case 2:system.out.println("Thu tu");
            break;
            Case 3:system.out.println("Thu nam");
            break;
            Case 4:system.out.println("Thu sau");
            break;
            Case 5:system.out.println("Thu bay");
            break;
            Case 6:system.out.println("Chu nhat");
            break;
            default:system.out.println("Đó không phải là ngày trong tuần");
        }
    }         
}
public class Baitapslide47 {
    public static void main(String[] args) {
        int a, sum=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số nguyên a: ");
            a=scanner.nextInt();
            sum += a;
        } while (sum<100);
        System.out.println("Tổng các số nguyên vừa nhập= "+sum);
    }
}
public class Baitapslide51 {
    public static void main(String[] args) {
        int a=0;
        for (;a<5;) {
            System.out.println(a);
            a++
        }
    
    }
}
public class Baitapslide55 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 5 là: ");
        for(int i=0;i<=20;i++);
        for
        if(i%5!=0)
        {
            continue;
        }
        System.out.println(i);
    }
}