# aqui voy a resolver problemas que encunetre en internet
___
## 20/01/2023 primer dia de practica

## primer problema es como hacer que muestre los numero del 1 al al 100(con un bucle while)
___
### resolucion 
```java
int i = 1;
        boolean main = true;
        

        /**
         *  @param bucle es el encargado sde sumar su valor de  par cumplir la condicion 
         */
        while (main) {
            int bucle = 1;
            bucle = 1 + ++i;// aui esto para el valor se sume a bucle

            System.out.println(bucle);
            if(bucle == 100){
                System.out.println("termino el bucle de java");
                break;
            }
        }
```
### explicacion
aqui lo que hice es declarar dos varibles una que se encargara en sumarle en uno a la otra varible para que llegue a 100 y la otra es la encargada de llegar a cien 
___
## Tercer ejercio 7:21 22/01/2023

en este problema debes crear un bucle con Do While, donde ingrese un numero menor o igual a cero para poder romper el bucle.
```java
Scanner input = new Scanner(System.in);
        double number;
        
        System.out.println("intente romper este bucle");
        do {
            
            System.out.println("deme un numero por favor");
            number = input.nextInt();;

        } while (number >= 0);
        System.out.println("termino el bucle");
```