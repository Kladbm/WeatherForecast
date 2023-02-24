package com.example.weatherforecast.service;

import com.example.weatherforecast.model.Current;
import com.example.weatherforecast.model.Location;
import com.example.weatherforecast.entity.Requests;
import com.example.weatherforecast.model.CurrentWeather;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherForecastServiceImpl implements WeatherForecastService {

    @Autowired
    private RequestsService requestsService;

    @Value("${APIkey}")
    String APIkey;

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public CurrentWeather getCurrentWeather(String cityName) {

        Requests request = requestsService.findByName(cityName);
        if (request != null) {
            CurrentWeather currentWeather = new CurrentWeather();
            currentWeather.setCurrent(getCurrent_model(request.getCurrentWeather()));
            currentWeather.setLocation(getLocation_model(request.getCurrentWeather()));
            return currentWeather;
        } else {
            String url = "https://api.weatherapi.com/v1/current.json?key=" + APIkey + "&q=" + cityName;
            CurrentWeather response = restTemplate.getForEntity(url, CurrentWeather.class).getBody();

            com.example.weatherforecast.entity.CurrentWeather currentWeather =
                    new com.example.weatherforecast.entity.CurrentWeather();

            currentWeather.setCurrent(getCurrent_entity(response));
            currentWeather.setLocation(getLocation_entity(response));

            Requests requests = new Requests();
            requests.setName(cityName);
            requests.setCurrentWeather(currentWeather);
            requests.setTime(String.valueOf(System.currentTimeMillis() / 1000L));

            requestsService.deleteByName(cityName);
            requestsService.saveRequests(requests);

            return response;
        }
    }

    private com.example.weatherforecast.entity.Current getCurrent_entity(CurrentWeather response) {
        com.example.weatherforecast.entity.Current current =
                new com.example.weatherforecast.entity.Current();

        current.setLastUpdated(response.getCurrent().getLastUpdated());
        current.setLastUpdatedEpoch(response.getCurrent().getLastUpdatedEpoch());
        current.setTempC(response.getCurrent().getTempC());
        current.setTempF(response.getCurrent().getTempF());
        current.setIsDay(response.getCurrent().getIsDay());
        current.setWindMph(response.getCurrent().getWindMph());
        current.setWindKph(response.getCurrent().getWindKph());
        current.setWindDegree(response.getCurrent().getWindDegree());
        current.setWindDir(response.getCurrent().getWindDir());
        current.setPressureMb(response.getCurrent().getPressureMb());
        current.setPressureIn(response.getCurrent().getPressureIn());
        current.setPrecipMm(response.getCurrent().getPrecipMm());
        current.setPrecipIn(response.getCurrent().getPrecipIn());
        current.setHumidity(response.getCurrent().getHumidity());
        current.setCloud(response.getCurrent().getCloud());
        current.setFeelslikeC(response.getCurrent().getFeelslikeC());
        current.setFeelslikeF(response.getCurrent().getFeelslikeF());
        current.setVisKm(response.getCurrent().getVisKm());
        current.setVisMiles(response.getCurrent().getVisMiles());
        current.setUv(response.getCurrent().getUv());
        current.setGustMph(response.getCurrent().getGustMph());
        current.setGustKph(response.getCurrent().getGustKph());

        return current;
    }

    private com.example.weatherforecast.entity.Location getLocation_entity(CurrentWeather response) {
        com.example.weatherforecast.entity.Location location =
                new com.example.weatherforecast.entity.Location();

        location.setName(response.getLocation().getName());
        location.setRegion(response.getLocation().getRegion());
        location.setCountry(response.getLocation().getCountry());
        location.setLat(response.getLocation().getLat());
        location.setLon(response.getLocation().getLon());
        location.setTzId(response.getLocation().getTzId());
        location.setLocaltimeEpoch(response.getLocation().getLocaltimeEpoch());
        location.setLocaltime(response.getLocation().getLocaltime());

        return location;
    }

    private Current getCurrent_model(com.example.weatherforecast.entity.CurrentWeather response) {
        Current current = new Current();

        current.setLastUpdated(response.getCurrent().getLastUpdated());
        current.setLastUpdatedEpoch(response.getCurrent().getLastUpdatedEpoch());
        current.setTempC(response.getCurrent().getTempC());
        current.setTempF(response.getCurrent().getTempF());
        current.setIsDay(response.getCurrent().getIsDay());
        current.setWindMph(response.getCurrent().getWindMph());
        current.setWindKph(response.getCurrent().getWindKph());
        current.setWindDegree(response.getCurrent().getWindDegree());
        current.setWindDir(response.getCurrent().getWindDir());
        current.setPressureMb(response.getCurrent().getPressureMb());
        current.setPressureIn(response.getCurrent().getPressureIn());
        current.setPrecipMm(response.getCurrent().getPrecipMm());
        current.setPrecipIn(response.getCurrent().getPrecipIn());
        current.setHumidity(response.getCurrent().getHumidity());
        current.setCloud(response.getCurrent().getCloud());
        current.setFeelslikeC(response.getCurrent().getFeelslikeC());
        current.setFeelslikeF(response.getCurrent().getFeelslikeF());
        current.setVisKm(response.getCurrent().getVisKm());
        current.setVisMiles(response.getCurrent().getVisMiles());
        current.setUv(response.getCurrent().getUv());
        current.setGustMph(response.getCurrent().getGustMph());
        current.setGustKph(response.getCurrent().getGustKph());

        return current;
    }

    private Location getLocation_model(com.example.weatherforecast.entity.CurrentWeather response) {
        Location location = new Location();

        location.setName(response.getLocation().getName());
        location.setRegion(response.getLocation().getRegion());
        location.setCountry(response.getLocation().getCountry());
        location.setLat(response.getLocation().getLat());
        location.setLon(response.getLocation().getLon());
        location.setTzId(response.getLocation().getTzId());
        location.setLocaltimeEpoch(response.getLocation().getLocaltimeEpoch());
        location.setLocaltime(response.getLocation().getLocaltime());

        return location;
    }
}
