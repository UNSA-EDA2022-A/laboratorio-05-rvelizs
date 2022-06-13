package com.example.project;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            System.out.println(obj.esBalanceado(s));
        }
    }

    public boolean esBalanceado(String s) {
        MyStack<Character> stack = new LinkedListStack<>();
        
        // RECORRER LA CADENA
		for (int i = 0; i < s.length(); i++) {
			
			// AUXILIAR DE RECORRIDO
			char aux = s.charAt(i);
			
			// SOLO CARACTERES VÁLIDOS
			if (aux == '[' || aux == '(' || aux == '{') {
				stack.push(aux); // AÑADIR A LA PILA
			}
			
			// CUANDO ENCUENTRA CARACTER DE CIERRE
			else if (aux == ']') {
				
				// SI LA PILA ESTÁ VACÍA O EL VALOR QUE ELIMINA NO CORRESPONDE A SU APRETURA
				if (stack.isEmpty() || stack.pop() != '[') {
					return false;
				}
			}
			
			// CUANDO ENCUENTRA CARACTER DE CIERRE
			else if (aux == ')') {
				
				// SI LA PILA ESTÁ VACÍA O EL VALOR QUE ELIMINA NO CORRESPONDE A SU APRETURA
				if (stack.isEmpty() || stack.pop() != '(') {
					return false;
				}
			}
			
			// CUANDO ENCUENTRA CARACTER DE CIERRE
			else if (aux == '}') {
				
				// SI LA PILA ESTÁ VACÍA O EL VALOR QUE ELIMINA NO CORRESPONDE A SU APRETURA
				if (stack.isEmpty() || stack.pop() != '{') {
					return false;
				}
			}

		}
		
		// LUEGO DE VERIFICAR QUE TODAS LAS PAREJAS SE ELIMINARON
		return stack.isEmpty();
        
    }
}
