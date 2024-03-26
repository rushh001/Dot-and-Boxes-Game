import java.util.*;
public class game {
  static  String grid[][]={{"a1","  ","a2","  ","a3","  ","a4","  ","a5","  ","a6","  ","a7"},
    {"  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  "},
    {"b1","  ","b2","  ","b3","  ","b4","  ","b5","  ","b6","  ","b7"},
    {"  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  "},
    {"c1","  ","c2","  ","c3","  ","c4","  ","c5","  ","c6","  ","c7"},
    {"  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  "},
    {"d1","  ","d2","  ","d3","  ","d4","  ","d5","  ","d6","  ","d7"},
    {"  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  ","  "},
    {"e1","  ","e2","  ","e3","  ","e4","  ","e5","  ","e6","  ","e7"}};
   static String name1="",name2="";
        int intro()
        {int p; 
         game ob=new game();
        Scanner sc=new Scanner(System.in);
        //String name1="",name2="";
        System.out.println("Enter the name of Player 1 (Symbol is O):");
        name1=sc.next();
        System.out.println("Enter the name of Player 2 (Symbol is X):");
        name2=sc.next();
       System.out.println();
        System.out.println("Welcome "+name1+" and "+name2+" to this game");
        System.out.println("Lets toss!");
        ob.delay();
       if((int)(Math.random()*10)%2==0)
        {System.out.println(name1+" has won the toss!");
        p=1;}
        else 
       {System.out.println(name2+" has won the toss!");
       p=2;}
       System.out.println();
       System.out.println("Lets Play!");
       System.out.println();
       return p;
        }
    void grid()
    { int i,j;
       for(i=0;i<9;i++)
         {for(j=0;j<13;j++)
         System.out.print(grid[i][j]);
         System.out.println();
         }
    }
    void delay()
    {   long i;
        System.out.print("Please wait...");
        for(i=0;i<999999999;i++)
        {}
        for(i=0;i<999999999;i++)
        {}
        for(i=0;i<999999999;i++)
        {}
        System.out.print("..");
        for(i=0;i<999999999;i++)
        {}
        for(i=0;i<999999999;i++)
        {}
        for(i=0;i<999999999;i++)
        {}
        System.out.print("..");
        for(i=0;i<99999999;i++)
        {}
        for(i=0;i<99999999;i++)
        {}
        for(i=0;i<999999999;i++)
        {}
        System.out.print("..done!");
        System.out.println();
        
    }
   
