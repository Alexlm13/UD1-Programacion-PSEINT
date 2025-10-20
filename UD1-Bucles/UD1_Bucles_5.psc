Algoritmo UD1_Bucles_5
	mostrar "Escriba un rango de números, vamos a sacar los números pares de dicho rango"
	leer n1
	leer n2
	
	Si n1>n2 Entonces
		tmp<-n1
		n1<-n2
		n2<-tmp
	FinSi
	
	mostrar "El rango será de ", n1," hasta ", n2
	
	para i<-n1 hasta n2 con paso 1 Hacer
		si i mod 2 = 0
			Mostrar i
		FinSi
	FinPara
FinAlgoritmo
