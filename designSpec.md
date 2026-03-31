# Data Models

# Description

All **structs** are Golang structs with JSON tags (see [How to Use Struct Tags in Go](https://www.digitalocean.com/community/tutorials/how-to-use-struct-tags-in-go)).
If you are familiar with them and their quirks, you will likely be able to deduce the data types and identify which fields could be optional.
However, just to be sure and to facilitate easier reading, I’ll highlight these fields with a color.

- **`Field is optional`**

**Also, here is our advanced marking system for these models**:

🔜 - In development

🚧 - Unstable or unfinished models

# Models

## ItemShort

Represent trimmed Item model, only used to build initial local copy of tradable items list on a client.

- **Golang Struct**
    
    
    ```go
    type ItemJson struct {
    	Id             string                   `json:"id"`
    	Slug           string                   `json:"slug"`
    	GameRef        string                   `json:"gameRef"`
    	Tags           []string                 `json:"tags,omitzero"`
    	SetRoot        *bool                    `json:"setRoot,omitempty"`
    	SetParts       []string                 `json:"setParts,omitempty"`
    	QuantityInSet  int32                    `json:"quantityInSet,omitempty"`
    	Rarity         string                   `json:"rarity,omitempty"`
    	BulkTradable   bool                     `json:"bulkTradable,omitempty"`
    	Subtypes       []string                 `json:"subtypes,omitempty"`
    	MaxRank        int32                    `json:"maxRank,omitempty"`
    	MaxCharges     int32                    `json:"maxCharges,omitempty"`
    	MaxAmberStars  int32                    `json:"maxAmberStars,omitempty"`
    	MaxCyanStars   int32                    `json:"maxCyanStars,omitempty"`
    	BaseEndo       int32                    `json:"baseEndo,omitempty"`
    	EndoMultiplier float32                  `json:"endoMultiplier,omitempty"`
    	Ducats         int32                    `json:"ducats,omitempty"`
    	Vosfor         int32                    `json:"vosfor,omitempty"`
    	ReqMasteryRank *int32                   `json:"reqMasteryRank,omitempty"`
    	Vaulted        *bool                    `json:"vaulted,omitempty"`
    	TradingTax     int32                    `json:"tradingTax,omitempty"`
    	Tradable       *bool                    `json:"tradable,omitempty"`
    	I18N           map[string]*ItemI18NJson `json:"i18n,omitempty"`
    }
    
    type ItemI18NJson struct {
    	Name        string `json:"name"`
    	Description string `json:"description,omitempty"`
    	WikiLink    string `json:"wikiLink,omitempty"`
    	Icon        string `json:"icon"`
    	Thumb       string `json:"thumb"`
    	SubIcon     string `json:"subIcon,omitempty"`
    }
    ```
    

**JSON Example**

```json
{
	id: "54aae292e7798909064f1575",
	slug: "secura-dual-cestra",
	gameRef: "/Lotus/Weapons/Syndicates/PerrinSequence/Pistols/PSDualCestra",
	tags: [
		"syndicate",
		"weapon",
		"secondary"
	],
	i18n: {
		en: {
			name: "Secura Dual Cestra",
			icon: "items/images/en/secura_dual_cestra.3d47a4ec6675ff774bb0da9b16c53e0e.png",
			thumb: "items/images/en/thumbs/secura_dual_cestra.3d47a4ec6675ff774bb0da9b16c53e0e.128x128.png",
			subIcon: "sub_icons/weapon/generic_receiver_128x128.png"
	},
	maxRank: 8,
	maxCharges: 3,
	vaulted: false,
	ducats: 45,
	amberStars: 8
	cyanStars:2,
	baseEndo: 100,
	endoMultipler: 2.0,
	subtypes: ["blueprint", "crafted"]
}
```

depends on your **Language** header, you could have any other language inside `i18n` field

---

## Item

Full item model with all possible fields

- **Golang Struct**
    
    
    ```go
    type ItemJson struct {
    	Id             string                   `json:"id"`
    	Slug           string                   `json:"slug"`
    	GameRef        string                   `json:"gameRef"`
    	Tags           []string                 `json:"tags,omitzero"`
    	SetRoot        *bool                    `json:"setRoot,omitempty"`
    	SetParts       []string                 `json:"setParts,omitempty"`
    	QuantityInSet  int32                    `json:"quantityInSet,omitempty"`
    	Rarity         string                   `json:"rarity,omitempty"`
    	BulkTradable   bool                     `json:"bulkTradable,omitempty"`
    	Subtypes       []string                 `json:"subtypes,omitempty"`
    	MaxRank        int32                    `json:"maxRank,omitempty"`
    	MaxCharges     int32                    `json:"maxCharges,omitempty"`
    	MaxAmberStars  int32                    `json:"maxAmberStars,omitempty"`
    	MaxCyanStars   int32                    `json:"maxCyanStars,omitempty"`
    	BaseEndo       int32                    `json:"baseEndo,omitempty"`
    	EndoMultiplier float32                  `json:"endoMultiplier,omitempty"`
    	Ducats         int32                    `json:"ducats,omitempty"`
    	Vosfor         int32                    `json:"vosfor,omitempty"`
    	ReqMasteryRank *int32                   `json:"reqMasteryRank,omitempty"`
    	Vaulted        *bool                    `json:"vaulted,omitempty"`
    	TradingTax     int32                    `json:"tradingTax,omitempty"`
    	Tradable       *bool                    `json:"tradable,omitempty"`
    	I18N           map[string]*ItemI18NJson `json:"i18n,omitempty"`
    }
    
    type ItemI18NJson struct {
    	Name        string `json:"name"`
    	Description string `json:"description,omitempty"`
    	WikiLink    string `json:"wikiLink,omitempty"`
    	Icon        string `json:"icon"`
    	Thumb       string `json:"thumb"`
    	SubIcon     string `json:"subIcon,omitempty"`
    }
    ```
    

**JSON Example**

```json
{
  id: "54e644ffe779897594fa68d2",
  tags: ["mod", "rare", "warframe", "trinity"],
  slug: "abating_link",
  gameRef: "/Lotus/Powersuits/Trinity/LinkAugmentCard",
  tradable: true,
  setRoot: false,
  setParts: [
    "54a73e65e779893a797fff72",
    "54a73e65e779893a797fff73",
    "54a73e65e779893a797fff71",
    "56783f24cbfa8f0432dd89a6",
    "54a73e65e779893a797fff76"
  ],
  quantityInSet: 1,
  i18n: {
    en: {
      name: "Abating Link",
      description: "Link Augment: Reduces Armor Rating by 60% on enemies targeted by Link.",
      wikiLink: "https://warframe.fandom.com/wiki/Abating_Link",
      icon: "items/images/en/abating_link.c547fa09315093a5ba6c609a9b195580.png",
      thumb: "items/images/en/thumbs/abating_link.c547fa09315093a5ba6c609a9b195580.128x128.png",
      subIcon: "sub_icons/blueprint_128x128.png"
    }
  },
  rarity: "rare",
  maxRank: 9,
  maxCharges: 3,
  bulkTradable: true,
  subtypes: ["blueprint", "crafted"],
  maxAmberStars: 5,
  maxCyanStars: 10,
  baseEndo: 400,
  endoMultiplier: 3,
  ducats: 75,
  reqMasteryRank: 10,
  vaulted: true,
  tradingTax: 8000,
}
```

---

## Riven item

Full riven weapon model with all possible fields

- **Golang Struct**
    
    ```go
    type Riven struct {
    	Id             string                    `json:"id"`
    	~~~~Slug           string                    `json:"slug"`
    	GameRef        string                    `json:"gameRef"`
    	Group          string                    `json:"group,omitempty"`
    	RivenType      string                    `json:"rivenType,omitempty"`
    	Disposition    float64                   `json:"disposition"`
    	ReqMasteryRank int8                      `json:"reqMasteryRank"`
    	I18N         map[string]*RivenI18NJson `json:"i18n,omitempty"`
    }
    
    type RivenI18N struct {
    	Name     string `json:"itemName,omitempty"
    	WikiLink string `json:"wikiLink,omitempty"`
    	Icon     string `json:"icon"`
    	Thumb    string `json:"thumb"`
    }
    ```
    

**`rivenType`** could be **** `kitgun` | `melee` | `pistol` | `rifle` | `shotgun` | `zaw`, but a new one may be added at any time.

**`group`** used to break riven by groups on the frontend, used for rendering only

**JSON Example**

```go
{
	id: "5c5ca81696e8d2003834fdcc",
	slug: "kulstar",
	gameRef: "/Lotus/Weapons/Grineer/Pistols/GrnTorpedoPistol/GrnTorpedoPistol",
	group: "secondary",
	rivenType: "pistol",
	disposition: 1.3,
	reqMasteryRank: 5,
	i18n: {
		en: {
			name: "Kulstar",
			wikiLink: "https://warframe.fandom.com/wiki/Kulstar",
			icon: "items/images/en/kulstar.92736ca911a3b84f99bc9e50f24369f0.png",
			thumb: "items/images/en/thumbs/kulstar.92736ca911a3b84f99bc9e50f24369f0.128x128.png"
		}
	}
}
```

---

## Riven attribute

Full riven attribute model with all possible fields

- **Golang Struct**
    
    ```go
    type RivenAttribute struct {
    	Id                 string                             `json:"id"`
    	~~~~Slug               string                             `json:"slug"`
    	GameRef            string                             `json:"gameRef"`
    	Group              string                             `json:"group,omitempty"`
    	Prefix             string                             `json:"prefix"`
    	Suffix             string                             `json:"suffix"`
    	ExclusiveTo        []string                           `json:"exclusiveTo,omitempty"`
    	PositiveIsNegative bool                               `json:"positiveIsNegative,omitempty"`
    	Unit               string                             `json:"unit,omitempty"`
    	PositiveOnly       bool                               `json:"positiveOnly,omitempty"`
    	NegativeOnly       bool                               `json:"negativeOnly,omitempty"`
    	I18N               map[string]*RivenAttributeI18N     `json:"i18n,omitempty"`
    }
    
    type RivenAttributeI18N struct {
    	Name   string `json:"effect"`
    	Icon   string `json:"icon"`
    	Thumb  string `json:"thumb"`
    }
    ```
    

**JSON Example**

```json
{
	id: "5c5ca81a96e8d2003834fe7f",
	slug: "recoil",
	gameRef: "WeaponRecoilReductionMod",
	group: "default",
	prefix: "Zeti",
	suffix: "Mag",
	exclusiveTo: [
		"shotgun",
		"rifle",
		"pistol",
		"kitgun"
	],
	positiveIsNegative: true,
	positiveOnly: true,
	negativeOnly: false,
	unit: "percent",
	i18n: {
		en: {
			name: "Weapon Recoil",
			icon: "riven_attribute/unknown.png",
			thumb: "riven_attribute/unknown.thumb.png"
		}
	}
}
```

---

## Lich weapon

- **Golang Struct**
    
    ```go
    type LichWeapon struct {
    	Id             string                         `json:"id"`
    	Slug           string                         `json:"slug"`
    	GameRef        string                         `json:"gameRef"`
    	ReqMasteryRank int8                           `json:"reqMasteryRank"`
    	I18N           map[string]*LichWeaponI18NJson `json:"i18n,omitempty"`
    }
    
    type LichWeaponI18N struct {
    	Name     string `json:"itemName"`
    	WikiLink string `json:"wikiLink,omitempty"`
    	Icon     string `json:"icon"`
    	Thumb    string `json:"thumb"`
    }
    ```
    

**JSON Example**

```json
{
	id: "5e9855993d9f64005cd702e6",
	slug: "kuva_drakgoon",
	gameRef: "/Lotus/Weapons/Grineer/KuvaLich/LongGuns/Drakgoon/KuvaDrakgoon",
	reqMasteryRank: 13,
	i18n: {
		en: {
			name: "Kuva Drakgoon",
			wikiLink: "https://warframe.fandom.com/wiki/Kuva_Drakgoon",
			icon: "lich_weapons/images/kuva_drakgoon.1c7452cc19e0d37f8403777906f06f7a.png",
			thumb: "lich_weapons/images/thumbs/kuva_drakgoon.1c7452cc19e0d37f8403777906f06f7a.128x128.png"
		}
	}
}
```

---

## Lich ephemera

- **Golang Struct**
    
    ```go
    type LichEphemera struct {
    	Id        string                           `json:"id"`
    	Slug      string                           `json:"slug"`
    	GameRef   string                           `json:"gameRef"`
    	Animation string                           `json:"animation"`
    	Element   string                           `json:"element"`
    	I18N      map[string]*LichEphemeraI18NJson `json:"i18n,omitempty"`
    }
    
    type LichEphemeraI18N struct {
    	Name  string `json:"itemName"`
    	Icon  string `json:"icon"`
    	Thumb string `json:"thumb"`
    }
    ```
    

**JSON Example**

```json
{
	id: "5e98548a3d9f64004f9136bb",
	slug: "vengeful_charge",
	gameRef: "/Lotus/Upgrades/Skins/Effects/Kuva/KuvaLightningEphemera",
	animation: "lich_ephemeras/animations/vengeful_charge.9682a7978dd10f8c63fa160d5ba1660e.webp",
	element: "electricity",
	i18n: {
		en: {
			name: "Vengeful Charge Ephemera",
			icon: "lich_ephemeras/images/vengeful_charge.68e07295ec11cdb303755a9f26e87f0e.png",
			thumb: "lich_ephemeras/images/thumbs/vengeful_charge.68e07295ec11cdb303755a9f26e87f0e.128x128.png"
		}
	}
}
```

---

## Lich quirk

- **Golang Struct**
    
    ```go
    type LichQuirk struct {
    	Id      string                        `json:"id"`
    	Slug    string                        `json:"slug"`
    	Group   string                        `json:"group,omitempty"`
    	I18N    map[string]*LichQuirkI18NJson `json:"i18n,omitempty"`
    }
    
    type LichQuirkI18N struct {
    	Name        string `json:"itemName"`
    	Description string `json:"description,omitempty"`
    	Icon        string `json:"icon,omitempty"`
    	Thumb       string `json:"thumb,omitempty"`
    }
    
    ```
    

**JSON Example**

```go
{
	id: "5e9855a43d9f6400697e895c",
	slug: "poor_sense_of_balance",
	group: "default",
	i18n: {
			en: {
				name: "Poor Sense of Balance",
				description: "The lich will retreat after kneeling down and without stabbing",
		}
	}
}
```

---

## Sister weapon

- **Golang Struct**
    
    ```go
    type SisterWeapon struct {
    	Id             string                         `json:"id"`
    	Slug           string                         `json:"slug"`
    	GameRef        string                         `json:"gameRef"`
    	ReqMasteryRank int8                           `json:"reqMasteryRank"`
    	I18N           map[string]*LichWeaponI18NJson `json:"i18n,omitempty"`
    }
    
    type SisterWeaponI18N struct {
    	Name     string `json:"itemName"`
    	WikiLink string `json:"wikiLink,omitempty"`
    	Icon     string `json:"icon"`
    	Thumb    string `json:"thumb"`
    }
    ```
    

**JSON Example**

```json
{
	id: "60f3feb1b64404003f0bf602",
	slug: "tenet_tetra",
	gameRef: "/Lotus/Weapons/Corpus/BoardExec/Primary/CrpBETetra/CrpBETetra",
	reqMasteryRank: 16,
	i18n: {
		en: {
			name: "Tenet Tetra",
			wikiLink: "https://warframe.fandom.com/wiki/Tenet_Tetra",
			icon: "sister_weapons/images/tenet_tetra.574603420c8673450692e0316abbb8cc.png",
			thumb: "sister_weapons/images/thumbs/tenet_tetra.574603420c8673450692e0316abbb8cc.128x128.png"
		}
	}
}
```

---

## Sister ephemera

- **Golang Struct**
    
    ```go
    type SisterEphemera struct {
    	Id        string                           `json:"id"`
    	Slug      string                           `json:"slug"`
    	GameRef   string                           `json:"gameRef"`
    	Animation string                           `json:"animation"`
    	Element   string                           `json:"element"`
    	I18N      map[string]*LichEphemeraI18NJson `json:"i18n,omitempty"`
    }
    
    type SisterEphemeraI18N struct {
    	Name  string `json:"itemName"`
    	Icon  string `json:"icon"`
    	Thumb string `json:"thumb"`
    }
    ```
    

**JSON Example**

```json
{
	id: "60f3feb5b64404003f0bf61d",
	slug: "gloriana_ephemera",
	gameRef: "/Lotus/Upgrades/Skins/Effects/CorpusLichEphemeraC",
	animation: "sister_ephemeras/animations/gloriana_ephemera.61f00273d398b5ecacf93004bdacf5a8.webp",
	element: "cold",
	i18n: {
		en: {
			name: "Gloriana Ephemera",
			icon: "sister_ephemeras/images/gloriana_ephemera.0ed0559f0a1f4bd07ccef755fb71152d.png",
			thumb: "sister_ephemeras/images/thumbs/gloriana_ephemera.0ed0559f0a1f4bd07ccef755fb71152d.128x128.png"
		}
	}
}
```

---

## Sister quirk

- **Golang Struct**
    
    ```go
    type SisterQuirk struct {
    	Id      string                        `json:"id"`
    	Slug    string                        `json:"slug"`
    	Group   string                        `json:"group,omitempty"`
    	I18N    map[string]*LichQuirkI18NJson `json:"i18n,omitempty"`
    }
    
    type SisterQuirkI18N struct {
    	Name        string `json:"itemName"`
    	Description string `json:"description,omitempty"`
    	Icon        string `json:"icon"`
    	Thumb       string `json:"thumb"`
    }
    
    ```
    

**JSON Example**

```json
{
	id: "60f3feb2b64404003f0bf60a",
	slug: "coward",
	group: "default",
	i18n: {
		en: {
			name: "Coward",
			description: "Can leave the mission at low health"
		}
	}
}
```

---

## Npc

- **Golang Struct**
    
    ```go
    type Npc struct {
    	Id      string                  `json:"id"`
    	Slug    string                  `json:"slug"`
    	GameRef string                  `json:"gameRef"`
    	I18N    map[string]*NpcI18NJson `json:"i18n,omitempty"`
    }
    type NpcI18N struct {
    	Name  string `json:"name"`
    	Icon  string `json:"icon"`
    	Thumb string `json:"thumb"`
    }
    ```
    

**JSON Example**

```json
{
	id: "62d2eff3751567007abb167e",
	slug: "infested_grineer",
	gameRef: "",
		i18n: {
		en: {
			name: "Infested Grineer",
			icon: "npc/images/infested_grineer.52931b27d55248a226c0f793e0863be0.png",
			thumb: "npc/images/thumbs/infested_grineer.52931b27d55248a226c0f793e0863be0.128x128.png"
		}
	}
}
```

---

## Location

- **Golang Struct**
    
    ```go
    type Location struct {
    	Id       string                       `json:"id"`
    	Slug     string                       `json:"slug"`
    	GameRef  string                       `json:"gameRef"`
    	Faction  string                       `json:"faction,omitempty"`
    	MinLevel int32                        `json:"minLevel,omitempty"`
    	MaxLevel int32                        `json:"maxLevel,omitempty"`
    	I18N     map[string]*LocationI18NJson `json:"i18n,omitempty"`
    }
    
    type LocationI18N struct {
    	NodeName   string `json:"nodeName"`
    	SystemName string `json:"systemName,omitempty"`
    	Icon       string `json:"icon"`
    	Thumb      string `json:"thumb"`
    }
    ```
    

**JSON Example**

```json
{
	id: "62d2eb5075156700663c83b4",
	slug: "amarna",
	gameRef: "ClanNode14",
	faction: "infested",
	minLevel: 35,
	maxLevel: 45,
		i18n: {
		en: {
			nodeName: "Amarna",
			systemName: "Sedna",
			icon: "locations/images/sedna.8c77b332a2c4e0d07a03c66cc2b1290e.png",
			thumb: "locations/images/thumbs/sedna.8c77b332a2c4e0d07a03c66cc2b1290e.128x128.png"
		}
	}
}
```

---

## Mission

- **Golang Struct**
    
    ```go
    type Mission struct {
    	Id      string                      `json:"id"`
    	Slug    string                      `json:"slug"`
    	GameRef string                      `json:"gameRef"`
    	I18N    map[string]*MissionI18NJson `json:"i18n,omitempty"`
    }
    
    type MissionI18N struct {
    	Name  string `json:"name"`
    	Icon  string `json:"icon,omitempty"`
    	Thumb string `json:"thumb,omitempty"`
    }
    ```
    

**JSON Example**

```json
{
	id: "62d2f049751567007abb1956",
	slug: "level_50_70_orb_vallis_bounty",
	gameRef: "",
	i18n: {
		en: {
			name: "Level 50 - 70 Orb Vallis Bounty",
			icon: "missions/images/level_50_70_orb_vallis_bounty.3401f96abd2236fdb1a6f745b12d597d.png",
			thumb: "missions/images/thumbs/level_50_70_orb_vallis_bounty.3401f96abd2236fdb1a6f745b12d597d.128x128.png"
		}
	}
}
```

---

## Order

Just an order, that’s it.
Without specifying the owner, used in cases where you already know who the owner of the order is, such as in a user profile or your own profile.

- **Golang Struct**
    
    
    ```go
    type Order struct {
    	Id         string  `json:"id"`                   // Is the unique identifier of the order.
    	Type       string  `json:"type"`                 // Specifies whether the order is a 'buy' or 'sell'.
    	Platinum   int32   `json:"platinum"`             // Is the total platinum currency involved in the order.
    	Quantity   int32   `json:"quantity"`             // Represents the number of items included in the order.
    	PerTrade   int8    `json:"perTrade,omitempty"`   // (optional) indicates the items quantity per transaction.
    	Rank       *int8   `json:"rank,omitempty"`       // (optional) specifies the rank or level of the item in the order.
    	Charges    *int8   `json:"charges,omitempty"`    // (optional) specifies number of charges left (used in requiem mods).
    	Subtype    string  `json:"subtype,omitempty"`    // (optional) defines the specific subtype or category of the item.
    	AmberStars *int8   `json:"amberStars,omitempty"` // (optional) denotes the count of amber stars in a sculpture order.
    	CyanStars  *int8   `json:"cyanStars,omitempty"`  // (optional) denotes the count of cyan stars in a sculpture order.
    	Visible    bool    `json:"visible"`              // (auth\mod) Indicates whether the order is publicly visible or not.
    	CreatedAt  string  `json:"createdAt"`            // Records the creation time of the order.
    	UpdatedAt  string  `json:"updatedAt"`            // Records the last modification time of the order.
    	ItemId     string  `json:"itemId"`               // Is the unique identifier of the item involved in the order.
      Group      string  `json:"group"`                // User-defined group to which the order belongs
    }
    ```
    

**JSON Example**

```json
{
	id: "5845a519d3ffb6213325ce33",
	type: "sell",
	platinum: 109,
	quantity: 1,
	perTrade: 5,
	rank: 10,
	charges: 3,
	subtype: "crafted",
	amberStars: 5,
	cyanStars: 10,
	visible: true,
	createdAt: "2016-12-05T17:34:17Z",
	updatedAt: "2021-05-21T14:59:02Z",
	itemId: "56783f24cbfa8f0432dd89a6",
	group: "all",
}
```

- **`group`** **string** - default group is always named `all`, all orders without custom group will be put into `all`

---

## OrderWithUser

This is a typical order model found in most requests, including a record about an owner.

- **Golang Struct**
    
    
    ```go
    type OrderWithUser struct {
    	[Order](https://www.notion.so/Data-Models-65e9ab01868c4dcca6ba499e68a04ac9?pvs=21)
    	User [UserShort](https://www.notion.so/Data-Models-65e9ab01868c4dcca6ba499e68a04ac9?pvs=21) `json:"user"` // Represents the user who created the order, with basic profile information.
    }
    ```
    

**JSON Example**

```json
{
	id: "5845a519d3ffb6213325ce33",
	type: "sell",
	platinum: 109,
	quantity: 1,
	perTrade: 5,
	rank: 10,
	charges: 1,
	subtype: "crafted",
	amberStars: 5,
	cyanStars: 10,
	vosfor: 400,
	visible: true,
	createdAt: "2016-12-05T17:34:17Z",
	updatedAt: "2021-05-21T14:59:02Z",
	itemId: "56783f24cbfa8f0432dd89a6",
	user: {
		id: "57426ce3d3ffb6355730cd09",
		ingameName: "KycKyc",
		avatar: "user/avatar/57c51a3ed3ffb672f34ae3e7.png?22448db7f423a89945968e0ab2563e3c",
		reputation: 0,
		locale: "en",
		platform: "pc",
		crossplay: true,
		status: "in_game",
		activity: {
			type: "on_mission",
			details: "The Circuit 55-75",
			startedAt: "2024-01-17T22:18:19Z"
		},
		lastSeen: "2024-01-17T22:18:19Z"
	}
}
```

---

## Transaction

Represents an order that has been fully or partially closed.

- **Golang Struct**
    
    ```go
    type TxItem struct {
    	Id         string `json:"id,omitempty"`
    	Rank       *int32 `json:"rank,omitempty"`
    	Charges    *int32 `json:"charges,omitempty"`
    	Subtype    string `json:"subtype,omitempty"`
    	AmberStars *int32 `json:"amberStars,omitempty"`
    	CyanStars  *int32 `json:"cyanStars,omitempty"`
    }
    
    type Transaction struct {
    	Id        string     `json:"id"`
    	Type      string     `json:"type"`
    	OriginId  string     `json:"originId"`
    	Platinum  int32      `json:"platinum"`
    	Quantity  int32      `json:"quantity"`
    	CreatedAt string     `json:"createdAt"`
    	UpdatedAt string     `json:"updatedAt"`
    	Item      *TxItem    `json:"item,omitempty"`
    	User      *UserShort `json:"user,omitempty"`
    }
    ```
    

**JSON Example**

```json
{
        id: "6849ae6370683e67b9103703",
        type: "sell",
        originId: "6848be91a3948400153846ed",
        platinum: 33,
        quantity: 6,
        createdAt: "2025-06-11T14:12:17Z",
        updatedAt: "2025-06-11T16:27:15Z",
        item: {
            id: "653833d6123a401b2563081d",
            rank: 5,
            charges: 6,
            subtype: "crafter",
            cyanStars: 5,
            amberStars: 7,
        },
        user: {
						id: "57426ce3d3ffb6355730cd09",
						ingameName: "KycKyc",
						avatar: "user/avatar/57c51a3ed3ffb672f34ae3e7.png?22448db7f423a89945968e0ab2563e3c",
						reputation: 0,
						locale: "en",
						platform: "pc",
						crossplay: true,
						status: "in_game",
						activity: {
							type: "on_mission",
							details: "The Circuit 55-75",
							startedAt: "2024-01-17T22:18:19Z"
						},
						lastSeen: "2024-01-17T22:18:19Z"
				}
}
```

Depends on endpoint, may have or not have `User` struct inside.

## UserShort

This is a shortened model of a user, which can be found in chats, messages, orders, bids, auctions, etc.

- **Golang Struct**
    
    
    ```go
    type UserShort struct {
    	Id         string  `json:"id"`
    	IngameName string  `json:"ingameName"`       // In-game name of the user.
    	Avatar     string  `json:"avatar,omitempty"` // Optional avatar image.
    	Reputation int16   `json:"reputation"`       // Reputation score.
    	Locale     string  `json:"locale"`           // Preferred communication language (e.g., 'en', 'ko', 'es').
    	Platform   string  `json:"platform"`         // Gaming platform used by the user.
    	Crossplay  bool    `json:"crossplay"`
    
    	Status   string   `json:"status"`   // Current status of the user.
    	Activity [Activity](https://www.notion.so/Data-Models-65e9ab01868c4dcca6ba499e68a04ac9?pvs=21) `json:"activity"` // Addition to the status, current activity of the user.
    	LastSeen string   `json:"lastSeen"` // Timestamp of the user's last online presence.
    }
    ```
    

**JSON Example**

```json
{
	id: "57426ce3d3ffb6355730cd09",
	ingameName: "KycKyc",
	avatar: "user/avatar/57c51a3ed3ffb672f34ae3e7.png?22448db7f423a89945968e0ab2563e3c",
	reputation: 0,
	locale: "en",
	platform: "pc",
	crossplay: true,
	status: "in_game",
	activity: {
		type: "on_mission",
		details: "The Circuit 55-75",
		startedAt: "2024-01-17T22:18:19Z"
	},
	lastSeen: "2024-01-17T22:18:19Z"
}
```

---

## User

Public user profile

- **Golang Struct**
    
    
    ```go
    // User represents a public user profile with full information.
    type User struct {
    	Id           string `json:"id"`                      // Unique identifier of the user.
    	IngameName   string `json:"ingameName"`              // User's in-game name.
    	Avatar       string `json:"avatar,omitempty"`        // Optional link to the user's avatar image.
    	Background   string `json:"background,omitempty"`    // Optional link to the user's profile background image.
    	About        string `json:"about,omitempty"`         // Optional HTML-formatted text about the user.
    	Reputation   int16  `json:"reputation"`              // User's reputation score.
    	MasteryLevel int8   `json:"masteryLevel,omitempty"`  // Optional in-game mastery level.
    
    	Platform   string `json:"platform"`   // Platform the user plays on.
    	Crossplay  bool   `json:"crossplay"`  // Indicates if the user is open to cross-platform trading.
    	Locale     string `json:"locale"`     // User's locale or preferred language.
    
    	AchievementShowcase [][Achievement](https://www.notion.so/Data-Models-65e9ab01868c4dcca6ba499e68a04ac9?pvs=21) `json:"achievementShowcase"` // List of achievements the user chose to showcase.
    
    	Status   string   `json:"status"`   // Current status of the user.
    	Activity [Activity](https://www.notion.so/Data-Models-65e9ab01868c4dcca6ba499e68a04ac9?pvs=21) `json:"activity"` // Current activity the user is engaged in.
    	LastSeen string   `json:"lastSeen"` // Timestamp of the user's last online presence.
    
    	Banned   bool   `json:"banned,omitempty"`   // Indicates whether the user is currently banned.
    	BanUntil string `json:"banUntil,omitempty"` // End date of the current ban, if applicable.
    
    	// Fields below are accessible only to moderators and admins.
    	Warned      bool   `json:"warned,omitempty"`      // Indicates whether the user has been warned.
    	WarnMessage string `json:"warnMessage,omitempty"` // Warning message, if any.
    	BanMessage  string `json:"banMessage,omitempty"`  // Ban message or reason for the ban, if any.
    }
    ```
    

**JSON Example**

```json
{
	id: "57426ce3d3ffb6355730cd09",
	ingameName: "KycKyc",
	slug: "kyckyc",
	avatar: "user/avatar/57c51a3ed3ffb672f34ae3e7.png?22448db7f423a89945968e0ab2563e3c",
	background: "user/background/54e0cdf8e77989024a1e34b2.png?14d961de874a4d8f10137e80403244be",
	about: "<p><code>warframe.market</code> developer</p>",
	reputation: 0,
	masteryLevel: 20,
	platform: "pc",
	crossplay: true,
	locale: "en",
	achievementShowcase: [
		{
			id: "57426ce3d3ffb6355730cd09",
			icon: "user/badges/04.png",
			thumb: "user/badges/04.thumb.png",
			type: "patreon",
			i18n: {
				en: {
					name: "Platinum Patron",
					description: "Thanks to this contributor, we can keep warframe.market alive!"
				}
			}
		},
		{
			id: "97426ce2d3ffb6335730cd09",
			icon: "user/badges/best_waifu.png",
			thumb: "user/badges/best_waifu.thumb.png",
			type: "custom",
			i18n: {
				en: {
					name: "Best waifu",
					description: "Hats off to you, Ultimate Waifu! You've officially stepped into the legendary league of the iconic hat aficionado. With loyalty that outshines even the most heroic of sidekicks and bravery that would make any adventurer jealous, you're the server's newfound star. Donning this epic headgear, you're not just a player, you're a walking, talking legend with a flair for dramatic narration. Congratulations on becoming the most charismatic, hat-toting hero in the game!"
				}
			}
		}
	],
	status: "in_game",
	activity: {
		type: "on_mission",
		details: "The Circuit 55-75",
		startedAt: "2024-01-17T22:18:19Z"
	},
	lastSeen: "2024-01-17T22:18:19Z",
	banned: true,
	banUntil: "2074-01-17T00:00:00Z",
	warned: true,
	warnMessage: "You're a bad person",
	banMessage: "Breaking TOS"
}
```

---

## UserPrivate

User profile, only available to the user itself.

- **Golang Struct**
    
    
    ```go
    type UserPrivate struct {
    	Id           string    `json:"id"`
    	Role         auth.Role `json:"role"`                 // Role assigned to the user (e.g., moderator, user).
    	IngameName   string    `json:"ingameName"`           // In-game name.
    	Avatar       string    `json:"avatar,omitempty"`     // Optional avatar image.
    	Background   string    `json:"background,omitempty"` // Optional background image.
    	About        string    `json:"about,omitempty"`      // Optional about text in html
    	AboutRaw     string    `json:"aboutRaw,omitempty"`   // Optional about text in raw markdown.
    	Reputation   int16     `json:"reputation"`           // Reputation score.
    	MasteryRank  int8      `json:"masteryRank"`         // In-game mastery level.
    	Credits      int32     `json:"credits"`              // In-game currency balance.
    
    	Platform   string `json:"platform"`   // Gaming platform.
    	Crossplay  bool   `json:"crossplay"`  // Crossplay enabled \ disabled
    	Locale     string `json:"locale"`     // Preferred communication language.
    	Theme      string `json:"theme"`      // Preferred color scheme for UI.
    
    	AchievementShowcase [][Achievement](https://www.notion.so/Data-Models-65e9ab01868c4dcca6ba499e68a04ac9?pvs=21) `json:"achievementShowcase"` // List of achievements the user chose to showcase.
    
    	Verification bool   `json:"verification"` // Verification status.
    	CheckCode    string `json:"checkCode"`    // Unique check code for the user.
    
    	Tier         auth.Tier `json:"tier"`         // Subscription tier.
    	Subscription bool      `json:"subscription"` // Subscription status.
    
    	Warned      bool   `json:"warned,omitempty"`
    	WarnMessage string `json:"warnMessage,omitempty"`
    	Banned      bool   `json:"banned,omitempty"`     // Ban status.
    	BanUntil    string `json:"banUntil,omitempty"`   // End date of the ban.
    	BanMessage  string `json:"banMessage,omitempty"` // Reason for the ban.
    
    	ReviewsLeft    int16    `json:"reviewsLeft"`    // How much reviews the user can still write today. (reset at midnight UTC)
    	UnreadMessages int16    `json:"unreadMessages"` // Count of unread messages.
    	IgnoreList     []string `json:"ignoreList"`     // List of ignored users.
    
    	DeleteInProgress bool   `json:"deleteInProgress,omitempty"` // Flag for pending deletion of the account.
    	DeleteAt         string `json:"deleteAt,omitempty"`     // Scheduled deletion date.
    
    	LinkedAccounts LinkedAccounts `json:"linkedAccounts"` // Accounts linked with the user's profile.
    	HasEmail       bool           `json:"hasEmail"`       // If the user has an email address.
    
    	LastSeen  string `json:"lastSeen"`  // Timestamp of the last online presence.
    	CreatedAt string `json:"createdAt"` // Account creation date.
    }
    ```
    

**JSON Example**

```json
SOON
```

---

## Activity 🚧

- **Golang Struct**
    
    
    ```go
    type Activity struct {
    	Type      [ActivityType](https://www.notion.so/Data-Models-65e9ab01868c4dcca6ba499e68a04ac9?pvs=21) `json:"type" `               // Name of the activity (e.g., 'on mission', 'dojo').
    	Details   string       `json:"details,omitempty"`   // Optional specifics about the activity (e.g., mission name, solo/squad status).
    	StartedAt string       `json:"startedAt,omitempty"` // Timestamp of the activity start.
    }
    ```
    

**JSON Example**

```json
{
	type: "on_mission",
	details: "The Circuit 55-75",
	startedAt: "2024-01-17T22:18:19Z"
}
```

Where:

`ActivityType` string could be `“on_mission" | "dojo" | “unknown” | ""` (for now)

---

## Achievement

- **Golang Struct**
    
    ```go
    type AchievementState struct {
    	Featured    bool   `json:"featured,omitempty"`    // If true, the achievement is featured
    	Hidden      bool   `json:"hidden,omitempty"`      // If true, the achievement is hidden from the public
    	Progress    *int32 `json:"progress,omitempty"`    // Current progress towards the achievement goal
    	CompletedAt string `json:"completedAt,omitempty"` // Timestamp when the achievement was achieved
    }
    
    type Achievement struct {
    	Id              string                          `json:"id"`
    	Slug            string                          `json:"slug"`
    	Type            string                          `json:"type"`                      // Type of the achievement (e.g., "task", "event", etc.)
    	Secret          bool                            `json:"secret,omitempty"`          // If true, the achievement is secret and not shown to public
    	ReputationBonus int32                           `json:"reputationBonus,omitempty"` // Reputation bonus for the achievement
    	Goal            int32                           `json:"goal,omitempty"`            // Goal to achieve
    	I18N            map[string]*AchievementI18N `json:"i18n"`                      // Localized text for the achievement
    	State           *AchievementState           `json:"state,omitempty"`           // Current state of the achievement
    }
    
    type AchievementI18N struct {
    	Name        string `json:"name"`
    	Description string `json:"description,omitempty"`
    	Icon        string `json:"icon,omitempty"`
    	Thumb       string `json:"thumb,omitempty"`
    }
    ```
    

**JSON Example**

```json
{
	id: "6324ae79cfca4d00514e0cf7",
	slug: "github_contribution",
	type: "github",
	goal: 5,
	i18n: {
		en: {
			name: "Contributor",
			description: "This badge approves the contribution towards warframe.market development.",
			icon: "user/badges/github_contribution.616d111a24024d0b4af37df0c26c387b.webp",
			thumb: "user/badges/thumbs/github_contribution.616d111a24024d0b4af37df0c26c387b.128x128.webp"
		}
	},
	state: {
		featured: true,
		progress: 5,
		completedAt: "2025-06-22T20:00:01Z"
	}
}
```

## DashboardShowcase

Mobile app main screen dashboard with featured items.

- **Golang Struct**
    
    ```go
    type DashboardShowcase struct {
    	I18N  map[string]*DashboardShowcaseI18NJson `json:"i18n,omitempty"`
    	Items []*DashboardShowcaseItemJson          `json:"items"`
    }
    
    type DashboardShowcaseI18N struct {
    	Title       string `json:"title"`
    	Description string `json:"description,omitempty"`
    }
    
    type DashboardShowcaseItem struct {
    	Item       string `json:"item"`
    	Background string `json:"background"`
    	BigCard    bool   `json:"bigCard"`
    }
    ```
    

**JSON Example**

```json
{
i18n: {
	en: {
		title: "Xaku Prime Access",
		description: "Xaku Prime, Quassus Prime and Trumna Prime are here!"
	}
},
items: [
		{
			item: "673516a9db3ac2cfade14a70",
			background: "showcase/xakuPrime.webp",
			bigCard: true
		},
		{
			item: "673516dddb3ac2cfade14a7c",
			background: "showcase/xakuPrimeSecondary.webp",
			bigCard: false
		},
		{
			item: "673516c5db3ac2cfade14a76",
			background: "showcase/xakuPrimeSecondary.webp",
			bigCard: false
		}
	]
}
```

## Status

Online status of user.

`invisible`, `offline`, `online`, `ingame`

## Activity type

`UNKNOWN`, `IDLE`, `ON_MISSION`, `IN_DOJO`, `IN_ORBITER`, `IN_RELAY`

## Role

Role on the site

`user`, `moderator`, `admin`

## Tier

Subscription tier, form Patreon \ Afdian \ Nitropay

`none`, `bronze`, `silver`, `gold`, `diamond`

## Language

One of the languages supported by the backend. 
Like, Frontend can have more languages, but they are only used to translate the user interface.

`ko`, `ru`, `de`, `fr`, `pt`, `zh-hans`, `zh-hant`, `es`, `it`, `pl`, `uk`, `en`

## Platform

Supported platforms

`pc`, `ps4`, `xbox`, `switch`, `mobile`

## Scope

Access scopes

`me`, `profile`, `settings`, `contracts`, `ledger`, `reviews`