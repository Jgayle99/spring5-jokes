package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


/**
 * Created by Joel Gayle on 25 Jan, 2020
 */
//@Configuration
public class ChuckConfiguration {

   // @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return  new ChuckNorrisQuotes();
    }
}
