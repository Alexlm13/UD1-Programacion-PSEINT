Funcion mayorMenor(a,b,c)
	si a==b y b==c Entonces
		mostrar "Los n�meros son iguales"
	SiNo
		si (a>=b y a>=c) Entonces
			mostrar a," es el n�mero mayor"
		SiNo
			si (b>=a y b>=c) Entonces
				mostrar b," es el n�mero mayor"
			SiNo
				mostrar c," es el n�mero mayor"
			FinSi
		FinSi
		si (a<=b y a<=c) Entonces
			mostrar a," es el n�mero menor"
		SiNo
			si (b<=a y b<=c) Entonces
				mostrar b," es el n�mero menor"
			SiNo
				mostrar c," es el n�mero menor"
			FinSi
		FinSi
	FinSi
FinFuncion

Algoritmo Ejemplo_Funcion
	//realizar un programa que pida al usuario 3 numeros enteros y escriba en pantalla el mayor de ellos y el menor usando funciones
	mostrar "Escriba 3 n�meros para compararlos y sacar el mayor y el menor"
	
	mostrar "N�mero 1"
	leer n1
	mostrar "N�mero 2"
	leer n2
	mostrar "N�mero 3"
	leer n3
	
	mayorMenor(n1, n2, n3)
FinAlgoritmo
