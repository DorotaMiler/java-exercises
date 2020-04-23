package _f_classes.Optional.NullPointerException;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import java.util.Properties;

public class ConfigService {

    private Properties properties = new Properties();

    public ConfigService() {
        try (var inputStream = getClass().getResourceAsStream("/config.properties")) {
            properties.load(inputStream);

        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public Optional<Integer> readInt(String key) {
        if (!properties.containsKey(key)) {
            return Optional.empty();
        }

        return Optional.of(Integer.parseInt(properties.get(key).toString()));
    }

    public Integer readInt(String key, int defaultValue) {
        return Optional.ofNullable(properties.get(key))
                .filter(Objects::nonNull)
                .map(String::valueOf)
                .map(v -> {
                    try {
                        return Integer.parseInt(v);
                    } catch (NumberFormatException e) {
                        return defaultValue;
                    }
                })
                .filter(i -> i >= 0)
                .orElse(defaultValue);
    }

    public Optional<String> readValue(String key) {
        return Optional.ofNullable((String) properties.get(key));
    }
}
