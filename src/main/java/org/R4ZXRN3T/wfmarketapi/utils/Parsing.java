package org.R4ZXRN3T.wfmarketapi.utils;

import org.R4ZXRN3T.wfmarketapi.objects.datamodels.*;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.enums.ActivityType;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.enums.Role;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.enums.Tier;
import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.Localization;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * JSON parsing helpers that convert API JSON payloads into the library's
 * datamodel objects.
 *
 * <p>All methods in this class are static and tolerant of missing fields:
 * they use the nullable helpers in {@link General} so absent fields become
 * {@code null} rather than throwing exceptions. Each parse method documents
 * its expected input and return value.</p>
 */
public class Parsing {
	/**
	 * Parse a short item representation (used in list endpoints) into an
	 * {@link ItemShort} instance.
	 *
	 * <p>The parser uses the nullable helpers in {@link General} so missing
	 * fields become {@code null} rather than throwing exceptions. When the
	 * input {@code json} is {@code null} an empty {@link ItemShort} is
	 * returned.</p>
	 *
	 * @param json the JSON object representing the short item, may be
	 *             {@code null}
	 * @return a populated {@link ItemShort} instance; fields may be {@code null}
	 * when absent in the JSON
	 */
	public static ItemShort parseItemShort(JSONObject json) {
		if (json == null) return new ItemShort();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		String[] tags = General.optStringArrayNullable(json, "tags");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		Integer maxRank = General.optIntegerNullable(json, "maxRank");
		Integer maxCharges = General.optIntegerNullable(json, "maxCharges");
		Boolean vaulted = General.optBooleanNullable(json, "vaulted");
		Integer ducats = General.optIntegerNullable(json, "ducats");
		Integer amberStars = General.optIntegerNullable(json, "amberStars");
		Integer cyanStars = General.optIntegerNullable(json, "cyanStars");
		Integer baseEndo = General.optIntegerNullable(json, "baseEndo");
		Float endoMultiplier = General.optFloatNullable(json, "endoMultiplier");
		String[] subTypes = General.optStringArrayNullable(json, "subTypes");

		return new ItemShort(id, slug, gameRef, tags, i18n, maxRank, maxCharges, vaulted, ducats, amberStars, cyanStars, baseEndo, endoMultiplier, subTypes);
	}

	/**
	 * Parse a full Item (long payload) into an {@link Item} object.
	 * Uses the nullable opt helpers so missing fields become null instead of throwing.
	 *
	 * @param json the JSON object representing the full item, may be {@code null}
	 * @return a populated {@link Item} instance; when {@code json} is
	 * {@code null} an empty {@link Item} is returned
	 */
	public static Item parseItem(JSONObject json) {
		if (json == null) return new Item();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		String[] tags = General.optStringArrayNullable(json, "tags");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		String[] subTypes = General.optStringArrayNullable(json, "subTypes");
		Integer maxRank = General.optIntegerNullable(json, "maxRank");
		Integer maxCharges = General.optIntegerNullable(json, "maxCharges");
		Boolean vaulted = General.optBooleanNullable(json, "vaulted");
		Integer ducats = General.optIntegerNullable(json, "ducats");
		Integer amberStars = General.optIntegerNullable(json, "amberStars");
		Integer cyanStars = General.optIntegerNullable(json, "cyanStars");
		Integer baseEndo = General.optIntegerNullable(json, "baseEndo");
		Float endoMultiplier = General.optFloatNullable(json, "endoMultiplier");

		Boolean setRoot = General.optBooleanNullable(json, "setRoot");
		String[] setParts = General.optStringArrayNullable(json, "setParts");
		Integer quantityInSet = General.optIntegerNullable(json, "quantityInSet");
		String rarity = General.optStringNullable(json, "rarity");
		Boolean bulkTradable = General.optBooleanNullable(json, "bulkTradable");
		Integer maxAmberStars = General.optIntegerNullable(json, "maxAmberStars");
		Integer maxCyanStars = General.optIntegerNullable(json, "maxCyanStars");
		Integer vosfor = General.optIntegerNullable(json, "vosfor");
		Integer reqMasteryRank = General.optIntegerNullable(json, "reqMasteryRank");
		Integer tradingTax = General.optIntegerNullable(json, "tradingTax");
		Boolean tradable = General.optBooleanNullable(json, "tradable");

		return new Item(id, slug, gameRef, tags, i18n, subTypes, maxRank, maxCharges, vaulted, ducats, amberStars, cyanStars, baseEndo, endoMultiplier, setRoot, setParts, quantityInSet, rarity, bulkTradable, maxAmberStars, maxCyanStars, vosfor, reqMasteryRank, tradingTax, tradable);
	}

