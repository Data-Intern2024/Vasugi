
/* get maximum number from the array*/
class HighArray {
    private long[] a; 
    private int Elem;

    public HighArray(int max) { 
        a = new long[max]; 
        Elem = 0; 
    }

    public boolean find(long searchKey) { 
        int j;
        for (j = 0; j < Elem; j++) { 
            if (a[j] == searchKey) { 
                break; 
            }
        }
        if (j == Elem) { 
            return false; 
        } else {
            return true;         }
    }

    public void insert(long value) { 
        a[Elem] = value; 
        Elem++; 
    }

    public boolean delete(long value) {
        int j;
        for (j = 0; j < Elem; j++) { 
            if (value == a[j]) {
                break;
            }
        }
        if (j == Elem) { 
            return false;
        } else { 
            for (int k = j; k < Elem; k++) { 
                a[k] = a[k + 1];
            }
            Elem--; 
            return true;
        }
    }

    public void display() { 
        for (int j = 0; j < Elem; j++) {
            System.out.print(a[j] + " "); 
        }
        System.out.println("");
    }

    public long getMax() {
        if (Elem == 0) {
            return -1;
        }

        long max = a[0];
        for (int i = 1; i < Elem; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}

class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100; 
        HighArray arr; 
        arr = new HighArray(maxSize); 

        arr.insert(77); 
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display(); 

        long max = arr.getMax(); 
        if (max != -1) {
            System.out.println("Max value is: " + max);
        } else {
            System.out.println("The array is empty.");
        }

        arr.delete(0); 
        arr.delete(55);
        arr.delete(99);

        arr.display(); 

        max = arr.getMax(); 
        if (max != -1) {
            System.out.println("Max value is: " + max);
        } else {
            System.out.println("The array is empty.");
        }
    }
}
