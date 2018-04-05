package edu.spring.boot.mybatis.read;

import edu.spring.boot.mybatis.read.repository.SelectCountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!test")
public class ReadCommandLineRunner implements CommandLineRunner {

    private SelectCountRepository selectCountRepository;

    ReadCommandLineRunner(SelectCountRepository selectCountRepository) {
        this.selectCountRepository = selectCountRepository;
    }

    @Override
    public void run(String... args) {

        int count = getSelectCountRepository().count("personal");

        System.out.println("sdfsdf  " + String.valueOf(count) );
    }

    public SelectCountRepository getSelectCountRepository() {
        return selectCountRepository;
    }
}
