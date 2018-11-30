* @param args the command line arguments
     */
    public static void main(String[] args) {

    	while(true)
        {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter number of elements of array: ");
            int size = reader.nextInt();
            System.out.println("Enter array: ");
             // for functions that require char array
            char[] chars = new char[size];
            for (int i = 0; i < size; i++)
            {
                System.out.print(i + 1 + " element: ");
                chars[i] = reader.next().charAt(0);
            }
             // for functions that only takes int array
            int[] integers = new int[size];
            for (int i = 0; i < size; i++)
            {
                if (chars[i] >= '0' || chars[i] <= '9')
                    integers[i] = chars[i] - '0';
                else
                    integers[i] = chars[i];
        while (true) {
            System.out.println("Please Enter size of arr");
            int sz;
            Scanner in = new Scanner(System.in);
            sz = in.nextInt();
            int arr[] = new int[sz];
            System.out.println("Enter array elements");
            for (int i = 0; i < sz; ++i) {
                int c = in.next().charAt(0);
                arr[i] = c;
             }
            System.out.println("1  - most repeated value");
            System.out.println("2  - sort");
            System.out.println("3  - shuffle");
            System.out.println("4  - Find the Largest Prime");
            System.out.println("5  - Find ths smallest Prime");
            System.out.println("6  - Check Palindrome");
            System.out.println("7  - Check sorted");
            System.out.println("8  - Count Primes");
            System.out.println("9  - Reverse array");
            System.out.println("10 - Shift array");
            System.out.println("11 - Distinct array");
            System.out.println("12 - Get the maximum 3 numbers");
            System.out.println("13 - Get the minimum 3 numbers");
            System.out.println("14 - Get average");
            System.out.println("15 - Get median");
            System.out.println("16 - Return only primes");
            System.out.println("17 - Zero if less than zero");
            System.out.println("18 - Execute all functions");
            System.out.println("19 - Exit");
            System.out.println("Enter your choice");
            int choice = in.nextInt();
            in.close();
            if (choice == 1) {
             } else if (choice == 2) {
             } else if (choice == 3) {
             } else if (choice == 4) {
             } else if (choice == 5) {
             } else if (choice == 6) {
             } else if (choice == 7) {
             } else if (choice == 8) {
             } else if (choice == 9) {
             } else if (choice == 10) {
             } else if (choice == 11) {
             // Menu
            System.out.println("Choose function:\n" +
                    "1-\tMost repeated value\n" +
                    "2-\tSort\n" +
                    "3-\tShuffle\n" +
                    "4-\tFind the largest prime\n" +
                    "5-\tFind the smallest prime\n" +
                    "6-\tCheck palindrome\n" +
                    "7-\tCheck sorted\n" +
                    "8-\tCount primes\n" +
                    "9-\tReverse array\n" +
                    "10-\tShift array\n" +
                    "11-\tDistinct array\n" +
                    "12-\tGet the maximum 3 numbers\n" +
                    "13-\tGet the maximum 3 numbers\n" +
                    "14-\tGet average\n" +
                    "15-\tGet median\n" +
                    "16-\tReturn only primes\n" +
                    "17-\tZero if less than zero\n" +
                    "18-\tAll\n" +
                    "19-\tExit\n");
            int choice = reader.nextInt();
            reader.close();
            switch (choice)
            {
                case 1:
					Most_common(integers);
                	break;
                case 2:
                     break;
                case 3:
                     break;
                case 4:
                     break;
                case 5:
                     break;
                case 6:
                    palindrome(chars);
                    break;
                case 7:
                     break;
                case 8:
                     break;
                case 9:
                     break;
                case 10:
                     break;
                case 11:
                     break;
                case 12:
                     break;
                case 13:
                     break;
                case 14:
                     break;
                case 15:
                     break;
                case 16:
                     break;
                case 17:
                     break;
                case 18:
                    palindrome(chars);
                    Most_common(integers);
                    break;
                case 19:
                    return;
            } else if (choice == 12) {
             } else if (choice == 13) {
                System.out.print("the minimum 3 numbers of the array : ");
                getmin(arr);
            } else if (choice == 14) {
             } else if (choice == 15) {
             } else if (choice == 16) {
             } else if (choice == 17) {
             } else if (choice == 18) {
             }else if (choice == 19) {
                break;
            }
        }
    }

    public static void Most_common(int [] array){
    	HashMap<Integer,Integer> hash = new HashMap<>();
    	for(int i=0;i<array.length;i++)
    	{

    		if(hash.containsKey(array[i]))
    		{
    			hash.put(array[i], hash.get(array[i]) + 1);
    		}
    		else {
    			hash.put(array[i], 1);
    		}
    	}


    		int max=0; int ind=0;
    	for (int i: hash.keySet())
    	{
    		if(hash.get(i)>max)
    		{
    			ind=i;
    			max=hash.get(i);
    		}
    	}
		System.out.println(max);

	}

	static boolean palindrome(char[] array)
    {
        for(int i = 0; i < array.length / 2; i++)
            if(array[i] != array[array.length - 1 - i])
            {
                System.out.println("Not Palindrome.");
                return false;
    static void getmin(int[] arr) {
        int mini = arr[0], idx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
                idx = i;
            }
        System.out.println("Palindrome.");
        return true;
        }
        System.out.print("the Smallest 3 numbers are : " + mini);
        arr[idx] = arr[arr.length - 1];
        mini = arr[0];
        idx = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
                idx = i;
            }
        }
        System.out.print(" , " + mini);
        arr[idx] = arr[arr.length - 2];
        mini = arr[0];
        idx = 0;
        for (int i = 1; i < arr.length - 2; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
            }
        }
        System.out.println(" , " + mini);
    }
}
}
