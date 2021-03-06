package examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class MovieRecommender {
	
	private String defaultLocale;
	private CustomerPreferenceDao customerPreferenceDao;

	@Autowired
	public MovieRecommender(CustomerPreferenceDao customerPreferenceDao,
			@Value("#{systemProperties['user.country']}") String defaultLocale) {
		this.customerPreferenceDao = customerPreferenceDao;
		this.defaultLocale = defaultLocale;
	}
	// ...
}
