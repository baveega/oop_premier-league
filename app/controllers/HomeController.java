package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import entities.FootballClub;
import play.Logger;
import play.libs.Json;
import play.mvc.*;
import services.PremierLeagueManager;
import org.slf4j.LoggerFactory;
import utils.ApplicationUtil;

import java.util.List;


public class HomeController extends Controller {

    public Result appSummary() {
        List<FootballClub> result = PremierLeagueManager.getInstance().getLeader();
        //logger.debug("In LeagueController.showLeaderboard(), result is: {}", result.toString());
        JsonNode jsonObject = Json.toJson(result);
        return ok(ApplicationUtil.createResponse(jsonObject, true));
    }
}
