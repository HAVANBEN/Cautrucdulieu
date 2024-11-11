package DoAn;

import java.util.Scanner;

public class DeQuyMenu {

	public static void main(String[] args) {
		showMenu();
	}

	public static void showMenu() {
		Scanner scanner = new Scanner(System.in);
		DeQuy deQuy = new DeQuy(); // Tạo đối tượng DeQuy để gọi các phương thức
		while (true) {
			System.out.println("+-------------------------------------------+");
			System.out.println("|   CHƯƠNG TRÌNH QUẢN LÝ BẰNG ĐỆ QUY        |");
			System.out.println("+-------------------------------------------+");
			System.out.println("| 1. Tính dãy số Fibonacci                  |");
			System.out.println("| 2. Tính giai thừa                         |");
			System.out.println("| 3. Tính tổng các số từ 1 đến n            |");
			System.out.println("| 4. Tính luỹ thừa                          |");
			System.out.println("| 5. Tính tổng luỹ thừa                     |");
			System.out.println("| 6. Chuyển nhị phân                        |");
			System.out.println("| 7. Sắp xếp QuickSort                      |");
			System.out.println("| 8. Sắp xếp BubbleSort                     |");
			System.out.println("| 9. Giải quyết bài toán Tháp Hà Nội        |");
			System.out.println("| 0. Thoát                                  |");
			System.out.println("+-------------------------------------------+");
			System.out.print("| Lựa chọn của bạn: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Nhập n: ");
				int nFib = scanner.nextInt();
				System.out.println("Fibonacci sử dụng thuật toán đệ quy là của " + nFib + " là: " + DeQuy.fibonacci(nFib));
				
				break;
			case 2:
				System.out.print("Nhập n: ");
				int nFact = scanner.nextInt();
				System.out.println("Giai thừa của " + nFact + " là: " + DeQuy.giaiThua(nFact));
				break;
			case 3:
				System.out.print("Nhập n: ");
				int nSum = scanner.nextInt();
				System.out.println("Tổng từ 1 đến " + nSum + " là: " + DeQuy.tong(nSum));
				break;
			case 4:
				System.out.print("Nhập cơ số a: ");
				int a = scanner.nextInt();
				System.out.print("Nhập số mũ n: ");
				int nPow = scanner.nextInt();
				System.out.println(a + "^" + nPow + " = " + DeQuy.luyThua(a, nPow));
				break;
			case 5:
				System.out.print("Nhập cơ số a: ");
				int aSum = scanner.nextInt();
				System.out.print("Nhập số mũ n: ");
				int nSumPow = scanner.nextInt();
				System.out.println("Tổng luỹ thừa từ 1 đến " + nSumPow + " của " + aSum + " là: "
						+ DeQuy.tongLuyThua(aSum, nSumPow));
				break;
			case 6:
				System.out.print("Nhập số nguyên n: ");
				int nBin = scanner.nextInt();
				System.out.println("Biểu diễn nhị phân của " + nBin + " là: " + DeQuy.chuyenNP(nBin));
				break;			
			case 7:
			    int[] arrQuick = {3, 6, 8, 10, 1, 2, 1};
			    System.out.println("Mảng trước khi sắp xếp QuickSort: ");
			    printArray(arrQuick);
			    DeQuy.quickSort(arrQuick, 0, arrQuick.length - 1);
			    System.out.println("Mảng sau khi sắp xếp QuickSort: ");
			    printArray(arrQuick);
			    break;
			case 8:
			    int[] arrBubble = {64, 34, 25, 12, 22, 11, 90};
			    System.out.println("Mảng trước khi sắp xếp BubbleSort: ");
			    printArray(arrBubble);
			    DeQuy.bubbleSort(arrBubble);  // Sửa lại gọi hàm bubbleSort
			    System.out.println("Mảng sau khi sắp xếp BubbleSort: ");
			    printArray(arrBubble);
			    break;
			case 9:
				System.out.print("Nhập số đĩa: ");
				int nHanoi = scanner.nextInt();
				DeQuy.towerOfHanoi(nHanoi, 'A', 'B', 'C');
				break;
			case 0:
				System.out.println("Thoát chương trình.");
				return; // Sử dụng return để thoát khỏi main
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
				break;
			}
		}
	}

	// Hàm in mảng ra màn hình
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
