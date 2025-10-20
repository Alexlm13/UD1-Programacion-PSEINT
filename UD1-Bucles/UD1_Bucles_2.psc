Algoritmo UD1_Bucles_2
	mostrar "Escriba números para hacer la suma de todos y después la media"
	suma<-0
	cont<-0
	
	Repetir
		mostrar "Escriba un número a sumar"
		leer num
		suma<-suma+num
		cont<-cont+1
	Hasta Que num=0
	media<-suma/cont
	mostrar "La suma de los números es: ", suma
	mostrar "La media es: ", media
FinAlgoritmo
