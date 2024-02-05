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
    )
)