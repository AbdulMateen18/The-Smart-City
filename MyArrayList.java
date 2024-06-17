


import java.util.Arrays;

public class MyArrayList<T> {
	private int counter;
	private T[] array;

	public MyArrayList() {
		this.array = (T[]) new Object[15];
		counter = 0;
	}// default

	public MyArrayList(int size) {
		if (size < 5) {
			this.array = (T[]) new Object[15];
			counter = 0;
		} else {
			this.array =(T[]) new Object[15];
			counter = 0;
		}

	}// overloaded

	private void ensureCapacity() {
		if (counter == array.length) {
			T[] newArray = (T[]) new Object[15];
//			 int[] newArray = Arrays.copyOf(array, this.size() * 2);
//			 array = newArray;
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
		}
		return;
	}

	public void add(T value) {
		ensureCapacity();
		this.array[counter] = value;
		counter++;

	}

	public void add(T value, int pos) {
		if (pos < 0 || pos > counter) {
//			return -1;
			System.out.println("Not possible");
		} else {
			ensureCapacity();

			for (int i = counter; i >= pos; i--) {
				array[i] = array[i - 1];
			}
			array[pos] = value;
			counter++;
		}
	}
	public void print(int i) {
		
			System.out.println(array[i]);

	}
	
	public void print() {
		for (int i = 0; i < array.length && this.array[i]!=null ; i++) {
			System.out.println(array[i]);
			
		}
	}
	@Override
	public String toString() {
		return  Arrays.toString(array) ;
	}

	public T remove(int pos) {
		if (pos < 0 || pos > counter) {
			return null;
		}
		T temp = array[pos];
		counter--;

		for (int i = pos; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}

		return temp;
	}

	public T replace(T value, int pos) {
		if (pos < 0 || pos > counter) {
			return null;
		}

		else {
			T temp = array[pos];
			array[pos] = value;

			return temp;
		}
	}

	public void clear() {
		this.counter = 0;
	}

	public int size() {
		return counter;
	}

	public boolean isEmpty() {
		return this.counter == 0;
	}

	public int find(T value) {
		for (int i = 0; i < counter; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}
	public boolean contains(T item){
		for (int i = 0; i < counter ; i++) {
			if(this.array[i].equals(item))
				return true;
		}
		return false;
	}
// This comment was added from phone
}
