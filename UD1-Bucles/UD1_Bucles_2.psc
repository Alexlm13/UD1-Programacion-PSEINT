Algoritmo UD1_Bucles_2
	mostrar "Escriba n�meros para hacer la suma de todos y despu�s la media"
	suma<-0
	cont<-0
	
	Repetir
		mostrar "Escriba un n�mero a sumar"
		leer num
		suma<-suma+num
		cont<-cont+1
	Hasta Que num=0
	media<-suma/cont
	mostrar "La suma de los n�meros es: ", suma
	mostrar "La media es: ", media
FinAlgoritmo
