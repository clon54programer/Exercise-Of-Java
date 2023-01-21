# aqui voy a resolver problemas que encunetre en internet

## 20/01/2023 primer dia de practica

## primer problema es como hacer que muestre los numero del 1 al al 100(con un bucle while)

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
