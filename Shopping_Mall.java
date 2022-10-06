import java.util.*;

class Shopping_Mall
{ 
    public void main()
    {   int bill = 0;double t=0.0;
        Scanner S = new Scanner(System.in);
        System.out.println("*******WELCOME*******");
        System.out.println("Enter your name");
        String n = S.nextLine();
        System.out.println("*****SECTIONS OF THE MALL*****");
        System.out.println("1.CLOTHING CENTER");
        System.out.println("2.PROVISIONS CENTER");
        System.out.println("3.FARMERS MARKET");
        System.out.println("4.UTILITIES CENTER");
        System.out.println("5.HARDWARE CENTER");
        System.out.println("6.FURNITURE CENTER");
        System.out.println("7.KIDS CENTER");
        System.out.println("Please enter the section number 1 to start");
        int c = S.nextInt();
        switch(c){
            case 1: 
                { System.out.println("*******WELCOME TO CLOTHING CENTER*******");
                  System.out.println("*******TYPES OF CLOTHING*******");
                  System.out.println("1.Kids Garments");
                  System.out.println("2.Womens Wear");
                  System.out.println("3.Mens Wear");
                  System.out.println("Please enter your choice(1-3),0 if no choice at this section");
                  int g = S.nextInt();
                  switch(g)
                  {
                      case 1:{
                          System.out.println("*******KIDS SECTION*******");
                          System.out.println("1.Velvet Jump Suit - Rs 99/one");
                          System.out.println("2.Tye and Dye T-Shirts- Rs199/one");
                          System.out.println("3.Deep Blue Soft Jeans- Rs 249/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=99;
                          else if(k==2)
                            bill+=199;
                          else 
                            bill+=249;
                        break;
                        }
                       case 2:{
                          System.out.println("*******WOMENS SECTION*******");
                          System.out.println("1.Western Wear - Rs 199/one");
                          System.out.println("2.Ethnic Wear- Rs 299/one");
                          System.out.println("3.Traditional Suits- Rs 999/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=199;
                          else if(k==2)
                            bill+=299;
                          else 
                            bill+=999;
                          break;
                        } 
                        case 3:{
                          System.out.println("*******MENS SECTION*******");
                          System.out.println("1.Western Wear - Rs 199/one");
                          System.out.println("2.Ethnic Wear- Rs399/one");
                          System.out.println("3.Traditional Suits - Rs 899/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=199;
                          else if(k==2)
                            bill+=399;
                          else 
                            bill+=899;
                          break;
                        }
                        default:{
                          System.out.println("Invalid Choice");
                          
                        break;}}}
                    
                case 2: 
                { System.out.println("*******WELCOME TO PROVISIONS CENTER*******");
                  System.out.println("*******TYPES OF PROVISIONS*******");
                  System.out.println("1.Personal Hygene");
                  System.out.println("2.Sanitation");
                  System.out.println("3.Others");
                  System.out.println("Please enter your choice(1-3) 0 if no choice at this section");
                  int g = S.nextInt();
                  switch(g)
                  {
                      case 1:{
                          System.out.println("*******Personal Hygene*******");
                          System.out.println("1.Bathing Soap - Rs 40/one");
                          System.out.println("2.Shampoo- Rs99/per bottle");
                          System.out.println("3.Hand Wash- Rs 99/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=40;
                          else if(k==2)
                            bill+=199;
                          else 
                            bill+=249;
                        break;
                        }
                       case 2:{
                          System.out.println("*******Sanitation*******");
                          System.out.println("1.All purpose Cleaning Liquid - Rs 199/one");
                          System.out.println("2.Detergent- Rs 299/one");
                          System.out.println("3.Room freshner- Rs 299/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=199;
                          else if(k==2)
                            bill+=299;
                          else 
                            bill+=299;
                          break;
                        } 
                        case 3:{
                          System.out.println("*******Others*******");
                          System.out.println("1.Perfumes - Rs 399/one");
                          System.out.println("2.Hair oil - Rs 99/one");
                          System.out.println("3.Stationey kit - Rs 199/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=399;
                          else if(k==2)
                            bill+=99;
                          else 
                            bill+=199;
                          break;
                        }
                        default:{
                          System.out.println("Invalid Choice");
                          
                        break;}
                    }     
                              
                          
                      }
                      case 3: 
                { System.out.println("*******WELCOME TO FARMERS MARKET*******");
                  
                  System.out.println("1.Cereals");
                  System.out.println("2.Vegetables");
                  System.out.println("3.Fruits");
                  System.out.println("Please enter your choice(1-3) 0 if no choice at this section");
                  int g = S.nextInt();
                  switch(g)
                  {
                      case 1:{
                          System.out.println("*******Cereals*******");
                          System.out.println("1.Rice - Rs 99/kg");
                          System.out.println("2.Wheat- Rs79/kg");
                          System.out.println("3.Millets - Rs 199/kg");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=99;
                          else if(k==2)
                            bill+=79;
                          else 
                            bill+=199;
                        break;
                        }
                       case 2:{
                          System.out.println("*******Vegetables*******");
                          System.out.println("1.Tomatoes - Rs 40/kg");
                          System.out.println("2.Onions- Rs 20/kg");
                          System.out.println("3.Egg plant- Rs 35/kg");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=40;
                          else if(k==2)
                            bill+=20;
                          else 
                            bill+=35;
                          break;
                        } 
                        case 3:{
                          System.out.println("*******Fruits*******");
                          System.out.println("1.Apples - Rs 250/kg");
                          System.out.println("2.Bananas- Rs70/dozen");
                          System.out.println("3.Oranges - Rs100 /kg");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=250;
                          else if(k==2)
                            bill+=70;
                          else 
                            bill+=100;
                          break;
                        }
                        default:{
                          System.out.println("Invalid Choice");
                          
                        break;}
                    }
                  }
                  case 4: 
                { System.out.println("*******WELCOME TO UTILITIES CENTER*******");
                  System.out.println("*******TYPES OF UTILITIES*******");
                  System.out.println("1.General Accesories");
                  System.out.println("2.Outfit accessories");
                  System.out.println("3.Kitchen accessories");
                  System.out.println("Please enter your choice(1-3) 0 if no choice at this section");
                  int g = S.nextInt();
                  switch(g)
                  {
                      case 1:{
                          System.out.println("*******General Accesories*******");
                          System.out.println("1.Bucket and Mug Set - Rs 99/one");
                          System.out.println("2.Book Shelf- Rs499/one");
                          System.out.println("3.Bed Sets- Rs 249/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=99;
                          else if(k==2)
                            bill+=499;
                          else 
                            bill+=249;
                        break;
                        }
                       case 2:{
                          System.out.println("*******Outfit Accesories*******");
                          System.out.println("1.FlipFlops - Rs 199/one");
                          System.out.println("2.Short Caps- Rs 99/one");
                          System.out.println("3.Umbrella- Rs 299/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=199;
                          else if(k==2)
                            bill+=99;
                          else 
                            bill+=299;
                          break;
                        } 
                        case 3:{
                          System.out.println("*******Kitchen Utilities*******");
                          System.out.println("1.Frying Pan - Rs 499/one");
                          System.out.println("2.Cutlery- Rs999/one");
                          System.out.println("3.Tea Set - Rs 899/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=499;
                          else if(k==2)
                            bill+=999;
                          else 
                            bill+=899;
                          break;
                        }
                        default:{
                          System.out.println("Invalid Choice");
                          
                        break;}
                    }
                }
                case 5: 
                { System.out.println("*******WELCOME TO HARDWARE CENTER *******");
                  System.out.println("*******TYPES OF HARDWARE*******");
                  System.out.println("1.Laptops");
                  System.out.println("2.Smartphone");
                  System.out.println("3.Utilities");
                  System.out.println("Please enter your choice(1-3) 0 if no choice at this section");
                  int g = S.nextInt();
                  switch(g)
                  {
                      case 1:{
                          System.out.println("*******Laptops*******");
                          System.out.println("1.HP Pavillion - Rs 80000/one");
                          System.out.println("2.Dell- Rs 75000/one");
                          System.out.println("3.Macbook- Rs 250000/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=80000;
                          else if(k==2)
                            bill+=75000;
                          else 
                            bill+=250000;
                        break;
                        }
                       case 2:{
                          System.out.println("*******Smartphone*******");
                          System.out.println("1.Samsung Galaxy - Rs 30000/one");
                          System.out.println("2.Oneplus- Rs 35000/one");
                          System.out.println("3.IPhone 14- Rs 100000/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=30000;
                          else if(k==2)
                            bill+=35000;
                          else 
                            bill+=100000;
                          break;
                        } 
                        case 3:{
                          System.out.println("*******Utilities*******");
                          System.out.println("1.Laptop Charger - Rs 999/one");
                          System.out.println("2.Mobile Charger- Rs 399/one");
                          System.out.println("3.Earpods - Rs 899/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=999;
                          else if(k==2)
                            bill+=399;
                          else 
                            bill+=899;
                          break;
                        }
                        default:{
                          System.out.println("Invalid Choice");
                          
                        break;}
                    }
    } 
    case 6: 
                { System.out.println("*******WELCOME TO FURNITURE CENTER*******");
                  System.out.println("*******TYPES*******");
                  System.out.println("1.Sofa");
                  System.out.println("2.Tables");
                  System.out.println("3.Shelves");
                  System.out.println("Please enter your choice(1-3) 0 if no choice at this section");
                  int g = S.nextInt();
                  switch(g)
                  {
                      case 1:{
                          System.out.println("*******Sofa*******");
                          System.out.println("1.L-shaped Sofa - Rs 50000/one");
                          System.out.println("2.U-Shaped Sofa- Rs75000/one");
                          System.out.println("3.Recliner- Rs 10000/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=50000;
                          else if(k==2)
                            bill+=75000;
                          else 
                            bill+=10000;
                        break;
                        }
                       case 2:{
                          System.out.println("*******Tables*******");
                          System.out.println("1.Dressing Table - Rs 4999/one");
                          System.out.println("2.Study table- Rs 2999/one");
                          System.out.println("3.Dining Table- Rs 15999/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=9499;
                          else if(k==2)
                            bill+=2999;
                          else 
                            bill+=15999;
                          break;
                        } 
                        case 3:{
                          System.out.println("*******Shelves*******");
                          System.out.println("1.Wardrobe - Rs 2999/one");
                          System.out.println("2.Cupboard- Rs3999/one");
                          System.out.println("3.Cutlery Shelf - Rs 1999/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=2999;
                          else if(k==2)
                            bill+=3999;
                          else 
                            bill+=1999;
                          break;
                        }
                        default:{
                          System.out.println("Invalid Choice");
                          
                        break;}
                    }} 
                    case 7: 
                { System.out.println("*******WELCOME TO KIDS CENTER*******");
                  
                  System.out.println("1.Kids Toys");
                  System.out.println("2.Sanitation");
                  System.out.println("3.Utilities");
                  System.out.println("Please enter your choice(1-3) 0 if no choice at this section");
                  int g = S.nextInt();
                  switch(g)
                  {
                      case 1:{
                          System.out.println("*******Kids Toys*******");
                          System.out.println("1.Soft Toys- Rs 99/one");
                          System.out.println("2.Costumes- Rs499/one");
                          System.out.println("3.Puzzle Sets- Rs 249/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=99;
                          else if(k==2)
                            bill+=499;
                          else 
                            bill+=249;
                        break;
                        }
                       case 2:{
                          System.out.println("*******Sanitation*******");
                          System.out.println("1.Baby soaps - Rs 59/one");
                          System.out.println("2.Baby Shampoo- Rs 299/one");
                          System.out.println("3.Mild disinfectant- Rs 199/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=59;
                          else if(k==2)
                            bill+=299;
                          else 
                            bill+=199;
                          break;
                        } 
                        case 3:{
                          System.out.println("*******Utilities*******");
                          System.out.println("1.NoteBooks - Rs 39/one");
                          System.out.println("2.Art kit- Rs99/one");
                          System.out.println("3.Cricket Kit - Rs 1999/one");
                          System.out.println("Please enter your choice(1-3)");
                          int k = S.nextInt();
                          if(k==1)
                           bill+=39;
                          else if(k==2)
                            bill+=99;
                          else 
                            bill+=1999;
                          break;
                        }
                        default:{
                          System.out.println("Invalid Choice");
                          
                        break;}
                    }
} 
default: 
    System.out.println("Invalid Choice");break;
}
System.out.println("Name of the customer: "+n);
if(bill>2000)
t = 0.9*bill;
else
 t=bill;
 System.out.println("Your total payment is " + t);
 System.out.println("******THANK YOU FOR SHOPPING WITH US******");
 
}}