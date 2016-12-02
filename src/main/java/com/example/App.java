package com.example;

import retrofit2.Call;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create a very simple REST adapter which points the HelloWorld API endpoint.
        Client client = ServiceGenerator.createService(Client.class);

        // Fetch and print a list of the contributors to this library.
        Call<GreetingsImpl> call =
                client.getGreeting();

        try {
            Greetings greetings = call.execute().body();
            System.out.println(greetings.getContent());
        } catch (IOException e) {
            // handle errors
        }
    }
}
