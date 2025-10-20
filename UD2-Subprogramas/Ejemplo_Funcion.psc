Funcion mayorMenor(a,b,c)
	si a==b y b==c Entonces
		mostrar "Los números son iguales"
	SiNo
		si (a>=b y a>=c) Entonces
			mostrar a," es el número mayor"
		SiNo
			si (b>=a y b>=c) Entonces
				mostrar b," es el número mayor"
			SiNo
				mostrar c," es el número mayor"
			FinSi
		FinSi
		si (a<=b y a<=c) Entonces
			mostrar a," es el número menor"
		SiNo
			si (b<=a y b<=c) Entonces
				mostrar b," es el número menor"
			SiNo
				mostrar c," es el número menor"
			FinSi
		FinSi
	FinSi
FinFuncion

Algoritmo Ejemplo_Funcion
	//realizar un programa que pida al usuario 3 numeros enteros y escriba en pantalla el mayor de ellos y el menor usando funciones
	mostrar "Escriba 3 números para compararlos y sacar el mayor y el menor"
	
	mostrar "Número 1"
	leer n1
	mostrar "Número 2"
	leer n2
	mostrar "Número 3"
	leer n3
	
	mayorMenor(n1, n2, n3)
FinAlgoritmo
