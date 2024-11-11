package DoAn;

public class DeQuy {
	// 1. Tính dãy số fibonacci
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	// Khử đệ quy Fibonacci
	public static int khuFibonacci(int n) {
	    if (n <= 1) {
	        return n;
	    }
	    int a = 0, b = 1;
	    int sum = 0;
	    for (int i = 2; i <= n; i++) {
	        sum = a + b;
	        a = b;
	        b = sum;
	    }
	    return sum;
	}

	// 2. Tính giai thừa
	public static int giaiThua(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * giaiThua(n - 1);
		}
	}
	
	// Khử đệ quy giai thừa 
	public static int khuGiaiThua(int n) {
	    int result = 1;
	    for (int i = 2; i <= n; i++) {
	        result *= i;
	    }
	    return result;
	}

	// 3.Tính tổng các số từ 1 đến n
	public static int tong(int n) {
		if (n <= 1) {
			return n;
		} else {
			return n + tong(n - 1);
		}
	}
	
	// Khử đệ quy tổng từ 1 -> n 
	public static int khuTong(int n) {
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        sum += i;
	    }
	    return sum;
	}
	
	// 4. Tính luỹ thừa
	public static int luyThua(int a, int n) {
		if (n == 0) {
			return 1;
		} else {
			return a * luyThua(a, n - 1);
		}
	}
	
	// Khử đệ quy tính luỹ thừa 
	public static int khuLuyThua(int a, int n) {
	    int result = 1;
	    for (int i = 1; i <= n; i++) {
	        result *= a;
	    }
	    return result;
	}

	// 5. Tính tổng luỹ thừa
	public static int tongLuyThua(int a, int n) {
		if (n == 1) {
			return a;
		} else {
			return luyThua(a, n) + tongLuyThua(a, n - 1);
		}
	}
	public static int khuTongLuyThua(int a, int n) {
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	        sum += khuLuyThua(a, i);
	    }
	    return sum;
	}

	// 6. Chuyển nhị phân
	public static String chuyenNP(int n) {
		if (n == 0) {
			return "0";
		} else if (n == 1) {
			return "1";
		} else {
			return chuyenNP(n / 2) + n % 2;
		}
	}

	// 7. Sắp xếp quickSort
	public static void quickSort(int[] arr, int low, int high) {
	    if (low >= high) {
	        return; // Điều kiện dừng: nếu mảng có 1 hoặc không có phần tử
	    }

	    // Chọn phần tử chốt (pivot)
	    int pivot = arr[low + (high - low) / 2];  // Chọn pivot là phần tử giữa mảng
	    int i = low;
	    int j = high;

	    while (i <= j) {
	        // Tìm phần tử bên trái lớn hơn hoặc bằng pivot
	        while (arr[i] < pivot) {
	            i++;
	        }

	        // Tìm phần tử bên phải nhỏ hơn hoặc bằng pivot
	        while (arr[j] > pivot) {
	            j--;
	        }

	        if (i <= j) {
	            // Hoán đổi arr[i] và arr[j]
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	    }

	    // Đệ quy sắp xếp mảng con bên trái và bên phải của pivot
	    if (low < j) {
	        quickSort(arr, low, j);
	    }
	    if (high > i) {
	        quickSort(arr, i, high);
	    }
	}

	//8.  bubleSort ( Sắp xếp nổi bọt )
	// Sắp xếp nổi bọt (Bubble Sort)
	public static void bubbleSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                // Hoán đổi nếu phần tử hiện tại lớn hơn phần tử kế tiếp
	                int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	}
	
	// 9. Tháp hà nội 
	public static void towerOfHanoi(int n, char from, char aux, char to) {
	    if (n == 1) {
	        System.out.println("Di chuyển đĩa 1 từ " + from + " sang " + to);
	        return;
	    }

	    towerOfHanoi(n - 1, from, to, aux);
	    System.out.println("Di chuyển đĩa " + n + " từ " + from + " sang " + to);
	    towerOfHanoi(n - 1, aux, from, to);
	}
	public static void bubbleSort(int[] arrBubble, int length) {
		// TODO Auto-generated method stub
		
	}
}