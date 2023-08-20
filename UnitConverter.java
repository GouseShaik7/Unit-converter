import java.util.*;
import java.util.Scanner;


class UnitConverter {
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Select your conversion");
        System.out.println("1. Length \n 2. Area \n 3.Volume \n 4.weight \n 5.Temperature");
        int option=sc.nextInt();
        if(option<6) {
       
       
        switch(option) {
            
            case 1: System.out.println("Select your units");
                    System.out.println("1. mm, 2.cm,3.m,4.km,5.mile ,6.inch,7.ft,8.yard");
                   int length1=sc.nextInt();
                   if(length1<9) {
                    System.out.println("Select new units");
                    System.out.println("1. mm, 2.cm,3.m,4.km,5.mile,6.inch,7.ft,8.yard");
                    int length2=sc.nextInt();
                        if(length2<9) {
                    System.out.println("Enter your length");
                    double length=sc.nextInt();
                   
                   switch(length1) {
                                    
                         
                       case 1:System.out.println("Conversion from mm");
                       
                               switch(length2) {
                                case 1: System.out.println("mm to mm");
                                       System.out.println(length*1);
                                break;
                                case 2: System.out.println("mm to cm");
                                System.out.println(length/10);
                                break;
                                case 3:System.out.println("mm to m");
                                    System.out.println(length/1000);
                                break;
                                case 4:System.out.println("mm to km");
                                    System.out.println(length/1000000);
                                break;
                                case 5:System.out.println("mm to miles");
                                    System.out.println(length/1609344);
                                break;
                                 case 6:System.out.println("mm to inch");
                                    System.out.println(length/25.4);
                                break;
                                 case 7:System.out.println("mm to ft");
                                    System.out.println(length/304.8);
                                break;
                                 case 8:System.out.println("mm to yard");
                                    System.out.println(length/914.4);
                                break;
                                default:System.out.println("Invalid");
                            
                    }
                    break;
                    case 2:System.out.println("conversion from cm");
                               switch(length2) {
                                case 1: System.out.println("cm to mm"); 
                                        System.out.println(length*10);//mm
                                break;
                                case 2: System.out.println("cm to cm");
                                        System.out.println(length*1);//cm
                                break;
                                case 3: System.out.println("cm to m");
                                        System.out.println(length/100);//m
                                break;
                                case 4: System.out.println("cm to km");
                                        System.out.println(length/100000); //km
                                break;
                                case 5: System.out.println("cm to mile");//mile
                                        System.out.println(length/160934.4);
                                break;
                                 case 6:System.out.println("cm to inch");
                                    System.out.println(length/2.54);
                                break;
                                 case 7:System.out.println("cm to ft");
                                    System.out.println(length/30.48);
                                break;
                                 case 8:System.out.println("cm to yard");
                                    System.out.println(length/91.44);
                                break;
                                default:System.out.println("Invalid");
                            
                    }
                    break;
                    case 3:System.out.println("conversion from m");
                               switch(length2) {
                                case 1: System.out.println("m to mm");
                                        System.out.println(length*1000);//mm
                                break;
                                case 2: System.out.println("m to cm");
                                        System.out.println(length*100);//cm
                                break;
                                case 3: System.out.println("m to m");
                                        System.out.println(length*1);//m
                                break;
                                case 4: System.out.println("m to km");
                                        System.out.println(length/1000);//km
                                break;
                                case 5: System.out.println("m to mile");
                                        System.out.println(length*1609.34);//mile
                                break;
                                 case 6: System.out.println("m to inch");
                                         System.out.println(length*39.37);
                                break;
                                 case 7: System.out.println("m to ft");
                                         System.out.println(length*3.281);
                                break;
                                 case 8: System.out.println("m to yard");
                                         System.out.println(length*1.094);
                                break;
                                default:System.out.println("Invalid");
                            
                    }
                    break;
                    case 4:System.out.println("conversion from km");
                               switch(length2) {
                                case 1: System.out.println("km to mm");
                                        System.out.println(length*1000000);//mm
                                break;
                                case 2: System.out.println("km to cm");
                                        System.out.println(length*100000);//cm
                                break;
                                case 3: System.out.println("km to m");
                                        System.out.println(length*1000);//m
                                break;
                                case 4: System.out.println("km to km");
                                        System.out.println(length*1);//km
                                break;
                                case 5: System.out.println("km to mile");
                                        System.out.println(length/1.60934);//mile
                                break;
                                 case 6:System.out.println("km to inch");
                                    System.out.println(length*39370.1);
                                break;
                                 case 7:System.out.println("km to ft");
                                    System.out.println(length*3280.84);
                                break;
                                 case 8:System.out.println("km to yard");
                                    System.out.println(length*1093.61);
                                break;
                                default:System.out.println("Invalid");
                            
                    }
                    break;
                    case 5:System.out.println("conversion from miles");
                               switch(length2) {
                                case 1: System.out.println("miles to mm");
                                        System.out.println(length*1609.34*1000);//mm
                                break;
                                case 2: System.out.println("miles to m");
                                        System.out.println(length*1609.34*100);//cm
                                break;
                                case 3: System.out.println("miles to m");
                                        System.out.println(length*1609.34);//m
                                break;
                                case 4: System.out.println("miles to km");
                                        System.out.println(length/1.60934);//km
                                break;
                                case 5: System.out.println("miles to miles");
                                        System.out.println(length*1);//miles
                                break;
                                 case 6:System.out.println("miles to inch");
                                        System.out.println(length*63360);
                                        break;
                                 case 7:System.out.println("miles to ft");
                                        System.out.println(length*5280);
                                        break;
                                 case 8:System.out.println("miles to yard");
                                        System.out.println(length*1760);
                                        break;
                                default:System.out.println("Invalid");
                            
                    }
                    break;
                     case 6:System.out.println("conversion from inches");
                               switch(length2) {
                                case 1: System.out.println("inches to mm");
                                        System.out.println(length*25.4);//mm
                                break;
                                case 2: System.out.println("inches to cm");
                                        System.out.println(length*2.54);//cm
                                break;
                                case 3: System.out.println("inches to m");
                                        System.out.println(length*0.0254);//m
                                break;
                                case 4: System.out.println("inches to km");
                                        System.out.println(length*0.0000254);//km
                                break;
                                case 5: System.out.println("inches to miles");
                                        System.out.println(length*0.00001578283);//miles
                                break;
                                 case 6:System.out.println("inches to inch");
                                        System.out.println(length*1);
                                        break;
                                 case 7:System.out.println("inches to ft");
                                        System.out.println(length/12);
                                        break;
                                 case 8:System.out.println("inches to yard");
                                        System.out.println(length/36);
                                        break;
                                default:System.out.println("Invalid");
                            
                    }
                    break; 
                    case 7:System.out.println("conversion from ft");
                               switch(length2) {
                                case 1: System.out.println("ft to mm");
                                        System.out.println(length*304.8);//mm
                                break;
                                case 2: System.out.println("ft to cm");
                                        System.out.println(length*30.48);//cm
                                break;
                                case 3: System.out.println("ft to m");
                                        System.out.println(length*0.3048);//m
                                break;
                                case 4: System.out.println("ft to km");
                                        System.out.println(length*0.0003048);//km
                                break;
                                case 5: System.out.println("ft to miles");
                                        System.out.println(length*0.000189394);//miles
                                break;
                                 case 6:System.out.println("ft to inch");
                                        System.out.println(length*12);
                                break;
                                 case 7:System.out.println("ft to ft");
                                        System.out.println(length*1);
                                break;
                                 case 8:System.out.println("ft to yard");
                                        System.out.println(length*0.33333);
                                break;
                                default:System.out.println("Invalid");
                            
                    }
                    break;
                     case 8:System.out.println("conversion from yard");
                               switch(length2) {
                                case 1: System.out.println(length*914.4);//mm
                                break;
                                case 2: System.out.println(length*91.44);//cm
                                break;
                                case 3:System.out.println(length*0.9144);//m
                                break;
                                case 4:System.out.println(length*0.0009144);//km
                                break;
                                case 5:System.out.println(length*0.000568182);//miles
                                break;
                                 case 6:System.out.println("yard to inch");
                                    System.out.println(length*36);
                                    break;
                                 case 7:System.out.println("yard to ft");
                                    System.out.println(length*3);
                                    break;
                                 case 8:System.out.println("yard to yard");
                                    System.out.println(length*1);
                                    break;
                                default:System.out.println("Invalid");
                            
                    }
                    break;
                    
                   

                    default:System.out.println("Invalid");
                   
            }
                        }
                        
                   else 
                   System.out.println("Invalid");
                   }
                   else 
                   System.out.println("Invalid");
            break;
            case 2:System.out.println("Area conversion");
                   System.out.println("1. mm^2, 2.cm^2,3.m^2,4.km^2,5.inch^2,6.ft^2,7.yd^2,8.acre.9.Hectare");
                   int area1=sc.nextInt();
                    if(area1<10) {
                    System.out.println("select new units");
                    System.out.println("1. mm^2, 2.cm^2,3.m^2,4.km^2,5.inch^2,6.ft^2,7.yd^2,8.acre.9.Hectare");
                    int area2=sc.nextInt();
                        if(area2<10) {
                    System.out.println("Enter your area");
                     double area=sc.nextInt();


                    switch(area1) {
                         case 1:System.out.println("conversion from mm^2");
                         switch(area2) {
                            case 1:System.out.println(area*1+"mm^2");//mm^2
                                break;
                            case 2:System.out.println(area*0.01+"cm^2");//cm^2
                                break;
                            case 3:System.out.println(area*0.000001+"m^2");//m^2
                                break;
                            case 4:System.out.println(area*0.000000000001+"km^2");//km^2
                                break;
                            case 5:System.out.println(area*0.001550+"inch^2");//in^2
                                break;
                            case 6:System.out.println(area*0.0000107639 +"ft^2");//ft^2
                                break;
                            case 7:System.out.println(area*0.00000119599+"yd^2");//yd^2
                                break;
                            case 8:System.out.println(area*0.000000000000247105+"acre");//acre
                                break;
                            case 9:System.out.println(area*0.00000000000001 +"hectare");//hectare
                                break;
                            default:System.out.println("Invalid");
                         }
                         break;
                         case 2:System.out.println("conversion from cm^2");
                         switch(area2) {
                            case 1:System.out.println(area*100+"mm^2");//mm^2
                                break;
                            case 2:System.out.println(area*1+"cm^2");//cm^2
                                break;
                            case 3:System.out.println(area*0.0001+"m^2");//m^2
                                break;
                            case 4:System.out.println(area* 0.0000000001+"km^2");//km^2
                                break;
                            case 5:System.out.println(area*0.01550+"inch^2");//in^2
                                break;
                            case 6:System.out.println(area*0.00107639 +"ft^2");//ft^2
                                break;
                            case 7:System.out.println(area*0.000119599+"yd^2");//yd^2
                                break;
                            case 8:System.out.println(area*0.0000000247105+"acre");//acre
                                break;
                            case 9:System.out.println(area*0.0000000001 +"hectare");//hectare
                                break;
                            default:System.out.println("Invalid");
                         }
                         break;
                          case 3:System.out.println("conversion from m^2");
                         switch(area2) {
                            case 1:System.out.println(area*1000000 +"mm^2");//mm^2
                                break;
                            case 2:System.out.println(area*10000+"cm^2");//cm^2
                                break;
                            case 3:System.out.println(area*1+"m^2");//m^2
                                break;
                            case 4:System.out.println(area*0.000001+"km^2");//km^2
                                break;
                            case 5:System.out.println(area* 1550.0031+"inch^2");//in^2
                                break;
                            case 6:System.out.println(area*10.7639104+"ft^2");//ft^2
                                break;
                            case 7:System.out.println(area*1.19599005+"yd^2");//yd^2
                                break;
                            case 8:System.out.println(area* 0.000000247105+"acre");//acre
                                break;
                            case 9:System.out.println(area*0.00000001 +"hectare");//hectare
                                break;
                            default:System.out.println("Invalid");
                         }
                         break;
                         case 4:System.out.println("conversion from km^2");
                         switch(area2) {
                            case 1:System.out.println(area*1+"*10^12" +"mm^2");//mm^2
                                break;
                            case 2:System.out.println(area*1+"*10^10"+"cm^2");//cm^2
                                break;
                            case 3:System.out.println(area*1000000 +"m^2");//m^2
                                break;
                            case 4:System.out.println(area*1+"km^2");//km^2
                                break;
                            case 5:System.out.println(area*1.5500031+"*10^12"+"inch^2");//in^2
                                break;
                            case 6:System.out.println(area*1.07639104+"*10^10"+"ft^2");//ft^2
                                break;
                            case 7:System.out.println(area*1195990049+"yd^2");//yd^2
                                break;
                            case 8:System.out.println(area*247.105381+"acre");//acre
                                break;
                            case 9:System.out.println(area*0.01 +"hectare");//hectare
                                break;
                            default:System.out.println("Invalid");
                         }
                         break;
                          case 5:System.out.println("conversion from inch^2");
                         switch(area2) {
                            case 1:System.out.println(area*645.16 +"mm^2");//mm^2
                                break;
                            case 2:System.out.println(area*6.4516+"cm^2");//cm^2
                                break;
                            case 3:System.out.println(area*0.00064516+"m^2");//m^2
                                break;
                            case 4:System.out.println(area*0.0000000006451612903+"km^2");//km^2
                                break;
                            case 5:System.out.println(area*1+"inch^2");//in^2
                                break;
                            case 6:System.out.println(area*0.00694444+"ft^2");//ft^2
                                break;
                            case 7:System.out.println(area*0.000771604+"yd^2");//yd^2
                                break;
                            case 8:System.out.println(area* 6272640+"acre");//acre
                                break;
                            case 9:System.out.println(area*100000000 +"hectare");//hectare
                                break;
                            default:System.out.println("Invalid");
                         }
                         break;
                          case 6:System.out.println("conversion from ft^2");
                         switch(area2) {
                            case 1:System.out.println(area*92903.04 +"mm^2");//mm^2
                                break;
                            case 2:System.out.println(area*929.0304 +"cm^2");//cm^2
                                break;
                            case 3:System.out.println(area*0.09290304+"m^2");//m^2
                                break;
                            case 4:System.out.println(area*0.00000009290303997+"km^2");//km^2
                                break;
                            case 5:System.out.println(area*144+"inch^2");//in^2
                                break;
                            case 6:System.out.println(area*1+"ft^2");//ft^2
                                break;
                            case 7:System.out.println(area*0.111111+"yd^2");//yd^2
                                break;
                            case 8:System.out.println(area* 0.000022957+"acre");//acre
                                break;
                            case 9:System.out.println(area*0.000009290303997 +"hectare");//hectare
                                break;
                            default:System.out.println("Invalid");
                         }
                         break;
                          case 7:System.out.println("conversion from yd^2");
                         switch(area2) {
                            case 1:System.out.println(area*836127.36 +"mm^2");//mm^2
                                break;
                            case 2:System.out.println(area*8361.2736 +"cm^2");//cm^2
                                break;
                            case 3:System.out.println(area*0.83612736+"m^2");//m^2
                                break;
                            case 4:System.out.println(area* 0.00000083613+"km^2");//km^2
                                break;
                            case 5:System.out.println(area*1296+"inch^2");//in^2
                                break;
                            case 6:System.out.println(area*0.111111+"ft^2");//ft^2
                                break;
                            case 7:System.out.println(area*1+"yd^2");//yd^2
                                break;
                            case 8:System.out.println(area* 0.0002066115903+"acre");//acre
                                break;
                            case 9:System.out.println(area*0.00008361274413 +"hectare");//hectare
                                break;
                            default:System.out.println("Invalid");
                         }
                         break;
                           case 8:System.out.println("conversion from acre");
                         switch(area2) {
                            case 1:System.out.println(area* 4046856.4224+"mm^2");//mm^2
                                break;
                            case 2:System.out.println(area*40468564.224+"cm^2");//cm^2
                                break;
                            case 3:System.out.println(area*4046856.4224+"m^2");//m^2
                                break;
                            case 4:System.out.println(area* 0.004046856422+"km^2");//km^2
                                break;
                            case 5:System.out.println(area*6272640+"inch^2");//in^2
                                break;
                            case 6:System.out.println(area*0.43560+"ft^2");//ft^2
                                break;
                            case 7:System.out.println(area*4840+"yd^2");//yd^2
                                break;
                            case 8:System.out.println(area* 1+"acre");//acre
                                break;
                            case 9:System.out.println(area*0.40468564224+"hectare");//hectare
                                break;
                            default:System.out.println("Invalid");
                         }
                         break;
                            case 9:System.out.println("conversion from hectare");
                         switch(area2) {
                            case 1:System.out.println(area* 1+"*10^10"+"mm^2");//mm^2
                                break;
                            case 2:System.out.println(area* 100000000+"cm^2");//cm^2
                                break;
                            case 3:System.out.println(area*10000000+"m^2");//m^2
                                break;
                            case 4:System.out.println(area* 0.01+"km^2");//km^2
                                break;
                            case 5:System.out.println(area*1.5500031+"*10^10"+"inch^2");//in^2
                                break;
                            case 6:System.out.println(area*107639.104+"ft^2");//ft^2
                                break;
                            case 7:System.out.println(area*119599.005+"yd^2");//yd^2
                                break;
                            case 8:System.out.println(area* 2.47105381+"acre");//acre
                                break;
                            case 9:System.out.println(area*1+"hectare");//hectare
                                break;
                            default:System.out.println("Invalid");
                         }
                         break;
                          
                    default:System.out.println("Invalid");

                    }
                    }
                        
                   else 
                   System.out.println("Invalid");
                   }
                   else 
                   System.out.println("Invalid");
                    break;
                    case 3:System.out.println("Volume conversion");
                        System.out.println("1. mm^3, 2.cm^3,3.m^3,4.ml,5.Lit,6.in^3,7.ft^3");
                        int volume1=sc.nextInt();
                        if(volume1<8) {
                         System.out.println("select new units");
                        System.out.println("1. mm^3, 2.cm^3,3.m^3,4.ml,5.Lit,6.in^3,7.ft^3");
                        int volume2=sc.nextInt();
                        if(volume2<8) {
                        System.out.println("Enter your Volume");
                        double volume=sc.nextInt();
                        switch(volume1) {
                         case 1:System.out.println("conversion from mm^3");
                            switch(volume2) {
                                case 1:System.out.println(volume*1+"mm^3");//mm^3
                                break;
                                case 2:System.out.println(volume*0.001+"cm^3");//cm^3
                                break;
                                case 3:System.out.println(volume* 0.000000001+"m^3");//m^3
                                break;
                                case 4:System.out.println(volume*0.001+"ml");//ml
                                break;
                                case 5:System.out.println(volume*0.000001+"Lit");//L
                                break;
                                case 6:System.out.println(volume* 0.000061+"in^3");//in^3
                                break;
                                case 7:System.out.println(volume* 0.00000004+"ft^3");//ft^3
                                break;
                                default:System.out.println("Invalid");
                            }
                            break;
                             case 2:System.out.println("conversion from cm^3");
                            switch(volume2) {
                                case 1:System.out.println(volume*1000+"mm^3");//mm^3
                                break;
                                case 2:System.out.println(volume*1+"cm^3");//cm^3
                                break;
                                case 3:System.out.println(volume* 0.000001+"m^3");//m^3
                                break;
                                case 4:System.out.println(volume*1+"ml");//ml
                                break;
                                case 5:System.out.println(volume*0.001+"Lit");//L
                                break;
                                case 6:System.out.println(volume* 0.0610237+"in^3");//in^3
                                break;
                                case 7:System.out.println(volume* 0.00003531466672+"ft^3");//ft^3
                                break;
                                default:System.out.println("Invalid");
                            }
                            break;
                             case 3:System.out.println("conversion from m^3");
                            switch(volume2) {
                                case 1:System.out.println(volume*1000000000+"mm^3");//mm^3
                                break;
                                case 2:System.out.println(volume*1000000+"cm^3");//cm^3
                                break;
                                case 3:System.out.println(volume* 1+"m^3");//m^3
                                break;
                                case 4:System.out.println(volume*1000000+"ml");//ml
                                break;
                                case 5:System.out.println(volume*1000+"Lit");//L
                                break;
                                case 6:System.out.println(volume* 61023.7+"in^3");//in^3
                                break;
                                case 7:System.out.println(volume* 35314.67+"ft^3");//ft^3
                                break;
                                default:System.out.println("Invalid");
                            }
                            break;
                             case 4:System.out.println("conversion from ml");
                            switch(volume2) {
                                case 1:System.out.println(volume*1000+"mm^3");//mm^3
                                break;
                                case 2:System.out.println(volume*1+"cm^3");//cm^3
                                break;
                                case 3:System.out.println(volume* 0.000001+"m^3");//m^3
                                break;
                                case 4:System.out.println(volume*1+"ml");//ml
                                break;
                                case 5:System.out.println(volume*0.001+"Lit");//L
                                break;
                                case 6:System.out.println(volume* 0.0610237+"in^3");//in^3
                                break;
                                case 7:System.out.println(volume* 0.000035+"ft^3");//ft^3
                                break;
                                default:System.out.println("Invalid");
                            }
                            break;
                             case 5:System.out.println("conversion from L^3");
                            switch(volume2) {
                                case 1:System.out.println(volume*1000000+"mm^3");//mm^3
                                break;
                                case 2:System.out.println(volume*1000+"cm^3");//cm^3
                                break;
                                case 3:System.out.println(volume*  0.001+"m^3");//m^3
                                break;
                                case 4:System.out.println(volume*1000+"ml");//ml
                                break;
                                case 5:System.out.println(volume*1+"Lit");//L
                                break;
                                case 6:System.out.println(volume*61.0237+"in^3");//in^3
                                break;
                                case 7:System.out.println(volume*0.0353147+"ft^3");//ft^3
                                break;
                                default:System.out.println("Invalid");
                            }
                            break;
                             case 6:System.out.println("conversion from in^3");
                            switch(volume2) {
                                case 1:System.out.println(volume* 16387.1+"mm^3");//mm^3
                                break;
                                case 2:System.out.println(volume*16.3871+"cm^3");//cm^3
                                break;
                                case 3:System.out.println(volume* 0.000016387064+"m^3");//m^3
                                break;
                                case 4:System.out.println(volume*16.3871+"ml");//ml
                                break;
                                case 5:System.out.println(volume*0.0163871+"Lit");//L
                                break;
                                case 6:System.out.println(volume* 1+"in^3");//in^3
                                break;
                                case 7:System.out.println(volume* 0.000578704+"ft^3");//ft^3
                                break;
                                default:System.out.println("Invalid");
                            }
                            break;
                             case 7:System.out.println("conversion from ft^3");
                            switch(volume2) {
                                case 1:System.out.println(volume*28316800+"mm^3");//mm^3
                                break;
                                case 2:System.out.println(volume*28316.8+"cm^3");//cm^3
                                break;
                                case 3:System.out.println(volume* 0.0283168+"m^3");//m^3
                                break;
                                case 4:System.out.println(volume*28316.8+"ml");//ml
                                break;
                                case 5:System.out.println(volume*28316.8+"Lit");//L
                                break;
                                case 6:System.out.println(volume* 1728+"in^3");//in^3
                                break;
                                case 7:System.out.println(volume* 1+"ft^3");//ft^3
                                break;
                                default:System.out.println("Invalid");
                            }
                            
                            break;
                            default:System.out.println("Invalid");
                     }
                          }
                        
                   else 
                   System.out.println("Invalid");
                   }
                   else 
                   System.out.println("Invalid");
                     break;
                        case 4:System.out.println("Weight conversion");
                        System.out.println("1. mg, 2.g,3.kg,4.Quinta 5.tonne,6.pound,7.Ounce,8.Newton");
                        int weight1=sc.nextInt();
                            if(weight1<9) {
                        System.out.println("select new units");
                        System.out.println("1. mg, 2.g,3.kg,4.Quinta 5.tonne,6.pound,7.Ounce,8.Newton");
                        int weight2=sc.nextInt();
                            if(weight2<9) {
                        System.out.println("Enter your Volume");
                        double weight=sc.nextInt();
                        switch(weight1) {
                             case 1:System.out.println("conversion from mg");
                                switch(weight2){
                                    case 1:System.out.println(weight*1 +"mg");//mg
                                    break;
                                    case 2:System.out.println(weight*0.001 +"g");//g
                                    break;
                                    case 3:System.out.println(weight* 0.000001+"kg");//kg
                                    break;
                                    case 4:System.out.println(weight* 0.00000001+"quinta");//quinta
                                    break;
                                    case 5:System.out.println(weight*0.000000001 +"tonne");//tonne
                                    break;
                                    case 6:System.out.println(weight*0.00000220462 +"pound");//pound
                                    break;
                                    case 7:System.out.println(weight*0.00003527396 +"ounce");//ounce
                                    break;
                                    case 8:System.out.println(weight*0.00000980665 +"newton");//newton
                                    break;
                                    default:System.out.println("Invalid");
                                }
                                break;
                                 case 2:System.out.println("conversion from g");
                                switch(weight2){
                                    case 1:System.out.println(weight*1000 +"mg");//mg
                                    break;
                                    case 2:System.out.println(weight*1 +"g");//g
                                    break;
                                    case 3:System.out.println(weight* 0.001+"kg");//kg
                                    break;
                                    case 4:System.out.println(weight* 0.00001+"quinta");//quinta
                                    break;
                                    case 5:System.out.println(weight*0.000001 +"tonne");//tonne
                                    break;
                                    case 6:System.out.println(weight*0.00220462 +"pound");//pound
                                    break;
                                    case 7:System.out.println(weight*0.03527396 +"ounce");//ounce
                                    break;
                                    case 8:System.out.println(weight*0.00980665 +"newton");//newton
                                    break;
                                    default:System.out.println("Invalid");
                                }
                                break;
                                 case 3:System.out.println("conversion from kg");
                                switch(weight2){
                                    case 1:System.out.println(weight*1000000 +"mg");//mg
                                    break;
                                    case 2:System.out.println(weight*1000 +"g");//g
                                    break;
                                    case 3:System.out.println(weight*1+"kg");//kg
                                    break;
                                    case 4:System.out.println(weight* 0.01+"quinta");//quinta
                                    break;
                                    case 5:System.out.println(weight*0.001 +"tonne");//tonne
                                    break;
                                    case 6:System.out.println(weight*2.20462+"pound");//pound
                                    break;
                                    case 7:System.out.println(weight*35.27396 +"ounce");//ounce
                                    break;
                                    case 8:System.out.println(weight* 9.80665 +"newton");//newton
                                    break;
                                    default:System.out.println("Invalid");
                                }
                                break;
                                 case 4:System.out.println("conversion from quinta");
                                switch(weight2){
                                    case 1:System.out.println(weight*100000000 +"mg");//mg
                                    break;
                                    case 2:System.out.println(weight*100000 +"g");//g
                                    break;
                                    case 3:System.out.println(weight* 100+"kg");//kg
                                    break;
                                    case 4:System.out.println(weight* 1+"quinta");//quinta
                                    break;
                                    case 5:System.out.println(weight*0.1 +"tonne");//tonne
                                    break;
                                    case 6:System.out.println(weight*220.462 +"pound");//pound
                                    break;
                                    case 7:System.out.println(weight*3527.396 +"ounce");//ounce
                                    break;
                                    case 8:System.out.println(weight*980665 +"newton");//newton
                                    break;
                                    default:System.out.println("Invalid");
                                }
                                break;
                                 case 5:System.out.println("conversion from tonne");
                                switch(weight2){
                                    case 1:System.out.println(weight*1000000000 +"mg");//mg
                                    break;
                                    case 2:System.out.println(weight*1000000  +"g");//g
                                    break;
                                    case 3:System.out.println(weight* 1000+"kg");//kg
                                    break;
                                    case 4:System.out.println(weight* 10+"quinta");//quinta
                                    break;
                                    case 5:System.out.println(weight*1 +"tonne");//tonne
                                    break;
                                    case 6:System.out.println(weight*2204.62 +"pound");//pound
                                    break;
                                    case 7:System.out.println(weight*35273.96 +"ounce");//ounce
                                    break;
                                    case 8:System.out.println(weight* 9806650 +"newton");//newton
                                    break;
                                    default:System.out.println("Invalid");
                                }
                                break;
                                 case 6:System.out.println("conversion from pounds");
                                switch(weight2){
                                    case 1:System.out.println(weight*453592.37 +"mg");//mg
                                    break;
                                    case 2:System.out.println(weight*453.59237 +"g");//g
                                    break;
                                    case 3:System.out.println(weight* 0.45359237+"kg");//kg
                                    break;
                                    case 4:System.out.println(weight* 0.0045359237+"quinta");//quinta
                                    break;
                                    case 5:System.out.println(weight*0.00045359237 +"tonne");//tonne
                                    break;
                                    case 6:System.out.println(weight*1 +"pound");//pound
                                    break;
                                    case 7:System.out.println(weight*160 +"ounce");//ounce
                                    break;
                                    case 8:System.out.println(weight*4.44822 +"newton");//newton
                                    break;
                                    default:System.out.println("Invalid");
                                }
                                break;
                                 case 7:System.out.println("conversion from ounce");
                                switch(weight2){
                                    case 1:System.out.println(weight*28349.52 +"mg");//mg
                                    break;
                                    case 2:System.out.println(weight*28.34952  +"g");//g
                                    break;
                                    case 3:System.out.println(weight* 0.02834952+"kg");//kg
                                    break;
                                    case 4:System.out.println(weight* 0.0002834952+"quinta");//quinta
                                    break;
                                    case 5:System.out.println(weight*0.00002834952 +"tonne");//tonne
                                    break;
                                    case 6:System.out.println(weight*0.0625 +"pound");//pound
                                    break;
                                    case 7:System.out.println(weight*1 +"ounce");//ounce
                                    break;
                                    case 8:System.out.println(weight*0.2780139 +"newton");//newton
                                    break;
                                    default:System.out.println("Invalid");
                                }
                                break;
                                 case 8:System.out.println("conversion from newton");
                                switch(weight2){
                                    case 1:System.out.println(weight*0.0000098 +"mg");//mg
                                    break;
                                    case 2:System.out.println(weight*0.00980665 +"g");//g
                                    break;
                                    case 3:System.out.println(weight*  9.8066500286389+"kg");//kg
                                    break;
                                    case 4:System.out.println(weight* 980.66500286389+"quinta");//quinta
                                    break;
                                    case 5:System.out.println(weight*9806.6500286389 +"tonne");//tonne
                                    break;
                                    case 6:System.out.println(weight*0.224809 +"pound");//pound
                                    break;
                                    case 7:System.out.println(weight* 0.03527396 +"ounce");//ounce
                                    break;
                                    case 8:System.out.println(weight*1 +"newton");//newton
                                    break;
                                    default:System.out.println("Invalid");
                                }
                                break;
                                default:System.out.println("Invalid");
                        }
                                }
                        
                   else 
                   System.out.println("Invalid");
                   }
                   else 
                   System.out.println("Invalid");
                        break;
                          case 5:System.out.println("Temperature conversion");
                            System.out.println("1.Celsius (°C),2.Fahrenheit (°F),3.Kelvin (K)");
                            int temp1=sc.nextInt();
                                if(temp1<4) {
                            System.out.println("select new units");
                            System.out.println("1.Celsius (°C),2.Fahrenheit (°F),3.Kelvin (K)");
                            int temp2=sc.nextInt();
                                    if(temp2<4) {
                            System.out.println("Enter your Value");
                            float temp=sc.nextInt();
                                switch(temp1) {
                                    case 1:System.out.println("conversion from Celsius(°C)");
                                            switch(temp2) {
                                                case 1: System.out.println(temp*1+"°C");
                                                    break;
                                                case 2: System.out.println((temp*(9/5))+32+"°F");
                                                    break;
                                                case 3:System.out.println(temp+273.15+"K");
                                                    break;
                                                default:System.out.println("Invalid");
                                            }
                                            break;
                                    case 2:System.out.println("conversion from Fahrenheit (°F)");
                                            switch(temp2) {
                                                case 1: System.out.println((temp-32)*(5/9)+"°C");
                                                    break;
                                                case 2: System.out.println(temp*1+"°F");
                                                    break;
                                                case 3:System.out.println((temp+459.67)*(5/9)+"K");
                                                    break;
                                                default:System.out.println("Invalid");
                                            }
                                            break;
                                     case 3:System.out.println("conversion from Kelvin (K)");
                                            switch(temp2) {
                                                case 1: System.out.println(temp-273.15+"°C");
                                                    break;
                                                case 2: System.out.println((temp*(9/5)-459.67)+"°F");
                                                    break;
                                                case 3:System.out.println(temp*1+"K");
                                                    break;
                                                default:System.out.println("Invalid");
                                            }
                                            break;
                                            default:System.out.println("Invalid");
                                }
                                             }
                        
                   else 
                   System.out.println("Invalid");
                   }
                   else 
                   System.out.println("Invalid");
                                    break;
            default:System.out.println("invalid");
        
    }
        }
        else 
        System.out.println("Invalid");
}
}
