# Smart_restaurant_billing
Java Mini Project: Smart Restaurant Billing System<br>

Hello, This is My Mini-Project in which I have created a basic restaurant billing system using java fundamentals. The project allows users to calculate bills for selected menu items. As I continue learning Java, I plan to add more features to make the system more advanced and user-friendly.
<br>
<h3>The Features Include:</h3> 
<br>
1. Console Based Menu Ordering.<br>
2. Handles Multiple order in single session.<br>
3. Calculates the total bill, including the tax.<br>

<h3>Code Snippet</h3>
<br>
Here's a small code snippet of how orders are processed: 
<br>
<br>
if(order.equals("pizza")){<br>
    total += num * 30;<br>
} else if (order.equals("fries")) {<br>
    total += num * 5;<br>
} else if (order.equals("coke")) {<br>
    total += num * 5;<br>   
} else{<br>
    System.out.println("Sorry! We don't have that :(");<br>
}<br>

<h3>Sample Output</h3> <br>

Welcome to xyz restaurant! Here's our menu <br>
pizza    30$ <br>
fries    5$ <br>
coke     5$<br>
What would you like to order?<br>
pizza<br>
Enter the quantity(in number of plates)<br>
2<br>
Anything else?(y/n)<br>
y<br>
What would you like to order?<br>
coke<br>
Enter the quantity(in number of plates)<br>
3<br>
Anything else?(y/n)<br>
n<br>

The bill is as follows: <br>
 subtotal: 75.0$ <br>
 tax: 3.75$ <br>
 total: 78.75$<br>
<h3>Future Improvements</h3>
The future Improvements include <br>
1. Adding More Menu Items and Categories <br>
2. Store Past Orders in a database. <br>
3. GUI version with the visual menu and buttons <br>
