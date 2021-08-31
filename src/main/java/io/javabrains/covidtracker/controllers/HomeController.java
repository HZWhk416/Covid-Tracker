package io.javabrains.covidtracker.controllers;

import io.javabrains.covidtracker.models.LocationsStats;
import io.javabrains.covidtracker.services.CovidVirusDataServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CovidVirusDataServie covidVirusDataServie;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationsStats> allStats = covidVirusDataServie.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat-> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat-> stat.getDifferFromPrevDay()).sum();
        model.addAttribute("locationStats", allStats);
        model.addAttribute("totalReportedCases", totalReportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return "home";
    }
}
