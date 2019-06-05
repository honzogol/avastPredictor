package avast;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.google.gson.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class PlayersController {

    ArrayList<Double> wages = new ArrayList<Double>();

    /*ResponsePlayers rp = new ResponsePlayers(0.5);*/

    @PostMapping("/person")
    @ResponseBody
    public ResponseEntity < String > returnWage(@RequestBody String json) {

        Gson gson = new Gson();
        RequestPlayers players = gson.fromJson(json, RequestPlayers.class);

        int numberOfPlayers = players.getAge().length;
        int controlNumber = players.getOverallRating().length;

        if (numberOfPlayers != controlNumber){
            return new ResponseEntity <String> ("Number of records in age and overall must be the same.", HttpStatus.EXPECTATION_FAILED);
        }
        else{
            for(int i = 0; i < numberOfPlayers; i++){
                double wage = -players.getAge()[i]*1.0 + players.getOverallRating()[i]*3.0 + 100.0;
                wages.add(wage);
            }
            String wagesString = gson.toJson(wages);
            wages.clear();
            String jsonComplete = "{'predictedWage' : " + wagesString + " }";
            return new ResponseEntity <String> (jsonComplete, HttpStatus.OK);
        }
    }

}