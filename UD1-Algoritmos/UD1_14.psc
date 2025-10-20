Algoritmo UD1_14
	MOSTRAR "Escriba un número de dos cifras"
	LEER num
	d<- trunc(num/10)
	num2<- num%10
	inv<- (num2*10)+d
	MOSTRAR "El número invertido es: ", inv
FinAlgoritmo
