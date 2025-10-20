//Hacer algoritmo suma de numeros que se le pida por teclado hasta que introduzcamos como valor un 0
Algoritmo Ejercicio_Hasta_Suma
	suma<-0
	Repetir
		mostrar "Introduce números para sumar (para acabar el bucle usa 0)"
		leer n
		suma<-suma+n
	Hasta Que n=0
	Mostrar "La suma es: ", suma
FinAlgoritmo

