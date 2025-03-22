// Write a program to print all the ASCII values and their equivalent characters of 26 alphabets using a while loop

public class ascii {
    public static void main(String[] args) {
        int i = 65;
        
        while(i <= 90 ){
            char c = (char) i;
            System.out.printf("The charcter for ASCII value %d is = %c%n",i,c);
            i++;
        }
    }
    
}
/*
output =>
The charcter for ASCII value 65 is = A
The charcter for ASCII value 66 is = B
The charcter for ASCII value 67 is = C
The charcter for ASCII value 68 is = D
The charcter for ASCII value 69 is = E
The charcter for ASCII value 70 is = F
The charcter for ASCII value 71 is = G
The charcter for ASCII value 72 is = H
The charcter for ASCII value 73 is = I
The charcter for ASCII value 74 is = J
The charcter for ASCII value 75 is = K
The charcter for ASCII value 76 is = L
The charcter for ASCII value 77 is = M
The charcter for ASCII value 78 is = N
The charcter for ASCII value 79 is = O
The charcter for ASCII value 80 is = P
The charcter for ASCII value 81 is = Q
The charcter for ASCII value 82 is = R
The charcter for ASCII value 83 is = S
The charcter for ASCII value 84 is = T
The charcter for ASCII value 85 is = U
The charcter for ASCII value 86 is = V
The charcter for ASCII value 87 is = W
The charcter for ASCII value 88 is = X
The charcter for ASCII value 89 is = Y
The charcter for ASCII value 90 is = Z
 */
