## Deli Around the Corner


The Deli Around the Corner application allows customer to order sandwiches, chips, and drinks. Sandwiches are fully customizable with cold cuts, veggies, and sauces of their choosing. After checking out, the receipt is stored in a text file named the time the order was processed.   


## User stories
- As a user, I want to filter out transactions by date, vendor, description, and the amount deposited/paid.
- As a user, I want to be able to add deposits, so I can keep track of spending.
- As a user, I want to be able to add payments, so I can keep track of my debt repayment.
- As a user, I want to see a list of options, so I can choose what to do on the application.
- As a user, I want to open all transactions, so I can see calculate the amount of money I have spent.
### Some features include:

**Add sandwiches, chips, drinks**
- Customers are allowed to add as much items as they want to order.

**Add toppings to sandwiches**
- Customers are allowed to add toppings to their sandwiches
- Option to request extra toppings
- Meat and cheeses cost extra, veggies, sauces, and sides are free of charge.

**Clear cart**
- If the user does not want to buy anything because of their change of mind, then they can exit the application.
- Can clear cart if they want to start over.

**Persistent storage**
- All products bought are stored in a text file.
- Total cost is calculated
- The text file is named after the time the order was processed.
  


## Setup


### Prerequisites

- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'FinancialTracker.main()'' to start the application.

## Technologies Used

- Java SDK 17
- IntelliJ IDEA

## Demo(Left to right, top to bottom)
<img width="270" height="154" alt="image" src="https://github.com/user-attachments/assets/2af1bf41-7fa8-47f4-9283-e2410a73a4fa" />
<img width="205" height="173" alt="image" src="https://github.com/user-attachments/assets/be531e23-fde3-4923-99ee-5c9160733e2e" />
<img width="266" height="218" alt="image" src="https://github.com/user-attachments/assets/bfa8c333-e2d4-4297-8e83-6cba88949208" />
<img width="891" height="280" alt="image" src="https://github.com/user-attachments/assets/bfaabf7b-6884-44c2-ac06-3f9dbf69256c" />
<img width="249" height="214" alt="image" src="https://github.com/user-attachments/assets/698189ea-acca-42a3-8927-9fbbc76593b7" />
<img width="199" height="167" alt="image" src="https://github.com/user-attachments/assets/f99f3b4e-2d8a-490f-ae6f-dcabe58febe2" />
<img width="303" height="205" alt="image" src="https://github.com/user-attachments/assets/ebbc0d9b-200e-4ca1-8cbb-d388627f318b" />



## Class Diagram
<img width="1243" height="668" alt="image" src="https://github.com/user-attachments/assets/6c14f69b-4937-4f23-b641-d1d08bb2cd34" />



## An Interesting Part of My Code

- One of the interesting parts of my code is how I refactored the helper methods for the reportMenu and LedgerMenu. I looked up at how to pass a condition through the parameter and it taught me about Predicate. Predicate is a functional interface that allows this. I was able to reduce a lot of repetition with this trick.
- Double vs double, where Double is an object. Used to check if the double was a valid number.4

## Resources
- https://www.geeksforgeeks.org/java/java-8-predicate-with-examples/
- https://www.bezkoder.com/java-sort-arraylist-of-objects/

## Contributors:
- Roger Su


