package crypto;

import java.util.ArrayList;

public class Exercise {
	public static void main(String[] args) {
		 int rows=0;
		 int[] digit= {0,1,2,3,4,5};
		 int[] v =new int[digit.length];
		 int[] use =new int[digit.length];
		 int T,O,R,F,Carry1,Carry2;
		 int found=0;
		 ArrayList<int[]> list = new ArrayList<int[]>();
		 int k=0;
		 list=printAllRecursive(digit.length, digit,' ',rows,v,list);
		 for(int i=0;i<list.size();i++) {
			 use=list.get(i);
			 T=use[0];
			 O=use[1];
			 F=use[2];
			 R=use[3];
			 int digit1=O+O;
			 if(digit1>5) {
				 digit1=digit1-6;
				 Carry1=1;
			 }
			 else Carry1=0;
			 if(digit1==R) {
				if(Carry1+T+T==O) {
					 int digit2=Carry1+T+T;
					 if(digit2>5) {
						 digit2=digit2-6;
						 Carry2=1;
					 }
					 else Carry2=0;
					if(Carry2==F) {
						i=list.size();
						System.out.print(" ");
						System.out.println(" Τ Ο   ("+T+" "+O+")");
						System.out.print("+ ");
						System.out.println("Τ Ο   ("+T+" "+O+")");
						System.out.println("______________");
						System.out.println("F O R ("+F+" "+digit2+" "+digit1+")");
						found=1;
					}
				}		
			 }
		}
		 if (found!=1) {
			System.out.print("No solution for cryptarithmetic TO+TO=FOR. ");
		 }
		 found=0;
			System.out.println(" ");
	///////***********TOO+TOO=FOR***************///////////////	 
	 for(int i=0;i<list.size();i++) {
			 use=list.get(i);
			 T=use[0];
			 O=use[1];
			 F=use[2];
			 R=use[3];
			 int Carry3;
			 int digit1=O+O;
			 if(digit1>5) {
				 digit1=digit1-6;
				 Carry1=1;
			 }
			 else Carry1=0;
			 if(digit1==R) {//ο+ο=r
				
					 int digit2=Carry1+O+O;
					 if(digit2>5) {
						 digit2=digit2-6;
						 Carry2=1;
					 }
					 else Carry2=0;
					 if(digit2==O) {
					if(Carry2+T+T==F) {
						int digit3=Carry2+T+T;
						if(digit3>5) {
							 digit3=digit3-6;
							 Carry3=1;
						 }
						 else Carry3=0;
						if ((Carry3!=T)&&(Carry3!=O)&&(Carry3!=R)&&(Carry3!=F)) {
						i=list.size();
						System.out.print(" ");
						System.out.println(" Τ Ο Ο  ("+T+" "+O+" "+O+ ")");
						System.out.print("+ ");
						System.out.println("Τ Ο Ο  ("+T+" "+O+" "+O+ ")");
						System.out.println("______________");
						System.out.println("  F O R  ("+F+" "+O+" "+R+")");
						found=1;
						}
					}
				}		
			 }
		}
	 if (found!=1) {
		System.out.println("No solution for cryptarithmetic TOO+TOO=FOR. ");
	 }
	 found=0;
		System.out.println(" ");
	 //*************WON+WON=TOO*******//
		 int[] digit_= {0,1,2,3,4,5,6,7,8,9};
		 int[] v_ =new int[digit_.length];
		 int[] use_ =new int[digit_.length];
		 int W,N;
		 list=printAllRecursive(digit_.length, digit_,' ',rows,v_,list);
		 for(int i=0;i<list.size();i++) {
			 use_=list.get(i);
			 W=use_[0];
			 O=use_[1];
			 N=use_[2];
			 T=use_[3];
			 int digit1=N+N;
			 if(digit1>9) {
				 digit1=digit1-10;
				 Carry1=1;
			 }
			 else Carry1=0;
			 if(digit1==O) {//n+n=o
				if(Carry1+O+O==O) {
					 int digit2=Carry1+O+O;
					 if(digit2>9) {
						 digit2=digit2-10;
						 Carry2=1;
					 }
					 else Carry2=0;
					if(Carry2+W+W==T) {
						i=list.size();
						System.out.print(" ");
						System.out.println(" W Ο N  ("+W+" "+O+" "+N+")");
						System.out.print("+ ");
						System.out.println("W Ο N  (\"+W+\" \"+O+\" \"+N+\")");
						System.out.println("______________");
						System.out.println("T O O ("+T+" "+O+" "+O+")");
						found=1;
					}
				}		
			 }
		}
		 if (found!=1) {
			System.out.print("No solution for cryptarithmetic WON+WON=TOO. ");
		 }
			 
		 
	}
		
		 
		 
	/**
	 * using this method to print all the permutations
	 * @param n -> base of numbers
	 * @param elements -> current array of one of the list of permutations
	 * @param delimiter -> gap
	 * @param rows -> keep track of the current row
	 * @param v -> after swapping the elements the current array
	 * @param list -> the list of permutations
	 * @return list
	 * @see <a href="https://www.baeldung.com/java-array-permutations">https://www.baeldung.com/java-array-permutations</a>
	 */
		public static ArrayList<int[]> printAllRecursive(int n, int[] elements, char delimiter, int rows,int[] v,ArrayList<int[]> list) {

				    if(n == 1) {
				        printArray(elements,rows,v,list);
				    } else {
				        for(int i = 0; i < n-1; i++) {
				            printAllRecursive(n - 1, elements, delimiter,rows,v,list);
				            if(n % 2 == 0) {
				                swap(elements, i, n-1);
				            } else {
				                swap(elements, 0, n-1);
				            }
				        }
				        printAllRecursive(n - 1, elements, delimiter,rows,v,list);
				    }
					return list;		    
				}

		/**
		 * function for swapping the elements in order to get all the existing permutations
		 * @param input
		 * @param a
		 * @param b
		 * @see <a href="https://www.baeldung.com/java-array-permutations">https://www.baeldung.com/java-array-permutations</a>
		 */
				private static void swap(int[] input, int a, int b) {
				    int tmp = input[a] ;
				    input[a] = input[b];
				    input[b] = tmp;
				}
				
				/**
				 * printing each array and saved it in the list
				 * @param input
				 * @param rows
				 * @param v
				 * @param list
				 * @see <a href="https://www.baeldung.com/java-array-permutations">https://www.baeldung.com/java-array-permutations</a>
				 */
				private static void printArray(int[] input,int rows,int[]v,ArrayList<int[]> list ) {
					 int[] array =new int[input.length];
					for(int i = 0; i < input.length; i++) {
				        v[i]=input[i];
				        array[i]=input[i];
				    }
				    if (rows==0)
				    	list.add(array);
				    else {
				    rows++;
			        list.add(rows, array);
				    }
		 }

	}


