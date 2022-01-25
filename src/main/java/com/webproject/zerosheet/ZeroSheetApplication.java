package com.webproject.zerosheet;

import java.util.Arrays;

import com.webproject.zerosheet.ItemInstance.Status;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZeroSheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeroSheetApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataSeader(ItemRepository itemrepo) {
		return args -> {
			itemrepo.save(new Item("001", "H frame 2.4 ( ኤች ፍሬም)", "PCS", 3.84d, 3.50d, 100, Arrays.asList
				(new ItemInstance(Status.AVAILABLE),
				new ItemInstance(Status.IN_MAINTENANCE),
				new ItemInstance(Status.IN_MAINTENANCE))
				));
			itemrepo.save(new Item("002", "X-bracing (ኤክስ መወጠሪያ)", "PCS", 3.84d, 4.50d, 120, Arrays.asList
				(new ItemInstance(Status.AVAILABLE),
				new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("003", "U-head (አናት)", "PCS", 4.45d, 3.50d, 120, Arrays.asList
				(new ItemInstance(Status.AVAILABLE),
				new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("004", "Base juck (እግር)", "PCS", 4.85d, 3.84d, 100, Arrays.asList
				(new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("005", "Connector ( ማገናኛ)", "PCS", 4.45d, 3.55d, 100, Arrays.asList
				(new ItemInstance(Status.AVAILABLE),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("006", "Extention1m (ማራዘሚያ1ሜ)", "PCS", 3.50d, 3.50d, 120, Arrays.asList
				(new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("007", "Extention50cm (ማራዘሚያ50ሤሜ)", "PCS", 2.85d, 2.50d, 80, Arrays.asList
				(new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("008", "Clamp free (ክላምፕ ነጻ)", "PCS", 2.5d, 2.80d, 70, Arrays.asList
				(new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("009", "Clamp 90° (ክላምፕ 90°)", "PCS", 2.45d, 3.50d, 90, Arrays.asList
				(new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("010", "Clamp connector(ክላምፕ ማገናኛ)", "PCS", 1.45d, 1.50d, 50, Arrays.asList
				(new ItemInstance(Status.SOON_AVAILABLE),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("011", "CHSØ48*3mm 6m(ክብ ቱቦ 48*2)", "PCS", 5.50d, 5.55d, 120, Arrays.asList
				(new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("012", "CHSØ48*2mm 2m(ክብ ቱቦ 48*2)", "PCS", 4.45d, 3.50d, 120, Arrays.asList
				(new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE),
				new ItemInstance(Status.SOON_AVAILABLE))
				));
			itemrepo.save(new Item("013", "Platform board(መቆሚያ ፓኔል)", "PCS", 8.5d, 7.50d, 100, Arrays.asList
				(new ItemInstance(Status.AVAILABLE),
				new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.AVAILABLE))
				));
			itemrepo.save(new Item("014", "Shoring Props (ቋሚ )", "PCS", 12.45d, 22.50d, 120, Arrays.asList
				(new ItemInstance(Status.SOON_AVAILABLE),
				new ItemInstance(Status.ON_LOAN),
				new ItemInstance(Status.IN_MAINTENANCE))
				));
			itemrepo.save(new Item("015", "RHS 60*60*3(ሬክታንግል ቱቦ60*60*3)", "PCS", 11.22d, 15.0d, 120, Arrays.asList
				(new ItemInstance(Status.AVAILABLE),
				new ItemInstance(Status.IN_MAINTENANCE),
				new ItemInstance(Status.ON_LOAN))
				));
		};
	}
	
	/*@Bean
	public CommandLineRunner dataseader(ItemInstanceRepository instancerepo) {
		return args -> {
			instancerepo.save(new ItemInstance( Status.ON_LOAN, null));
		};
	}*/

}
