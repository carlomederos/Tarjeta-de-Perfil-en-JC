package com.carlo_mederos.lazylayoutsdemo

data class UserProfile(
    val id: Int,
    val name: String,
    val bio: String,
    val interests: List<String>,
    val imageRes: Int = 0,
    val likes: Int = 0,
    val location: String = ""
)

val sampleUsers = listOf(
    UserProfile(
        1, "Pancho", "Desarrollador Android apasionado por Kotlin y Compose.",
        listOf("Android", "Kotlin", "Compose", "Firebase", "Diseño"),
        R.drawable.profile_01,
        likes = 128,
        location = "La Habana, Cuba"
    ),
    UserProfile(
        2, "Lucía Fernández", "Diseñadora UX/UI que transforma ideas en interfaces intuitivas.",
        listOf("Diseño", "Fotografía", "Viajes", "Arte", "Música"),
        R.drawable.profile_02,
        likes = 342,
        location = "Ciudad de México, México"
    ),
    UserProfile(
        3, "Andrés Gutiérrez", "Ingeniero de software backend. Fan del café y el código limpio.",
        listOf("Kotlin", "Java", "Arquitectura", "Café", "Gaming"),
        R.drawable.profile_03,
        likes = 87,
        location = "Bogotá, Colombia"
    ),
    UserProfile(
        4, "María José Rojas", "Data scientist. Encuentro patrones donde otros ven caos.",
        listOf("Datos", "Python", "Machine Learning", "Lectura", "Running"),
        R.drawable.profile_04,
        likes = 515,
        location = "Buenos Aires, Argentina"
    ),
    UserProfile(
        5, "Diego Herrera", "Fotógrafo profesional especializado en paisajes y naturaleza.",
        listOf("Fotografía", "Viajes", "Naturaleza", "Cine", "Música"),
        R.drawable.profile_05,
        likes = 76,
        location = "Bariloche, Argentina"
    ),
    UserProfile(
        6, "Valentina Ríos", "Estudiante de ingeniería en multimedia y creadora de contenido.",
        listOf("Diseño", "Video", "Streaming", "Gaming", "Música"),
        R.drawable.profile_06,
        likes = 229,
        location = "Lima, Perú"
    ),
    UserProfile(
        7, "Jorge Molina", "Entrenador personal. La disciplina vence al talento.",
        listOf("Deporte", "Gym", "Nutrición", "Running", "Salud"),
        R.drawable.profile_07,
        likes = 194,
        location = "Santiago, Chile"
    ),
    UserProfile(
        8, "Camila Torres", "Chef pastelera. Endulzo vidas desde mi cocina.",
        listOf("Cocina", "Repostería", "Viajes", "Fotografía", "Música"),
        R.drawable.profile_08,
        likes = 61,
        location = "Medellín, Colombia"
    ),
    UserProfile(
        9, "Sebastián Vidal", "Músico y productor. Vivo entre acordes y secuencias.",
        listOf("Música", "Producción", "Piano", "Conciertos", "Cine"),
        R.drawable.profile_09,
        likes = 383,
        location = "Madrid, España"
    ),
    UserProfile(
        10, "Isabela Márquez", "Periodista cultural. Cuento historias que merecen ser escuchadas.",
        listOf("Escritura", "Lectura", "Cine", "Teatro", "Viajes"),
        R.drawable.profile_10,
        likes = 45,
        location = "Guadalajara, México"
    ),
    UserProfile(
        11, "Tomás Aguirre", "DevOps engineer. Automatizo todo, hasta mi café de la mañana.",
        listOf("DevOps", "Docker", "Cloud", "Linux", "Gaming"),
        R.drawable.profile_11,
        likes = 167,
        location = "Montevideo, Uruguay"
    ),
    UserProfile(
        12, "Renata Blanco", "Arquitecta. Creo espacios donde la luz cuenta la historia.",
        listOf("Arquitectura", "Diseño", "Arte", "Fotografía", "Viajes"),
        R.drawable.profile_12,
        likes = 238,
        location = "Barcelona, España"
    ),
    UserProfile(
        13, "Emilio Castaño", "Piloto de drones y amante de las vistas aéreas.",
        listOf("Drones", "Fotografía", "Tecnología", "Viajes", "Naturaleza"),
        R.drawable.profile_13,
        likes = 92,
        location = "Quito, Ecuador"
    ),
    UserProfile(
        14, "Daniela Cifuentes", "Fisioterapeuta. Ayudo a las personas a moverse sin dolor.",
        listOf("Salud", "Deporte", "Yoga", "Nutrición", "Lectura"),
        R.drawable.profile_14,
        likes = 154,
        location = "San José, Costa Rica"
    ),
    UserProfile(
        15, "Nicolás Pardo", "Game developer. Construyo mundos un píxel a la vez.",
        listOf("Gaming", "Unity", "Diseño", "Pixel Art", "Streaming"),
        R.drawable.profile_15,
        likes = 311,
        location = "Valparaíso, Chile"
    ),
    UserProfile(
        16, "Paula Andrade", "Profesora de yoga y meditación. Respira, el resto llega solo.",
        listOf("Yoga", "Meditación", "Salud", "Naturaleza", "Música"),
        R.drawable.profile_16,
        likes = 108,
        location = "Panamá, Panamá"
    ),
    UserProfile(
        17, "Iván Salazar", "Cinéfilo y crítico de cine. Las 35mm tienen alma.",
        listOf("Cine", "Crítica", "Escritura", "Fotografía", "Café"),
        R.drawable.profile_17,
        likes = 276,
        location = "Sevilla, España"
    ),
    UserProfile(
        18, "Elena Villalba", "Veterinaria. Mi corazón tiene patas y pelaje.",
        listOf("Animales", "Naturaleza", "Voluntariado", "Lectura", "Viajes"),
        R.drawable.profile_18,
        likes = 69,
        location = "Córdoba, Argentina"
    ),
    UserProfile(
        19, "Mateo Bermúdez", "Astrónomo aficionado. Siempre con la mirada en el cielo.",
        listOf("Astronomía", "Ciencia", "Fotografía", "Tecnología", "Lectura"),
        R.drawable.profile_19,
        likes = 142,
        location = "San Pedro de Atacama, Chile"
    ),
    UserProfile(
        20, "Sofía Noguera", "Emprendedora social. El mejor código es el que cambia vidas.",
        listOf("Emprendimiento", "Tecnología", "Voluntariado", "Diseño", "Escritura"),
        R.drawable.profile_20,
        likes = 205,
        location = "Asunción, Paraguay"
    )
)
