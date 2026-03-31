package org.R4ZXRN3T.wfmarketapi;

import org.R4ZXRN3T.wfmarketapi.endpoints.Manifests;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.ItemShort;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.Localization.Language;
import org.json.JSONObject;

import java.util.HashMap;

import static org.R4ZXRN3T.wfmarketapi.objects.datamodels.Platform.PC;

/**
 * Application entry point for the WFMarketApi example / tooling.
 *
 * <p>This class currently contains a minimal {@code main} method kept as a
 * placeholder for running quick manual tests or sample usages. The method is
 * intentionally empty in the library distribution.</p>
 */
public class Main {
	/**
	 * Program entry point placeholder. Left intentionally empty — include any
	 * ad-hoc test code here when running locally.
	 */
	public static void main(String[] args) {
		JSONObject response = API.getJsonResponse(Language.KOREAN, PC, "item/revenant_prime_set", true);
		assert response != null;
		System.out.println(response.toString(4));
		HashMap<String, ItemShort> items = Manifests.getItems();
		System.out.println(items.get("revenant_prime_set").getName());
	}
}
