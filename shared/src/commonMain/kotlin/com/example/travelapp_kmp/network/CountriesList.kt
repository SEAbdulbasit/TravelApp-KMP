package com.example.travelapp_kmp.network

import com.example.travelapp_kmp.listing.Country
import com.example.travelapp_kmp.listing.Location
import com.example.travelapp_kmp.listing.TouristPlace
import org.jetbrains.compose.resources.ExperimentalResourceApi
import travelappkmp.shared.generated.resources.Res
import travelappkmp.shared.generated.resources.*


/**
 * Created by abdulbasit on 30/05/2023.
 */

@OptIn(ExperimentalResourceApi::class)
fun getRestCountriesList() = listOf(
    Country(name = "Saudi Arabia", flagIcon = Res.drawable.sa, touristPlaces = listOf(
        TouristPlace(
            name = "Mecca",
            shortDescription = "Mecca, in a desert valley in western Saudi Arabia, is Islam’s holiest city, as it’s the birthplace of the Prophet Muhammad and the faith itself.",
            longDescription = "Mecca, also spelled Makkah, is one of the most important cities in Saudi Arabia and holds immense historical, religious, and cultural significance. Located in the western part of the country, Mecca is the birthplace of Islam and the Prophet Muhammad. It is the holiest city in Islam and the direction (qibla) towards which Muslims around the world turn in prayer. Masjid al-Haram\n" +
                    "\n" +
                    "The Grand Mosque, or Masjid al-Haram, is the largest mosque in the world and surrounds the Kaaba. It covers an area of 356,800 square meters and can accommodate up to four million worshippers during the Hajj season. The mosque complex includes important sites such as the Black Stone, Maqam Ibrahim, and the Zamzam Well.\n" +
                    "\n" +
                    "Jabal al-Nour\n" +
                    "\n" +
                    "Jabal al-Nour, or the \"Mountain of Light,\" is a significant site where the Prophet Muhammad received his first revelation from Allah through the Angel Gabriel. The cave of Hira, located on the mountain, is a place of spiritual significance for many Muslims.\n" +
                    "\n" +
                    "Mina, Arafat, and Muzdalifah\n" +
                    "\n" +
                    "These sites are integral to the Hajj pilgrimage rituals. Mina is known for the ritual of the stoning of the devil, Arafat is where pilgrims stand in prayer and reflection on the Day of Arafat, and Muzdalifah is where pilgrims collect pebbles for the stoning ritual.",
            location = Location(lat = 21.422510, long = 39.826168),
            images = listOf(
                Res.drawable.makah,
                Res.drawable.makkah_2,
                Res.drawable.arafat,
                Res.drawable.jabal_al_noor
            )
        ),
        TouristPlace(
            name = "Madinah",
            shortDescription = "Medina is a city in western Saudi Arabia. In the city center, the vast Al-Masjid an-Nabawi (Prophet's Mosque) is a major Islamic pilgrimage site. Its striking Green Dome rises above the tombs of the Prophet Muhammad and early Islamic leaders Abu Bakr and Umar.",
            longDescription = "Medina, also spelled Madinah, is a city of immense historical and religious significance located in the Hejaz region of western Saudi Arabia. It is the second holiest city in Islam after Mecca and serves as the burial place of the Prophet Muhammad. Medina is historically known as Yathrib before the advent of Islam. Medina is situated approximately 400 kilometers north of Mecca and 100 kilometers inland from the Red Sea coast." +
                    "Al-Masjid an-Nabawi\n" +
                    "\n" +
                    "The Prophet's Mosque, or Al-Masjid an-Nabawi, is the centerpiece of Medina. It is the second holiest mosque in Islam, after the Masjid al-Haram in Mecca. The mosque was originally built by the Prophet Muhammad himself and has since been expanded and renovated multiple times. The Green Dome, under which the Prophet's tomb is located, is a prominent feature of the mosque.\n" +
                    "\n" +
                    "The Hijra\n" +
                    "\n" +
                    "Medina's historical significance is deeply connected to the Hijra, the migration of the Prophet Muhammad and his followers from Mecca to Medina in 622 CE. This event marks the beginning of the Islamic calendar. Upon arrival, Muhammad established the first Muslim community and laid the foundation for the spread of Islam." +
                    "Quba Mosque\n" +
                    "\n" +
                    "The Quba Mosque is the first mosque ever built and holds a special place in Islamic history. It was constructed by the Prophet Muhammad and his companions upon their arrival in Medina. The mosque has been expanded and renovated over the centuries and is a significant destination for pilgrims." +
                    "Mount Uhud\n" +
                    "\n" +
                    "Mount Uhud is the site of the Battle of Uhud, a significant battle in early Islamic history. The battle took place in 625 CE between the early Muslims and the Meccan forces. The mountain and its surrounding area are visited by pilgrims to reflect on the sacrifices and lessons from the battle.",
            location = Location(lat = 24.470901, long = 39.612236),
            images = listOf(
                Res.drawable.madinah,
                Res.drawable.madinah_2,
                Res.drawable.masjid_quba,
                Res.drawable.mount_uhud
            )
        ),
        TouristPlace(
            name = "The Clock Towers",
            shortDescription = "The Clock Towers, also known as Abraj Al Bait, is a complex of seven skyscraper hotels in Mecca, Saudi Arabia. It's a prominent landmark and a symbol of modern Saudi Arabia.",
            longDescription = "The Clock Towers, also known as the Abraj Al Bait Towers, are a prominent landmark in Mecca, Saudi Arabia. This government-owned complex is situated just meters away from the Masjid al-Haram, the holiest site in Islam. The centerpiece of the complex is the Makkah Royal Clock Tower, which stands as the third tallest building and fifth tallest freestanding structure in the world, reaching a height of 601 meters (1,971 feet).\n" +
                    "\n" +
                    "The Clock Tower features the world's largest clock face, visible from a distance of up to 25 kilometers (16 miles). The complex includes luxury hotels, residential apartments, a shopping mall, and a conference center, catering to the millions of pilgrims visiting Mecca annually. The Clock Towers' architectural design combines modernity with Islamic elements, symbolizing the city's significance as a religious and cultural epicenter.",
            location = Location(lat = 24.470901, long = 39.612236),
            images = listOf(
                Res.drawable.colck_tower,
                Res.drawable.colck_tower_2,
                Res.drawable.colck_tower_3,
                Res.drawable.colck_tower_4
            )
        )
    )),
    Country(
        name = "Egypt", flagIcon = Res.drawable.eg, touristPlaces = listOf(
            TouristPlace(
                name = "Al-Azhar Masjid",
                shortDescription = "Al-Azhar Masjid is one of the most important historical strongholds for spreading and teaching Islam in Egypt and the Islamic world. It was built in 378 AH / 970 AD, And is located in Cairo, Egypt.",
                longDescription = "Al-Azhar Masjid is the most important Masjid in Egypt at all, and one of the historical strongholds for the spread and teaching of Islam. It is also one of the most famous archaeological Masjid in Egypt and the Islamic world, and part of the Al-Azhar Al-Sharif Foundation. Its construction dates back to Jumada al-Awwal 359 AH/970 AD. The Masjid is considered the second oldest continuously operating university in the world after the University of Al-Qarawiyyin. Although the Amr ibn al-Aas Masjid in Fustat preceded it in its teaching role, as lesson sessions were held there voluntarily and as a donation, the Al-Azhar Masjid was considered the first in Egypt to perform the role of regular schools and institutes. Its lessons were given by commission from the state and scholars and teachers were hired for them. During the French occupation of Egypt, a revolution began against the French forces from Al-Azhar on October 21, 1798. The Egyptian people, armed only with stones and spears, carried out heroic acts against Napoleon’s army, until the French general Jean-Baptiste Kleber was killed by Suleiman Al-Halabi, of Algerian origin, in March 1800. Student at Al-Azhar. Many scholars graduated from Al-Azhar who had a profound impact on spreading the teachings of Islam, such as the great scholar Muhammad Al-Ghazali.",
                images = listOf(
                    Res.drawable.al_azhar_masjid,
                    Res.drawable.al_azhar_masjid_2,
                ),
                location = Location(
                    lat = 30.0459,
                    long = 31.2627
                )
            ), TouristPlace(
                name = "Egyptian pyramids",
                shortDescription = "The Giza pyramid complex in Egypt is home to the Great Pyramid, the Pyramid of Khafre, and the Pyramid of Menkaure, along with their associated pyramid complexes and the Great Sphinx. All were built during the Fourth Dynasty of the Old Kingdom of ancient Egypt, between c. 2600 – c. 2500 BC. And There are some studies now that prove that it was built c. 10000 BC",
                longDescription = "The Egyptian pyramids are ancient masonry structures located in Egypt. Sources cite at least 118 identified \"Egyptian\" pyramids. Approximately 80 pyramids were built within the Kingdom of Kush, now located in the modern country of Sudan. Of those located in modern Egypt. The earliest known Egyptian pyramids are found at Saqqara, northwest of Memphis, although at least one step-pyramid-like structure has been found at Saqqara, dating to the First Dynasty: which has been attributed to the reign of Pharaoh Anedjib, with inscriptions, and other archaeological remains of the period, suggesting there may have been others. The otherwise earliest among these is the Pyramid of Djoser built during the Third Dynasty. This pyramid and its surrounding complex are generally considered to be the world's oldest monumental structures constructed of dressed masonry. The most famous Egyptian pyramids are those found at Giza, on the outskirts of Cairo. Several of the Giza pyramids are counted among the largest structures ever built. The Pyramid of Khufu is the largest Egyptian pyramid and the last of the Seven Wonders of the Ancient World still in existence.",
                images = listOf(
                    Res.drawable.py,
                    Res.drawable.py_2,
                    Res.drawable.py_3,
                    Res.drawable.py_4,
                ),
                location = Location(
                    lat = 29.9792,
                    long = 31.1342
                )
            ), TouristPlace(
                name = "Citadel of Saladin",
                shortDescription = "The Citadel of Cairo or Citadel of Saladin (Qalaʿat Salāḥ ad-Dīn) is an Islamic-era fortification in Cairo, Egypt, built by Salah ad-Din and further developed by subsequent Egyptian rulers. It was the seat of government in Egypt and the residence of its rulers for nearly 700 years from the 13th century until the construction of Abdeen Palace in the 19th century.",
                longDescription = "The Citadel was built on a promontory beneath the Muqattam Hills, a setting that made it difficult to attack. The efficacy of the Citadel's location is further demonstrated by the fact that it remained the heart of Egyptian government until the 19th century. During this long period, the layout and structure of the Citadel was repeatedly altered and adapted to suit the designs of new rulers and new regimes, which makes it difficult to reconstitute its original plan or even its plan in subsequent periods. There have been three major construction periods leading to the Citadel's current form: 12th-century Ayyubid (starting with Saladin), 14th-century Mamluk (under al-Nasir Muhammad), and in the 19th century under Muhammad Ali. The Citadel stopped being the seat of government when Egypt's ruler, Khedive Ismail, moved to his newly built Abdin Palace in the new downtown Cairo in 1874. Despite its elaborate defenses, the Citadel never ended up being subjected to a true siege, though it was implicated on various occasions in the political conflicts within Cairo or Egypt.",
                images = listOf(
                    Res.drawable.ca_salah,
                    Res.drawable.ca_salah_1,
                    Res.drawable.ca_salah_2,
                    Res.drawable.ca_salah_3,
                ),
                location = Location(
                    lat = 30.0287,
                    long = 31.2597
                )
            )
        )
    ),
    Country(
        name = "Japan", flagIcon = Res.drawable.jp, touristPlaces = listOf(
            TouristPlace(
                name = "Tokyo Skytree",
                shortDescription = "The Tokyo Skytree is a towering communications and observation tower located in Tokyo, Japan. At 634 meters tall, it is the tallest structure in Japan and offers breathtaking views of the city from its observation deck.",
                longDescription = "The Tokyo Skytree is a stunning architectural landmark located in the Sumida ward of Tokyo, Japan. Standing at 634 meters tall, it is the tallest structure in Japan and one of the tallest towers in the world. The tower was built as a communications tower, but it also features a large observation deck that offers breathtaking views of the city and beyond. Visitors to the Tokyo Skytree can take an elevator to the observation deck, which is located at a height of 450 meters. From here, they can enjoy 360-degree views of the city, including iconic landmarks such as Tokyo Tower and the Tokyo Metropolitan Government Building. On clear days, it is even possible to see as far as Mount Fuji, located over 100 kilometers away. In addition to the observation deck, the Tokyo Skytree also features a number of shops and restaurants, as well as a historical exhibit about the history and culture of the area. The tower is also a popular destination for night time views, as the city lights up below. Overall, the Tokyo Skytree is a must-visit destination for anyone traveling to Tokyo. Whether you're an architecture or history buff, or just looking for a stunning view, the tower is sure to impress.",
                images = listOf(
                    Res.drawable.tokyo_skytree_1,
                    Res.drawable.tokyo_skytree_2,
                    Res.drawable.tokyo_skytree_3,
                    Res.drawable.tokyo_skytree_4,
                ),
                location = Location(
                    lat = 35.7101,
                    long = 139.8107
                )
            ), TouristPlace(
                name = "Fushimi Inari Taisha",
                shortDescription = "Fushimi Inari Taisha is a famous Shinto shrine located in Kyoto, Japan, dedicated to the god of agriculture and prosperity, Inari. The shrine is known for its thousands of vermilion torii gates, which line the trails leading up to the main shrine buildings and offer a peaceful and scenic walk for visitors.",
                longDescription = "Fushimi Inari Taisha is a Shinto shrine located in the Fushimi ward of Kyoto, Japan. It is one of the most popular tourist destinations in the city and is dedicated to Inari, the god of agriculture and prosperity. The shrine is known for its thousands of vermilion torii gates, which line the trails leading up to the main shrine buildings. The trails, known as the Senbon Torii, wind through the forested hills behind the shrine, offering a peaceful and scenic walk for visitors.The torii gates were donated by businesses and individuals who believed that the blessings of Inari would bring them success and prosperity. The trail leading up to the main shrine buildings is approximately 4 kilometers long and takes about 2-3 hours to complete, but visitors can choose to walk as far as they like. Along the way, there are smaller shrines and statues dedicated to Inari and other gods, as well as food stalls selling traditional Japanese treats. At the main shrine buildings, visitors can offer prayers and make offerings to Inari, and the shrine is a popular destination for those seeking blessings for business success and good fortune. The history of Fushimi Inari Taisha dates back to the 8th century, and it has been a place of worship for over 1,000 years. The shrine and its trails are a unique and breathtaking example of traditional Japanese culture and religion, and a must-visit for those traveling to Kyoto.",
                images = listOf(
                    Res.drawable.fushimi_inari_taisha_1,
                    Res.drawable.fushimi_inari_taisha_2,
                    Res.drawable.fushimi_inari_taisha_3,
                    Res.drawable.fushimi_inari_taisha_4,
                    Res.drawable.fushimi_inari_taisha_5,
                    Res.drawable.fushimi_inari_taisha_6,
                ),
                location = Location(
                    lat = 34.9677,
                    long = 135.7792
                )
            ), TouristPlace(
                name = "Mount Fuji",
                shortDescription = "Mount Fuji is the highest mountain in Japan and a symbol of Japanese culture and history. It is a UNESCO World Heritage site and a popular destination for climbers and tourists alike.",
                longDescription = "Mount Fuji is a stunning and iconic symbol of Japanese culture and history. Standing at 3,776 meters tall, it is the highest mountain in Japan and a UNESCO World Heritage site. Mount Fuji has been revered by the Japanese for centuries and is considered a sacred site by many. The mountain is located about 100 kilometers southwest of Tokyo and is easily visible from the city on a clear day. Mount Fuji is a popular destination for climbers and tourists, who come to experience its beauty and cultural significance. The climbing season typically runs from July to September, and the ascent is a challenging but rewarding experience for those who are prepared. Along the way, climbers can enjoy stunning views of the surrounding landscape and stop at mountain huts for rest and refreshment. For those who prefer not to climb, there are many observation points and cultural sites surrounding Mount Fuji, including the famous Lake Kawaguchiko and the historic town of Hakone. These areas offer spectacular views of the mountain and are popular tourist destinations in their own right. Overall, Mount Fuji is a must-visit destination for anyone traveling to Japan, offering a unique combination of natural beauty and cultural significance. Whether you climb to the summit or simply admire it from a distance, the experience is sure to be unforgettable.",
                images = listOf(
                    Res.drawable.mount_fuji_1,
                    Res.drawable.mount_fuji_2,
                    Res.drawable.mount_fuji_3,
                    Res.drawable.mount_fuji_4,
                    Res.drawable.mount_fuji_5,
                    Res.drawable.mount_fuji_6,
                    Res.drawable.mount_fuji_7,
                    Res.drawable.mount_fuji_8
                ),
                location = Location(
                    lat = 35.3606,
                    long = 138.7274
                )
            )
        )
    ),
    Country(
        name = "France", flagIcon = Res.drawable.fr, touristPlaces = listOf(
            TouristPlace(
                name = "Eiffel Tower",
                shortDescription = "The Eiffel Tower is a landmark iron lattice tower located in Paris, France. Standing at 324 meters tall, it is the tallest structure in Paris and one of the most recognizable symbols of France.",
                longDescription = "The Eiffel Tower is an iconic symbol of France and one of the most recognizable landmarks in the world. Located in Paris, the tower stands at 324 meters tall and was built as the centerpiece of the 1889 Exposition Universelle, a world's fair held in Paris to commemorate the 100th anniversary of the French Revolution. Designed by Gustave Eiffel, the tower is constructed of iron lattice work and was the tallest structure in the world when it was completed. Today, the Eiffel Tower is one of the most popular tourist destinations in Paris, attracting millions of visitors each year. Visitors can take the stairs or an elevator to the top of the tower, where they can enjoy stunning views of Paris and its landmarks, including the Seine River, Notre-Dame Cathedral, and the Louvre Museum. The tower is also a popular spot for picnics and romantic evenings, as the city lights up below. In addition to its stunning views, the Eiffel Tower is also an important cultural and historical landmark, representing the technological achievements of the late 19th century and serving as a symbol of France and Paris for over a century. Overall, the Eiffel Tower is a must-visit destination for anyone traveling to Paris, offering a unique combination of natural beauty, cultural significance, and breathtaking views of the city.",
                images = listOf(
                    Res.drawable.eiffel_tower_2,
                    Res.drawable.eiffel_tower_3,
                    Res.drawable.eiffel_tower_4
                ),
                location = Location(
                    lat = 48.8584,
                    long = 2.2945
                )
            ), TouristPlace(
                name = "Mont Saint Michel",
                shortDescription = "Mont Saint Michel is a stunning island commune located in Normandy, France. It is famous for its historic abbey and its picturesque setting, surrounded by sandbanks and the sea.",
                longDescription = "Mont Saint Michel is a breathtaking island commune located in Normandy, France. The island is famous for its historic abbey, which sits atop a rocky outcropping and is surrounded by sandbanks and the sea. The abbey is one of the most recognizable landmarks in France and is considered one of the country's greatest architectural wonders. The history of Mont Saint Michel dates back over a thousand years, and the island has served as a pilgrimage site, a fortress, and a prison over the centuries. Today, the abbey is a museum, and visitors can tour the impressive building and admire its gothic architecture, stained glass windows, and elaborate carvings. In addition to the abbey, Mont Saint Michel is also known for its picturesque setting and its stunning natural beauty. The island is surrounded by vast sandbanks that are covered in water during high tide and exposed during low tide. Visitors can explore the island's narrow streets and alleyways, visit its shops and restaurants, and enjoy breathtaking views of the sea and the surrounding landscape. Whether you're a history buff, an architecture lover, or just looking for a unique natural wonder, Mont Saint Michel is a must-visit destination in Normandy, France. With its rich history, stunning architecture, and breathtaking setting, Mont Saint Michel is sure to leave a lasting impression on visitors.",
                images = listOf(
                    Res.drawable.mont_saint_michel_1,
                    Res.drawable.mont_saint_michel_2,
                    Res.drawable.mont_saint_michel_3,
                    Res.drawable.mont_saint_michel_4,
                    Res.drawable.mont_saint_michel_5,
                    Res.drawable.mont_saint_michel_6,
                ),
                location = Location(
                    lat = 48.6361,
                    long = 1.5115
                )
            )
        )
    ),
    Country(
        name = "Bangladesh", flagIcon = Res.drawable.bd, touristPlaces = listOf(
            TouristPlace(
                name = "Cox's Bazar",
                shortDescription = "TCox’s Bazar is a town on the southeast coast of Bangladesh. It’s known for its very long, sandy beachfront, stretching from Sea Beach in the north to Kolatoli Beach in the south. Aggameda Khyang monastery is home to bronze statues and centuries-old Buddhist manuscripts. South of town, the tropical rainforest of Himchari National Park has waterfalls and many birds. North, sea turtles breed on nearby Sonadia Island.",
                longDescription = "Cox's Bazar (Bengali: কক্সবাজার) is a city, fishing port, tourism centre, and district headquarters in southeastern Bangladesh. The iconic Cox's Bazar Beach, one of the most popular tourist attractions in Bangladesh, is the longest uninterrupted beach in the world. It is located 150 km (93 mi) south of the city of Chittagong. Cox's Bazar is also known by the name Panowa, which translates literally as \"yellow flower.\" An old name was \"Palongkee\". Kutupalong refugee camp with more than a million Rohingya refugees is in Cox's Bazar.",
                images = listOf(
                    Res.drawable.bangladesh_coxs_bazar_1,
                    Res.drawable.bangladesh_coxs_bazar_2,
                    Res.drawable.bangladesh_coxs_bazar_3,
                    Res.drawable.bangladesh_coxs_bazar_4,
                    Res.drawable.bangladesh_coxs_bazar_5
                ),
                location = Location(
                    lat = 21.4272,
                    long = 92.0061
                )
            ), TouristPlace(
                name = "St. Martin's Island (Saint Martin)",
                shortDescription = "Saint Martin is part of the Leeward Islands in the Caribbean Sea. It comprises 2 separate countries, divided between its northern French side, called Saint-Martin, and its southern Dutch side, Sint Maarten. The island is home to busy resort beaches and secluded coves. It's also known for fusion cuisine, vibrant nightlife and duty-free shops selling jewelry and liquor.",
                longDescription = "Saint Martin Island (Bengali: সেন্টমার্টিন দ্বীপ) is a small island (area only 3 km2) in the northeastern part of the Bay of Bengal, about 9 km south of the tip of the Cox's Bazar-Teknaf peninsula, and forming the southernmost part of Bangladesh. There is a small adjoining island that is separated at high tide, called Chera Dwip. It is about 8 kilometres (5 miles) west of the northwest coast of Myanmar, at the mouth of the Naf River.",
                images = listOf(
                    Res.drawable.bangladesh_saint_martin_1,
                    Res.drawable.bangladesh_saint_martin_2,
                    Res.drawable.bangladesh_saint_martin_3,
                    Res.drawable.bangladesh_saint_martin_4,
                    Res.drawable.bangladesh_saint_martin_5,
                    Res.drawable.bangladesh_saint_martin_6,
                    Res.drawable.bangladesh_saint_martin_7,
                    Res.drawable.bangladesh_saint_martin_8
                ),
                location = Location(
                    lat = 18.0708,
                    long = 63.0501
                )
            ), TouristPlace(
                name = "Rangamati",
                shortDescription = "Rangamati is the administrative headquarter and town of Rangamati Hill District in the Chittagong Hill Tracts of Bangladesh. The town is located at 22°37'60N 92°12'0E and has an altitude of 14 metres. It is also where Ropuiliani, a Mizo chieftess, was jailed and died, during the British rule in Mizoram.",
                longDescription = "Rangamati (Bengali: রাঙ্গামাটি;) is the administrative headquarter and town of Rangamati Hill District in the Chittagong Hill Tracts of Bangladesh. The town is located at 22°37'60N 92°12'0E and has an altitude of 14 metres (46 ft). It is also where Ropuiliani, a Mizo chieftess, was jailed and died, during the British rule in Mizoram.\nFrom Chittagong a 77 kilometres (48 mi) road leads to Rangamati. The township is located on the western bank of the Kaptai lake. Rangamati is a holiday destination because of its landscape, scenery, lake, indigenous groups (Chakma, Marma, Mizo, Tripuri, Tanchangya, etc.), flora and fauna, indigenous museum and hanging bridge.",
                images = listOf(
                    Res.drawable.bangladesh_rangamati_1,
                    Res.drawable.bangladesh_rangamati_2,
                    Res.drawable.bangladesh_rangamati_3,
                    Res.drawable.bangladesh_rangamati_4
                ),
                location = Location(
                    lat = 22.6620,
                    long = 92.1611
                )
            ), TouristPlace(
                name = "Bandarban",
                shortDescription = "It is one of the three hill districts of Bangladesh and a part of the Chittagong Hill Tracts, the others being Rangamati District and Khagrachhari District.",
                longDescription = "Bandarban (Bengali: বান্দরবান, Chakma: \uD804\uDD1D\uD804\uDD1A\uD804\uDD34\uD804\uDD18\uD804\uDD27\uD804\uDD22\uD804\uDD34\uD804\uDD1D\uD804\uDD1A\uD804\uDD34) is a district in South-Eastern Bangladesh, and a part of the Chittagong Division. It is one of the three hill districts of Bangladesh and a part of the Chittagong Hill Tracts, the others being Rangamati District and Khagrachhari District. Bandarban district (4,479 km2) is not only the most remote district of the country, but also the least populous (population 388,000). There is an army contingent at Bandarban Cantonment.",
                images = listOf(
                    Res.drawable.bangladesh_bandarban_1,
                    Res.drawable.bangladesh_bandarban_2,
                    Res.drawable.bangladesh_bandarban_3,
                    Res.drawable.bangladesh_bandarban_4
                ),
                location = Location(
                    lat = 22.1961,
                    long = 92.2176
                )
            ), TouristPlace(
                name = "Lalbagh Fort",
                shortDescription = "Lalbagh Fort is a fort in the old city of Dhaka, Bangladesh. Its name is derived from its neighborhood Lalbagh, which means Red Garden. The term Lalbagh refers to reddish and pinkish architecture from the Mughal period. The original fort was called Fort Aurangabad.",
                longDescription = "Lalbagh Fort (Bengali: লালবাগ কেল্লা) is a fort in the old city of Dhaka, Bangladesh. Its name is derived from its neighborhood Lalbagh, which means Red Garden. The term Lalbagh refers to reddish and pinkish architecture from the Mughal period. The original fort was called Fort Aurangabad. Its construction was started by Prince Muhammad Azam Shah, who was the son of Emperor Aurangzeb and a future Mughal emperor himself. After the prince was recalled by his father, the fort's construction was overseen by Shaista Khan. The death of Shaista Khan's daughter Pari Bibi (Fairy Lady) resulted in a halt to the construction process, apparently due to Shaista Khan's superstition that the fort brought bad omen. Pari Bibi was buried inside the fort.\n" +
                        "\n" +
                        "Lalbagh Fort was built as the official residence of the governor of the Mughal province of Bengal, Bihar and Orissa. The complex includes the Mughal governor's house, the tomb of Pari Bibi and a mosque. It is covered by lawns, fountains and water channels. Its two south gates were previously grand arches. The original grand complex covered the governor's house and the two archways. The tomb of Pari Bibi was later added. Lalbagh Fort was modelled as a miniature version of great Mughal forts like the Red Fort and Fatehpur Sikri. During the reign of Emperor Aurangzeb, Mughal Bengal became the economic engine of the empire. Emperor Aurangzeb called Bengal the Paradise of Nations. Dhaka grew into an imperial city with one of the richest elites in the Mughal Empire, including members of the imperial family. Mughal artillery guarded the fort. Once located beside the Buriganga River, the river has retreated from the vicinity of the fort. The fort was depicted in European paintings during the 18th and 19th centuries.\n" +
                        "\n" +
                        "Today, Lalbagh Fort is one of the most visited sites in Dhaka. Several pieces of artillery are kept inside the fort. The Ambassadors Fund for Cultural Preservation is funding a restoration project for parts of the fort. Lalbagh Fort is one of the most recognized symbols of Mughal rule in Bengal. ",
                images = listOf(
                    Res.drawable.bangladesh_lalbagh_1,
                    Res.drawable.bangladesh_lalbagh_2,
                    Res.drawable.bangladesh_lalbagh_3,
                    Res.drawable.bangladesh_lalbagh_4
                ),
                location = Location(
                    lat = 23.7189,
                    long = 90.3882
                )
            ), TouristPlace(
                name = "Ahsan Manzil Museum",
                shortDescription = "Ahsan Manzil is a palace located in the Kumartoli area of Dhaka, Bangladesh. It was formerly the residence and seat of the Nawab of Dhaka and has been designated an Old Dhaka Heritage Site. It now serves as a museum.",
                longDescription = "During the Mughal Empire, Sheikh Enayet Ullah, Zamindar of the Jamalpur Porgona district, had a garden house on this property and later added a palace, which he called Rongmohol. He was buried on the northeast corner of the palace yard but his gravesite was ruined at the beginning of the 20th century. His son Sheikh Moti Ullah sold the property to French traders, who erected a trading house beside the property. After changing hands a number of times over the next several centuries, the property was purchased by Khwaja Alimullah in the 1800s. Alimullah renovated the property, turning the trading house into a residence and adding a stable and family mosque. After his death, his son Khwaja Abdul Ghani named the property Ahsan Manzil after his son, Khwaja Ahsanullah. He continued renovations; the old building was renamed Ondor Mohol and the new building was called Rangmahal.\n" +
                        "\n" +
                        "On 7 April 1888, a tornado severely damaged Ahsan Manzil and it was temporarily abandoned. With the exception of Rangmahal, which only required repairs, all buildings had to be rebuilt. Abdul Ghani and Ahsanullah continued renovations. What was previously the French trading house was rebuilt as a two-storey building similar to the Rangmahal. A wooden bridge connected the first floors of the two buildings. The palace was repaired again following the 1897 Assam earthquake. After Ahsanullah's death in 1901, the property again changed hands due in part to disagreements within the family. It was a slum for a period before the government acquired it in 1952 under the East Bengal Estate Acquisition Act.\n" +
                        "\n" +
                        "The Government of Bangladesh acquired the palace and property in 1985 and began renovating it, taking care to preserve the remaining structure. Renovations were completed in 1992 and ownership was transferred to the Bangladesh National Museum. Part of the northern side of the property was given to the Dhaka City Corporation while half of the Andarmahal and the Nawab residential area were beyond acquisition.[clarification needed] Just under 5 acres (220,000 sq ft) was then used for the museum.",
                images = listOf(
                    Res.drawable.bangladesh_ahsan_manjil_1,
                    Res.drawable.bangladesh_ahsan_manjil_2,
                    Res.drawable.bangladesh_ahsan_manjil_3
                ),
                location = Location(
                    lat = 23.7085,
                    long = 90.4060
                )
            ), TouristPlace(
                name = "Sajek Valley",
                shortDescription = "Sajek Valley is one of the most popular tourist spots in Bangladesh situated among the hills of the Kasalong range of mountains in Sajek union, Baghaichhari Upazila in Rangamati District. The valley is 2,000 feet above sea level. Sajek Valley is known as the Queen of Hills & Roof of Rangamati.",
                longDescription = "Sajek Valley is one of the most popular tourist spots in Bangladesh situated among the hills of the Kasalong range of mountains in Sajek union, Baghaichhari Upazila in Rangamati District. The valley is 2,000 feet (610 m) above sea level. Sajek Valley is known as the Queen of Hills & Roof of Rangamati.",
                images = listOf(
                    Res.drawable.bangladesh_sajek_valley_1,
                    Res.drawable.bangladesh_sajek_valley_2,
                    Res.drawable.bangladesh_sajek_valley_3,
                    Res.drawable.bangladesh_sajek_valley_4,
                ),
                location = Location(
                    lat = 23.3838,
                    long = 92.2939
                )
            ), TouristPlace(
                name = "Sundarbans",
                shortDescription = "Sundarbans is a mangrove area in the delta formed by the confluence of the Ganges, Brahmaputra and Meghna Rivers in the Bay of Bengal. Sundarban Reserve Forest of Bangladesh is the largest mangrove forest in the world.",
                longDescription = "Sundarbans (pronounced /sʌnˈdɑːrbənz/) is a mangrove area in the delta formed by the confluence of the Ganges, Brahmaputra and Meghna Rivers in the Bay of Bengal. Sundarban Reserve Forest (SRF) of Bangladesh is the largest mangrove forest in the world. It spans the area from the Baleswar River in Bangladesh's division of Khulna to the Hooghly River in India's state of West Bengal. It comprises closed and open mangrove forests, land used for agricultural purpose, mudflats and barren land, and is intersected by multiple tidal streams and channels. Sundarbans is home to the world's largest area of mangrove forests. Four protected areas in the Sundarbans are enlisted as UNESCO World Heritage Sites, viz. Sundarbans West (Bangladesh), Sundarbans South (Bangladesh), Sundarbans East (Bangladesh) and Sundarbans National Park (India).\n" +
                        "\n" +
                        "Despite the protected status, the Indian Sundarbans were considered endangered in a 2020 assessment under the IUCN Red List of Ecosystems framework. The Sundarbans mangrove forest covers an area of about 10,000 km2 (3,900 sq mi), of which forests in Bangladesh's Khulna Division extend over 6,517 km2 (2,516 sq mi) and in West Bengal, they extend over 3,483 km2 (1,345 sq mi) across the South 24 Parganas and North 24 Parganas districts. The most abundant tree species are sundri (Heritiera fomes) and gewa (Excoecaria agallocha). The forests provide habitat to 453 fauna wildlife, including 290 bird, 120 fish, 42 mammal, 35 reptile and eight amphibian species. Despite a total ban on all killing or capture of wildlife other than fish and some invertebrates, there has been a consistent pattern of depleted biodiversity or loss of species in the 20th century, with the ecological quality of the forest declining.\n" +
                        "\n" +
                        "Despite preservation commitments from both governments, the Sundarbans are under threat from both natural and human-made causes. In 2007, the landfall of Cyclone Sidr damaged around 40% of the Sundarbans. The forest is also suffering from increased salinity caused by rising sea levels due to climate change and reduced freshwater supply. In May 2009 Cyclone Aila devastated the Sundarbans with massive casualties. At least 100,000 people were affected by this cyclone. The proposed coal-fired Rampal power station situated 14 km (8.7 mi) north of the Sundarbans at Rampal Upazila of Bagerhat District in Khulna, Bangladesh, is anticipated to further damage this unique mangrove forest according to a 2016 report by UNESCO. Climate change is expected to continue to negatively affect both natural systems and human populations in the region, resulting in further ecosystem degradation and climate migration. Experts examining the region recommend further focus on mangrove restoration and management and advocating for adaptation of human populations, through processes like managed retreat and investments in resilient infrastructure.",
                images = listOf(
                    Res.drawable.bangladesh_sundarbans_1,
                    Res.drawable.bangladesh_sundarbans_2,
                    Res.drawable.bangladesh_sundarbans_3,
                    Res.drawable.bangladesh_sundarbans_4,
                    Res.drawable.bangladesh_sundarbans_5,
                ),
                location = Location(
                    lat = 21.9497,
                    long = 89.1833
                )
            )
        )
    ),
    Country(
        name = "India", flagIcon = Res.drawable.india, touristPlaces = listOf(
            TouristPlace(
                name = "Taj Mahal",
                shortDescription = "The Taj Mahal, an ivory-white marble monument in Agra, India, embodies eternal love. Built by Mughal emperor Shah Jahan in memory of his third wife Mumtaz Mahal, it's a UNESCO World Heritage Site and one of the New Seven Wonders of the World. Its symmetrical design, intricate carvings, and lush gardens mesmerize visitors. From its white brilliance at dawn to its golden glow at sunset, the Taj Mahal reflects beauty, grief, and architectural excellence.",
                longDescription = "Rising majestically on the banks of the Yamuna river, the Taj Mahal is a timeless ode to love. Mughal emperor Shah Jahan, heartbroken by the loss of his beloved wife Mumtaz Mahal in 1631, commissioned this architectural marvel as her final resting place. Construction began in 1632, employing over 20,000 artisans for over 20 years.\n" + "\n" + "The Taj Mahal's beauty lies in its perfect symmetry and intricate details. White marble, sourced from Rajasthan, gleams under the sun, inlaid with semi-precious stones like lapis lazuli and carnelian forming captivating floral patterns. Calligraphic inscriptions from the Quran adorn the arches and doorways, adding a spiritual dimension. Four minarets gracefully flank the main mausoleum, reflecting in the reflecting pool below, creating a breathtaking mirror image.\n" + "\n" + "Inside, the cenotaphs of Mumtaz Mahal and Shah Jahan, encased in intricately carved marble screens, lie amidst floral designs and precious stones. The octagonal chamber resonates with a serene atmosphere, a testament to the love story etched in its every detail.\n" + "\n" + "Beyond the mausoleum, lush gardens adorned with fountains and pools extend along the Yamuna, symbolizing the path to paradise. The entire complex, including the mosque and guest house, stands as a magnificent example of Mughal architecture, blending Persian, Indian, and Islamic influences.\n" + "\n" + "The Taj Mahal transcends its role as a mausoleum. It's a symbol of love, loss, and artistic brilliance, captivating hearts and imaginations for centuries. Its ever-changing hues throughout the day, from soft pink at dawn to ethereal white in the afternoon, and golden yellow under the moonlight, add to its magic.\n" + "\n" + "Visiting the Taj Mahal is an unforgettable experience, a journey through history, love, and architectural wonder. It's a reminder that even in the face of grief, beauty can endure, leaving an eternal mark on the world.\n" + "\n",
                images = listOf(
                    Res.drawable.india_taj_mahal_1,
                    Res.drawable.india_taj_mahal_2,
                    Res.drawable.india_taj_mahal_3,
                    Res.drawable.india_taj_mahal_4,
                    Res.drawable.india_taj_mahal_5
                ),
                location = Location(
                    lat = 27.1751,
                    long = 78.0421
                )
            ),
            TouristPlace(
                name = "Varanasi",
                shortDescription = "Varanasi, also known as Kashi, is an ancient city in India located on the banks of the holy Ganges River. It's considered the spiritual capital of India and one of the seven sacred cities in Hinduism. Renowned for its vibrant culture, rich history, and spiritual significance, Varanasi attracts millions of pilgrims and tourists every year. The city pulsates with life along the numerous ghats (bathing steps) where pilgrims perform rituals and devotees offer prayers. Witnessing the sunrise over the Ganges and the evening aarti ceremony is a mesmerizing experience. From bustling bazaars to serene temples, Varanasi offers a unique blend of spirituality, tradition, and modernity.",
                longDescription = "Varanasi, steeped in history and mythology, is believed to be one of the oldest continuously inhabited cities in the world. Dating back to the 11th century BC, it has witnessed the rise and fall of empires, the evolution of cultures, and the enduring spirit of Hinduism. Fondly called Kashi, the city embodies the essence of India's spiritual heritage.\n" + "\n" + "The Ganges River, considered sacred by Hindus, forms the very lifeblood of Varanasi. The numerous ghats along its banks come alive with pilgrims performing pujas (worship rituals), taking dips in the holy water, and offering diyas (earthen lamps) in the evening aarti ceremony, creating a mesmerizing spectacle. The air resonates with chants, prayers, and the rhythmic clanging of temple bells.\n" + "\n" + "Wandering through the narrow lanes and bustling bazaars of Varanasi is an immersive experience. The aroma of spices fills the air, and shops overflow with colorful silk sarees, handcrafted souvenirs, and mouthwatering street food. The Kashi Vishwanath Temple, dedicated to Lord Shiva, is one of the holiest Hindu shrines, attracting devotees from all walks of life.\n" + "\n" + "Beyond the religious significance, Varanasi is a vibrant center of art, music, and culture. Classical music performances, traditional dance forms like Kathak, and vibrant folk art showcase the city's rich cultural tapestry. From witnessing the sunrise over the Ganges to exploring the ancient temples and bustling markets, Varanasi offers a unique and unforgettable experience for every visitor.\n" + "\n",
                images = listOf(
                    Res.drawable.india_varanasi_1,
                    Res.drawable.india_varanasi_2,
                    Res.drawable.india_varanasi_3,
                    Res.drawable.india_varanasi_4,
                    Res.drawable.india_varanasi_5,
                    Res.drawable.india_varanasi_6,
                    Res.drawable.india_varanasi_7,
                ),
                location = Location(
                    lat = 25.3176,
                    long = 82.9739
                )
            ),
            TouristPlace(
                name = "Munnar",
                shortDescription = "Munnar, nestled amidst the rolling hills of the Western Ghats in Kerala, is a postcard-perfect hill station adorned with emerald tea plantations, cascading waterfalls, and breathtaking vistas. Renowned for its cool climate, scenic beauty, and rich biodiversity, it's an ideal escape for nature lovers and adventure seekers. Explore sprawling tea estates, trek through lush forests, boat on serene lakes, or witness the majestic Anamudi peak, South India's highest. From cascading Echo Point to the aromatic spice markets, Munnar offers a delightful blend of nature's charm and cultural heritage.",
                longDescription = "Embraced by the cool embrace of the Western Ghats, Munnar paints a canvas of breathtaking beauty in Kerala. This idyllic hill station, named after the confluence of three mountain streams (meaning \"three rivers\" in Malayalam), was once a favored summer retreat for the British Raj. Today, it attracts travelers seeking solace in nature's embrace.\n" + "\n" + "Carpeted with emerald tea plantations that stretch as far as the eye can see, Munnar exudes a refreshing aroma. Wander through these manicured estates, witness the tea plucking process, and indulge in a cup of locally brewed tea - a true sensory experience. Nature enthusiasts can trek through Shola forests teeming with diverse flora and fauna, spot Nilgiri tahr grazing on the slopes, or embark on an adventurous jeep safari.\n" + "\n" + "Waterfalls like Echo Point and Attukal cascade down verdant hills, creating mesmerizing spectacles. Serene lakes like Kundala invite boat rides amidst breathtaking scenery. For panoramic views, head to Anamudi Peak, South India's highest, or witness the sunrise paint the sky with vibrant hues at Top Station.\n" + "\n" + "Beyond its natural beauty, Munnar offers a glimpse into Kerala's rich heritage. Explore spice plantations overflowing with cardamom, pepper, and cinnamon, their pungent aromas filling the air. Visit the historic Mattupetty Dam, built by the British, or delve into the ancient traditions of local tribes.\n" + "\n" + "Whether you seek tranquility amidst rolling hills, adventure in the wilderness, or a cultural immersion, Munnar has something for everyone. Come, experience the magic of this enchanting hill station and create memories that will last a lifetime.\n" + "\n",
                images = listOf(
                    Res.drawable.india_munnar_1,
                    Res.drawable.india_munnar_2,
                    Res.drawable.india_munnar_3,
                    Res.drawable.india_munnar_4,
                    Res.drawable.india_munnar_5,
                    Res.drawable.india_munnar_6,
                    Res.drawable.india_munnar_7,
                ),
                location = Location(
                    lat = 10.0889,
                    long = 77.0595
                )
            ),
            TouristPlace(
                name = "Amber Palace",
                shortDescription = "Amber Palace, also known as Amer Fort, stands majestically atop a hill near Jaipur, showcasing a stunning blend of Rajput and Mughal architecture. Built in the 16th century, it served as the royal residence for centuries. Climb the fortified walls, adorned with intricate carvings, and explore opulent palaces, serene courtyards, and the breathtaking Sheesh Mahal (Mirror Palace). Witnessing the sunset over the Maota Lake paints an unforgettable picture.",
                longDescription = "Rising like a golden mirage against the Aravalli Hills, Amber Palace (Amer Fort) whispers tales of grandeur and bygone eras. This magnificent fort, just outside Jaipur, served as the seat of power for the Kachwaha Rajput rulers for centuries, dating back to the 16th century. Today, it stands as a UNESCO World Heritage Site, captivating visitors with its architectural splendor and rich history.\n" + "\n" + "As you ascend the fortified walls, intricately carved elephants guarding the majestic Suraj Pol (Sun Gate) welcome you. Inside, a labyrinth of courtyards, palaces, and gardens unfolds. Marvel at the Diwan-e-Aam (Hall of Public Audience), where the Maharaja held court, and the Diwan-e-Khas (Hall of Private Audience), adorned with precious stones and delicate mirrorwork.\n" + "\n" + "Climb the Painted Passage, its walls showcasing vibrant murals depicting battles and processions. Be awestruck by the Sheesh Mahal (Mirror Palace), where thousands of tiny mirrors create a mesmerizing kaleidoscope effect. Wander through the Sukh Mahal (Hall of Pleasure), with its cool and refreshing water channels, and imagine royal life unfold before you.\n" + "\n" + "Beyond the architectural marvels, the fort offers breathtaking views. Gaze upon the Maota Lake, shimmering below, and capture the unforgettable scene as the sun dips behind the Aravalli Hills, painting the sky in vibrant hues. Explore the hidden tunnels connecting Amber Palace to Jaigarh Fort, and delve deeper into the fort's fascinating history.\n" + "\n" + "Whether you're an architecture enthusiast, history buff, or simply seeking a glimpse into India's royal past, Amber Palace provides an unforgettable experience. It's a testament to the artistry and grandeur of a bygone era, where every step whispers stories of opulence, power, and the rich tapestry of Indian history.\n" + "\n",
                images = listOf(
                    Res.drawable.india_amber_palace_1,
                    Res.drawable.india_amber_palace_2,
                    Res.drawable.india_amber_palace_3,
                    Res.drawable.india_amber_palace_4,
                ),
                location = Location(
                    lat = 26.9855,
                    long = 75.8513
                )
            ),
            TouristPlace(
                name = "Dudhsagar Waterfalls",
                shortDescription = "Dudhsagar Waterfalls, cascading amidst the lush Western Ghats in Goa, is a majestic spectacle. India's highest waterfall plunges 310 meters, creating a breathtaking sight and refreshing mist. Hike through verdant forests, take a jeep safari, or witness the falls' grandeur from a train passing over a bridge offering stunning views. Dudhsagar is a haven for nature lovers and adventure seekers.",
                longDescription = "In the heart of the verdant Western Ghats, Goa, lies Dudhsagar Waterfalls, a cascading marvel that leaves visitors spellbound. Cascading down a staggering 310 meters, it earns the title of India's highest waterfall, creating a breathtaking spectacle that enthralls nature enthusiasts and adventure seekers alike.\n" + "\n" + "Reaching Dudhsagar is an adventure in itself. Hike through lush forests teeming with diverse flora and fauna, their vibrant colors contrasting with the gushing waters. For a thrilling experience, embark on a jeep safari, navigating through challenging terrain and offering glimpses of the hidden beauty of the region.\n" + "\n" + "As you arrive at the base of the falls, prepare to be mesmerized. The gushing water crashes down from a seemingly endless height, creating a powerful roar and sending refreshing mist into the air. Take a dip in the cool pool beneath the falls, feeling the invigorating power of nature. For a different perspective, board a train that passes over a bridge offering stunning views of the cascading wonder from above.\n" + "\n" + "Beyond its visual grandeur, Dudhsagar holds ecological significance. The surrounding forests are home to a rich variety of plant and animal life, including endangered species like the Malabar langur and the lion-tailed macaque. Spotting these creatures amidst the lush greenery adds another layer to the experience.\n" + "\n" + "Whether you're seeking a refreshing escape, an adrenaline-pumping adventure, or a connection with nature, Dudhsagar Waterfalls offers something for everyone. Its cascading beauty, diverse ecosystem, and accessible adventures make it a must-visit for travelers exploring the vibrant state of Goa.\n" + "\n",
                images = listOf(
                    Res.drawable.india_dudhsagar_waterfalls_1,
                    Res.drawable.india_dudhsagar_waterfalls_2,
                    Res.drawable.india_dudhsagar_waterfalls_3,
                    Res.drawable.india_dudhsagar_waterfalls_4,
                    Res.drawable.india_dudhsagar_waterfalls_5,
                    Res.drawable.india_dudhsagar_waterfalls_6,
                    Res.drawable.india_dudhsagar_waterfalls_7,
                ),
                location = Location(
                    lat = 15.3144,
                    long = 74.3143
                )
            ),
            TouristPlace(
                name = "Manali",
                shortDescription = "Manali, nestled amidst the majestic Himalayas, is a picturesque hill station in Himachal Pradesh. Renowned for its snow-capped peaks, verdant valleys, and adventure activities, it's a haven for nature lovers and thrill-seekers. Hike through apple orchards, soak in hot springs, or witness the panoramic views from Rohtang Pass. Manali's charm lies in its blend of natural beauty, Tibetan culture, and adventure opportunities.",
                longDescription = "Manali, cradled in the lap of the majestic Himalayas in Himachal Pradesh, paints a picture of breathtaking beauty and adventure. This picturesque hill station, perched at an altitude of 6,769 feet, has long been a magnet for travelers seeking solace in nature's embrace and adrenaline-pumping activities.\n" + "\n" + "Carpeted with lush valleys and snow-capped peaks, Manali offers a feast for the eyes. Hike through apple orchards bursting with vibrant hues, breathe in the crisp mountain air, and witness the majestic Himalayas paint the sky with a kaleidoscope of colors at sunrise or sunset.\n" + "\n" + "Adventure enthusiasts rejoice in Manali's playground. Embark on a thrilling trek to Rohtang Pass, offering panoramic views of the surrounding peaks. Go white-water rafting on the Beas River, feeling the rush of adrenaline as you navigate through rapids. Or, try your hand at paragliding, soaring above the valleys and experiencing the world from a bird's-eye view.\n" + "\n" + "Manali's cultural tapestry is woven with Tibetan influences. Explore the serene monasteries like the Gadhan Thekchok Kyong Gompa, where monks chant and prayer flags flutter in the wind. Immerse yourself in the vibrant Tibetan markets, overflowing with colorful handicrafts and souvenirs. Savor the local cuisine, with momos and Thukpa warming your soul on chilly evenings.\n" + "\n" + "Beyond its natural beauty and adventure, Manali offers a chance to unwind and reconnect with nature. Soak in the rejuvenating hot springs at Vashisht, believed to have medicinal properties. Take a leisurely stroll along the Beas River, listening to its soothing gurgling and feeling the sun's warmth on your skin.\n" + "\n" + "Whether you're seeking a breathtaking escape, an adrenaline-pumping adventure, or a cultural immersion, Manali has something for everyone. Come, experience the magic of this enchanting hill station and create memories that will last a lifetime.\n" + "\n",
                images = listOf(
                    Res.drawable.india_manali_1,
                    Res.drawable.india_manali_2,
                    Res.drawable.india_manali_3,
                    Res.drawable.india_manali_4,
                    Res.drawable.india_manali_5,
                    Res.drawable.india_manali_6,
                    Res.drawable.india_manali_7,
                    Res.drawable.india_manali_8,
                    Res.drawable.india_manali_9,
                ),
                location = Location(
                    lat = 32.2432,
                    long = 77.1892
                )
            ),
            TouristPlace(
                name = "Darjeeling",
                shortDescription = "Darjeeling, perched amidst the Himalayas, is a charming hill station renowned for its breathtaking views, verdant tea plantations, and iconic toy train. Witnessing sunrise over Kanchenjunga peak, exploring bustling Chowrasta market, and riding the Darjeeling Himalayan Railway are unforgettable experiences. Darjeeling offers a unique blend of colonial charm, breathtaking beauty, and aromatic teas, making it a must-visit for any India adventure.",
                longDescription = "Nestled amidst the majestic Himalayas, Darjeeling, fondly called the \"Queen of Hills,\" captivates visitors with its breathtaking beauty, colonial charm, and aromatic tea estates. This hill station in West Bengal, perched at an altitude of 6,700 feet, offers a unique blend of experiences that linger long after your visit.\n" + "\n" + "Start your day by witnessing the magical sunrise over the snow-capped Kanchenjunga peak, the world's third highest mountain. The golden hues paint the sky, creating a spectacle that leaves you awestruck. Explore the sprawling tea plantations, their emerald slopes stretching as far as the eye can see. Breathe in the invigorating aroma of freshly brewed Darjeeling tea, savoring its delicate flavor at a local tea house.\n" + "\n" + "Step back in time as you wander through Chowrasta, the bustling heart of Darjeeling. This historic market overflows with colorful souvenirs, traditional Tibetan handicrafts, and local delicacies. Ride the iconic Darjeeling Himalayan Railway, a UNESCO World Heritage Site, experiencing the scenic beauty of the hills on this charming toy train.\n" + "\n" + "Beyond the tourist attractions, Darjeeling offers a glimpse into its rich history and culture. Visit the Himalayan Mountaineering Institute, commemorating the spirit of adventure, or delve deeper into Tibetan traditions at the Mahakal Temple and Ghoom Monastery. For an off-the-beaten-path experience, hike through the Senchal Wildlife Sanctuary, spotting diverse flora and fauna.\n" + "\n" + "Whether you're seeking breathtaking panoramas, a nostalgic journey through colonial history, or a connection with nature and local culture, Darjeeling has something for everyone. Come, experience the magic of this enchanting hill station and create memories that will warm your heart like a cup of Darjeeling tea.\n" + "\n",
                images = listOf(
                    Res.drawable.india_darjeeling_1,
                    Res.drawable.india_darjeeling_2,
                    Res.drawable.india_darjeeling_3,
                    Res.drawable.india_darjeeling_4,
                    Res.drawable.india_darjeeling_5,
                    Res.drawable.india_darjeeling_6,
                    Res.drawable.india_darjeeling_7,
                    Res.drawable.india_darjeeling_8,
                    Res.drawable.india_darjeeling_9,
                ),
                location = Location(
                    lat = 27.0410,
                    long = 88.2663
                )
            ),
            TouristPlace(
                name = "Dal Lake",
                shortDescription = "Dal Lake, also known as \"Srinagar's Jewel,\" is a mesmerizing expanse of freshwater nestled amidst the majestic Himalayas in Kashmir, India. Shikara boats glide across its tranquil waters, passing by floating gardens, houseboats, and vibrant markets. Witnessing the breathtaking sunrise over the lake and experiencing the serene beauty of its surrounding mountains is an unforgettable experience.",
                longDescription = "Dal Lake, a glittering jewel nestled amidst the snow-capped peaks of the Himalayas in Srinagar, Kashmir, India, enchants visitors with its serene beauty and vibrant culture. Revered as \"Srinagar's Jewel,\" this freshwater lake pulsates with life, offering a unique and unforgettable experience.\n" + "\n" + "Imagine gliding across the calm waters in a traditional Shikara boat, feeling the cool breeze caress your face as you navigate past floating gardens bursting with colorful flowers. The gentle lapping of water creates a tranquil symphony, contrasting with the lively chatter of vendors selling fresh produce and handcrafted souvenirs in floating markets.\n" + "\n" + "Dal Lake transforms into a magical canvas each dawn and dusk. Witness the first rays of sunlight cast a golden glow on the snow-capped peaks surrounding the lake, painting the sky in mesmerizing hues of orange and pink. As the sun dips below the horizon, the water reflects the vibrant colors of the setting sun, creating a breathtaking spectacle.\n" + "\n" + "Beyond its scenic beauty, Dal Lake offers a glimpse into the rich culture and traditions of Kashmir. Houseboats, intricately adorned with Kashmiri wood carvings, provide a unique and comfortable stay on the lake. Savor delicious local cuisine, featuring fresh fish and aromatic spices, served on the houseboats by warm and hospitable families.\n" + "\n" + "For a deeper cultural immersion, visit the Hazratbal Shrine, a revered Islamic pilgrim site located on the banks of the lake. Explore the bustling markets along the ghats, overflowing with colorful spices, hand-woven shawls, and traditional Kashmiri handicrafts.\n" + "\n" + "Whether you seek serenity on the Shikara, adventure on the surrounding mountains, or a cultural immersion in Kashmiri traditions, Dal Lake has something for everyone. Come, experience the magic of this enchanting lake and create memories that will last a lifetime.\n" + "\n",
                images = listOf(
                    Res.drawable.india_dal_lake_1,
                    Res.drawable.india_dal_lake_2,
                    Res.drawable.india_dal_lake_3,
                    Res.drawable.india_dal_lake_4,
                    Res.drawable.india_dal_lake_5,
                    Res.drawable.india_dal_lake_6,
                    Res.drawable.india_dal_lake_7,
                    Res.drawable.india_dal_lake_8,
                ),
                location = Location(
                    lat = 34.1106,
                    long = 74.8683
                )
            ),
        )
    ),
    Country(
        name = "Pakistan", flagIcon = Res.drawable.pk, touristPlaces = listOf(
            TouristPlace(
                name = "Badshahi Mosque, Lahore",
                shortDescription = "An iconic symbol of Mughal architecture in Lahore, Pakistan.",
                longDescription = "The Badshahi Mosque, commissioned by Emperor Aurangzeb in 1671, is a marvel of Mughal architecture. With its grand red sandstone and white marble structure, adorned with intricate calligraphy and stunning geometric patterns, it stands as a testament to the opulence of the Mughal era. The mosque's expansive courtyard and regal aura make it a cultural and historical gem, offering panoramic views of Lahore. Visitors are transported to a bygone era, marveling at the artistry and spirituality that permeate this magnificent structure.",
                images = listOf(
                    Res.drawable.pakistan_badshahi_mosque_1,
                    Res.drawable.pakistan_badshahi_mosque_2,
                    Res.drawable.pakistan_badshahi_mosque_3
                ),
                location = Location(
                    lat = 31.5879,
                    long = 74.3094
                )
            ),

            TouristPlace(
                name = "Shangrila Resort, Skardu",
                shortDescription = "A paradise nestled in the mesmerizing landscapes of Skardu, Pakistan.",
                longDescription = "Shangrila Resort, also known as Lower Kachura Lake, is a breathtaking escape surrounded by the Karakoram Range in Skardu. Offering panoramic views of snow-capped peaks, the resort features enchanting gardens and a serene lake. The unique boat-shaped restaurant adds to the charm, allowing visitors to dine with a view. Shangrila Resort is a haven for outdoor enthusiasts, providing opportunities for boating, fishing, and trekking in the nearby valleys. Guests can immerse themselves in nature's beauty and find tranquility in the heart of Skardu.",
                images = listOf(
                    Res.drawable.pakistan_shangrila_resort_1,
                    Res.drawable.pakistan_shangrila_resort_2
                ),
                location = Location(
                    lat = 35.4259,
                    long = 75.4565
                )
            ),

            TouristPlace(
                name = "Hunza Valley",
                shortDescription = "A mesmerizing valley in the Gilgit-Baltistan region, offering breathtaking vistas.",
                longDescription = "Hunza Valley, nestled in the heart of the Karakoram Range, is a paradise for nature lovers and adventure seekers. Surrounded by majestic mountains, including Rakaposhi and Ultar Sar, the valley boasts stunning landscapes, vibrant meadows, and serene rivers. The ancient Baltit Fort and Altit Fort add a touch of history to this picturesque region. Visitors can engage in trekking, explore traditional villages, and experience the warm hospitality of the locals. Hunza Valley is a gateway to unparalleled beauty and cultural richness in the Gilgit-Baltistan region of Pakistan.",
                images = listOf(
                    Res.drawable.pakistan_hunza_valley_1,
                    Res.drawable.pakistan_hunza_valley_2,
                ),
                location = Location(
                    lat = 36.3167,
                    long = 74.6500
                )
            )
        )
    ),
    Country(
        name = "Algeria", flagIcon = Res.drawable.dz,
        touristPlaces = listOf(
            TouristPlace(
                name = "Kasbah of Algiers",
                shortDescription = "The Kasbah is a unique kind of medina, or Islamic city. It stands in one of the finest coastal sites on the Mediterranean, overlooking the islands where a Carthaginian trading-post was established in the 4th century BC. There are the remains of the citadel, old mosques and Ottoman-style palaces as well as the remains of a traditional urban structure associated with a deep-rooted sense of community.",
                longDescription = "The Kasbah of Algiers is founded on the ruins of old Icosium in the 10th century. It was a city built on a hill, stretching towards the sea, divided into the \"High city\" and the \"Low city\". One finds there masonry and mosques dating from the 17th century: Ketchaoua Mosque (built in 1794 by the Dey Baba Hassan) flanked by two minarets; Djama’a al-Djedid (1660, at the time of the Ottomans) with its large finished ovoid cupola points some and its four cupolas; Djamaâ el Kebir (the oldest of the mosques), built by Almoravid ruler Yusuf ibn Tashfin; and Ali Bitchin Mosque (Raïs, 1623). The Kasbah also contained several palaces, including Dar Aziza, Dar Mustapha Pacha, Palace of the Dey, and Dar Hassan Pacha which was built in 1791 to house the Pasha, who lived there for eight years.[4]\n" + "\n" + "In 1839, shortly after the French conquest, the French governor moved into Dar Hassan Pacha. In 1860, Napoleon III and Eugénie de Montijo visited.[4] Before French rule, the kasbah contained around 13 Jama Masjids, 109 mosques, 32 mausoleums and 12 Zawiyas, total of 166 religious-related buildings. However, the majority of these religious buildings were destroyed during the occupation. In 1862, there were only nine Jama Masjids, 19 mosques, 15 mausoleums and five Zawiyas left. Many mosques such as Ketchauoua Mosque and Berrani Mosque were converted into building with non-Islamic purposes, such as military barracks and churches.[5]\n" + "\n" + "The kasbah played a central role during the Algerian War of Independence (1954–1962). During the early years of the war, the kasbah was the epicenter of the insurgency planning of the National Liberation Front (FLN), from which it planned and executed attacks against French citizens and law enforcement agents in Algeria at the time. In order to counter their efforts, the French authorities launched operations in the kasbah during the Battle of Algiers. ",
                images = listOf(
                    Res.drawable.algeria_kasba_1,
                    Res.drawable.algeria_kasba_2,
                    Res.drawable.algeria_kasba_3,
                    Res.drawable.algeria_kasba_4,
                    Res.drawable.algeria_kasba_5,
                    Res.drawable.algeria_kasba_6,
                    Res.drawable.algeria_kasba_7,
                    Res.drawable.algeria_kasba_8,
                ),
                location = Location(
                    lat = 36.7904,
                    long = 3.0732
                )
            ),
            TouristPlace(
                name = "Timgad",
                shortDescription = "It was a Roman city in the Aurès Mountains of Algeria. It was founded by the Roman Emperor Trajan around 100 CE.",
                longDescription = "The city was founded as a military colony by the emperor Trajan in the year 100. It was intended to serve primarily as a Roman bastion against the Berbers in the nearby Aures Mountains, and it was originally populated largely by Roman veterans and colonists.",
                images = listOf(
                    Res.drawable.algeria_timgad_1,
                    Res.drawable.algeria_timgad_2,
                    Res.drawable.algeria_timgad_3,
                    Res.drawable.algeria_timgad_4,
                    Res.drawable.algeria_timgad_5,
                    Res.drawable.algeria_timgad_6,
                ),
                location = Location(
                    lat = 35.4949,
                    long = 6.4680
                )
            ),

            TouristPlace(
                name = "Botanical Garden of Hamma",
                shortDescription = "A 32-hectare (79-acre) botanical garden (38 hectares (94 acres) of gardens and 20 hectares (49 acres) of arboretum).",
                longDescription = "In 1832, Pierre Genty De Bussy, the Civil Intendant, and General Antoine Avisard, interim governor, decided to drain the marshes at the foot of the Arcades hill. The Botanical Garden of Hamma was then created on a 5 hectares (12 acres) area, to make not only a model farm but also a test garden.\n" + "\n" + "In 1837, the organization bought a 18-hectare (44-acre) site under the Fountain of Plane Trees. The garden grew westwards and became the Central Nursery of the Government. The initial site was renamed Little Test Garden until its exchange in 1848 for another piece of land inside the Nursery.\n" + "\n" + "The garden's principal activity is to provide trees to public organisations and to European settlers. From 1833, production of carmine was added.\n" + "\n" + "Auguste Hardy was named director of the Botanical Garden in 1842. Many animal species were introduced to the garden at that time, and it expanded several times. As well as the animal and vegetable produce, industry relating to new technology occupied a lot of space, and employed a lot of people.\n" + "\n" + "Between 1848 and 1867 the garden expanded several times, until it arrived at its current configuration. In 1860, a lake was created and an exterior boulevard constructed. The garden was renamed the Acclimatization Garden (French: Jardin d'Acclimatation) in 1861. In 1867, an estimated 8,214 species could " + "be found in the garden. Between 2001 and 2009 the garden was closed for restoration work. Reopened in 2009, it is now home to the Algerian National Institute of Agronomical Research, and was opened to visitors.",
                images = listOf(
                    Res.drawable.the_botanical_garden_1,
                    Res.drawable.the_botanical_garden_2,
                    Res.drawable.the_botanical_garden_3,
                    Res.drawable.the_botanical_garden_4,
                    Res.drawable.the_botanical_garden_5,
                    Res.drawable.the_botanical_garden_6
                ),
                location = Location(
                    lat = 36.7484,
                    long = 3.0758
                )
            )
        )
    ),
    Country(
        name = "Germany", flagIcon = Res.drawable.germany, touristPlaces = listOf(
            TouristPlace(
                name = "Brandenburg Gate",
                shortDescription = "The Brandenburg Gate is an iconic neoclassical monument in Berlin, Germany, standing as a symbol of unity and peace. Built in the 18th century, it is one of the city's most important landmarks and a must-visit historical site that once marked the division between East and West Berlin.",
                longDescription = "The Brandenburg Gate is an iconic neoclassical monument in Berlin, Germany, renowned as a symbol of peace and unity. Designed by Carl Gotthard Langhans and completed in the late 18th century, it draws inspiration from the Acropolis in Athens, embodying the architectural elegance of the era. \n" + "\n" + "The gate is crowned with the Quadriga, a sculpture of a chariot drawn by four horses, led by Victoria, the Roman goddess of victory, symbolizing peace.\n" + "\n" + "Throughout its history, the Brandenburg Gate has stood witness to many of Germany's key historical moments, including Napoleon's conquests and the tumultuous events of the 20th century.\n" + "\n" + "Originally marking the boundary of Berlin, the Brandenburg Gate became a symbol of division during the Cold War, as it was situated just behind the Berlin Wall, separating East from West Berlin.\n" + "\n" + "With the fall of the Berlin Wall in 1989, the gate transformed into a powerful emblem of German reunification and is now celebrated as a monument to freedom and reconciliation. \n" + "\n" + "Today, it attracts visitors from around the globe, serving as a poignant reminder of Berlin's past struggles and its enduring hope for peace.\n" + "\n",
                images = listOf(
                    Res.drawable.germany_brandenburg_gate_1,
                    Res.drawable.germany_brandenburg_gate_2,
                    Res.drawable.germany_brandenburg_gate_3,
                    Res.drawable.germany_brandenburg_gate_4,
                    Res.drawable.germany_brandenburg_gate_5
                ),
                location = Location(
                    lat = 52.5163,
                    long = 13.3777
                )
            ), TouristPlace(
                name = "Neuschwanstein Castle",
                shortDescription = "Neuschwanstein Castle is a fairy-tale castle in Bavaria, Germany, that inspired Disney’s Sleeping Beauty Castle. Built in the 19th century by King Ludwig II of Bavaria, this picturesque castle stands atop rugged cliffs against the scenic backdrop of the Alps, embodying the romantic spirit of the era and drawing millions of visitors yearly.",
                longDescription = "Neuschwanstein Castle, set amidst the breathtaking landscapes of Bavaria, Germany, is a quintessential symbol of Romantic architecture and the dreamlike fantasies of King Ludwig II. Constructed in the late 19th century, the castle was designed as a personal refuge for the reclusive king, but also as a homage to Richard Wagner, the king’s muse and inspiration. \n" + "\n" + "Neuschwanstein’s design reflects the medieval Gothic revival, yet it incorporates modern technology of the time, including central heating, running water, and even an electric bell system for summoning servants.\n" + "\n" + "Its interiors are adorned with intricate murals depicting legends and tales that were dear to Ludwig, further enhancing its mystical allure.\n" + "\n" + "The castle’s location is as dramatic as its architecture, perched on a rugged hill above the village of Hohenschwangau near Füssen, in southwest Bavaria. It offers stunning views of the surrounding alpine landscapes, making it a picturesque masterpiece that looks like it has been lifted from the pages of a storybook.\n" + "\n" + "Despite King Ludwig II's death in 1886 before the castle’s completion, Neuschwanstein became a symbol of opulence and fantasy, attracting over a million visitors each year. It is not only a monument to the king’s imagination but also a testament to the allure of the Romantic era, making it one of the most visited and recognizable castles in the world.\n",
                images = listOf(
                    Res.drawable.germany_neuschwanstein_castle_1,
                    Res.drawable.germany_neuschwanstein_castle_2,
                    Res.drawable.germany_neuschwanstein_castle_3,
                    Res.drawable.germany_neuschwanstein_castle_4,
                    Res.drawable.germany_neuschwanstein_castle_5,
                ),
                location = Location(
                    lat = 47.5576,
                    long = 10.7498
                )
            ), TouristPlace(
                name = "Cologne Cathedral",
                shortDescription = "Cologne Cathedral, a masterpiece of Gothic architecture, stands as a monumental landmark in Cologne, Germany. Known for its awe-inspiring spires, intricate façades, and the Shrine of the Three Kings, this UNESCO World Heritage site is not only a place of worship but also a symbol of German resilience and faith.",
                longDescription = "Cologne Cathedral (Kölner Dom), with its soaring twin spires dominating the skyline of Cologne, is one of the most significant Gothic structures in Europe. Construction began in 1248 to house the relics of the Three Wise Men and, despite centuries of intermittent work, was not completed until 1880.\n" + "\n" + "The cathedral showcases remarkable Gothic architectural elements, including flying buttresses, large clerestory windows, and a stunningly detailed façade. Inside, it houses a wealth of art, most notably the Shrine of the Three Kings, a gilded sarcophagus believed to contain the remains of the Magi.\n" + "\n" + "This majestic cathedral has withstood the test of time, surviving the devastation of World War II almost unscathed amidst the heavily bombed city of Cologne, which stands as a testament to its symbolic significance.\n" + "\n" + "oday, it attracts millions of visitors and pilgrims annually, drawn not only to its spiritual significance but also to its architectural beauty and historical art pieces. \n" + "\n" + "The Cologne Cathedral, standing as a beacon of faith, Gothic artistry, and German heritage, continues to fascinate and inspire awe in all who visit.\n" + "\n",
                images = listOf(
                    Res.drawable.germany_cologne_cathedral_1,
                    Res.drawable.germany_cologne_cathedral_2,
                    Res.drawable.germany_cologne_cathedral_3,
                    Res.drawable.germany_cologne_cathedral_4,
                    Res.drawable.germany_cologne_cathedral_5,
                ),
                location = Location(
                    lat = 50.9413,
                    long = 6.9583
                )
            ), TouristPlace(
                name = "Berliner Fernsehturm",
                shortDescription = "The Berliner Fernsehturm (Berlin TV Tower) is a prominent landmark and television tower located in central Berlin, Germany. At a staggering height of 368 meters, it is the tallest structure in Germany, offering panoramic views of the city from its observation deck and revolving restaurant, making it a must-visit for tourists.",
                longDescription = "The Berliner Fernsehturm, situated near Alexanderplatz in Mitte, is not just an iconic silhouette on Berlin's skyline but also a symbol of the city's history and technological advancement. Constructed between 1965 and 1969 by the German Democratic Republic (GDR), the tower was intended as a demonstration of the strength and efficiency of the socialist party system.\n" + "\n" + "Today, it serves as a poignant reminder of Berlin's Cold War era while standing as a beacon of modernity and reunification.\n" + "\n" + "With its spherical observation deck and revolving restaurant located 207 meters above ground, the Berliner Fernsehturm offers visitors unparalleled 360-degree views of Berlin, encompassing historical sites, modern landmarks, and the lush greenery surrounding the city.\n" + "\n" + "The tower's design and engineering have earned it a place among the most famous television towers worldwide. Its presence in East Berlin's cityscape has made it a central point of reference for both locals and tourists alike, symbolizing Berlin's resilience and its continuous stride towards the future. \n" + "\n" + "Whether viewed from the cobblestone streets of the city or the heights of its observation deck, the Berliner Fernsehturm captivates with its history, architecture, and the sweeping vistas it provides.\n" + "\n",
                images = listOf(
                    Res.drawable.germany_berlin_fernsehtrum_1,
                    Res.drawable.germany_berlin_fernsehtrum_2,
                    Res.drawable.germany_berlin_fernsehtrum_3,

                    ),
                location = Location(
                    lat = 52.5208,
                    long = 13.4094
                )
            ), TouristPlace(
                name = "Zugspitze",
                shortDescription = "The Zugspitze is Germany's highest peak, soaring 2,962 meters above sea level in the Bavarian Alps. Renowned for its breathtaking panoramas, the mountain offers a unique blend of natural beauty, outdoor adventure, and cultural experiences, making it a premier destination for tourists and mountaineers alike.",
                longDescription = "As the pinnacle of the German Alps, the Zugspitze presents visitors with unparalleled views that stretch across four countries on clear days. The journey to the summit can be achieved via cogwheel train and cable car, offering a memorable experience as one ascends through diverse alpine landscapes.\n" + "\n" + "Upon reaching the top, visitors are greeted by the striking contrast of rugged mountain peaks and the gentle undulation of the valleys below. The summit hosts three glaciers, including the largest glacier in Germany, the Schneeferner, adding to the Zugspitze's allure as a natural wonder.\n" + "\n" + "The Zugspitze is not only a haven for skiers and snowboarders, with its snowy slopes offering some of the best winter sports conditions in Germany, but also a summer retreat for hikers and climbers who seek to explore its challenging trails and enjoy the alpine flora and fauna. \n" + "\n" + "Additionally, the Zugspitze straddles the border between Germany and Austria, allowing visitors to effortlessly experience the culture and hospitality of two nations. With its breathtaking scenery, diverse activities, and the unique opportunity to stand at the highest point in Germany, the Zugspitze captivates all who venture to its summit, embodying the majestic spirit of the Alps.\n",
                images = listOf(
                    Res.drawable.germany_zugspitzbahn_1,
                    Res.drawable.germany_zugspitzbahn_2,
                    Res.drawable.germany_zugspitzbahn_3,
                    Res.drawable.germany_zugspitzbahn_4,
                    Res.drawable.germany_zugspitsbahn_5,
                ),
                location = Location(
                    lat = 47.4211,
                    long = 10.9854
                )

            )
        )
    ),
    Country(
        name = "United Kingdom", flagIcon = Res.drawable.uk, touristPlaces = listOf(
            TouristPlace(
                name = "Tower of London",
                shortDescription = "A historic castle on the banks of the River Thames known for its rich history and housing the Crown Jewels.",
                longDescription = "The Tower of London, founded by William the Conqueror in the 11th century, has served as a royal palace, prison, and treasury. Visitors can explore its medieval architecture, view the Crown Jewels, and learn about its role in English history.",
                images = listOf(
                    Res.drawable.uk_tower_of_london,
                    Res.drawable.uk_tower_of_london_2,
                ),
                location = Location(
                    lat = 51.508530,
                    long = -0.076132
                )
            ), TouristPlace(
                name = "Buckingham Palace",
                shortDescription = "The official residence of the British monarch in London, known for the Changing of the Guard ceremony.",
                longDescription = "Buckingham Palace, built in the 18th century, is the monarch's primary residence. Visitors can witness the iconic Changing of the Guard, explore the State Rooms during the summer months, and enjoy the vast gardens.",
                images = listOf(
                    Res.drawable.uk_buckingham_palace,
                    Res.drawable.uk_buckingham_palace_2,
                    Res.drawable.uk_buckingham_palace_3,
                ),
                location = Location(
                    lat = 51.5014,
                    long = 0.1419
                )
            ), TouristPlace(
                name = "Stonehenge",
                shortDescription = "A prehistoric monument in Wiltshire featuring a circle of massive standing stones.",
                longDescription = "Stonehenge, dating back to around 3000 BC, remains one of the world's most famous archaeological sites. Its purpose and construction methods continue to be subjects of speculation, adding to its mystique.",
                images = listOf(
                    Res.drawable.uk_stonehenge,
                    Res.drawable.uk_stonehenge_2,
                    Res.drawable.uk_stonehenge_3,
                    Res.drawable.uk_stonehenge_4,
                ),
                location = Location(
                    lat = 51.1789,
                    long = 1.8262
                )
            )
        )
    ),
    Country(
        name = "Switzerland", flagIcon = Res.drawable.sw, touristPlaces = listOf(
            TouristPlace(
                name = "Interlaken",
                shortDescription = "Interlaken's unique location between two lakes – Lake Brienz and Lake Thun – makes it a breathtaking spot for a vacation. Here, you can spend hours hiking various trails, taking in the castle-studded shores of Lake Thun on a boat cruise or gazing at the surrounding mountains from the Harder Kulm observation deck (accessible via a funicular).",
                longDescription = "Interlaken is a Swiss town and municipality in the Interlaken-Oberhasli administrative district in the canton of Bern. It is an important and well-known tourist destination in the Bernese Oberland region of the Swiss Alps, and the main transport gateway to the mountains and lakes of that region. The town is located on flat alluvial land called Bödeli between two lakes, Brienz to the east and Thun to the west, and alongside the river Aare, which flows between them. Transport routes to the east and west alongside the lakes are complemented by a route southwards into the near mountain resorts and high mountains, e.g. the famous high Alpine peaks of Eiger, Mönch, and Jungfrau, following upwards the Lütschine.",
                images = listOf(
                    Res.drawable.swiss_interlaken_1,
                    Res.drawable.swiss_interlaken_2,
                    Res.drawable.swiss_interlaken_3,
                ),
                location = Location(
                    lat = 46.6863,
                    long = 7.8632
                )
            ), TouristPlace(
                name = "Zermatt",
                shortDescription = "Zermatt is a car-free village in the upper Valais, one of the alpine cantons of Switzerland. It's probably best known as a platform for skiing and mountaineering, especially on the mountain which towers above the village, the Matterhorn. The surroundings are breathtaking but this comes at a price: Accommodation in Zermatt is among the most expensive in Switzerland.",
                longDescription = "Zermatt is surrounded by a range of fabulous mountains, among which the highest of Switzerland: Monte Rosa, but it is famous for the Matterhorn. It was one of the last alpine mountains to be conquered (in 1865), and the first expedition that reached the top ended dramatically (only 3 of the 7 climbers survived). If you've never experienced a car-free city of any size then Zermatt could be a bit of a surprise: during the high season, nearly 20,000 people live in a town with only 5 or 6 streets and more significantly almost no internal combustion vehicles except very occasional outside delivery and specialist services. This means that you can leave a noisy bar or party, and a few minutes later on foot find yourself in utter tranquility. You can sit on the hotel balcony and listen to dozens of varieties of songbirds while watching the sunset on one of the most striking mountains in the western world. Wake up with the sun in a room or a canvas tent to the sound of the aforementioned birds, crickets, church bells, and children's laughter.",
                images = listOf(
                    Res.drawable.swiss_zermatt_1,
                    Res.drawable.swiss_zermatt_2,
                    Res.drawable.swiss_zermatt_3,

                    ),
                location = Location(
                    lat = 46.0207,
                    long = 7.7491
                )
            ), TouristPlace(
                name = "Basel",
                shortDescription = "Basel is Switzerland's oldest university city. Historic landmarks of the city include the large market square with its richly decorated red sandstone town hall and the late Romanesque-Gothic cathedral. During a walk through the old town, past small boutiques, antique book shops but also shops of modern designers, a visit to the \"Läckerli Huus\" to try the traditional Basel honey cake is well worth your while. ",
                longDescription = "Basel is tradition-conscious and open-minded at the same time, a fact born out by several modern buildings designed by renowned architects such as Herzog & de Meuron, Mario Botta, Diener & Diener and Richard Meyer.\n" + "Almost 40 museums make Basel the city with the highest density of museums in the country. Internationally known museums, such as the Basel Art Museum, the museum devoted to the iron sculptor Jean Tinguely, the Fondation Beyeler and the Museum of Cultures attract a great many visitors, as do several galleries and playhouses. Basel is among other things home to the symphony orchestra and the chamber orchestra as well as the musical theatre featuring international productions. And a wide range of classical and contemporary productions are shown on the stages of the Basel Theatre and the Playhouse.\n" + " \n" + "Basel is a green city. The Botanical Gardens, the Merian Gärten and the banks of the Rhine are perfect places to relax and linger for a while. And the Etoscha House at the zoo Basel offers spectacular insights into the Namibian Savannah.\n" + "You can easily explore Basel on foot or by bike. There are four Rhine ferries that connect Grossbasel with Kleinbasel.\n" + "\n" + "At nearby Augusta Raurica near Augst impressive ruins and a great many finds at the museum bear testimony to the busy lives of the Romans in the region in the past. The charming countryside of the Basel region with its many cherry trees in spring boasts a particularly beautiful display of blooms. Germany and France, the Black Forest and Vosges Mountains are only a stone's throw away from the border city of Basel.",
                images = listOf(
                    Res.drawable.swiss_basel_1,
                    Res.drawable.swiss_basel_2,
                    Res.drawable.swiss_basel_3,
                ),
                location = Location(
                    lat = 47.5596,
                    long = 7.5886
                )
            )
        )
    ),
    Country(
        name = "Costa Rica", flagIcon = Res.drawable.cr, touristPlaces = listOf(
            TouristPlace(
                name = "San Jose",
                shortDescription = "San Jose, Costa Rica's vibrant capital, pulsates with history and culture. Founded in 1738, it's a blend of colonial charm and modern energy. Explore grand architecture like the ornate Teatro Nacional, wander bustling markets like Mercado Central, or delve into museums showcasing pre-Columbian gold and rich coffee heritage. Beyond the city, verdant rainforests and majestic volcanoes beckon nature lovers. Savor authentic Costa Rican cuisine, immerse yourself in the lively nightlife, and discover why San Jose is Central America's hidden gem.",
                longDescription = "Nestled in the heart of Costa Rica's Central Valley, San Jose offers a captivating blend of urban buzz and natural beauty. This dynamic capital, brimming with over 300,000 residents, is a microcosm of the country's rich heritage and warm hospitality.\n" + "\n" + "Delve into San Jose's colonial past, evident in the elegant structures lining Avenida Central. Marvel at the opulent facade of the Teatro Nacional, a cultural icon showcasing opera, ballet, and theatrical productions. Admire the intricate neoclassical architecture of the Museo Nacional, housing fascinating exhibits on Costa Rican history and indigenous cultures.\n" + "\n" + "For a taste of local life, explore the bustling Central Market, overflowing with fresh produce, handicrafts, and traditional souvenirs. Mingle with friendly vendors and indulge in Costa Rican staples like \"casados\" (rice and beans plates) and flavorful coffee.\n" + "\n" + "Step beyond the city center and discover hidden gems like Barrio Amon, a charming district showcasing restored Victorian mansions and trendy cafes. Immerse yourself in the vibrant art scene at the Museo de Arte Costarricense, or wander through the serene La Sabana Metropolitan Park, a haven for locals and nature enthusiasts.\n" + "\n" + "Embrace San Jose's adventurous spirit by venturing outside the city limits. Hike through lush rainforests teeming with exotic wildlife, ascend majestic volcanoes like Irazu and Poas, or relax on pristine beaches lining the Pacific coast.\n" + "\n" + "As dusk settles, San Jose's nightlife comes alive. Sway to Latin rhythms in salsa clubs, enjoy craft beers at local breweries, or savor international cuisine in trendy restaurants.\n" + "\n" + "Whether you're a history buff, a nature lover, or a cultural explorer, San Jose offers an unforgettable experience. With its warm climate, friendly people, and diverse offerings, Costa Rica's capital is a must-visit for any traveler seeking an authentic Central American adventure.\n",
                images = listOf(
                    Res.drawable.cr_san_jose_1,
                    Res.drawable.cr_san_jose_2,
                    Res.drawable.cr_san_jose_3,
                    Res.drawable.cr_san_jose_4,
                ),
                location = Location(
                    lat = 37.3387,
                    long = 121.8853
                )
            ), TouristPlace(
                name = "Guanacaste Beaches",
                shortDescription = "Guanacaste, Costa Rica's \"Gold Coast,\" boasts a dazzling array of beaches, each with its own unique character. From the world-renowned surf breaks of Tamarindo to the secluded serenity of Playa Conchal's shell-sand shores, discover endless opportunities for swimming, sunbathing, snorkeling, and adventure. Lush rainforests and vibrant towns provide a backdrop for unforgettable experiences, making Guanacaste a beach lover's paradise.",
                longDescription = "Escape to Guanacaste, Costa Rica's sun-drenched province, where pristine beaches unfurl along the Pacific Ocean. Nicknamed the \"Gold Coast,\" Guanacaste offers a diverse haven for beach enthusiasts, from adrenaline-pumping surfers to relaxation seekers.\n" + "\n" + "Indulge in the vibrant energy of Tamarindo, a renowned surfing hub with consistent waves and a lively atmosphere. Learn to ride the waves, explore tide pools teeming with marine life, or simply soak up the sun on the expansive beach.\n" + "\n" + "Embrace tranquility at Playa Conchal, a secluded gem known for its unique, soft sand composed of millions of crushed seashells. Swim in crystal-clear waters, stroll along the scenic coastline, or bask in the serenity of this hidden paradise.\n" + "\n" + "For a touch of luxury, head to Playa Flamingo, where secluded shores meet upscale resorts and world-class marinas. Embark on snorkeling adventures, indulge in pampering spa treatments, or tee off on championship golf courses overlooking the sparkling ocean.\n" + "\n" + "Discover Playa Grande, a haven for surfers and nature lovers alike. Witness the awe-inspiring spectacle of nesting Leatherback turtles during the season, learn to surf the powerful waves, or hike through the surrounding mangroves teeming with wildlife.\n" + "\n" + "Beyond these iconic beaches, Guanacaste offers countless hidden gems waiting to be explored. Discover Playa Samara's laid-back charm, Playa Avellanas' renowned surf breaks, or the secluded beauty of Playa Nosara, a haven for yoga enthusiasts and wellness seekers.\n" + "\n" + "With its diverse offerings, stunning natural beauty, and warm hospitality, Guanacaste's beaches promise an unforgettable escape for travelers seeking adventure, relaxation, and everything in between.\n",
                images = listOf(
                    Res.drawable.cr_guanacaste_beaches_1,
                    Res.drawable.cr_guanacaste_beaches_2,
                    Res.drawable.cr_guanacaste_beaches_3,
                    Res.drawable.cr_guanacaste_beaches_4,
                ),
                location = Location(
                    lat = 10.2992,
                    long = 85.8396
                )
            ), TouristPlace(
                name = "Arenal Volcano",
                shortDescription = "Arenal Volcano, Costa Rica's most active, towers majestically over lush rainforests. Once fiery, it now slumbers, offering breathtaking views, thrilling hikes, and geothermal wonders. Hike through verdant trails, soak in volcanic hot springs, and witness awe-inspiring lava flows at night. Arenal is a must-visit for nature lovers and adventure seekers.",
                longDescription = "Awaken your senses at Arenal Volcano, Costa Rica's iconic natural wonder. Though currently in a resting phase, Arenal's once fiery past left behind a dramatic conical peak (5,358 ft) that dominates the surrounding landscape. This awe-inspiring volcano, nestled in the heart of Arenal Volcano National Park, offers countless opportunities for exploration, adventure, and relaxation.\n" + "\n" + "Lace up your boots and hike through lush rainforests teeming with exotic flora and fauna. Feel the pulse of the earth beneath your feet as you traverse trails leading to stunning viewpoints with breathtaking panoramas of the volcano and surrounding landscapes.\n" + "\n" + "Indulge in the therapeutic bliss of natural hot springs heated by the volcano's geothermal energy. Relax in steaming pools surrounded by lush greenery, letting the warm waters soothe your muscles and revitalize your spirit.\n" + "\n" + "Thrill-seekers can opt for adrenaline-pumping activities like rappelling down waterfalls, white-water rafting through canyons, or zipping through the rainforest canopy on exhilarating zip lines.\n" + "\n" + "After dusk, witness the magic of Arenal come alive. Watch in awe as incandescent lava flows cascade down the volcano's slopes, painting the night sky with an ethereal glow. Capture unforgettable memories of this fiery spectacle, a testament to the raw power and beauty of nature.\n" + "\n" + "Beyond the volcano itself, the surrounding National Park offers a wealth of biodiversity, from cascading waterfalls and hidden lagoons to diverse wildlife sightings. Explore the Mistico Hanging Bridges suspended high above the rainforest canopy, or embark on a thrilling boat tour on Lake Arenal, surrounded by stunning volcanic panoramas.\n" + "\n" + "Whether you seek relaxation in hot springs, adventure in the rainforest, or awe-inspiring views of the volcano, Arenal offers an unforgettable experience. This iconic landmark is a must-visit for any traveler seeking to immerse themselves in Costa Rica's breathtaking natural beauty and vibrant energy.\n",
                images = listOf(
                    Res.drawable.cr_arenal_volcano_1,
                    Res.drawable.cr_arenal_volcano_2,
                    Res.drawable.cr_arenal_volcano_3,
                ),
                location = Location(
                    lat = 10.4626,
                    long = 84.7032
                )
            ), TouristPlace(
                name = "Playa Manuel Antonio",
                shortDescription = "Imagine paradise: swaying palm trees, shimmering turquoise waters, and powder-soft sand. Playa Manuel Antonio delivers, nestled within a protected national park teeming with exotic wildlife. Hike lush trails, relax on the beach, spot sloths lounging in trees, and witness playful monkeys swinging through the canopy. This natural wonderland promises an unforgettable Costa Rican experience.",
                longDescription = "Immerse yourself in paradise at Playa Manuel Antonio, a jewel of Costa Rica's Pacific coast. Framed by lush rainforest within Manuel Antonio National Park, this stunning beach boasts everything you dream of in a tropical escape.\n" + "\n" + "Sink your toes into the soft, golden sand and let the gentle waves lap at your feet. Bask in the warm Costa Rican sunshine, listening to the rhythmic whisper of palm trees swaying overhead. Dive into the crystal-clear waters, teeming with colorful fish and vibrant coral reefs, perfect for snorkeling and exploring the underwater world.\n" + "\n" + "Beyond the beach, adventure awaits in the surrounding rainforest. Hike through winding trails, enveloped by the emerald embrace of the jungle. Keep your eyes peeled for playful monkeys swinging through the branches, curious sloths hanging upside down, and exotic birds flitting amidst the vibrant foliage.\n" + "\n" + "Encounter a diverse array of wildlife, from toucans with their vibrant beaks to playful capuchin monkeys, curious iguanas sunning themselves on rocks, and even the occasional glimpse of a majestic three-toed sloth lazing in the trees. The park is a haven for nature lovers, offering a chance to witness the incredible biodiversity of Costa Rica's rainforest ecosystem.\n" + "\n" + "After a day of exploring, relax in the charming village of Manuel Antonio, offering a variety of restaurants, cafes, and shops. Savor delicious Costa Rican cuisine while enjoying the laid-back atmosphere and friendly locals.\n" + "\n" + "Playa Manuel Antonio is more than just a stunning beach; it's an immersive experience in nature's wonders. Whether you seek relaxation on the sand, exploration in the rainforest, or encounters with fascinating wildlife, this slice of paradise promises an unforgettable adventure.\n" + "\n",
                images = listOf(
                    Res.drawable.cr_playa_manuel_antonio_1,
                    Res.drawable.cr_playa_manuel_antonio_2,
                    Res.drawable.cr_playa_manuel_antonio_3,
                ),
                location = Location(
                    lat = 9.3813,
                    long = 84.1451
                )
            ), TouristPlace(
                name = "Monteverde Cloud Reserve Forest",
                shortDescription = "Step into another world in Monteverde Cloud Reserve Forest, Costa Rica. This mystical place, shrouded in mist and teeming with life, boasts towering trees adorned with orchids, elusive quetzals flitting through the canopy, and hidden waterfalls cascading through lush vegetation. Hike misty trails, encounter diverse wildlife, and witness breathtaking views – a nature lover's paradise awaits.",
                longDescription = "Soar above the clouds and immerse yourself in the enchanting realm of Monteverde Cloud Reserve Forest, Costa Rica. This ecological treasure trove, perched high in the Cordillera de Tilarán mountain range, unveils a captivating world cloaked in perpetual mist and teeming with an astonishing array of biodiversity.\n" + "\n" + "Imagine strolling along meandering trails canopied by ancient trees draped in vibrant orchids, bromeliads, and ferns. Breathe in the crisp, misty air as sunlight filters through the dense foliage, creating an ethereal atmosphere. Keep your ears peeled for the melodic calls of resplendent quetzals, their emerald plumage shimmering amidst the verdant tapestry. Watch in wonder as playful monkeys swing through the branches, and listen for the croaking symphony of hidden frogs and chirping insects – a symphony of life echoing throughout the forest.\n" + "\n" + "Beyond the captivating flora and fauna, Monteverde Cloud Reserve offers a diverse tapestry of trails catering to all levels of adventure. Hike the Sendero Pantanoso (Swamp Trail) and traverse the Continental Divide, or embark on the Sendero Bosque Nuboso (Cloud Forest Trail) and witness the majestic stature of towering trees reaching for the sky. Each path unveils hidden waterfalls, breathtaking vistas, and opportunities to encounter Costa Rica's unique wildlife.\n" + "\n" + "This haven for nature enthusiasts protects over 2,500 plant species, 400 species of birds, and countless elusive creatures. Whether you're a seasoned birder, a passionate photographer, or simply seeking a tranquil escape in nature's embrace, Monteverde Cloud Reserve promises an unforgettable experience. So lace up your hiking boots, breathe in the fresh mountain air, and prepare to be enchanted by this mystical cloud forest paradise.\n" + "\n" + "Remember: The Monteverde Cloud Reserve is committed to sustainable tourism practices. Make sure to plan your visit responsibly and help conserve this magical ecosystem for future generations.\n" + "\n",
                images = listOf(
                    Res.drawable.cr_monteverde_forest_1,
                    Res.drawable.cr_monteverde_forest_2,
                    Res.drawable.cr_monteverde_forest_3,
                    Res.drawable.cr_monteverde_forest_4,
                ),
                location = Location(
                    lat = 10.2989,
                    long = 84.7682
                )
            ), TouristPlace(
                name = "Tortuguero",
                shortDescription = "Tortuguero, Costa Rica, is a remote village nestled within lush rainforests and bordered by pristine Caribbean beaches. Accessible only by boat or plane, this unique destination offers a chance to witness endangered green sea turtles nesting on its shores, explore vibrant canals teeming with wildlife, and immerse yourself in the laid-back Caribbean atmosphere.",
                longDescription = "Escape to the enchanting village of Tortuguero, Costa Rica, where time seems to slow down and nature reigns supreme. Nestled within the labyrinthine canals of Tortuguero National Park, this remote village, accessible only by boat or plane, offers a unique blend of pristine beaches, vibrant rainforests, and a rich cultural heritage.\n" + "\n" + "As you arrive, prepare to be captivated by the village's charm. Colorful houses on stilts line the canals, their vibrant hues reflecting in the tranquil waters. The air hums with the symphony of exotic birds and the gentle murmur of lapping waves, creating a serene ambiance.\n" + "\n" + "Explore the village's narrow streets lined with local shops and restaurants, offering fresh seafood dishes and traditional Costa Rican fare. Immerse yourself in the laid-back Caribbean atmosphere, where locals greet you with warm smiles and a sense of pura vida (pure life).\n" + "\n" + "But Tortuguero's true magic lies beyond the village. Embark on a boat tour through the intricate network of canals, teeming with wildlife. Spot playful monkeys swinging through the trees, beobachten Sie majestic caimans basking in the sun, and keep your eyes peeled for elusive sloths hanging upside down. The canals are a photographer's paradise, offering endless opportunities to capture stunning nature shots.\n" + "\n" + "As dusk settles, witness the awe-inspiring spectacle of endangered green sea turtles nesting on the shores. Observe these gentle giants lumbering onto the beach, carefully digging their nests and laying their eggs under the moonlight. This unforgettable experience is a testament to the importance of conservation and the delicate balance of nature.\n" + "\n" + "Beyond the canals and beaches, Tortuguero National Park offers a plethora of hiking trails leading through lush rainforests. Hike through the dense foliage, encountering towering trees adorned with bromeliads and orchids, and listen to the symphony of exotic birds echoing through the canopy.\n" + "\n" + "Whether you seek relaxation on pristine beaches, thrilling wildlife encounters, or a glimpse into the traditional Caribbean way of life, Tortuguero offers an unforgettable experience. So, step off the beaten path and delve into the magic of this remote village, where nature's wonders and cultural charm await you.\n" + "\n",
                images = listOf(
                    Res.drawable.cr_tortuguero_1,
                    Res.drawable.cr_tortuguero_2,
                    Res.drawable.cr_tortuguero_3,
                    Res.drawable.cr_tortuguero_4,
                    Res.drawable.cr_tortuguero_5,
                    Res.drawable.cr_tortuguero_6,
                    Res.drawable.cr_tortuguero_7,
                    Res.drawable.cr_tortuguero_8,
                    Res.drawable.cr_tortuguero_9,
                    Res.drawable.cr_tortuguero_10,
                ),
                location = Location(
                    lat = 10.5425,
                    long = 83.5024
                )
            ), TouristPlace(
                name = "Celeste River",
                shortDescription = "A Turquoise Paradise. Celeste River is a hidden gem located in Tenorio Volcano National Park, Costa Rica. The river is known for its stunning turquoise color, caused by the mineral volcanic ash called \"la piedra azul\" (the blue stone). Visitors can hike to the river's source, a beautiful waterfall called Catarata de la Virgen, and swim in the refreshing waters.",
                longDescription = "Celeste River is a breathtaking natural wonder located in the heart of Tenorio Volcano National Park, Costa Rica. This river is renowned for its captivating turquoise color, a unique phenomenon attributed to the presence of the mineral volcanic ash known as \"la piedra azul\" (the blue stone). The mesmerizing hue creates a visual spectacle that leaves visitors awestruck.\n" + "\n" + "Reaching the river's source requires a scenic hike through the verdant rainforest of Tenorio Volcano National Park. The well-maintained trail winds its way through diverse flora and fauna, offering glimpses of hidden waterfalls and cascading streams along the journey. As you approach the source, the anticipation builds, culminating in the reveal of the magnificent Catarata de la Virgen (the Virgin's Waterfall).\n" + "\n" + "Catarata de la Virgen is a cascading masterpiece, plunging into a pool of the river's mesmerizing turquoise waters. The sight is truly breathtaking, and visitors are often compelled to take a dip in the refreshingly cool waters, surrounded by the lush rainforest canopy.\n" + "\n" + "Beyond its visual appeal, Celeste River holds cultural significance for the indigenous communities residing in the region. The turquoise color is believed to possess mystical properties, and legends recount its healing powers. This adds another layer of intrigue to the river's allure, making it a destination steeped in both natural beauty and cultural heritage.\n" + "\n" + "If you're seeking an unforgettable experience in Costa Rica, a visit to Celeste River is a must. The combination of its stunning turquoise color, captivating waterfall, and surrounding rainforest creates a magical atmosphere that will leave you mesmerized. So, lace up your hiking boots, pack your swimsuit, and embark on an adventure to discover the hidden gem of Celeste River.\n" + "\n",
                images = listOf(
                    Res.drawable.cr_celeste_river_1,
                    Res.drawable.cr_celeste_river_2,
                    Res.drawable.cr_celeste_river_3,
                ),
                location = Location(
                    lat = 10.658282,
                    long = -84.971352
                )
            )
        )
    ),
    Country(
        name = "Alyemen", flagIcon = Res.drawable.ye, touristPlaces = listOf(
            TouristPlace(
                name = "Old City of Sanaa",
                shortDescription = "The old, walled city has been inhabited for more than 2,500 years and contains a wealth of intact architectural gems.",
                longDescription = "Sana'a, the capital of Yemen, is a city of remarkable beauty and historical significance. Its Old City, a UNESCO World Heritage Site, is a testament to the city's rich past and vibrant culture.\n" +
                        "\n" +
                        "Architectural Marvels: Sana'a's Old City is home to a number of stunning historical buildings, including mosques, palaces, and bathhouses. These structures feature unique designs and impressive architecture, reflecting Yemen's rich architectural traditions.\n" +
                        "\n" +
                        "Souqs and Markets: The Old City is renowned for its vibrant souqs, or markets, which offer a diverse array of local goods and handicrafts. Visitors can wander through these bustling marketplaces and explore a wide range of products, including colorful textiles, aromatic spices, and unique antiques.\n" +
                        "\n" +
                        "Great Mosque of Sana'a: The Great Mosque of Sana'a is one of the oldest and largest mosques in the world. Built in the 7th century AD, it boasts magnificent architecture and intricate designs. The Great Mosque stands as a prominent landmark in the Old City, attracting visitors from around the globe.\n" +
                        "\n" +
                        "Bab al-Yemen: Bab al-Yemen, or the Gate of Yemen, serves as the main entrance to the Old City of Sana'a. Constructed in the 17th century AD, it features stunning architecture and towering minarets. Bab al-Yemen is an iconic symbol of the city and a popular tourist attraction for visitors worldwide.\n" +
                        "\n" +
                        "Warm and Welcoming People: The people of Sana'a's Old City are known for their warm hospitality and welcoming nature. They take pride in their heritage and culture and are delighted to share it with visitors from all corners of the world.",
                images = listOf(
                    Res.drawable.alyemen_sanaa_1,
                    Res.drawable.alyemen_sanaa_2,

                    ),
                location = Location(
                    lat = 15.3559,
                    long = 44.2135
                )
            ), TouristPlace(
                name = "Socotra Island",
                shortDescription = " Socotra Island is an ideal tourist destination for nature lovers and adventurers. ",
                longDescription = "  Socotra is a unique and fascinating island located in the Arabian Sea, off the coast of Somalia. It is renowned for its stunning natural beauty, diverse wildlife, and rich cultural heritage. With its pristine beaches, towering mountains, and lush forests, Socotra offers a truly unforgettable experience for travelers seeking adventure and tranquility.\n" +
                        "\n" +
                        "Here are some highlights of Socotra that make it a must-visit destination:\n" +
                        "\n" +
                        "Unique Flora and Fauna: Socotra is home to a remarkable array of endemic species, including the iconic dragon's blood tree, which is found nowhere else in the world. The island's diverse ecosystem supports a wide variety of birds, reptiles, and marine life, making it a paradise for nature enthusiasts.\n" +
                        "\n" +
                        "Stunning Landscapes: Socotra's landscapes are as diverse as they are breathtaking. From the white-sand beaches of Dihamri to the towering peaks of the Haghier Mountains, the island offers a feast for the eyes. Visitors can explore hidden canyons, swim in crystal-clear waters, and marvel at the unique rock formations that dot the island.\n" +
                        "\n" +
                        "Rich Cultural Heritage: Socotra has a rich cultural heritage that is deeply intertwined with its natural environment. The island's inhabitants, the Socotri people, have a unique way of life that has been shaped by centuries of isolation. Visitors can learn about their traditions, customs, and crafts, and experience their warm hospitality firsthand.\n" +
                        "\n" +
                        "Adventure and Exploration: Socotra is a haven for adventure seekers. With its rugged terrain and diverse landscapes, the island offers ample opportunities for hiking, camping, snorkeling, and diving. Visitors can explore hidden caves, climb towering peaks, and discover secluded beaches that are accessible only by foot or boat.\n" +
                        "\n" +
                        "Tranquility and Relaxation: Despite its growing popularity, Socotra remains a relatively unspoiled destination. Visitors can escape the hustle and bustle of everyday life and immerse themselves in the island's tranquil atmosphere. With its serene beaches, clear waters, and starry night skies, Socotra is the perfect place to relax, rejuvenate, and reconnect with nature.\n" +
                        "\n",
                images = listOf(
                    Res.drawable.alyemen_socotra_1,
                    Res.drawable.alyemen_socotra_2,
                    Res.drawable.alyemen_socotra_3,

                    ),
                location = Location(
                    lat = 12.4634,
                    long = 53.8237
                )
            )

        )
    ),
    Country(
        name = "Lithuania", flagIcon = Res.drawable.li_lithuania_flag, touristPlaces = listOf(
            TouristPlace(
                name = "Vilnius Old Town",
                shortDescription = "The Old Town of Vilnius, one of the largest surviving medieval old towns in Northern Europe",
                longDescription = "The Old Town of Vilnius has an area of 3.59 square kilometres (887 acres). It encompasses 74 quarters, with 70 streets and lanes numbering 1487 buildings with a total floor area of 1,497,000 square meters. It was founded by the Lithuanian Grand Duke and King of Poland Jogaila in 1387 on the Magdeburg rights the oldest part of the Lithuanian capital of Vilnius, it had been developed over the course of many centuries, and has been shaped by the city's history and a constantly changing cultural influence. It is a place where some of Europe's greatest architectural styles—gothic, renaissance, baroque and neoclassical—stand side by side and complement each other. There are many Catholic, Lutheran and Orthodox churches, residential houses, cultural and architectural monuments, museums in the Old Town.\n" +
                        "\n" +
                        "Pilies Street is the Old Town's main artery and the hub of cafe and street market life. The main street of Vilnius, Gediminas Avenue, is partially located in the Old Town. The central squares in the Old Town are the Cathedral Square and the Town Hall Square.\n" +
                        "\n" +
                        "One of the most elaborate architectural complexes is the Vilnius University Architectural Ensemble, which occupies a large part of the Old Town and has 13 courtyards. It was selected to represent Lithuania in the Mini-Europe Park in Brussels.",

                images = listOf(
                    Res.drawable.li_vilnius_old_town,
                    Res.drawable.li_vilnius_old_town_2,
                    Res.drawable.li_vilnius_old_town_3,
                ),
                location = Location(
                    lat = 54.6784,
                    long = 25.2865
                )
            ),
            TouristPlace(
                name = "Curonian Spit National Park",
                shortDescription = "Curonian Spit National Park is one of the five national parks in Lithuania. It was established in 1991 to protect the unique ecosystems of the Curonian Spit and Curonian Lagoon.",
                longDescription = "The Curonian Spit is a unique and vulnerable, sandy and wooded cultural landscape on a coastal spit which features small Curonian lagoon settlements. The Spit was formed by the sea, wind and human activity and continues to be shaped by them. Rich with an abundance of unique natural and cultural features, it has retained its social and cultural importance. Local communities adapted to the changes in the natural environment in order to survive. This interaction between humans and nature shaped the Curonian Spit cultural landscape.\n" +
                        "\n" +
                        "The history of the Curonian Spit is dramatic: 5,000 years ago, a narrow peninsula (98 km in length and 0.4-3.8 km in width), the Great Dune Ridge separating the Baltic Sea from the Curonian Lagoon, was formed on moraine islands from sand transported by currents, and later covered by forest. After intensive logging in the 17th and 18th centuries, the dunes began moving towards the Curonian Lagoon, burying the oldest settlements.",

                images = listOf(
                    Res.drawable.li_curonian_spit_national_park,
                    Res.drawable.li_curonian_spit_national_park_2,
                    Res.drawable.li_curonian_spit_national_park_3,
                ),
                location = Location(
                    lat = 55.2950,
                    long = 20.9905
                )
            ),

            TouristPlace(
                name = "Trakai Island Castle",
                shortDescription = "Trakai Island Castle is an island castle located in Trakai, Lithuania, on an island in Lake Galvė.",
                longDescription = "The castle was built in the 14th century and served as a residence for the Grand Dukes of Lithuania. However, the structure fell into disarray in the 17th century and was only rebuilt in 1951. In 1962, the castle became a part of the Trakai History Museum.\n" +
                        "\n" +
                        "The castle is famous for its gothic architecture and its special location – it stands on an island on Lake Galve, one of the deepest lakes in Lithuania. The view of the historic structure is straight out of a fairy tale. You can reach the castle by crossing the long wooden bridge. In the winter the lake freezes over and becomes a natural skating rink. You can also take in a special view of the castle from a yacht.",
                images = listOf(
                    Res.drawable.li_trakai_island_castle,
                    Res.drawable.li_trakai_island_castle_2,
                    Res.drawable.li_trakai_island_castle_3,
                ),
                location = Location(
                    lat = 54.6523,
                    long = 24.9336
                )
            )

        )
    ),
    Country(
        name = "Indonesia", flagIcon = Res.drawable.id, touristPlaces = listOf(
            TouristPlace(
                name = "Bali",
                shortDescription = "Bali, embodies a harmonious blend of natural beauty, cultural richness, and spiritual serenity that captivates visitors from around the world. Nestled in the Indonesian archipelago, this island paradise is renowned for its lush landscapes, including verdant rice terraces, cascading waterfalls, and rugged volcanic peaks that rise dramatically against the skyline. From the sun-kissed beaches of Kuta and Seminyak to the tranquil shores of Sanur and Lovina, Bali's coastline offers endless opportunities for relaxation, water sports, and unforgettable sunsets.",
                longDescription = "Bali, embodies a harmonious blend of natural beauty, cultural richness, and spiritual serenity that captivates visitors from around the world. Nestled in the Indonesian archipelago, this island paradise is renowned for its lush landscapes, including verdant rice terraces, cascading waterfalls, and rugged volcanic peaks that rise dramatically against the skyline. From the sun-kissed beaches of Kuta and Seminyak to the tranquil shores of Sanur and Lovina, Bali's coastline offers endless opportunities for relaxation, water sports, and unforgettable sunsets. Beyond its stunning scenery, Bali is steeped in a vibrant cultural heritage that permeates every facet of daily life. The island's Hindu traditions are evident in its ornate temples, elaborate ceremonies, and colorful festivals, where locals and visitors alike come together to celebrate spirituality and community. From the iconic sea temple of Tanah Lot to the sacred sanctuary of Ubud's Monkey Forest, Bali's spiritual landmarks provide a glimpse into the island's ancient past and enduring traditions. Moreover, Bali's cultural vibrancy is showcased through its traditional dance performances, intricate batik and wood carvings, and delectable cuisine that tantalizes the taste buds with a fusion of flavors and spices. In essence, Bali is a destination where travelers can immerse themselves in a tapestry of natural wonders, cultural treasures, and spiritual experiences that leave an indelible mark on the soul.",
                images = listOf(
                    Res.drawable.indonesia_bali_1,
                    Res.drawable.indonesia_bali_2,
                    Res.drawable.indonesia_bali_3,
                    Res.drawable.indonesia_bali_4,
                    Res.drawable.indonesia_bali_5,
                ),
                location = Location(
                    lat = 8.4095,
                    long = 115.1889
                )
            ),
            TouristPlace(
                name = "Komodo Park",
                shortDescription = "Komodo National Park, situated in the Lesser Sunda Islands of Indonesia, is a pristine wilderness that encompasses a chain of volcanic islands, rugged coastlines, and rich marine ecosystems. Renowned as the habitat of the iconic Komodo dragon, the world's largest lizard species, this UNESCO World Heritage Site is a haven for biodiversity and natural wonders. The park's diverse landscapes range from lush forests and savannah plains to vibrant coral reefs and crystal-clear waters teeming with marine life, making it a paradise for nature enthusiasts, adventurers, and conservationists alike.",
                longDescription = "Komodo National Park, situated in the Lesser Sunda Islands of Indonesia, is a pristine wilderness that encompasses a chain of volcanic islands, rugged coastlines, and rich marine ecosystems. Renowned as the habitat of the iconic Komodo dragon, the world's largest lizard species, this UNESCO World Heritage Site is a haven for biodiversity and natural wonders. The park's diverse landscapes range from lush forests and savannah plains to vibrant coral reefs and crystal-clear waters teeming with marine life, making it a paradise for nature enthusiasts, adventurers, and conservationists alike. Exploring Komodo National Park offers a glimpse into a world untouched by time, where prehistoric creatures roam freely amidst landscapes of unparalleled beauty and ecological significance. Visitors can embark on guided treks through rugged terrain to encounter Komodo dragons in their natural habitat, witnessing firsthand the awe-inspiring spectacle of these ancient reptiles in the wild. Beneath the waves, the park's marine treasures await discovery, with some of the world's most biodiverse coral reefs providing sanctuary to a dazzling array of marine species, including manta rays, sea turtles, and colorful reef fish. Whether diving, snorkeling, hiking, or simply soaking in the breathtaking scenery, Komodo National Park offers a truly immersive and unforgettable experience, where the wonders of nature unfold at every turn, leaving a lasting impression on all who venture into its pristine wilderness.",
                images = listOf(
                    Res.drawable.indonesia_comodo_island_1,
                    Res.drawable.indonesia_comodo_island_2,
                    Res.drawable.indonesia_comodo_island_3,
                    Res.drawable.indonesia_comodo_island_4,
                ),
                location = Location(
                    lat = 8.5850,
                    long = 119.4411
                )
            ),
            TouristPlace(
                name = "Lombok",
                shortDescription = "Lombok is a hidden gem in the Indonesian archipelago, offering a tranquil escape from the bustling crowds of neighboring Bali. With its pristine beaches, rugged landscapes, and rich cultural heritage, Lombok beckons travelers seeking adventure, relaxation, and authentic experiences. The island is renowned for its stunning beaches, including the powdery white sands of Kuta Beach and the turquoise waters of the Gili Islands, which offer world-class snorkeling, diving, and surfing opportunities amidst vibrant coral reefs and marine life.",
                longDescription = "Lombok is a hidden gem in the Indonesian archipelago, offering a tranquil escape from the bustling crowds of neighboring Bali. With its pristine beaches, rugged landscapes, and rich cultural heritage, Lombok beckons travelers seeking adventure, relaxation, and authentic experiences. The island is renowned for its stunning beaches, including the powdery white sands of Kuta Beach and the turquoise waters of the Gili Islands, which offer world-class snorkeling, diving, and surfing opportunities amidst vibrant coral reefs and marine life. Beyond its coastal allure, Lombok boasts a diverse terrain that encompasses lush rice paddies, towering volcanoes, and cascading waterfalls waiting to be explored. The majestic Mount Rinjani, Indonesia's second-highest volcano, is a hiker's paradise, offering challenging treks that reward adventurers with panoramic views of crater lakes and lush valleys. In addition to its natural wonders, Lombok is home to a rich tapestry of cultures, with Sasak traditions and customs shaping the island's unique identity. Visitors can immerse themselves in local life by exploring traditional Sasak villages, witnessing age-old weaving techniques, and savoring authentic culinary delights such as ayam taliwang and plecing kangkung. In essence, Lombok embodies the essence of tropical paradise, where pristine landscapes, cultural authenticity, and warm hospitality converge to create an unforgettable island getaway.",
                images = listOf(
                    Res.drawable.indonesia_bromo_1,
                    Res.drawable.indonesia_bromo_2,
                    Res.drawable.indonesia_bromo_3,
                    Res.drawable.indonesia_bromo_4,
                    Res.drawable.indonesia_bromo_5,
                ),
                location = Location(
                    lat = 8.6510,
                    long = 116.3249
                )
            ),
            TouristPlace(
                name = "Borobudur Temple",
                shortDescription = "Borobudur Temple located on the island of Java in Indonesia, stands as one of the world's most magnificent religious monuments and a testament to Indonesia's rich cultural heritage. This UNESCO World Heritage Site is a masterpiece of Buddhist architecture and artistry, dating back to the 9th century during the Sailendra dynasty. Rising majestically amidst lush greenery and volcanic landscapes, Borobudur is a monumental stone structure comprised of nine stacked platforms, adorned with over 2,500 intricately carved relief panels and 504 Buddha statues.",
                longDescription = "Borobudur Temple located on the island of Java in Indonesia, stands as one of the world's most magnificent religious monuments and a testament to Indonesia's rich cultural heritage. This UNESCO World Heritage Site is a masterpiece of Buddhist architecture and artistry, dating back to the 9th century during the Sailendra dynasty. Rising majestically amidst lush greenery and volcanic landscapes, Borobudur is a monumental stone structure comprised of nine stacked platforms, adorned with over 2,500 intricately carved relief panels and 504 Buddha statues. As visitors ascend its terraces, they embark on a symbolic journey towards enlightenment, following the path of Buddhist cosmology depicted through the temple's intricate carvings and sculptures. Each level represents a stage in the Buddhist spiritual journey, culminating in the central dome, which is crowned by a large stupa symbolizing Nirvana. From its panoramic vantage points, Borobudur offers breathtaking views of the surrounding countryside, including mist-shrouded mountains, verdant rice fields, and distant volcanoes, creating an atmosphere of tranquility and spiritual awe. At sunrise or sunset, the temple's stone stupas cast dramatic silhouettes against the sky, providing visitors with a truly magical and unforgettable experience amidst the ancient grandeur of Borobudur Temple.",
                images = listOf(
                    Res.drawable.indonesia_candi_brob_1,
                    Res.drawable.indonesia_candi_brob_2,
                    Res.drawable.indonesia_candi_brob_3,
                    Res.drawable.indonesia_candi_brob_4,
                ),
                location = Location(
                    lat = 7.6079,
                    long = 110.2038
                )
            ),
            TouristPlace(
                name = "Raja Ampat",
                shortDescription = "Raja Ampat, located in the heart of the Coral Triangle in Indonesia's West Papua province, is a pristine marine paradise renowned for its unparalleled biodiversity and stunning natural beauty. Comprising over 1,500 small islands, cays, and shoals, Raja Ampat's crystalline waters are home to an astonishing array of marine life, including vibrant coral reefs, majestic manta rays, and elusive whale sharks. ",
                longDescription = "Raja Ampat, located in the heart of the Coral Triangle in Indonesia's West Papua province, is a pristine marine paradise renowned for its unparalleled biodiversity and stunning natural beauty. Comprising over 1,500 small islands, cays, and shoals, Raja Ampat's crystalline waters are home to an astonishing array of marine life, including vibrant coral reefs, majestic manta rays, and elusive whale sharks. Divers and snorkelers flock to this remote archipelago to explore its underwater wonders, which boast some of the most biodiverse marine ecosystems on the planet. From the kaleidoscopic coral gardens of Misool to the adrenaline-inducing drift dives of the Dampier Strait, Raja Ampat offers a diverse range of diving experiences suitable for both beginners and experienced enthusiasts alike. Above the surface, Raja Ampat's emerald-green islands are adorned with lush rainforests, hidden lagoons, and secluded beaches that beckon adventurers and nature lovers to explore their pristine shores. Visitors can embark on jungle treks to discover rare bird species, such as the iconic Birds of Paradise, or kayak through mangrove forests teeming with wildlife. Cultural encounters with the indigenous Papuan communities offer insights into traditional way of life, where ancient customs and rituals are still preserved amidst the remote islands of Raja Ampat. As a beacon of conservation and ecotourism, Raja Ampat serves as a reminder of the extraordinary beauty and fragility of our natural world, inspiring visitors to protect and preserve these precious marine ecosystems for generations to come.",
                images = listOf(
                    Res.drawable.indonesia_raja_ampat_1,
                    Res.drawable.indonesia_raja_ampat_2,
                    Res.drawable.indonesia_raja_ampat_3,
                    Res.drawable.indonesia_raja_ampat_4,
                    Res.drawable.indonesia_raja_ampat_5,
                ),
                location = Location(
                    lat = 1.0915,
                    long = 130.8779
                )
            ),
            TouristPlace(
                name = "Bromo",
                shortDescription = "Bromo, a majestic volcanic complex situated in East Java, Indonesia, is a mesmerizing testament to the forces of nature and a beacon of adventure for travelers seeking to explore Indonesia's rugged landscapes. Surrounded by the Bromo Tengger Semeru National Park, this geological wonder comprises a series of volcanic cones, with the active Bromo volcano standing as the centerpiece of the region. Rising 2,329 meters (7,641 feet) above sea level, Bromo's stark beauty and dramatic scenery have made it an iconic destination for adventurers, photographers, and nature enthusiasts alike.",
                longDescription = "Bromo, a majestic volcanic complex situated in East Java, Indonesia, is a mesmerizing testament to the forces of nature and a beacon of adventure for travelers seeking to explore Indonesia's rugged landscapes. Surrounded by the Bromo Tengger Semeru National Park, this geological wonder comprises a series of volcanic cones, with the active Bromo volcano standing as the centerpiece of the region. Rising 2,329 meters (7,641 feet) above sea level, Bromo's stark beauty and dramatic scenery have made it an iconic destination for adventurers, photographers, and nature enthusiasts alike. The journey to Bromo unfolds amidst a backdrop of breathtaking vistas and diverse ecosystems. Travelers embark on an adventure that winds through verdant forests, rugged terrain, and ancient villages, immersing themselves in the rich tapestry of Javanese culture and tradition. As visitors approach the volcanic complex, they are greeted by the surreal landscape of the Tengger Caldera, where vast plains of volcanic sand stretch as far as the eye can see. The ascent to Bromo's crater rim offers a sense of anticipation and wonder, culminating in awe-inspiring views of the surrounding landscape and the smoking crater below. At sunrise, the horizon ignites with hues of crimson and gold, casting an ethereal glow over Bromo and its neighboring peaks, creating a moment of pure magic amidst the untamed wilderness of Indonesia's volcanic realm.",
                images = listOf(
                    Res.drawable.indonesia_bromo_1,
                    Res.drawable.indonesia_bromo_2,
                    Res.drawable.indonesia_bromo_3,
                    Res.drawable.indonesia_bromo_4,
                    Res.drawable.indonesia_bromo_5,
                ),
                location = Location(
                    lat = -7.942965,
                    long = 112.9530
                )
            ),
        )
    ),
    Country(
        name = "Iraq", flagIcon = Res.drawable.iraq,
        touristPlaces = listOf(
            TouristPlace(
                name = "Baghdad",
                shortDescription = "The capital city of Iraq, known for its rich history, cultural sites, and bustling markets.",
                longDescription = "Baghdad, located on the Tigris River, is one of the oldest continuously inhabited cities in the world. It boasts a wealth of historical landmarks, including the Al-Mustansiriya School, the Al-Shaheed Monument, and the Baghdad Tower. Visitors can explore vibrant markets like the Al-Mutanabbi Street book market and experience the city's diverse cuisine and vibrant culture.",
                images = listOf(
                    Res.drawable.bagdad_1,
                    Res.drawable.bagdad_2,
                    Res.drawable.bagdad_3,
                    Res.drawable.bagdad_4,
                    Res.drawable.bagdad_5,
                ),
                location = Location(
                    lat = 33.3152,
                    long = 44.3661
                )
            ),
            TouristPlace(
                name = "Erbil Citadel",
                shortDescription = "An ancient citadel located in Erbil, considered one of the oldest continuously inhabited cities in the world.",
                longDescription = "The Erbil Citadel is a UNESCO World Heritage Site and a symbol of Erbil's rich history. It dates back over 6,000 years and has been continuously occupied since ancient times. The citadel features archaeological sites, museums, and historic buildings, offering visitors a glimpse into the region's past.",
                images = listOf(
                    Res.drawable.erbil_1,
                    Res.drawable.erbil_2,
                    Res.drawable.erbil_3,
                ),
                location = Location(
                    lat = 36.1912,
                    long = 44.0094
                )
            ),
            TouristPlace(
                name = "Karbala",
                shortDescription = "A sacred city for Shia Muslims, known for the Shrine of Imam Hussein and the Battle of Karbala.",
                longDescription = "Karbala holds immense religious significance for Shia Muslims as the site of the Battle of Karbala in 680 AD, where Imam Hussein, the grandson of Prophet Muhammad, was martyred. The city is home to the grand Shrine of Imam Hussein, a pilgrimage destination visited by millions of Shia Muslims annually. Karbala also features other religious sites, including the Shrine of Abbas ibn Ali and historic mosques.",
                images = listOf(
                    Res.drawable.karbala_1,
                    Res.drawable.karbala_2,
                    Res.drawable.karbala_3,
                    Res.drawable.karbala_4,
                    Res.drawable.karbala_5,
                    Res.drawable.karbala_6,
                ),
                location = Location(
                    lat = 32.6027,
                    long = 44.0197
                )
            ),

            TouristPlace(
                name = "Hatra",
                shortDescription = "An ancient city in northern Iraq, renowned for its well-preserved ruins and unique architecture.",
                longDescription = "Hatra is an archaeological site dating back to the 2nd century BCE. It was the capital of the Kingdom of Hatra and is known for its impressive defensive walls, temples, and statues. Despite being damaged by conflicts, many of its structures remain intact, providing insight into ancient Mesopotamian culture and architecture.",
                images = listOf(
                    Res.drawable.hatra_1,
                    Res.drawable.hatra_2,
                    Res.drawable.hatra_3,
                ),
                location = Location(
                    lat = 35.5759,
                    long = 42.7345
                )
            ),
            TouristPlace(
                name = "Marshes of Southern Iraq",
                shortDescription = "A unique wetland ecosystem in southern Iraq, home to diverse flora and fauna and traditional Marsh Arab culture.",
                longDescription = "Hatra is an archaeological site dating back to the 2nd century BCE. It was the capital of the Kingdom of Hatra and is known for its impressive defensive walls, temples, and statues. Despite being damaged by conflicts, many of its structures remain intact, providing insight into ancient Mesopotamian culture and architecture.",
                images = listOf(
                    Res.drawable.marshes_1,
                    Res.drawable.marshes_2,
                    Res.drawable.marshes_3,
                ),
                location = Location(
                    lat = 31.1590,
                    long = 47.9458
                )
            ),
            TouristPlace(
                name = "Basra",
                shortDescription = "A port city in southern Iraq, known for its bustling markets, historic architecture, and cultural heritage.",
                longDescription = "Basra, situated along the Shatt al-Arab river, is Iraq's second-largest city and a major economic hub. It boasts a vibrant cultural scene, with historic landmarks such as the Basra Grand Mosque, the Corniche al-Basra waterfront promenade, and the Basra Museum. Visitors can experience the city's unique blend of Arab, Persian, and British influences, along with its famous seafood cuisine and lively souks.",
                images = listOf(
                    Res.drawable.basra_1,
                ),
                location = Location(
                    lat = 30.5258,
                    long = 47.7738
                )
            ),
            TouristPlace(
                name = "Samarra",
                shortDescription = "A historical city on the Tigris River, home to UNESCO-listed archaeological sites and Islamic landmarks.",
                longDescription = "Samarra is renowned for its well-preserved Abbasid-era architecture and archaeological ruins. The city's most famous attraction is the Great Mosque of Samarra, with its iconic spiral minaret. Other notable sites include the Al-Askari Shrine and the Malwiya Tower. Samarra offers visitors a fascinating glimpse into Iraq's medieval Islamic history and architectural heritage.",
                images = listOf(
                    Res.drawable.samarra_1,
                ),
                location = Location(
                    lat = 34.1660,
                    long = 43.9055
                )
            ),

            TouristPlace(
                name = "Najaf",
                shortDescription = "Najaf is a holy city for Shia Muslims, known for its religious significance and architectural landmarks.",
                longDescription = "Najaf is located in central Iraq and holds great importance for Shia Muslims worldwide. It is home to the Shrine of Imam Ali, the cousin and son-in-law of the Prophet Muhammad, and the first Imam in Shia Islam. The shrine, one of the holiest sites in Shia Islam, is a magnificent architectural masterpiece adorned with intricate tilework, calligraphy, and gold embellishments. Pilgrims from around the world visit Najaf to pay their respects to Imam Ali and seek spiritual blessings. In addition to the shrine, Najaf features other religious landmarks such as mosques, mausoleums, and religious schools. The city has a rich cultural heritage and a vibrant atmosphere, with bustling markets, traditional bazaars, and historic neighborhoods. Najaf's religious significance, combined with its architectural beauty and cultural heritage, makes it a must-visit destination for travelers interested in exploring Iraq's spiritual and historical legacy.",
                images = listOf(
                    Res.drawable.najaf_1,
                    Res.drawable.najaf_2,
                ),
                location = Location(
                    lat = 32.0107,
                    long = 44.3265
                )
            ),
            TouristPlace(
                name = "Nimrud",
                shortDescription = "An ancient Assyrian city with archaeological ruins, including palaces, temples, and artifacts.",
                longDescription = "Nimrud, also known as Kalhu or Kalakh, was the capital of the Neo-Assyrian Empire. The site is home to the remains of grand palaces, temples, and statues adorned with intricate carvings and reliefs. Visitors can explore the archaeological site and marvel at the artifacts housed in museums around the world, showcasing Nimrud's rich history and cultural significance.",
                images = listOf(
                    Res.drawable.nimrud_1,
                ),
                location = Location(
                    lat = 36.0933,
                    long = 43.3211
                )
            ),

            ),
    ),
    Country(
        name = "Kenya", flagIcon = Res.drawable.kenya, touristPlaces = listOf(
            TouristPlace(
                name = "Maasai Mara",
                shortDescription = "Maasai Mara is a renowned game reserve in Kenya, famous for its stunning landscapes and abundant wildlife, including the Big Five.",
                longDescription = "Nestled in southwestern Kenya, Maasai Mara National Reserve is a quintessential African safari destination. Its vast savanna landscapes are dotted with acacia trees, providing a picturesque backdrop for the awe-inspiring array of wildlife that inhabits the region. The Mara is renowned for its role in the Great Migration, a natural spectacle where millions of wildebeest, zebras, and other herbivores traverse the plains in search of fresh grazing grounds, closely followed by predators such as lions, cheetahs, and hyenas. Visitors to Maasai Mara have the opportunity to witness this breathtaking phenomenon firsthand, as well as engage in thrilling game drives, guided walks, and cultural interactions with the Maasai people, who have coexisted with the wildlife for centuries. With its rich biodiversity and unparalleled natural beauty, Maasai Mara is a bucket-list destination for wildlife enthusiasts and adventure seekers alike.",
                images = listOf(
                    Res.drawable.kenya_mara_1,
                    Res.drawable.kenya_mara_2,
                    Res.drawable.kenya_mara_3,
                ),
                location = Location(
                    lat = 1.4821,
                    long = 35.1300
                )
            ),
            TouristPlace(
                name = "Lamu Island",
                shortDescription = "Lamu Island is a charming destination off the coast of Kenya, known for its Swahili architecture, pristine beaches, and vibrant culture.",
                longDescription = " Lamu Island, located in the Indian Ocean off the northern coast of Kenya, is a unique and enchanting destination steeped in history and culture. Designated as a UNESCO World Heritage Site, Lamu is renowned for its well-preserved Swahili architecture, characterized by intricately carved wooden doors, narrow winding streets, and majestic stone buildings. The island's pristine beaches, with their clear turquoise waters and swaying palm trees, offer idyllic spots for relaxation and water activities such as snorkeling, diving, and dhow sailing. Lamu's vibrant cultural scene is evident in its bustling markets, traditional dhow races, and lively festivals, including the annual Lamu Cultural Festival which showcases the island's rich heritage through music, dance, and art. Visitors can explore historical sites like the Lamu Fort and ancient Swahili settlements such as Lamu Town, Shela, and Matondoni, where time seems to stand still amidst the tranquility of island life. With its timeless charm and authentic Swahili ambiance, Lamu Island offers a captivating escape for those seeking a blend of history, culture, and natural beauty in a tropical paradise.",
                images = listOf(
                    Res.drawable.kenya_lamu_1,
                    Res.drawable.kenya_lamu_2,
                    Res.drawable.kenya_lamu_3,
                ),
                location = Location(
                    lat = 2.2904,
                    long = 40.8677
                )
            ),
            TouristPlace(
                name = "Fourteen Falls",
                shortDescription = "Fourteen Falls is a scenic waterfall located in Thika, Kenya, offering breathtaking views and opportunities for nature exploration and photography.",
                longDescription = "Fourteen Falls, located near Thika in central Kenya, is a captivating natural wonder renowned for its picturesque beauty and serene ambiance. Named after the 14 distinct cascades formed by the Athi River as it tumbles over the rocky terrain, the waterfall is a popular destination for nature lovers, photographers, and adventure seekers alike. Visitors can marvel at the majestic sight of the cascading water, which creates a mesmerizing spectacle of mist and spray against a backdrop of lush greenery and rocky cliffs. The surrounding landscape is adorned with indigenous flora and fauna, providing opportunities for nature exploration and birdwatching. Adventurous visitors can embark on hikes along the riverbanks or take boat rides to get closer to the falls, while those seeking tranquility can simply relax and enjoy the soothing sounds of rushing water and chirping birds. Fourteen Falls is not only a scenic marvel but also holds cultural significance for the local communities, serving as a gathering place for traditional ceremonies and festivities. Whether it's for a peaceful retreat into nature, an adrenaline-pumping adventure, or simply to admire its natural beauty, Fourteen Falls offers an unforgettable experience for all who visit.",
                images = listOf(
                    Res.drawable.kenya_ff_1,
                    Res.drawable.kenya_ff_2,
                ),
                location = Location(
                    lat = -0.9613,
                    long = 37.1525
                )
            ),
        )
    ),
    Country(
        name = "Vietnam",
        flagIcon = Res.drawable.vietnam,
        touristPlaces = listOf(
            TouristPlace(
                name = "Ha Long Bay",
                shortDescription = "Hạ Long Bay or Halong Bay is a UNESCO World Heritage Site and popular travel destination in Quảng Ninh province, Vietnam.",
                longDescription = "Hạ Long Bay or Halong Bay is a UNESCO World Heritage Site and popular travel destination in Quảng Ninh province, Vietnam. The name Hạ Long means \"descending dragon\". Administratively, the bay belongs to Hạ Long city, Cẩm Phả city, and is a part of Vân Đồn district. The bay features thousands of limestone karsts and islets in various shapes and sizes. Hạ Long Bay is a center of a larger zone that includes Bai Tu Long Bay to the northeast, and Cát Bà Island to the southwest. These larger zones share a similar geological, geographical, geomorphological, climate, and cultural characters.",
                images = listOf(
                    Res.drawable.vietnam_halongbay_1,
                    Res.drawable.vietnam_halongbay_2,
                    Res.drawable.vietnam_halongbay_3,
                ),
                location = Location(
                    lat = 20.9101,
                    long = 107.1839
                )
            ),
            TouristPlace(
                name = "Sơn Đoòng cave",
                shortDescription = "Sơn Đoòng cave, in Phong Nha-Kẻ Bàng National Park, Bố Trạch District, Quảng Bình Province, Vietnam, is one of the world's largest natural caves.",
                longDescription = "Sơn Đoòng cave, in Phong Nha-Kẻ Bàng National Park, Bố Trạch District, Quảng Bình Province, Vietnam, is one of the world's largest natural caves. Located near the Laos–Vietnam border, Hang Sơn Đoòng has an internal, fast-flowing subterranean river and the largest cross-section of any cave, worldwide, believed to be twice that of the next-largest passage. It is the largest known cave passage in the world by volume. Its name, Hang Sơn Đoòng, is variously translated from Vietnamese as \"cave of the mountain river\" or \"cave of mountains behind Đoòng [village]\". As a solutional cave, it was formed in soluble limestone and is believed to be between 2 and 5 million years old.",
                images = listOf(
                    Res.drawable.vietnam_sondoong_1,
                    Res.drawable.vietnam_sondoong_2,
                    Res.drawable.vietnam_sondoong_3,
                ),
                location = Location(
                    lat = 17.5469,
                    long = 106.1440
                )
            ),
            TouristPlace(
                name = "Phu Quoc",
                shortDescription = "Phú Quốc is the largest island in Vietnam. Phú Quốc and nearby islands, along with the distant Thổ Chu Islands, are part of Kiên Giang Province as Phú Quốc City.",
                longDescription = "Phú Quốc is the largest island in Vietnam. Phú Quốc and nearby islands, along with the distant Thổ Chu Islands, are part of Kiên Giang Province as Phú Quốc City. The island has a total area of 574 km2 (222 sq mi) and a permanent population of approximately 179,480 people. Located in the Gulf of Thailand, the island city of Phú Quốc includes the island proper and 21 smaller islets. Dương Đông ward, located on the island's west coast, is the island's administrative centre and largest town. The other ward is An Thới on the southern tip of the island.",
                images = listOf(
                    Res.drawable.vietnam_phuquoc_1,
                    Res.drawable.vietnam_phuquoc_2,
                    Res.drawable.vietnam_phuquoc_3,
                ),
                location = Location(
                    lat = 10.2899,
                    long = 103.9840
                )
            ),
        ),
    ),
    Country(
        name = "Peru", flagIcon = Res.drawable.peru, touristPlaces = listOf(
            TouristPlace(
                name = "Machu Picchu",
                shortDescription = "Machu Picchu is an ancient Incan citadel located in the Andes Mountains of Peru, famous for its breathtaking natural beauty and rich history.",
                longDescription = "Machu Picchu, also known as the Sacred Valley, is an ancient Incan citadel located in the Andes Mountains of Peru. It is considered one of the most iconic and enduring cultural landmarks in South America, attracting millions of visitors each year. The site is situated on a mountain ridge overlooking the Sacred Valley, which is a vast network of canyons, waterfalls, and other natural wonders. Machu Picchu's unique architecture and stunning natural beauty make it a must-visit destination for travelers seeking a glimpse into the rich history and culture of the Incan civilization. Visitors can explore the site's various temples, palaces, and terraces, marvel at the breathtaking views of the surrounding landscape, and learn about the history and significance of the site through guided tours and educational programs. Machu Picchu is also a popular destination for adventure seekers, offering opportunities for hiking, zip-lining, and other outdoor activities.",
                images = listOf(
                    Res.drawable.machu_picchu_1,
                    Res.drawable.machu_picchu_2,
                    Res.drawable.machu_picchu_3,
                ),
                location = Location(
                    lat = -13.1630,
                    long = -72.5451
                )
            ),
            TouristPlace(
                name = "Rainbow mountain",
                shortDescription = "Rainbow mountain is a famous mountain in Peru, known for its stunning natural beauty and unique geological formations.",
                longDescription = "Rainbow Mountain, known locally as Vinicunca, is a stunning geological formation located in the Vilcanota mountain range of the Peruvian Andes, approximately 100 kilometers southeast of Cusco. This natural wonder has gained international fame for its vibrant, multi-colored slopes that resemble a rainbow, showcasing an array of hues including turquoise, lavender, gold, and fuchsia. The mountain stands at an impressive altitude of 5,200 meters (17,060 feet) above sea level, making it one of the highest accessible peaks in the region.",
                images = listOf(
                    Res.drawable.colorful_mountain_1,
                    Res.drawable.colorful_mountain_2,
                    Res.drawable.colorful_mountain_3,
                ),
                location = Location(
                    lat = -13.8702,
                    long = -71.3029
                )
            ),
            TouristPlace(
                name = "Green Coast Lima",
                shortDescription = "Green Coast Lima is a picturesque coastal town in Peru, known for its stunning natural beauty and vibrant culture.",
                longDescription = "Green Coast Lima, also known as Puerto Lima, is a picturesque coastal town located in the southern region of Peru, near the Pacific Ocean. It is known for its stunning natural beauty, vibrant culture, and rich history. The town is situated on a limestone coastline, surrounded by lush greenery and crystal-clear waters. Visitors can explore the town's historic center, which features a mix of colonial architecture and modern buildings, as well as its many parks and gardens. The town's vibrant cultural scene is evident in its bustling markets, traditional dance performances, and lively festivals, including the annual Carnival celebration, which takes place in February. Green Coast Lima is also a popular destination for adventure seekers, offering opportunities for hiking, zip-lining, and other outdoor activities.",
                images = listOf(
                    Res.drawable.lima_1,
                    Res.drawable.lima_2,
                    Res.drawable.lima_3,
                ),
                location = Location(
                    lat = -12.1239,
                    long = -77.0103
                )
            ),
        )
    ),
    Country(
        name = "United States", flagIcon = Res.drawable.united_states, touristPlaces = listOf(
            TouristPlace(
                name = "Lake George",
                shortDescription = "Lake George is a long, narrow oligotrophic lake located in the northeastern portion of the U.S. state of New York.",
                longDescription = "Lake George, nicknamed the Queen of American Lakes is a long, narrow oligotrophic lake located at the southeast base of the Adirondack Mountains, in the northeastern portion of the U.S. state of New York. In the fall, Lake George offers a serene escape with activities like scenic boat cruises on the lake and leisurely hikes through vibrant autumn foliage in the peaceful beauty of the Adirondacks.",
                images = listOf(
                    Res.drawable.us_ny_lake_george_water,
                    Res.drawable.us_ny_lake_george_expedition_park,
                    Res.drawable.us_ny_lake_george_bolton_landing,
                    Res.drawable.us_ny_lake_george_festive,
                ),
                location = Location(
                    lat = 43.5681,
                    long = -73.5466
                )
            ),
            TouristPlace(
                name = "Vesuvio Cafe",
                shortDescription = "Vesuvio Cafe is a historic bar in San Francisco, California, United States.",
                longDescription = "Vesuvio Cafe is as rich in history as it is in eclectic decor. The bar was founded in 1948 by Henri Lenoir, and was frequented by a number of Beat Generation celebrities including Jack Kerouac, Allen Ginsberg, Lawrence Ferlinghetti, and Neal Cassady. t's right next to City Lights Bookstore, and they often had Beat poets read there back in the day. The wall has many fun pictures. The drinks are reasonable.",
                images = listOf(
                    Res.drawable.us_san_vesuvio_cafe_bar,
                    Res.drawable.us_san_vesuvio_cafe,
                ),
                location = Location(
                    lat = 37.7977,
                    long = -122.4064
                )
            ),
            TouristPlace(
                name = "Lincoln Memorial",
                shortDescription = "The Lincoln Memorial is a U.S. national memorial that honors the 16th president of the United States, Abraham Lincoln.",
                longDescription = "The Lincoln Memorial is a marble monument honoring President Abraham Lincoln. It rests across the reflecting pool at the National Monument. Up the steps of the Lincoln Memorial, you’ll find 36 towering marble columns representing the states within the U.S. during Lincoln’s presidency. The 19-foot-tall statue of Lincoln is surrounded by engraved quotes. This includes the entirety of his famous Gettysburg Address speech. Same as other monuments on the National Mall, this one is open 24/7. Visit the Lincoln Memorial in the evening to see spotlights illuminate the monument.",
                images = listOf(
                    Res.drawable.us_wdc_lincoln_memorial,
                    Res.drawable.us_wdc_lincoln_memorial_entrance,
                    Res.drawable.us_wdc_lincoln_memorial_interior,
                ),
                location = Location(
                    lat = 38.8892,
                    long = -77.0506
                )
            )
        )
    )
)
