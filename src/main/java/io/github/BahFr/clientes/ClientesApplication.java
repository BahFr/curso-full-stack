package io.github.BahFr.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "io/github/BahFr/model/entity")
public class ClientesApplication {

//    @Bean
//    public CommandLineRunner run(@Autowired ClienteRepository repository){
//        return args -> {
//            Cliente cliente = Cliente.builder().cpf("00000000000").nome("Astolfo").build();
//            repository.save(cliente);
//            //cliente.setNome();
//        };
//    }
    public static void main(String[] args) {
        SpringApplication.run(ClientesApplication.class, args);
    }
}
