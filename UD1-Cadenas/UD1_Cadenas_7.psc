Algoritmo UD1_Cadenas_7
	mostrar "Escriba una cadena"
	leer cad
	
	repetir
		mostrar "Escriba un caracter que quieras cambiar de la cadena anterior"
		leer car
	hasta que longitud(car)=1
	
	repetir
		mostrar "Escriba el caracter que te gustaria que apareciera"
		leer car2
	hasta que longitud(car2)=1
	
	resultado <- ""
	encontrado <- FALSO
	
	para i<-0 hasta Longitud(cad)-1
		car_actual <- Subcadena(cad, i, i)
		si car_actual = car Entonces
			resultado <- resultado + car2
			encontrado <- VERDADERO
		SiNo
			resultado <- resultado + car_actual
		FinSi
	FinPara
	
	si encontrado Entonces
		mostrar "Resultado final: ", resultado
	SiNo
		mostrar "El carácter seleccionado no existe dentro de la cadena."
	FinSi
FinAlgoritmo