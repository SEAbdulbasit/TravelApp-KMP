package com.example.travelapp_kmp.network

import com.example.travelapp_kmp.listing.Country
import com.example.travelapp_kmp.listing.TouristPlace
import org.jetbrains.compose.resources.ExperimentalResourceApi
import travelappkmp.shared.generated.resources.Res


/**
 * Created by abdulbasit on 30/05/2023.
 */

@OptIn(ExperimentalResourceApi::class)
fun getRestCountriesList() = listOf(
    Country(
        name = "Egypt",
        flagIcon = Res.drawable.eg,
        touristPlaces = listOf(
            TouristPlace(
                name = "Al-Azhar Masjid",
                shortDescription = "Al-Azhar Masjid is one of the most important historical strongholds for spreading and teaching Islam in Egypt and the Islamic world. It was built in 378 AH / 970 AD, And is located in Cairo, Egypt.",
                longDescription = "Al-Azhar Masjid is the most important Masjid in Egypt at all, and one of the historical strongholds for the spread and teaching of Islam. It is also one of the most famous archaeological Masjid in Egypt and the Islamic world, and part of the Al-Azhar Al-Sharif Foundation. Its construction dates back to Jumada al-Awwal 359 AH/970 AD. The Masjid is considered the second oldest continuously operating university in the world after the University of Al-Qarawiyyin. Although the Amr ibn al-Aas Masjid in Fustat preceded it in its teaching role, as lesson sessions were held there voluntarily and as a donation, the Al-Azhar Masjid was considered the first in Egypt to perform the role of regular schools and institutes. Its lessons were given by commission from the state and scholars and teachers were hired for them. During the French occupation of Egypt, a revolution began against the French forces from Al-Azhar on October 21, 1798. The Egyptian people, armed only with stones and spears, carried out heroic acts against Napoleon’s army, until the French general Jean-Baptiste Kleber was killed by Suleiman Al-Halabi, of Algerian origin, in March 1800. Student at Al-Azhar. Many scholars graduated from Al-Azhar who had a profound impact on spreading the teachings of Islam, such as the great scholar Muhammad Al-Ghazali.",
                images = listOf(
                    Res.drawable.al_azhar_masjid,
                    Res.drawable.al_azhar_masjid_2,
                )
            ),
            TouristPlace(
                name = "Egyptian pyramids",
                shortDescription = "The Giza pyramid complex in Egypt is home to the Great Pyramid, the Pyramid of Khafre, and the Pyramid of Menkaure, along with their associated pyramid complexes and the Great Sphinx. All were built during the Fourth Dynasty of the Old Kingdom of ancient Egypt, between c. 2600 – c. 2500 BC. And There are some studies now that prove that it was built c. 10000 BC",
                longDescription = "The Egyptian pyramids are ancient masonry structures located in Egypt. Sources cite at least 118 identified \"Egyptian\" pyramids. Approximately 80 pyramids were built within the Kingdom of Kush, now located in the modern country of Sudan. Of those located in modern Egypt. The earliest known Egyptian pyramids are found at Saqqara, northwest of Memphis, although at least one step-pyramid-like structure has been found at Saqqara, dating to the First Dynasty: which has been attributed to the reign of Pharaoh Anedjib, with inscriptions, and other archaeological remains of the period, suggesting there may have been others. The otherwise earliest among these is the Pyramid of Djoser built during the Third Dynasty. This pyramid and its surrounding complex are generally considered to be the world's oldest monumental structures constructed of dressed masonry. The most famous Egyptian pyramids are those found at Giza, on the outskirts of Cairo. Several of the Giza pyramids are counted among the largest structures ever built. The Pyramid of Khufu is the largest Egyptian pyramid and the last of the Seven Wonders of the Ancient World still in existence.",
                images = listOf(
                    Res.drawable.py,
                    Res.drawable.py_2,
                    Res.drawable.py_3,
                    Res.drawable.py_4,
                )
            )
        )
    ),
    Country(
        name = "Japan",
        flagIcon = Res.drawable.jp,
        touristPlaces = listOf(
            TouristPlace(
                name = "Tokyo Skytree",
                shortDescription = "The Tokyo Skytree is a towering communications and observation tower located in Tokyo, Japan. At 634 meters tall, it is the tallest structure in Japan and offers breathtaking views of the city from its observation deck.",
                longDescription = "The Tokyo Skytree is a stunning architectural landmark located in the Sumida ward of Tokyo, Japan. Standing at 634 meters tall, it is the tallest structure in Japan and one of the tallest towers in the world. The tower was built as a communications tower, but it also features a large observation deck that offers breathtaking views of the city and beyond. Visitors to the Tokyo Skytree can take an elevator to the observation deck, which is located at a height of 450 meters. From here, they can enjoy 360-degree views of the city, including iconic landmarks such as Tokyo Tower and the Tokyo Metropolitan Government Building. On clear days, it is even possible to see as far as Mount Fuji, located over 100 kilometers away. In addition to the observation deck, the Tokyo Skytree also features a number of shops and restaurants, as well as a historical exhibit about the history and culture of the area. The tower is also a popular destination for night time views, as the city lights up below. Overall, the Tokyo Skytree is a must-visit destination for anyone traveling to Tokyo. Whether you're an architecture or history buff, or just looking for a stunning view, the tower is sure to impress.",
                images = listOf(
                    Res.drawable.tokyo_skytree_1,
                    Res.drawable.tokyo_skytree_2,
                    Res.drawable.tokyo_skytree_3,
                    Res.drawable.tokyo_skytree_4,
                )
            ),
            TouristPlace(
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
                )
            ),
            TouristPlace(
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
                )
            )
        )
    ),
    Country(
        name = "France",
        flagIcon = Res.drawable.fr,
        touristPlaces = listOf(
            TouristPlace(
                name = "Eiffel Tower",
                shortDescription = "The Eiffel Tower is a landmark iron lattice tower located in Paris, France. Standing at 324 meters tall, it is the tallest structure in Paris and one of the most recognizable symbols of France.",
                longDescription = "The Eiffel Tower is an iconic symbol of France and one of the most recognizable landmarks in the world. Located in Paris, the tower stands at 324 meters tall and was built as the centerpiece of the 1889 Exposition Universelle, a world's fair held in Paris to commemorate the 100th anniversary of the French Revolution. Designed by Gustave Eiffel, the tower is constructed of iron lattice work and was the tallest structure in the world when it was completed. Today, the Eiffel Tower is one of the most popular tourist destinations in Paris, attracting millions of visitors each year. Visitors can take the stairs or an elevator to the top of the tower, where they can enjoy stunning views of Paris and its landmarks, including the Seine River, Notre-Dame Cathedral, and the Louvre Museum. The tower is also a popular spot for picnics and romantic evenings, as the city lights up below. In addition to its stunning views, the Eiffel Tower is also an important cultural and historical landmark, representing the technological achievements of the late 19th century and serving as a symbol of France and Paris for over a century. Overall, the Eiffel Tower is a must-visit destination for anyone traveling to Paris, offering a unique combination of natural beauty, cultural significance, and breathtaking views of the city.",
                images = listOf(
                    Res.drawable.eiffel_tower_2,
                    Res.drawable.eiffel_tower_3,
                    Res.drawable.eiffel_tower_4
                )
            ),
            TouristPlace(
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
                )
            )
        )
    ),
    Country(
        name = "Bangladesh",
        flagIcon = Res.drawable.bd,
        touristPlaces = listOf(
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
                )
            ),
            TouristPlace(
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
                )
            ),
            TouristPlace(
                name = "Rangamati",
                shortDescription = "Rangamati is the administrative headquarter and town of Rangamati Hill District in the Chittagong Hill Tracts of Bangladesh. The town is located at 22°37'60N 92°12'0E and has an altitude of 14 metres. It is also where Ropuiliani, a Mizo chieftess, was jailed and died, during the British rule in Mizoram.",
                longDescription = "Rangamati (Bengali: রাঙ্গামাটি;) is the administrative headquarter and town of Rangamati Hill District in the Chittagong Hill Tracts of Bangladesh. The town is located at 22°37'60N 92°12'0E and has an altitude of 14 metres (46 ft). It is also where Ropuiliani, a Mizo chieftess, was jailed and died, during the British rule in Mizoram.\nFrom Chittagong a 77 kilometres (48 mi) road leads to Rangamati. The township is located on the western bank of the Kaptai lake. Rangamati is a holiday destination because of its landscape, scenery, lake, indigenous groups (Chakma, Marma, Mizo, Tripuri, Tanchangya, etc.), flora and fauna, indigenous museum and hanging bridge.",
                images = listOf(
                    Res.drawable.bangladesh_rangamati_1,
                    Res.drawable.bangladesh_rangamati_2,
                    Res.drawable.bangladesh_rangamati_3,
                    Res.drawable.bangladesh_rangamati_4
                )
            ),
            TouristPlace(
                name = "Bandarban",
                shortDescription = "It is one of the three hill districts of Bangladesh and a part of the Chittagong Hill Tracts, the others being Rangamati District and Khagrachhari District.",
                longDescription = "Bandarban (Bengali: বান্দরবান, Chakma: \uD804\uDD1D\uD804\uDD1A\uD804\uDD34\uD804\uDD18\uD804\uDD27\uD804\uDD22\uD804\uDD34\uD804\uDD1D\uD804\uDD1A\uD804\uDD34) is a district in South-Eastern Bangladesh, and a part of the Chittagong Division. It is one of the three hill districts of Bangladesh and a part of the Chittagong Hill Tracts, the others being Rangamati District and Khagrachhari District. Bandarban district (4,479 km2) is not only the most remote district of the country, but also the least populous (population 388,000). There is an army contingent at Bandarban Cantonment.",
                images = listOf(
                    Res.drawable.bangladesh_bandarban_1,
                    Res.drawable.bangladesh_bandarban_2,
                    Res.drawable.bangladesh_bandarban_3,
                    Res.drawable.bangladesh_bandarban_4
                )
            )
        )
    ),
    Country(
        name = "Pakistan",
        flagIcon = Res.drawable.pk,
        touristPlaces = listOf(
            TouristPlace(
                name = "Badshahi Mosque, Lahore",
                shortDescription = "An iconic symbol of Mughal architecture in Lahore, Pakistan.",
                longDescription = "The Badshahi Mosque, commissioned by Emperor Aurangzeb in 1671, is a marvel of Mughal architecture. With its grand red sandstone and white marble structure, adorned with intricate calligraphy and stunning geometric patterns, it stands as a testament to the opulence of the Mughal era. The mosque's expansive courtyard and regal aura make it a cultural and historical gem, offering panoramic views of Lahore. Visitors are transported to a bygone era, marveling at the artistry and spirituality that permeate this magnificent structure.",
                images = listOf(
                    Res.drawable.pakistan_badshahi_mosque_1,
                    Res.drawable.pakistan_badshahi_mosque_2,
                    Res.drawable.pakistan_badshahi_mosque_3
                )
            ),

            TouristPlace(
                name = "Shangrila Resort, Skardu",
                shortDescription = "A paradise nestled in the mesmerizing landscapes of Skardu, Pakistan.",
                longDescription = "Shangrila Resort, also known as Lower Kachura Lake, is a breathtaking escape surrounded by the Karakoram Range in Skardu. Offering panoramic views of snow-capped peaks, the resort features enchanting gardens and a serene lake. The unique boat-shaped restaurant adds to the charm, allowing visitors to dine with a view. Shangrila Resort is a haven for outdoor enthusiasts, providing opportunities for boating, fishing, and trekking in the nearby valleys. Guests can immerse themselves in nature's beauty and find tranquility in the heart of Skardu.",
                images = listOf(
                    Res.drawable.pakistan_shangrila_resort_1,
                    Res.drawable.pakistan_shangrila_resort_2
                )
            ),

            TouristPlace(
                name = "Hunza Valley",
                shortDescription = "A mesmerizing valley in the Gilgit-Baltistan region, offering breathtaking vistas.",
                longDescription = "Hunza Valley, nestled in the heart of the Karakoram Range, is a paradise for nature lovers and adventure seekers. Surrounded by majestic mountains, including Rakaposhi and Ultar Sar, the valley boasts stunning landscapes, vibrant meadows, and serene rivers. The ancient Baltit Fort and Altit Fort add a touch of history to this picturesque region. Visitors can engage in trekking, explore traditional villages, and experience the warm hospitality of the locals. Hunza Valley is a gateway to unparalleled beauty and cultural richness in the Gilgit-Baltistan region of Pakistan.",
                images = listOf(
                    Res.drawable.pakistan_hunza_valley_1,
                    Res.drawable.pakistan_hunza_valley_2,
                )
            )
        )

    )
)