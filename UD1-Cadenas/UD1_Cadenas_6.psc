Algoritmo UD1_Cadenas_6
	mostrar "Escriba una cadena de caracteres"
	leer cad
	cad2<-""
	largo<-Longitud(cad)-1
	
	Para i<-largo Hasta 0
		cad2<-Subcadena(cad,i,i)
		mostrar cad2
	Fin Para
FinAlgoritmo
