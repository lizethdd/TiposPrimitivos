
package tiposprimitivos;

import java.util.Scanner;


public class TiposPrimitivos {
        static Scanner liz = new Scanner(System.in);
 
    public static void main(String[] args) {
        
        //practice();
          //programa();
          //tiposAritmeticos();
          //asignacion();
          //unarios();
          ejercicioArea();
    }
    
    public static void ejercicioArea(){
        var base=10;
        var altura=5;
        
        var area = base * altura;
        System.out.println("Perímetro: "+(base + altura)*(base + altura));
        
        var num1=0;
        var num2=0;
        System.out.print("Introduce el primer número: ");
        num1=liz.nextInt();
        System.out.print("Introduce el segundo número: "); 
        num2= liz.nextInt();
        System.out.println("");
        var mayor = (num1 > num2)?"El primer número es mayor" : "El segundo número es el mayor";
        System.out.println(mayor);
    }
    
    public static void unarios(){
        //cambio de signo
        var x=5;
        var y=-x;
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
        //negación
        boolean z= true;
        boolean w= !z;
        System.out.println("z = "+z);
        System.out.println("w = "+w);
        
        //Pre-incremento
        var a=7;
        System.out.println("a = "+a);
        var b= ++a;
        System.out.println("b = "+b);
        
        //Post-incremento 
        var c=5;                
        var d=c++;
        System.out.println("c = "+c);
        System.out.println("d= "+d);
        
        //Pre-incremento --
        var j=5;
        System.out.println("j = "+j);
        var k= --j;
        System.out.println("k = "+k);
        
        //Post-incremento --
        var l=10;                
        var m=l--;
        System.out.println("l = "+l);
        System.out.println("m= "+m);
        
        System.out.println("");
         var as = 7 - 8 * 6 / 5;
         System.out.println(as);
         
        var qw = --a - ++b;
         System.out.println(qw);
          
        
    }
    
    public static void asignacion(){
        int x = 3, y = 2;
        int c = x + 3 - y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        x += 1;
        int l=2/2;
        int k=2%2;
        System.out.println(l);
        System.out.println(k);
    }
    public static void tiposAritmeticos(){
         var num1=0;
        var num2=0;
        System.out.print("Introduce el primer número: ");
        num1=liz.nextInt();
        System.out.print("Introduce el segundo número: "); 
        num2= liz.nextInt();
        
        System.out.println("La suma es: "+(num1+num2));
        System.out.println("La resta es: "+(num1-num2));
        System.out.printf("La división es: %d",(num1/num2));
        System.out.println("\nLa multiplicació es: "+(num1*num2));
        
        if(num1 % 2==0){
            System.out.println("Es un número par.");
        }else{
            System.out.println("Es un número impar");            
        }
    }
    public static void programa(){
        String equipo;
        double presupuesto;
        int id;
        boolean champions;
        System.out.print("Indica el identificador del equipo: ");
        id=liz.nextInt();
        liz.nextLine();
        System.out.print("Nombre del equipo de fútbol: ");
        equipo=liz.nextLine();
        System.out.print("Presupuesto: ");
        presupuesto=liz.nextDouble();
        System.out.print("¿Tiene champions? ");
        champions=liz.nextBoolean();
        
        System.out.println(equipo+" #0000"+id);
        System.out.println("Presupuesto: "+presupuesto+" €");
        System.out.println("Champions: "+champions);
    }
    
    public static void practice(){
        byte numeroByte=5;
        //byte numeroByte= (byte)129;
        System.out.println(numeroByte);
        System.out.println("Valor mínimo del tipo byte: "+ Byte.MIN_VALUE);
        System.out.println("Valor máximo del tipo byte: "+Byte.MAX_VALUE);
        
        
        short numShort=30000;
        System.out.println(numShort);
        System.out.println("Valor mínimo del tipo short: "+ Short.MIN_VALUE);
        System.out.println("Valor máximo del tipo short: "+Short.MAX_VALUE);
        
        int numInt=30000;
        System.out.println(numInt);
        System.out.println("Valor mínimo del tipo int: "+ Integer.MIN_VALUE);
        System.out.println("Valor máximo del tipo int: "+Integer.MAX_VALUE);
        
        long numLong=30000;
        System.out.println(numLong);
        System.out.println("Valor mínimo del tipo long: "+ Long.MIN_VALUE);
        System.out.println("Valor máximo del tipo long: "+Long.MAX_VALUE);
        
        //TIPO FLOTANTES CON DECIMALES: FLOAT
        float numeroFloat = 10.0F;
        double numeroFloar2=10.0;
        System.out.println(numeroFloat);
        System.out.println("Valor mínimo del tipo float: "+ Float.MIN_VALUE);
        System.out.println("Valor máximo del tipo float: "+Float.MAX_VALUE);
        
        //TIPO DOUBLE
        double numeroDouble=10.0;
         double numeroDouble2=10;
        System.out.println(numeroDouble);
        System.out.println("Valor mínimo del tipo double: "+ Double.MIN_VALUE);
        System.out.println("Valor máximo del tipo double: "+Double.MAX_VALUE);
        
        //TIPO CHAR
        char caracter= 'b';
        System.out.println("Caracter = "+caracter);        
        char caracter2= '\u0021';
        System.out.println("Caracter2 = "+caracter2);
        char caracter3= 33;
        System.out.println("Caracter3 = "+caracter3);        
        char caracter4= '!';
        System.out.println("Caracter4 = "+caracter4);
        
        System.out.println("");
        System.out.println("");
        var caracter22= '\u0021';
        System.out.println("Caracter2 = "+caracter22);
        var caracter33= 33;
        System.out.println("Caracter3 = "+caracter33);        
        var caracter44= '!';
        System.out.println("Caracter4 = "+caracter44);
        
        
        System.out.println(Byte.parseByte("-128")+2);
        System.out.println(Short.parseShort("32"));
        System.out.println(Integer.parseInt("458")+2);
        System.out.println(Double.parseDouble("25.25")+.25);
        System.out.println( Float.parseFloat("50.10")+.25); 
        
        //EJERCICIO
        System.out.println("Ingresa un número: ");
        var num = liz.nextInt();
        var mult= num * 5;
        System.out.println(mult);   
        System.out.println(Integer.parseInt("55")*5);
        System.out.println("");
        
        //Convierte un Entero a String
        System.out.println("Posición de una carrera: "+String.valueOf(5));
        System.out.println("");
        
        System.out.println("LIZETH".charAt(2));
        System.out.println();
        
        liz.nextLine();
        System.out.println("Escribe una letra: ");
        var letra= liz.nextLine();
        System.out.println(letra.charAt(0));
  
    }
}