    void play(int p1)
    {int i,n=24;
        String choice1="",choice2="";
        Scanner sc=new Scanner(System.in);
        game ob1=new game();
        for(i=1;i<=n;i++)
        { //System.out.println(p1);
         if(p1==1)
          System.out.println(name1+":::");
          else
          System.out.println(name2+":::");
          System.out.println("Enter the first point: ");
          choice1=sc.next();
          System.out.println("Enter the second point: ");
          choice2=sc.next();
          //System.out.println("1");
       
           // System.out.println(p1);
        int j,ai=0,aj=0,bi=0,bj=0,c=0,repeat=0;
        for(i=0;i<9;i++)
          {for(j=0;j<13;j++)
          {
            if(grid[i][j].equals(choice1))
                {ai=i;aj=j;c++;break;}
            else
            {ai=-1;aj=-1;}
          }
          if(c==1)
          break;
        }
        
              //System.out.println("2");
        c=0;
        for(i=0;i<9;i++)
        {for(j=0;j<13;j++)
        {
          if(grid[i][j].equals(choice2))
              {bi=i;bj=j;c++;break;}
          else 
          {bi=-1;bj=-1;}
        }
        if(c==1)
        break;
      }
      if(ai==-1||aj==-1||bi==-1||bj==-1)
      repeat++;
      
        // System.out.println(ai+" "+aj+" "+bi+" "+bj);
    // System.out.println("3");
      if(ai==bi&&(ai!=-1||aj!=-1||bi!=-1||bj!=-1))
     { //System.out.println("3a");  
      if(grid[ai][aj+1].equals("  ")&&(aj<bj))
        {grid[ai][aj+1]="--";} //System.out.println("3a1");}
       else if(grid[ai][aj-1].equals("  ")&&(aj>bj))
        {grid[ai][aj-1]="--";} //System.out.println("3a2");}
        else
        repeat++;
     }
    
     //System.out.println("4");
     if(aj==bj&&(ai!=-1||aj!=-1||bi!=-1||bj!=-1))
     {  if(grid[ai+1][aj].equals("  ")&&(ai<bi))
        grid[ai+1][aj]="| ";
        else if(grid[ai-1][aj].equals("  ")&&(ai>bi))
        grid[ai-1][aj]="| ";
        else
        repeat++;
     }
     
    //  System.out.println("5");
    //  System.out.println(p1);
int inc=0;
if(ai!=-1&&aj!=-1)
{
     if(ai!=8&&aj!=12)
     { //System.out.println("6");
        if(grid[ai][aj+1].equals("--")&&grid[ai+1][aj].equals("| ")&&grid[ai+2][aj+1].equals("--")&&grid[ai+1][aj+2].equals("| ")&&grid[ai+1][aj+1].equals("  "))
     {inc++; 
       // System.out.println("6a");
        if(p1==1)
       grid[ai+1][aj+1]="O ";
      else
      grid[ai+1][aj+1]="X ";
     }}
     if(ai!=8&&aj!=0 )
     {//System.out.println("6b");
        if(grid[ai][aj-1].equals("--")&&grid[ai+1][aj].equals("| ")&&grid[ai+2][aj-1].equals("--")&&grid[ai+1][aj-2].equals("| ")&&grid[ai+1][aj-1].equals("  "))
     {inc++;//System.out.println("6c");
        if(p1==1)
        grid[ai+1][aj-1]="O ";
      else
      grid[ai+1][aj-1]="X ";
     }}
     if(ai!=0&&aj!=12)
     {//System.out.println("6d");
        if(grid[ai][aj+1].equals("--")&&grid[ai-1][aj].equals("| ")&&grid[ai-2][aj+1].equals("--")&&grid[ai-1][aj+2].equals("| ")&&grid[ai-1][aj+1].equals("  "))
     {inc++;
        if(p1==1)
        {grid[ai-1][aj+1]="O ";}//System.out.println("6d1");}
      else
      {grid[ai-1][aj+1]="X ";}//System.out.println("6d2");}
     }}
     if(ai!=0&&aj!=0)
     {//System.out.println("6e");
        if(grid[ai][aj-1].equals("--")&&grid[ai-1][aj].equals("| ")&&grid[ai-2][aj-1].equals("--")&&grid[ai-1][aj-2].equals("| ")&&grid[ai-1][aj-1].equals("  "))
     {inc++;//System.out.println("6e1");
        if(p1==1)
        grid[ai-1][aj-1]="O ";
      else
      grid[ai-1][aj-1]="X ";
     }}
   }
     //System.out.println(repeat);
      if(p1==1 && inc==0)
       {p1=p1+1;}//System.out.println(p1);}
      else if(p1==2 && inc==0)
        {p1=p1-1;}//System.out.println(p1);}
        else
        inc=0;
              //System.out.println(p1);
          //System.out.println("7");
          if(repeat!=0)
          {//System.out.println("7a1");
              n=n+1;
              System.out.println("Enter valid points ");
              continue;
          }//System.out.println("7a");
          ob1.grid();
        }
    }

 void win()
 {
  int i,j,c1=0,c2=0;
  for(i=1;i<9;i+=2)
         {for(j=1;j<13;j+=2)
         if(grid[i][j].equals("O"))
         c1=c1+1;
         if(grid[i][j].equals("X"))
         c2=c2+1;
         }

      if(c1>c2)
      System.out.println(name1+" won the match!");
      else if(c2>c1)
      System.out.println(name2+" won the match!");
      else 
      System.out.println("Match Drawn!");

 }
    public static void main(String aid[])
    {  game ob=new game();
       int j= ob.intro();
      ob.grid();
       ob.play(j);
       ob.win();
    }
}

    

