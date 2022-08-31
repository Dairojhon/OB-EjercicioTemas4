import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int numeroIf = rnd.nextInt();
        int numeroWhile=0;
        String estaciones[]= {"Verano", "Otoño", "Invierno", "Primavera", "Sin estación"};


        //Estructura If
        if(numeroIf>0)
        {
            System.out.println("El número ingresado es positivo "+numeroIf);
        }
        else if (numeroIf<0)
        {
            System.out.println("El número ingresado es negativo "+numeroIf);
        }
        else
        {
            System.out.println("El número ingresado es cero (0)");
        }
        System.out.println("-----------------------------------------------------------");

        //Estructura While
        while (numeroWhile<3)
        {
            System.out.println("El numero de la estructura While a mostrar es "+numeroWhile);
            numeroWhile=numeroWhile+1;
        }
        System.out.println("-----------------------------------------------------------");

        //Estructura DoWhile
        do
        {
            System.out.println("El numero de la estructura Do While a mostrar es "+numeroWhile);
        }
        while (numeroWhile<3);
        System.out.println("-----------------------------------------------------------");

        //Estructura For
        for(int numeroFor=0;numeroFor<3;numeroFor++)
        {
            System.out.println("El numero de la estructura For a mostrar es "+numeroFor);
        }

        System.out.println("-----------------------------------------------------------");
        //Estructura Switch
        switch (estaciones[rnd.nextInt(estaciones.length)])
        {
            case "Verano":
                System.out.println("La estación actual es Verano");
                break;
            case "Invierno":
                System.out.println("La estación actual es Invierno");
                break;
            case "Otoño":
                System.out.println("La estación actual es Otoño");
                break;
            case "Primavera":
                System.out.println("La estación actual es Primavera");
                break;
            default:
                System.out.println("No se ha ingresado una estación correctamente");

        }



    }
}