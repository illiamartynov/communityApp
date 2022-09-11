package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Account account4 = new Account();



        Scanner input = new Scanner(System.in);
        System.out.println("1. Показать баланс");
        System.out.println("2. Пойти в новое место");
        System.out.println("3. Посмотреть кто кому сколько должен");
        System.out.println("4. Выйти из приложения");
        System.out.println("");
        System.out.print("Введите ваш выбор: ");

        int userInput = input.nextInt();

        while (userInput != 4) {

            if(userInput == 1) {
                System.out.printf("Баланс 1 пользователя: ₴%.2f\n" , account1.setBalance());
                System.out.printf("Баланс 2 пользователя: ₴%.2f\n" , account2.setBalance());
                System.out.printf("Баланс 3 пользователя: ₴%.2f\n" , account3.setBalance());
                System.out.printf("Баланс 4 пользователя: ₴%.2f\n" , account4.setBalance());
            }
            else if(userInput == 2) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Впишите латиницей куда вы собираетесь пойти: \n");

                    String partyChoice = sc.next().toUpperCase();
                    variantsToGo partyNames = variantsToGo.valueOf(partyChoice);





                System.out.println("Впишите цифру пользователя, который будет платить за данное мероприятие (1,2,3,4)");
                int userNumber = input.nextInt();
                switch (userNumber){
                    case 1 -> {
                        switch (partyNames) {


                            case CAFE,RESTAURANT,CINEMA,THEATRE,KARAOKE,POOL,SWIMMING_POOL,CLUB,SHOP -> {
                                System.out.println("Впишите цену, которую надо заплатить за " + partyNames);
                                int amountOfMoney = sc.nextInt();
                                System.out.println("Сумма которую надо заплатить за " +  partyNames + " = " + account1.paymentForParty(amountOfMoney) + "₴");


                            }
                            default ->  System.out.println("К сожалению, такого мероприятия нет в списке, попробуйте что-то другое");

                        }
                        System.out.println("Теперь на аккаунте 1 пользователя " + account1.getBalance() + "₴");

                    }
                    case 2 -> {
                        switch (partyNames) {


                            case CAFE,RESTAURANT,CINEMA,THEATRE,KARAOKE,POOL,SWIMMING_POOL,CLUB,SHOP -> {
                                System.out.println("Впишите цену, которую надо заплатить за " + partyNames);
                                int amountOfMoney = sc.nextInt();
                                System.out.println("Сумма которую надо заплатить за " +  partyNames + " = " + account2.paymentForParty(amountOfMoney) + "₴");

                            }

                        }
                        System.out.println("Теперь на аккаунте 2 пользователя " + account2.getBalance() + "₴");

                    }
                    case 3 -> {
                        switch (partyNames) {


                            case CAFE,RESTAURANT,CINEMA,THEATRE,KARAOKE,POOL,SWIMMING_POOL,CLUB,SHOP -> {
                                System.out.println("Впишите цену, которую надо заплатить за " + partyNames);
                                int amountOfMoney = sc.nextInt();
                                System.out.println("Сумма которую надо заплатить за " +  partyNames + " = " + account3.paymentForParty(amountOfMoney) + "₴");

                            }

                        }
                        System.out.println("Теперь на аккаунте 3 пользователя " + account3.getBalance() + "₴");

                    }
                    case 4 -> {
                        switch (partyNames) {


                            case CAFE,RESTAURANT,CINEMA,THEATRE,KARAOKE,POOL,SWIMMING_POOL,CLUB,SHOP -> {
                                System.out.println("Впишите цену, которую надо заплатить за " + partyNames);
                                int amountOfMoney = sc.nextInt();
                                System.out.println("Сумма которую надо заплатить за " +  partyNames + " = " + account4.paymentForParty(amountOfMoney) + "₴");

                            }

                        }
                        System.out.println("Теперь на аккаунте 4 пользователя " + account4.getBalance() + "₴");


                    }
                    default -> System.out.println("К сожалению, такого номера пользователя нет в списке");
                }


            }
            else if(userInput == 3){

            }
             else

                System.out.println("Вы ввели неправильную цифру, такого варианта не существует; ");

            System.out.println("");
            System.out.println("1. Показать баланс");
            System.out.println("2. Пойти в новое место");
            System.out.println("3. Посмотреть кто кому сколько должен");
            System.out.println("4. Выйти из приложения");
            userInput = input.nextInt();

        }
        input.close();
        System.out.println("Спасибо что выбрали моё приложение) ");
   }
}