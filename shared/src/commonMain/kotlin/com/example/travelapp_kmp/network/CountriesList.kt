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
            ),
            TouristPlace(
                name = "Citadel of Saladin",
                shortDescription = "The Citadel of Cairo or Citadel of Saladin (Qalaʿat Salāḥ ad-Dīn) is an Islamic-era fortification in Cairo, Egypt, built by Salah ad-Din and further developed by subsequent Egyptian rulers. It was the seat of government in Egypt and the residence of its rulers for nearly 700 years from the 13th century until the construction of Abdeen Palace in the 19th century.",
                longDescription = "The Citadel was built on a promontory beneath the Muqattam Hills, a setting that made it difficult to attack. The efficacy of the Citadel's location is further demonstrated by the fact that it remained the heart of Egyptian government until the 19th century. During this long period, the layout and structure of the Citadel was repeatedly altered and adapted to suit the designs of new rulers and new regimes, which makes it difficult to reconstitute its original plan or even its plan in subsequent periods. There have been three major construction periods leading to the Citadel's current form: 12th-century Ayyubid (starting with Saladin), 14th-century Mamluk (under al-Nasir Muhammad), and in the 19th century under Muhammad Ali. The Citadel stopped being the seat of government when Egypt's ruler, Khedive Ismail, moved to his newly built Abdin Palace in the new downtown Cairo in 1874. Despite its elaborate defenses, the Citadel never ended up being subjected to a true siege, though it was implicated on various occasions in the political conflicts within Cairo or Egypt.",
                images = listOf(
                    Res.drawable.ca_salah,
                    Res.drawable.ca_salah_1,
                    Res.drawable.ca_salah_2,
                    Res.drawable.ca_salah_3,
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
        name = "India",
        touristPlaces = listOf(
            TouristPlace(
                name = "Taj Mahal",
                shortDescription = "The Taj Mahal, an ivory-white marble monument in Agra, India, embodies eternal love. Built by Mughal emperor Shah Jahan in memory of his third wife Mumtaz Mahal, it's a UNESCO World Heritage Site and one of the New Seven Wonders of the World. Its symmetrical design, intricate carvings, and lush gardens mesmerize visitors. From its white brilliance at dawn to its golden glow at sunset, the Taj Mahal reflects beauty, grief, and architectural excellence.",
                longDescription = "Rising majestically on the banks of the Yamuna river, the Taj Mahal is a timeless ode to love. Mughal emperor Shah Jahan, heartbroken by the loss of his beloved wife Mumtaz Mahal in 1631, commissioned this architectural marvel as her final resting place. Construction began in 1632, employing over 20,000 artisans for over 20 years.\n" +
                        "\n" +
                        "The Taj Mahal's beauty lies in its perfect symmetry and intricate details. White marble, sourced from Rajasthan, gleams under the sun, inlaid with semi-precious stones like lapis lazuli and carnelian forming captivating floral patterns. Calligraphic inscriptions from the Quran adorn the arches and doorways, adding a spiritual dimension. Four minarets gracefully flank the main mausoleum, reflecting in the reflecting pool below, creating a breathtaking mirror image.\n" +
                        "\n" +
                        "Inside, the cenotaphs of Mumtaz Mahal and Shah Jahan, encased in intricately carved marble screens, lie amidst floral designs and precious stones. The octagonal chamber resonates with a serene atmosphere, a testament to the love story etched in its every detail.\n" +
                        "\n" +
                        "Beyond the mausoleum, lush gardens adorned with fountains and pools extend along the Yamuna, symbolizing the path to paradise. The entire complex, including the mosque and guest house, stands as a magnificent example of Mughal architecture, blending Persian, Indian, and Islamic influences.\n" +
                        "\n" +
                        "The Taj Mahal transcends its role as a mausoleum. It's a symbol of love, loss, and artistic brilliance, captivating hearts and imaginations for centuries. Its ever-changing hues throughout the day, from soft pink at dawn to ethereal white in the afternoon, and golden yellow under the moonlight, add to its magic.\n" +
                        "\n" +
                        "Visiting the Taj Mahal is an unforgettable experience, a journey through history, love, and architectural wonder. It's a reminder that even in the face of grief, beauty can endure, leaving an eternal mark on the world.\n" +
                        "\n",
                images = listOf(
                    Res.drawable.india_taj_mahal_1,
                    Res.drawable.india_taj_mahal_2,
                    Res.drawable.india_taj_mahal_3,
                    Res.drawable.india_taj_mahal_4,
                    Res.drawable.india_taj_mahal_5
                )
            ),
            TouristPlace(
                name = "Varanasi",
                shortDescription = "Varanasi, also known as Kashi, is an ancient city in India located on the banks of the holy Ganges River. It's considered the spiritual capital of India and one of the seven sacred cities in Hinduism. Renowned for its vibrant culture, rich history, and spiritual significance, Varanasi attracts millions of pilgrims and tourists every year. The city pulsates with life along the numerous ghats (bathing steps) where pilgrims perform rituals and devotees offer prayers. Witnessing the sunrise over the Ganges and the evening aarti ceremony is a mesmerizing experience. From bustling bazaars to serene temples, Varanasi offers a unique blend of spirituality, tradition, and modernity.",
                longDescription = "Varanasi, steeped in history and mythology, is believed to be one of the oldest continuously inhabited cities in the world. Dating back to the 11th century BC, it has witnessed the rise and fall of empires, the evolution of cultures, and the enduring spirit of Hinduism. Fondly called Kashi, the city embodies the essence of India's spiritual heritage.\n" +
                        "\n" +
                        "The Ganges River, considered sacred by Hindus, forms the very lifeblood of Varanasi. The numerous ghats along its banks come alive with pilgrims performing pujas (worship rituals), taking dips in the holy water, and offering diyas (earthen lamps) in the evening aarti ceremony, creating a mesmerizing spectacle. The air resonates with chants, prayers, and the rhythmic clanging of temple bells.\n" +
                        "\n" +
                        "Wandering through the narrow lanes and bustling bazaars of Varanasi is an immersive experience. The aroma of spices fills the air, and shops overflow with colorful silk sarees, handcrafted souvenirs, and mouthwatering street food. The Kashi Vishwanath Temple, dedicated to Lord Shiva, is one of the holiest Hindu shrines, attracting devotees from all walks of life.\n" +
                        "\n" +
                        "Beyond the religious significance, Varanasi is a vibrant center of art, music, and culture. Classical music performances, traditional dance forms like Kathak, and vibrant folk art showcase the city's rich cultural tapestry. From witnessing the sunrise over the Ganges to exploring the ancient temples and bustling markets, Varanasi offers a unique and unforgettable experience for every visitor.\n" +
                        "\n",
                images = listOf(
                    Res.drawable.india_varanasi_1,
                    Res.drawable.india_varanasi_2,
                    Res.drawable.india_varanasi_3,
                    Res.drawable.india_varanasi_4,
                    Res.drawable.india_varanasi_5,
                    Res.drawable.india_varanasi_6,
                    Res.drawable.india_varanasi_7,
                )
            ),
            TouristPlace(
                name = "Munnar",
                shortDescription = "Munnar, nestled amidst the rolling hills of the Western Ghats in Kerala, is a postcard-perfect hill station adorned with emerald tea plantations, cascading waterfalls, and breathtaking vistas. Renowned for its cool climate, scenic beauty, and rich biodiversity, it's an ideal escape for nature lovers and adventure seekers. Explore sprawling tea estates, trek through lush forests, boat on serene lakes, or witness the majestic Anamudi peak, South India's highest. From cascading Echo Point to the aromatic spice markets, Munnar offers a delightful blend of nature's charm and cultural heritage.",
                longDescription = "Embraced by the cool embrace of the Western Ghats, Munnar paints a canvas of breathtaking beauty in Kerala. This idyllic hill station, named after the confluence of three mountain streams (meaning \"three rivers\" in Malayalam), was once a favored summer retreat for the British Raj. Today, it attracts travelers seeking solace in nature's embrace.\n" +
                        "\n" +
                        "Carpeted with emerald tea plantations that stretch as far as the eye can see, Munnar exudes a refreshing aroma. Wander through these manicured estates, witness the tea plucking process, and indulge in a cup of locally brewed tea - a true sensory experience. Nature enthusiasts can trek through Shola forests teeming with diverse flora and fauna, spot Nilgiri tahr grazing on the slopes, or embark on an adventurous jeep safari.\n" +
                        "\n" +
                        "Waterfalls like Echo Point and Attukal cascade down verdant hills, creating mesmerizing spectacles. Serene lakes like Kundala invite boat rides amidst breathtaking scenery. For panoramic views, head to Anamudi Peak, South India's highest, or witness the sunrise paint the sky with vibrant hues at Top Station.\n" +
                        "\n" +
                        "Beyond its natural beauty, Munnar offers a glimpse into Kerala's rich heritage. Explore spice plantations overflowing with cardamom, pepper, and cinnamon, their pungent aromas filling the air. Visit the historic Mattupetty Dam, built by the British, or delve into the ancient traditions of local tribes.\n" +
                        "\n" +
                        "Whether you seek tranquility amidst rolling hills, adventure in the wilderness, or a cultural immersion, Munnar has something for everyone. Come, experience the magic of this enchanting hill station and create memories that will last a lifetime.\n" +
                        "\n",
                images = listOf(
                    Res.drawable.india_munnar_1,
                    Res.drawable.india_munnar_2,
                    Res.drawable.india_munnar_3,
                    Res.drawable.india_munnar_4,
                    Res.drawable.india_munnar_5,
                    Res.drawable.india_munnar_6,
                    Res.drawable.india_munnar_7,
                )
            ),
            TouristPlace(
                name = "Amber Palace",
                shortDescription = "Amber Palace, also known as Amer Fort, stands majestically atop a hill near Jaipur, showcasing a stunning blend of Rajput and Mughal architecture. Built in the 16th century, it served as the royal residence for centuries. Climb the fortified walls, adorned with intricate carvings, and explore opulent palaces, serene courtyards, and the breathtaking Sheesh Mahal (Mirror Palace). Witnessing the sunset over the Maota Lake paints an unforgettable picture.",
                longDescription = "Rising like a golden mirage against the Aravalli Hills, Amber Palace (Amer Fort) whispers tales of grandeur and bygone eras. This magnificent fort, just outside Jaipur, served as the seat of power for the Kachwaha Rajput rulers for centuries, dating back to the 16th century. Today, it stands as a UNESCO World Heritage Site, captivating visitors with its architectural splendor and rich history.\n" +
                        "\n" +
                        "As you ascend the fortified walls, intricately carved elephants guarding the majestic Suraj Pol (Sun Gate) welcome you. Inside, a labyrinth of courtyards, palaces, and gardens unfolds. Marvel at the Diwan-e-Aam (Hall of Public Audience), where the Maharaja held court, and the Diwan-e-Khas (Hall of Private Audience), adorned with precious stones and delicate mirrorwork.\n" +
                        "\n" +
                        "Climb the Painted Passage, its walls showcasing vibrant murals depicting battles and processions. Be awestruck by the Sheesh Mahal (Mirror Palace), where thousands of tiny mirrors create a mesmerizing kaleidoscope effect. Wander through the Sukh Mahal (Hall of Pleasure), with its cool and refreshing water channels, and imagine royal life unfold before you.\n" +
                        "\n" +
                        "Beyond the architectural marvels, the fort offers breathtaking views. Gaze upon the Maota Lake, shimmering below, and capture the unforgettable scene as the sun dips behind the Aravalli Hills, painting the sky in vibrant hues. Explore the hidden tunnels connecting Amber Palace to Jaigarh Fort, and delve deeper into the fort's fascinating history.\n" +
                        "\n" +
                        "Whether you're an architecture enthusiast, history buff, or simply seeking a glimpse into India's royal past, Amber Palace provides an unforgettable experience. It's a testament to the artistry and grandeur of a bygone era, where every step whispers stories of opulence, power, and the rich tapestry of Indian history.\n" +
                        "\n",
                images = listOf(
                    Res.drawable.india_amber_palace_1,
                    Res.drawable.india_amber_palace_2,
                    Res.drawable.india_amber_palace_3,
                    Res.drawable.india_amber_palace_4,
                )
            ),
            TouristPlace(
                name = "Dudhsagar Waterfalls",
                shortDescription = "Dudhsagar Waterfalls, cascading amidst the lush Western Ghats in Goa, is a majestic spectacle. India's highest waterfall plunges 310 meters, creating a breathtaking sight and refreshing mist. Hike through verdant forests, take a jeep safari, or witness the falls' grandeur from a train passing over a bridge offering stunning views. Dudhsagar is a haven for nature lovers and adventure seekers.",
                longDescription = "In the heart of the verdant Western Ghats, Goa, lies Dudhsagar Waterfalls, a cascading marvel that leaves visitors spellbound. Cascading down a staggering 310 meters, it earns the title of India's highest waterfall, creating a breathtaking spectacle that enthralls nature enthusiasts and adventure seekers alike.\n" +
                        "\n" +
                        "Reaching Dudhsagar is an adventure in itself. Hike through lush forests teeming with diverse flora and fauna, their vibrant colors contrasting with the gushing waters. For a thrilling experience, embark on a jeep safari, navigating through challenging terrain and offering glimpses of the hidden beauty of the region.\n" +
                        "\n" +
                        "As you arrive at the base of the falls, prepare to be mesmerized. The gushing water crashes down from a seemingly endless height, creating a powerful roar and sending refreshing mist into the air. Take a dip in the cool pool beneath the falls, feeling the invigorating power of nature. For a different perspective, board a train that passes over a bridge offering stunning views of the cascading wonder from above.\n" +
                        "\n" +
                        "Beyond its visual grandeur, Dudhsagar holds ecological significance. The surrounding forests are home to a rich variety of plant and animal life, including endangered species like the Malabar langur and the lion-tailed macaque. Spotting these creatures amidst the lush greenery adds another layer to the experience.\n" +
                        "\n" +
                        "Whether you're seeking a refreshing escape, an adrenaline-pumping adventure, or a connection with nature, Dudhsagar Waterfalls offers something for everyone. Its cascading beauty, diverse ecosystem, and accessible adventures make it a must-visit for travelers exploring the vibrant state of Goa.\n" +
                        "\n",
                images = listOf(
                    Res.drawable.india_dudhsagar_waterfalls_1,
                    Res.drawable.india_dudhsagar_waterfalls_2,
                    Res.drawable.india_dudhsagar_waterfalls_3,
                    Res.drawable.india_dudhsagar_waterfalls_4,
                    Res.drawable.india_dudhsagar_waterfalls_5,
                    Res.drawable.india_dudhsagar_waterfalls_6,
                    Res.drawable.india_dudhsagar_waterfalls_7,
                )
            ),
            TouristPlace(
                name = "Manali",
                shortDescription = "Manali, nestled amidst the majestic Himalayas, is a picturesque hill station in Himachal Pradesh. Renowned for its snow-capped peaks, verdant valleys, and adventure activities, it's a haven for nature lovers and thrill-seekers. Hike through apple orchards, soak in hot springs, or witness the panoramic views from Rohtang Pass. Manali's charm lies in its blend of natural beauty, Tibetan culture, and adventure opportunities.",
                longDescription = "Manali, cradled in the lap of the majestic Himalayas in Himachal Pradesh, paints a picture of breathtaking beauty and adventure. This picturesque hill station, perched at an altitude of 6,769 feet, has long been a magnet for travelers seeking solace in nature's embrace and adrenaline-pumping activities.\n" +
                        "\n" +
                        "Carpeted with lush valleys and snow-capped peaks, Manali offers a feast for the eyes. Hike through apple orchards bursting with vibrant hues, breathe in the crisp mountain air, and witness the majestic Himalayas paint the sky with a kaleidoscope of colors at sunrise or sunset.\n" +
                        "\n" +
                        "Adventure enthusiasts rejoice in Manali's playground. Embark on a thrilling trek to Rohtang Pass, offering panoramic views of the surrounding peaks. Go white-water rafting on the Beas River, feeling the rush of adrenaline as you navigate through rapids. Or, try your hand at paragliding, soaring above the valleys and experiencing the world from a bird's-eye view.\n" +
                        "\n" +
                        "Manali's cultural tapestry is woven with Tibetan influences. Explore the serene monasteries like the Gadhan Thekchok Kyong Gompa, where monks chant and prayer flags flutter in the wind. Immerse yourself in the vibrant Tibetan markets, overflowing with colorful handicrafts and souvenirs. Savor the local cuisine, with momos and Thukpa warming your soul on chilly evenings.\n" +
                        "\n" +
                        "Beyond its natural beauty and adventure, Manali offers a chance to unwind and reconnect with nature. Soak in the rejuvenating hot springs at Vashisht, believed to have medicinal properties. Take a leisurely stroll along the Beas River, listening to its soothing gurgling and feeling the sun's warmth on your skin.\n" +
                        "\n" +
                        "Whether you're seeking a breathtaking escape, an adrenaline-pumping adventure, or a cultural immersion, Manali has something for everyone. Come, experience the magic of this enchanting hill station and create memories that will last a lifetime.\n" +
                        "\n",
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
                )
            ),
            TouristPlace(
                name = "Darjeeling",
                shortDescription = "Darjeeling, perched amidst the Himalayas, is a charming hill station renowned for its breathtaking views, verdant tea plantations, and iconic toy train. Witnessing sunrise over Kanchenjunga peak, exploring bustling Chowrasta market, and riding the Darjeeling Himalayan Railway are unforgettable experiences. Darjeeling offers a unique blend of colonial charm, breathtaking beauty, and aromatic teas, making it a must-visit for any India adventure.",
                longDescription = "Nestled amidst the majestic Himalayas, Darjeeling, fondly called the \"Queen of Hills,\" captivates visitors with its breathtaking beauty, colonial charm, and aromatic tea estates. This hill station in West Bengal, perched at an altitude of 6,700 feet, offers a unique blend of experiences that linger long after your visit.\n" +
                        "\n" +
                        "Start your day by witnessing the magical sunrise over the snow-capped Kanchenjunga peak, the world's third highest mountain. The golden hues paint the sky, creating a spectacle that leaves you awestruck. Explore the sprawling tea plantations, their emerald slopes stretching as far as the eye can see. Breathe in the invigorating aroma of freshly brewed Darjeeling tea, savoring its delicate flavor at a local tea house.\n" +
                        "\n" +
                        "Step back in time as you wander through Chowrasta, the bustling heart of Darjeeling. This historic market overflows with colorful souvenirs, traditional Tibetan handicrafts, and local delicacies. Ride the iconic Darjeeling Himalayan Railway, a UNESCO World Heritage Site, experiencing the scenic beauty of the hills on this charming toy train.\n" +
                        "\n" +
                        "Beyond the tourist attractions, Darjeeling offers a glimpse into its rich history and culture. Visit the Himalayan Mountaineering Institute, commemorating the spirit of adventure, or delve deeper into Tibetan traditions at the Mahakal Temple and Ghoom Monastery. For an off-the-beaten-path experience, hike through the Senchal Wildlife Sanctuary, spotting diverse flora and fauna.\n" +
                        "\n" +
                        "Whether you're seeking breathtaking panoramas, a nostalgic journey through colonial history, or a connection with nature and local culture, Darjeeling has something for everyone. Come, experience the magic of this enchanting hill station and create memories that will warm your heart like a cup of Darjeeling tea.\n" +
                        "\n",
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
                )
            ),
            TouristPlace(
                name = "Dal Lake",
                shortDescription = "Dal Lake, also known as \"Srinagar's Jewel,\" is a mesmerizing expanse of freshwater nestled amidst the majestic Himalayas in Kashmir, India. Shikara boats glide across its tranquil waters, passing by floating gardens, houseboats, and vibrant markets. Witnessing the breathtaking sunrise over the lake and experiencing the serene beauty of its surrounding mountains is an unforgettable experience.",
                longDescription = "Dal Lake, a glittering jewel nestled amidst the snow-capped peaks of the Himalayas in Srinagar, Kashmir, India, enchants visitors with its serene beauty and vibrant culture. Revered as \"Srinagar's Jewel,\" this freshwater lake pulsates with life, offering a unique and unforgettable experience.\n" +
                        "\n" +
                        "Imagine gliding across the calm waters in a traditional Shikara boat, feeling the cool breeze caress your face as you navigate past floating gardens bursting with colorful flowers. The gentle lapping of water creates a tranquil symphony, contrasting with the lively chatter of vendors selling fresh produce and handcrafted souvenirs in floating markets.\n" +
                        "\n" +
                        "Dal Lake transforms into a magical canvas each dawn and dusk. Witness the first rays of sunlight cast a golden glow on the snow-capped peaks surrounding the lake, painting the sky in mesmerizing hues of orange and pink. As the sun dips below the horizon, the water reflects the vibrant colors of the setting sun, creating a breathtaking spectacle.\n" +
                        "\n" +
                        "Beyond its scenic beauty, Dal Lake offers a glimpse into the rich culture and traditions of Kashmir. Houseboats, intricately adorned with Kashmiri wood carvings, provide a unique and comfortable stay on the lake. Savor delicious local cuisine, featuring fresh fish and aromatic spices, served on the houseboats by warm and hospitable families.\n" +
                        "\n" +
                        "For a deeper cultural immersion, visit the Hazratbal Shrine, a revered Islamic pilgrim site located on the banks of the lake. Explore the bustling markets along the ghats, overflowing with colorful spices, hand-woven shawls, and traditional Kashmiri handicrafts.\n" +
                        "\n" +
                        "Whether you seek serenity on the Shikara, adventure on the surrounding mountains, or a cultural immersion in Kashmiri traditions, Dal Lake has something for everyone. Come, experience the magic of this enchanting lake and create memories that will last a lifetime.\n" +
                        "\n",
                images = listOf(
                    Res.drawable.india_dal_lake_1,
                    Res.drawable.india_dal_lake_2,
                    Res.drawable.india_dal_lake_3,
                    Res.drawable.india_dal_lake_4,
                    Res.drawable.india_dal_lake_5,
                    Res.drawable.india_dal_lake_6,
                    Res.drawable.india_dal_lake_7,
                    Res.drawable.india_dal_lake_8,
                )
            ),
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