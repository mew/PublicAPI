import com.google.gson.JsonArray;
import net.hypixel.api.HypixelAPI;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        HypixelAPI api = new HypixelAPI(UUID.fromString("API_KEY"));
        String uuid = "e2db3b87ae5c4b91a04f7d6f5ef51e27";
        JsonArray array = api.getSkyBlockProfiles(uuid).get().getProfile();
        array.forEach(it -> System.out.println(it.getAsJsonObject().get("members").getAsJsonObject().get(uuid).getAsJsonObject().get("last_save").getAsLong()));
        api.shutdown();
    }
}
