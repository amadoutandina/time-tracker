package com.amadou.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.amadou.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jason on 6/19/2015.
 */
@Configuration
@ComponentScan("com.amadou.timetracker.core")
public class TrackerCoreConfig {

    @Bean(name = "timesheet")
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
