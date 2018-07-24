package com.wlodarczyk.szymon.app;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    private final Random random = new Random();

    @GetMapping("/api/service")
    public void call() throws InterruptedException {

        simulateTimeConsumingBusinessLogic();

    }

    private void simulateTimeConsumingBusinessLogic() throws InterruptedException {
        int value = random.nextInt(10) + 1;
        long extraSleepTime = value * 100L;
        long sleepTime = 1000L + extraSleepTime;
        TimeUnit.MILLISECONDS.sleep(sleepTime);
    }

}