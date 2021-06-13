package springDemo.fortuneService;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService{

    private String fileName =
            "/Users/anastasia/IdeaProjects/Spring_and_Hibernate_course/spring_demo_annotations/src/fortunes.txt";
    private List<String> fortunes = new ArrayList<>();

    // create a random number generator
	private Random myRandom = new Random();

	public FileFortuneService() {

		File theFile = new File(fileName);

		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());

		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				fortunes.add(tempLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(fortunes.size());

		return fortunes.get(index);
	}

}