	// -----------------
	// Additional parsers
	// -----------------

	/**
	 * Parse an Activity object from JSON.
	 *
	 * @param json the JSON representation of the activity, may be {@code null}
	 * @return a populated {@link Activity} or an empty {@link Activity} when
	 * {@code json} is {@code null}
	 */
	public static Activity parseActivity(JSONObject json) {
		if (json == null) return new Activity();
		ActivityType type = parseActivityType(General.optStringNullable(json, "type"));
		String details = General.optStringNullable(json, "details");
		String startedAt = General.optStringNullable(json, "startedAt");
		return new Activity(type, details, startedAt);
	}

	/**
	 * Parse an Achievement object including its nested state when present.
	 *
	 * @param json the JSON representation of the achievement, may be {@code null}
	 * @return a populated {@link Achievement} or an empty {@link Achievement}
	 * when {@code json} is {@code null}
	 */
	public static Achievement parseAchievement(JSONObject json) {
		if (json == null) return new Achievement();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String type = General.optStringNullable(json, "type");
		Boolean secret = General.optBooleanNullable(json, "secret");
		Integer reputationBonus = General.optIntegerNullable(json, "reputationBonus");
		Integer goal = General.optIntegerNullable(json, "goal");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));

		Achievement.AchievementState state = null;
		JSONObject stateObj = json.optJSONObject("state");
		if (stateObj != null) {
			Boolean featured = General.optBooleanNullable(stateObj, "featured");
			Boolean hidden = General.optBooleanNullable(stateObj, "hidden");
			Integer progress = General.optIntegerNullable(stateObj, "progress");
			String completedAt = General.optStringNullable(stateObj, "completedAt");
			state = new Achievement.AchievementState(featured, hidden, progress, completedAt);
		}

		return new Achievement(id, slug, type, secret, reputationBonus, goal, i18n, state);
	}

	/**
	 * Parse a dashboard showcase container object.
	 *
	 * @param json the JSON representation of the showcase, may be {@code null}
	 * @return a {@link DashboardShowcase} instance; when input is {@code null}
	 * an empty showcase is returned
	 */
	public static DashboardShowcase parseDashboardShowcase(JSONObject json) {
		if (json == null) return new DashboardShowcase();
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		JSONArray arr = json.optJSONArray("items");
		DashboardShowcase.DashboardShowcaseItem[] items = null;
		if (arr != null) {
			items = new DashboardShowcase.DashboardShowcaseItem[arr.length()];
			for (int i = 0; i < arr.length(); i++) {
				JSONObject it = arr.optJSONObject(i);
				if (it == null) {
					items[i] = new DashboardShowcase.DashboardShowcaseItem();
					continue;
				}
				String item = General.optStringNullable(it, "item");
				String background = General.optStringNullable(it, "background");
				Boolean bigCard = General.optBooleanNullable(it, "bigCard");
				items[i] = new DashboardShowcase.DashboardShowcaseItem(item, background, bigCard);
			}
		}
		return new DashboardShowcase(i18n, items);
	}

	/**
	 * Parse a Riven item from JSON.
	 *
	 * @param json the JSON object representing the riven, may be {@code null}
	 * @return a {@link RivenWeapon} object; when {@code json} is {@code null} an
	 * empty {@link RivenWeapon} is returned
	 */
	public static RivenWeapon parseRivenWeapon(JSONObject json) {
		if (json == null) return new RivenWeapon();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		String group = General.optStringNullable(json, "group");
		String rivenType = General.optStringNullable(json, "rivenType");
		Float disposition = General.optFloatNullable(json, "disposition");
		Integer reqMasteryRank = General.optIntegerNullable(json, "reqMasteryRank");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new RivenWeapon(id, slug, gameRef, group, rivenType, disposition, reqMasteryRank, i18n);
	}

	/**
	 * Parse a Riven attribute definition from JSON.
	 *
	 * @param json the JSON representation, may be {@code null}
	 * @return a {@link RivenAttribute} instance
	 */
	public static RivenAttribute parseRivenAttribute(JSONObject json) {
		if (json == null) return new RivenAttribute();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		String group = General.optStringNullable(json, "group");
		String prefix = General.optStringNullable(json, "prefix");
		String suffix = General.optStringNullable(json, "suffix");
		String[] exclusiveTo = General.optStringArrayNullable(json, "exclusiveTo");
		Boolean positiveIsNegative = General.optBooleanNullable(json, "positiveIsNegative");
		String unit = General.optStringNullable(json, "unit");
		Boolean positiveOnly = General.optBooleanNullable(json, "positiveOnly");
		Boolean negativeOnly = General.optBooleanNullable(json, "negativeOnly");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new RivenAttribute(id, slug, gameRef, group, prefix, suffix, exclusiveTo, positiveIsNegative, unit, positiveOnly, negativeOnly, i18n);
	}

	/**
	 * Parse a Lich weapon object.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link LichWeapon} instance
	 */
	public static LichWeapon parseLichWeapon(JSONObject json) {
		if (json == null) return new LichWeapon();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		Integer reqMasteryRank = General.optIntegerNullable(json, "reqMasteryRank");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new LichWeapon(id, slug, gameRef, reqMasteryRank, i18n);
	}

	/**
	 * Parse a Lich ephemera object.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link LichEphemera} instance
	 */
	public static LichEphemera parseLichEphemera(JSONObject json) {
		if (json == null) return new LichEphemera();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		String animation = General.optStringNullable(json, "animation");
		String element = General.optStringNullable(json, "element");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new LichEphemera(id, slug, gameRef, animation, element, i18n);
	}

	/**
	 * Parse a Lich quirk definition.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link LichQuirk} instance
	 */
	public static LichQuirk parseLichQuirk(JSONObject json) {
		if (json == null) return new LichQuirk();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String group = General.optStringNullable(json, "group");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new LichQuirk(id, slug, group, i18n);
	}

	/**
	 * Parse a Sister weapon object.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link SisterWeapon} instance
	 */
	public static SisterWeapon parseSisterWeapon(JSONObject json) {
		if (json == null) return new SisterWeapon();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		Integer reqMasteryRank = General.optIntegerNullable(json, "reqMasteryRank");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new SisterWeapon(id, slug, gameRef, reqMasteryRank, i18n);
	}

	/**
	 * Parse a Sister ephemera object.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link SisterEphemera} instance
	 */
	public static SisterEphemera parseSisterEphemera(JSONObject json) {
		if (json == null) return new SisterEphemera();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		String animation = General.optStringNullable(json, "animation");
		String element = General.optStringNullable(json, "element");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new SisterEphemera(id, slug, gameRef, animation, element, i18n);
	}

	/**
	 * Parse a Sister quirk definition.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link SisterQuirk} instance
	 */
	public static SisterQuirk parseSisterQuirk(JSONObject json) {
		if (json == null) return new SisterQuirk();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String group = General.optStringNullable(json, "group");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new SisterQuirk(id, slug, group, i18n);
	}

	/**
	 * Parse an NPC object.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link Npc} instance
	 */
	public static Npc parseNpc(JSONObject json) {
		if (json == null) return new Npc();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new Npc(id, slug, gameRef, i18n);
	}

	/**
	 * Parse a Location object.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link Location} instance
	 */
	public static Location parseLocation(JSONObject json) {
		if (json == null) return new Location();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		String faction = General.optStringNullable(json, "faction");
		Integer minLevel = General.optIntegerNullable(json, "minLevel");
		Integer maxLevel = General.optIntegerNullable(json, "maxLevel");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new Location(id, slug, gameRef, faction, minLevel, maxLevel, i18n);
	}

	/**
	 * Parse a Mission object.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link Mission} instance
	 */
	public static Mission parseMission(JSONObject json) {
		if (json == null) return new Mission();
		String id = General.optStringNullable(json, "id");
		String slug = General.optStringNullable(json, "slug");
		String gameRef = General.optStringNullable(json, "gameRef");
		Localization i18n = General.parseLocalization(json.optJSONObject("i18n"));
		return new Mission(id, slug, gameRef, i18n);
	}

	/**
	 * Parse an Order object used by the marketplace.
	 *
	 * @param json the JSON object representing the order, may be {@code null}
	 * @return a {@link Order} instance
	 */
	public static Order parseOrder(JSONObject json) {
		if (json == null) return new Order();
		String id = General.optStringNullable(json, "id");
		String type = General.optStringNullable(json, "type");
		Integer platinum = General.optIntegerNullable(json, "platinum");
		Integer quantity = General.optIntegerNullable(json, "quantity");
		Integer perTrade = General.optIntegerNullable(json, "perTrade");
		Integer rank = General.optIntegerNullable(json, "rank");
		Integer charges = General.optIntegerNullable(json, "charges");
		String subtype = General.optStringNullable(json, "subtype");
		Integer amberStars = General.optIntegerNullable(json, "amberStars");
		Integer cyanStars = General.optIntegerNullable(json, "cyanStars");
		Boolean visible = General.optBooleanNullable(json, "visible");
		String createdAt = General.optStringNullable(json, "createdAt");
		String updatedAt = General.optStringNullable(json, "updatedAt");
		String itemId = General.optStringNullable(json, "itemId");
		String group = General.optStringNullable(json, "group");
		return new Order(id, type, platinum, quantity, perTrade, rank, charges, subtype, amberStars, cyanStars, visible, createdAt, updatedAt, itemId, group);
	}

	/**
	 * Parse an {@link OrderWithUser} which contains an order and the user who
	 * created it. The base order fields are parsed via {@link #parseOrder(JSONObject)}
	 * and the nested {@code user} object is parsed with {@link #parseUserShort(JSONObject)}.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a populated {@link OrderWithUser} instance
	 */
	public static OrderWithUser parseOrderWithUser(JSONObject json) {
		if (json == null) return new OrderWithUser();
		// reuse parseOrder for base fields
		Order base = parseOrder(json);
		JSONObject userObj = json.optJSONObject("user");
		UserShort user = userObj == null ? null : parseUserShort(userObj);

		OrderWithUser out = new OrderWithUser();
		// copy base order fields via setters
		out.setId(base.getId());
		out.setType(base.getType());
		out.setPlatinum(base.getPlatinum());
		out.setQuantity(base.getQuantity());
		out.setPerTrade(base.getPerTrade());
		out.setRank(base.getRank());
		out.setCharges(base.getCharges());
		out.setSubtype(base.getSubtype());
		out.setAmberStars(base.getAmberStars());
		out.setCyanStars(base.getCyanStars());
		out.setVisible(base.getVisible());
		out.setCreatedAt(base.getCreatedAt());
		out.setUpdatedAt(base.getUpdatedAt());
		out.setItemId(base.getItemId());
		out.setGroup(base.getGroup());
		out.setUser(user);
		return out;
	}

	/**
	 * Parse a transaction item used inside transactions.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link TxItem} instance
	 */
	public static TxItem parseTxItem(JSONObject json) {
		if (json == null) return new TxItem();
		String id = General.optStringNullable(json, "id");
		Integer rank = General.optIntegerNullable(json, "rank");
		Integer charges = General.optIntegerNullable(json, "charges");
		String subtype = General.optStringNullable(json, "subtype");
		Integer amberStars = General.optIntegerNullable(json, "amberStars");
		Integer cyanStars = General.optIntegerNullable(json, "cyanStars");
		return new TxItem(id, rank, charges, subtype, amberStars, cyanStars);
	}

	/**
	 * Parse a Transaction object including nested item and user when present.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link Transaction} instance
	 */
	public static Transaction parseTransaction(JSONObject json) {
		if (json == null) return new Transaction();
		String id = General.optStringNullable(json, "id");
		String type = General.optStringNullable(json, "type");
		String originId = General.optStringNullable(json, "originId");
		Integer platinum = General.optIntegerNullable(json, "platinum");
		Integer quantity = General.optIntegerNullable(json, "quantity");
		String createdAt = General.optStringNullable(json, "createdAt");
		String updatedAt = General.optStringNullable(json, "updatedAt");
		TxItem item = json.optJSONObject("item") == null ? null : parseTxItem(json.optJSONObject("item"));
		UserShort user = json.optJSONObject("user") == null ? null : parseUserShort(json.optJSONObject("user"));
		return new Transaction(id, type, originId, platinum, quantity, createdAt, updatedAt, item, user);
	}

	/**
	 * Parse a compact user representation.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a {@link UserShort} instance
	 */
	public static UserShort parseUserShort(JSONObject json) {
		if (json == null) return new UserShort();
		String id = General.optStringNullable(json, "id");
		String ingameName = General.optStringNullable(json, "ingameName");
		String avatar = General.optStringNullable(json, "avatar");
		Integer reputation = General.optIntegerNullable(json, "reputation");
		String locale = General.optStringNullable(json, "locale");
		String platform = General.optStringNullable(json, "platform");
		Boolean crossplay = General.optBooleanNullable(json, "crossplay");
		String status = General.optStringNullable(json, "status");
		Activity activity = json.optJSONObject("activity") == null ? null : parseActivity(json.optJSONObject("activity"));
		String lastSeen = General.optStringNullable(json, "lastSeen");
		return new UserShort(id, ingameName, avatar, reputation, locale, platform, crossplay, status, activity, lastSeen);
	}

	/**
	 * Parse an array of achievements into a Java array.
	 *
	 * @param arr the JSON array, may be {@code null}
	 * @return an array of {@link Achievement} or {@code null} when input is
	 * {@code null}
	 */
	public static Achievement[] parseAchievementArray(JSONArray arr) {
		if (arr == null) return null;
		Achievement[] out = new Achievement[arr.length()];
		for (int i = 0; i < arr.length(); i++) {
			out[i] = parseAchievement(arr.optJSONObject(i));
		}
		return out;
	}

	/**
	 * Parse a full {@link User} object from JSON (public fields only).
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a populated {@link User}
	 */
	public static User parseUser(JSONObject json) {
		if (json == null) return new User();
		User u = new User();
		u.setId(General.optStringNullable(json, "id"));
		u.setIngameName(General.optStringNullable(json, "ingameName"));
		u.setAvatar(General.optStringNullable(json, "avatar"));
		u.setBackground(General.optStringNullable(json, "background"));
		u.setAbout(General.optStringNullable(json, "about"));
		u.setReputation(General.optIntegerNullable(json, "reputation"));
		u.setMasteryLevel(General.optIntegerNullable(json, "masteryLevel"));
		u.setPlatform(General.optStringNullable(json, "platform"));
		u.setCrossplay(General.optBooleanNullable(json, "crossplay"));
		u.setLocale(General.optStringNullable(json, "locale"));
		u.setAchievementShowcase(parseAchievementArray(json.optJSONArray("achievementShowcase")));
		u.setStatus(General.optStringNullable(json, "status"));
		u.setActivity(json.optJSONObject("activity") == null ? null : parseActivity(json.optJSONObject("activity")));
		u.setLastSeen(General.optStringNullable(json, "lastSeen"));
		u.setBanned(General.optBooleanNullable(json, "banned"));
		u.setBanUntil(General.optStringNullable(json, "banUntil"));
		u.setWarned(General.optBooleanNullable(json, "warned"));
		u.setWarnMessage(General.optStringNullable(json, "warnMessage"));
		u.setBanMessage(General.optStringNullable(json, "banMessage"));
		return u;
	}

	/**
	 * Parse a private user object which contains all public {@link User}
	 * fields plus private fields that require authentication on the API side.
	 * The method first parses the public user fields via {@link #parseUser(JSONObject)}
	 * and then reads the private fields.
	 *
	 * @param json the JSON object, may be {@code null}
	 * @return a populated {@link UserPrivate} instance
	 */
	public static UserPrivate parseUserPrivate(JSONObject json) {
		if (json == null) return new UserPrivate();
		UserPrivate up = new UserPrivate();
		// base user fields
		User base = parseUser(json);
		up.setId(base.getId());
		up.setIngameName(base.getIngameName());
		up.setAvatar(base.getAvatar());
		up.setBackground(base.getBackground());
		up.setAbout(base.getAbout());
		up.setReputation(base.getReputation());
		up.setMasteryLevel(base.getMasteryLevel());
		up.setPlatform(base.getPlatform());
		up.setCrossplay(base.getCrossplay());
		up.setLocale(base.getLocale());
		up.setAchievementShowcase(base.getAchievementShowcase());
		up.setStatus(base.getStatus());
		up.setActivity(base.getActivity());
		up.setLastSeen(base.getLastSeen());
		up.setBanned(base.getBanned());
		up.setBanUntil(base.getBanUntil());
		up.setWarned(base.getWarned());
		up.setWarnMessage(base.getWarnMessage());
		up.setBanMessage(base.getBanMessage());

		// private fields
		up.setRole(parseRole(General.optStringNullable(json, "role")));
		up.setAboutRaw(General.optStringNullable(json, "aboutRaw"));
		up.setCredits(General.optIntegerNullable(json, "credits"));
		up.setTheme(General.optStringNullable(json, "theme"));
		up.setVerification(General.optBooleanNullable(json, "verification"));
		up.setCheckCode(General.optStringNullable(json, "checkCode"));
		up.setTier(parseTier(General.optStringNullable(json, "tier")));
		up.setSubscription(General.optBooleanNullable(json, "subscription"));
		up.setReviewsLeft(General.optIntegerNullable(json, "reviewsLeft"));
		up.setUnreadMessages(General.optIntegerNullable(json, "unreadMessages"));
		up.setIgnoreList(General.optStringArrayNullable(json, "ignoreList"));
		up.setDeleteInProgress(General.optBooleanNullable(json, "deleteInProgress"));
		up.setDeleteAt(General.optStringNullable(json, "deleteAt"));
		up.setLinkedAccounts(json.has("linkedAccounts") ? json.opt("linkedAccounts") : null);
		up.setHasEmail(General.optBooleanNullable(json, "hasEmail"));
		up.setCreatedAt(General.optStringNullable(json, "createdAt"));
		return up;
	}

	// -----------------
	// Tiny enum helpers
	// -----------------

	// -----------------
	// Tiny enum helpers
	// -----------------

	/**
	 * Convert a string to an {@link ActivityType} enum value by comparing
	 * {@code toString()} results. Returns {@code null} if the input is
	 * {@code null} or no matching enum value is found.
	 */
	private static ActivityType parseActivityType(String s) {
		if (s == null) return null;
		for (ActivityType t : ActivityType.values()) {
			if (t.toString().equals(s)) return t;
		}
		return null;
	}

	/**
	 * Convert a string to a {@link Role} enum value; returns {@code null}
	 * when the input is {@code null} or no match is available.
	 */
	private static Role parseRole(String s) {
		if (s == null) return null;
		for (Role r : Role.values()) {
			if (r.toString().equals(s)) return r;
		}
		return null;
	}

	/**
	 * Convert a string to a {@link Tier} enum value; returns {@code null}
	 * when the input is {@code null} or no match is available.
	 */
	private static Tier parseTier(String s) {
		if (s == null) return null;
		for (Tier t : Tier.values()) {
			if (t.toString().equals(s)) return t;
		}
		return null;
	}
}
