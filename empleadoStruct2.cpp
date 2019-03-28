#include<stdio.h>
#include <stdlib.h>


struct Empleado {
   char nombre[100];
   unsigned int  edad;
   char numeroDeEmpleado[10];
   char numeroDeSeguro[14];
};  
	int main(){
		struct Empleado empleados[1];
		
	printf("Ingrese el nombre: ");
	scanf("%99[^\n]",empleados[0].nombre);
	printf("Ingrese la edad: ");
	scanf( "%d",&empleados[0].edad);
	printf("Ingrese el numero de empleado: ");
	scanf( "%s",empleados[0].numeroDeEmpleado);
	printf("Ingrese el numero de seguro: ");
	scanf( "%s",empleados[0].numeroDeSeguro);
	printf("%s %d %s %s\n",empleados[0].nombre,empleados[0].edad,empleados[0].numeroDeEmpleado,empleados[0].numeroDeSeguro);
		
	FILE*filepointer;
	filepointer=fopen("empleados.txt","w");
	fprintf(filepointer,"%s %d %s %s\n",empleados[0].nombre,empleados[0].edad,empleados[0].numeroDeEmpleado,empleados[0].numeroDeSeguro);
	fclose(filepointer);
		
	}
