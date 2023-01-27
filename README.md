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
## cuarto ejercio 8:00 22/01/2023

en este problema creanos una contraseño donde tienes tres intentos para dar la correcta sino la tienes en tus tres intentos se acaba el programa

```java
//aqui creare un programa que pida una contaseña y tienes tres intentos

        Scanner input = new Scanner(System.in);
        final String Contrasena = "12345";

        for(int i = 1; i <= 3;i++){
            
            System.out.println("por favor cual es su contraseña");
            String Password = input.nextLine();

            if(Password.equals(Contrasena)){
                // eguals es metodo si ve si otro objeto es igual al otro
                System.out.println("Enhorabuena");
                break;
            }if (i == 3) {
                System.out.println("usted no se sabe su contraseña");   
            } 
            else{
                System.out.println("tiene otro intento, este es su intento numero "+i);
            }
        }
```
___

### ahora pero con while 
```java
 //ahora con while 

        int a = 1;
        boolean master = true;
        System.out.println("por favor coloque otra vez la contraseña");

        while(master){
            String Password = input.nextLine();

            if(Password.equals(Contrasena)){
                // eguals es metodo si ve si otro objeto es igual al otro
                System.out.println("Enhorabuena");
                break;
            }if (a == 3) {
                System.out.println("usted no se sabe su contraseña");   
            } 
            else{
                System.out.println("tiene otro intento, este es su intento numero "+a);
            }
            a++;
        }
```

# Nueva informacion

> el metodo equals ve si un objeto es igual a otro objeto.