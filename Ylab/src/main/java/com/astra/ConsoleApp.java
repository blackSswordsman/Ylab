package com.astra;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.UserInterruptException;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import org.jline.utils.NonBlockingReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConsoleApp {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            Terminal terminal = TerminalBuilder.builder().system(true).build();
            LineReader reader = LineReaderBuilder.builder()
                    .terminal(terminal)
                    .build();

            while (!login(reader)) {
                System.out.println("Invalid username or password. Please try again.");
            }

            showMenu(reader);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean login(LineReader reader) {
        String username = reader.readLine("Enter username: ");
        String password = reader.readLine("Enter password: ", '*');
        return AuthenticationService.INSTANCE.authenticateUser(username,password);
    }

    private static void showMenu(LineReader reader) {
        Map<Integer, Runnable> actions = new HashMap<>();
        actions.put(1, () -> System.out.println("View all available workspaces and conference rooms."));
        actions.put(2, () -> System.out.println("View available slots for booking on a specific date."));
        actions.put(3, () -> System.out.println("Book a workspace or conference room for a specific time and date."));
        actions.put(4, () -> System.out.println("Cancel a booking."));
        actions.put(5, () -> System.out.println("Add new workspaces and conference rooms, and manage existing ones."));
        actions.put(6, () -> System.out.println("View all bookings and filter by date, user, or resource."));
        actions.put(0, () -> System.exit(0));

        while (true) {
            printMenu();
            try {
                String choiceStr = reader.readLine("Choose an option: ");
                int choice = Integer.parseInt(choiceStr);

                if (actions.containsKey(choice)) {
                    actions.get(choice).run();
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (UserInterruptException e) {
                System.out.println("Interrupted");
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. View all available workspaces and conference rooms");
        System.out.println("2. View available slots for booking on a specific date");
        System.out.println("3. Book a workspace or conference room for a specific time and date");
        System.out.println("4. Cancel a booking");
        System.out.println("5. Add new workspaces and conference rooms, and manage existing ones");
        System.out.println("6. View all bookings and filter by date, user, or resource");
        System.out.println("0. Exit");
    }
}
