/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema15;
import java.util.*;
/**
 *
 * @author Enano
 */
public class PP2Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
      // Variables
      int[][] Table;
      // Resolución
      Table=createTable();
      printTable(Table,sumColumns(Table),sumRows(Table));
    }
    public static int[][] createTable() //Se crea la tabla
    {
        int[][]Table=new int[10][10];
        Random rand = new Random();
        for(int i=0;i<=Table.length-1;i++)
        {
            for(int j=0;j<=Table.length-1;j++)
            {
                Table[i][j]=rand.nextInt(9); //Se genera un numero al azar entre el 0-9. (Se puede cambiar)
            }                                //Lo hice tan bajo para conservar la estetica
        }
        return Table;
    }
    public static int[] sumRows(int[][] Table)
    {
        int i=0, j=0;int[]sumOfRows=new int [Table.length];
        do
        {
            if(i==Table.length-1)//Si es la última fila, se mueve a la siguiente.
            {
                j++;
                i=0;             //Se reinicia el contador de la fila
            }
            else
            {
                sumOfRows[j]=sumOfRows[j]+Table[i][j]; //Se suma la fila.
                i++;
            }
        }
        while(j<Table.length-1);
        return sumOfRows;
    }
    public static int[] sumColumns(int[][]Table)
    {
        int i=0, j=0;int[]sumOfCol=new int [Table.length];
        do
        {
            if(i==Table.length-1)//Si es la última columna, se mueve a la siguiente
            {
                j++;
                i=0;    //Se reinicia el contador
            }
            else
            {
                sumOfCol[j]=sumOfCol[j]+Table[i][j]; //Se suma la columna
                i++;
            }
        }
        while(j<=Table.length-1);
        return sumOfCol;
    }
    public static void printTable (int[][]Table, int[] sumColumns, int[]sumRows) //Se imprime la tabla
    {
        int i,j;
        System.out.println("Generando números al azar: ");
        for(i=0;i<=Table.length-1;i++)
        {
            for(j=0;j<=Table.length-1;j++)
            {
                if(j==Table.length-1)   //Si es la penúltima fila
                {
                    System.out.print("["+Table[i][j]+"] ");     //Se imprime la decima tabla
                    System.out.print("{"+sumColumns[i]+"} ");   //Se imprime la suma
                }
                else
                {
                    System.out.print("["+Table[i][j]+"] "); //Se imprime el valor del azar
                }
            }            
            System.out.println("");
        }
        for(i=0;i<(Table.length);++i)
        {
            System.out.print("{"+sumRows[i]+"}");   //En la ultima fila, se imprimen las sumas de las columnas
        }
        System.out.println("");
    }
}
