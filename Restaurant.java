//PUPPALA LILLY PRIYA//
//11803627//
//K18AP//
//53//
//CSE310//
//SUBMITTED TO SHAILAJA SHARMA//
//github link: https://github.com/lillypuppala77/java_cse310_restaurant-management-system //

import java.util.*;
interface RMS //USING INTERFACE
{
 void initial_setup(Restaurant restaurant, Order active_orders[]);
 void show_menu(Restaurant restaurant);	
 void place_order(Restaurant restaurant, Order active_orders[]);
 void calculate_bill(Restaurant restaurant, Order active_orders[]);
 void exit();
}
class Restaurant implements RMS //USING INHERITANCE
 {
        String            restaurant_name;
        static int        total_orders;
        static int        total_dish_count;
        static int        total_tables;
        Order             active_orders[];

        Restaurant() {
                restaurant_name   = "Fasoos";
                total_dish_count  = 10;
                total_tables      = 10;
        }
        
        public void initial_setup(Restaurant restaurant, Order active_orders[]) {
                System.out.println("");
                System.out.println("\t\t------------------------------------------------------------");
                System.out.println("\t\t                     Welcome to Fasoos                      ");
		System.out.println("\t\t           This is RESTUARANT MANAGEMENT SYSTEM             ");
                System.out.println("\t\t------------------------------------------------------------");
                System.out.println("");
                System.out.println("\t\tMENU:");
                System.out.println("");
                System.out.println("\t\t1. Show dishes menu");
                System.out.println("\t\t2. Place an order");
                System.out.println("\t\t3. Show bill");
		System.out.println("\t\t4. Exit");
                System.out.println("\t\t5. Exit and give feedback");
                System.out.println("");
                System.out.println("\t\tEnter your choice (1 to 5): ");

                int choice;
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
                switch(choice) {
                        case 1: restaurant.show_menu(restaurant);
                                break;
                        case 2: restaurant.place_order(restaurant, restaurant.active_orders);
                                break;
                        case 3: restaurant.calculate_bill(restaurant, restaurant.active_orders);
                                break;
                        case 4: restaurant.exit();
                                break;
			case 5: restaurant.exit(1);
                                break;
			default:
				System.out.println("Not a valid input");
			
                }
        }


        public void show_menu(Restaurant restaurant) {
                System.out.println("\t\t------------------- Menu -----------------");
                System.out.println("\t\t  Dishes\t\t\tPrice");
                System.out.println("\t\t------------------------------------------");
                System.out.println("\t\t  1. Sandwich\t\t\t100");
                System.out.println("\t\t  2. Burger\t\t\t200");
                System.out.println("\t\t  3. Pasta\t\t\t300");
                System.out.println("\t\t  4. Noodles\t\t\t400");
                System.out.println("\t\t  5. Paneer1\t\t\t500");
                System.out.println("\t\t  6. Paneer2\t\t\t600");
                System.out.println("\t\t  7. Paneer3\t\t\t700");
                System.out.println("\t\t  8. Paneer4\t\t\t800");
                System.out.println("\t\t  9. Sweet1\t\t\t900");
                System.out.println("\t\t  10. Sweet2\t\t\t1000");
                System.out.println("\t\t  11. Sweet3\t\t\t1200");
                System.out.println("\t\t  12. Sweet4\t\t\t1600");
                System.out.println("\n");
                System.out.println("\t\tPress any key to go back....");
                Scanner sc = new Scanner(System.in);
                sc.nextLine();
                restaurant.initial_setup(restaurant, restaurant.active_orders);
        }
        
        public void place_order(Restaurant restaurant, Order active_orders[]) {
                System.out.println("\t\t------------------- Menu -----------------");
                System.out.println("\t\t  Dishes\t\t\tPrice");
                System.out.println("\t\t------------------------------------------");
                System.out.println("\t\t  1. Sandwich\t\t\t100");
                System.out.println("\t\t  2. Burger\t\t\t200");
                System.out.println("\t\t  3. Pasta\t\t\t300");
                System.out.println("\t\t  4. Noodles\t\t\t400");
                System.out.println("\t\t  5. Paneer1\t\t\t500");
                System.out.println("\t\t  6. Paneer2\t\t\t600");
                System.out.println("\t\t  7. Paneer3\t\t\t700");
                System.out.println("\t\t  8. Paneer4\t\t\t800");
                System.out.println("\t\t  9. Sweet1\t\t\t900");
                System.out.println("\t\t  10. Sweet2\t\t\t1000");
                System.out.println("\t\t  11. Sweet3\t\t\t1200");
                System.out.println("\t\t  12. Sweet4\t\t\t1600");
                System.out.println("\n");
        
                Order order = new Order();
                Restaurant.total_orders++;
                order.order_id = (total_orders - 1);
                Scanner sc = new Scanner(System.in);
                System.out.println("\t\tEnter your choice as index number of dish: ");                
                order.dish_choice = sc.nextInt();
                System.out.println("\t\tEnter quantity: ");
                order.quantity = sc.nextInt();
                
                switch (order.dish_choice) {
                        case 1: order.dish_name = "Sandwich";
                                break;
                        case 2: order.dish_name = "Burger";
                                break;
                        case 3: order.dish_name = "Pasta";
                                break;
                        case 4: order.dish_name = "Noodles";
                                break;
                        case 5: order.dish_name = "Paneer1";
                                break;
                        case 6: order.dish_name = "Paneer2";
                                break;
                        case 7: order.dish_name = "Paneer3";
                                break;
                        case 8: order.dish_name = "Paneer4";
                                break;
                        case 9: order.dish_name = "Sweet1";
                                break;
                        case 10: order.dish_name = "Sweet2";
                                break;
                        case 11: order.dish_name = "Sweet3";
                                break;
                        case 12: order.dish_name = "Sweet4";
                                break;
                }

                switch (order.dish_choice) {
                        case 1: order.dish_price = 100;
                                break;
                        case 2: order.dish_price = 200;
                                break;
                        case 3: order.dish_price = 300;
                                break;
                        case 4: order.dish_price = 400;
                                break;
                        case 5: order.dish_price = 500;
                                break;
                        case 6: order.dish_price = 600;
                                break;
                        case 7: order.dish_price = 700;
                                break;
                        case 8: order.dish_price = 800;
                                break;
                        case 9: order.dish_price = 900;
                                break;
                        case 10: order.dish_price = 1000;
                                break;
                        case 11: order.dish_price = 1100;
                                break;
                        case 12: order.dish_price = 1200;
                                break;
                }
                System.out.println("\t\tOrder successfully placed...");
                System.out.println("\t\tOrder details: ");
                System.out.println("\t\tYour order ID: " + order.order_id);
                System.out.println("\t\tDish name: " + order.dish_name);
                System.out.println("\t\tQuantity: " + order.quantity);
                System.out.println("");
                active_orders[order.order_id] = order;
                restaurant.initial_setup(restaurant, active_orders);
        }

        public void calculate_bill(Restaurant restaurant, Order active_orders[]) {
                System.out.println("\t\tEnter the order ID you would like to calculate bill for: ");
                Scanner sc = new Scanner(System.in);
                int temp_order_id = sc.nextInt();

                int order_found = 0;
                int target_index = 0;
                for (int i = 0; i < Restaurant.total_orders; i++) {
                        if (active_orders[i].order_id == temp_order_id) {
                                order_found =  1;
                                target_index = i;
                                System.out.println("\t\tYour order details: ");
                                System.out.println("\t\tDish name: " + active_orders[i].dish_name);
                                System.out.println("\t\tQuantity:  " + active_orders[i].quantity);
                                System.out.println("");
                        }
                }
        
                if (order_found == 0) {
                        System.out.println("Sorry can't cancel the order. No such active order found...");
                } else {
                        float bill;
                        bill = active_orders[target_index].calculate_bill();
                        System.out.println("\t\tBill for your order is: Rs. " + bill);
                }
                restaurant.initial_setup(restaurant, restaurant.active_orders);
        }

        public void exit() {
                System.out.println("");
                System.out.println("Thank you for using Restaurant management system....");
                System.out.println("Now exiting....");
                System.out.println("");
        }
	public void exit(int x)		//USING POLYMORPHISM
	{
		System.out.println("");
                System.out.println("Thank you for visiting fasoos....");
		System.out.println("we would love to have your feedback");
		System.out.println("Feel free to write your thoughts");
		Scanner sc = new Scanner(System.in);
		String fb=sc.nextLine();
		System.out.println("your registered feedback is\n");
		System.out.println(fb);
		System.out.println("thank you for your feedback");
		System.out.println("have good day");
		
                System.out.println("Now exiting....");
                System.out.println("");
	} 
        
}       

class Order {
        int order_id = 0;
        int        dish_choice;
        int        quantity;
        float      order_bill;
        float      dish_price;
        String     dish_name;

        Order() {
                dish_choice  = 0;
                quantity     = 0;
                order_bill   = 0.0f;
        }

        public float calculate_bill() {
                float gst = 0.14f * dish_price;
                order_bill =dish_price * quantity + gst; 
                return order_bill;       
        }
}

class Fasoos extends Restaurant		//USING INHERITANCE

{
public static void main(String []args) {
                Restaurant restaurant = new Restaurant();
                restaurant.active_orders = new Order[100];
                try			//USING EXCEPTION HANDLING
{
restaurant.initial_setup(restaurant, restaurant.active_orders);}
catch(Exception e)
            {
                System.out.println("Not a valid input");
            }
        }
}
