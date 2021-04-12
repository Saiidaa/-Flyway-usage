

@Configuration
public class EmptyFlyway {

    @Bean
    public Flyway flyway() {
        return flyway(){
    };

}
