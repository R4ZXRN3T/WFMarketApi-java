package org.R4ZXRN3T.wfmarketapi;

import org.R4ZXRN3T.wfmarketapi.endpoints.Manifests;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.Item;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.ItemShort;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.RivenAttribute;

import java.util.HashMap;

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
		Item revenantPrimeSetItem = Manifests.getItem("revenant_prime_set");
		System.out.println("Name: " + revenantPrimeSetItem.getName());
		HashMap<String, ItemShort> items = Manifests.getItems();
		System.out.println(items.get("revenant_prime_set").getName());
		System.out.println(items.size());

		Item[] revenantPrimeSet = Manifests.getSetItems("revenant_prime_set");
		for (Item item : revenantPrimeSet) {
			System.out.println(item.getName());
		}

		HashMap<String, RivenAttribute> rivenAttributes = Manifests.getRivenAttributes();
		System.out.println(rivenAttributes.keySet());
	}
}
