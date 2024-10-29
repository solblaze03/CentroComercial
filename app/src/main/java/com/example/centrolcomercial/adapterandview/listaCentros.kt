package com.example.centrolcomercial.adapterandview

import com.example.centrolcomercial.clases.*

class listaCentros {
    companion object {
        val centro = listOf<Centros>(
            Centros(
                nombre = "El Saler",
                ubicacion = "Professor López Piñero, 16",
                tiendas = "150 Tiendas",
                listOf(
                    Tiendas(
                        nombre = "Carrefour",
                        descripcion = "Somos especialistas en electrónica de consumo, informática, moda, deportes, electrodomésticos, juguetes, etc."
                    ),
                    Tiendas(
                        nombre = "Zara",
                        descripcion = "Tienda de moda que ofrece ropa, calzado y accesorios de las últimas tendencias."
                    ),
                    Tiendas(
                        nombre = "H&M",
                        descripcion = "Ofrecemos moda y calidad al mejor precio de manera sostenible."
                    ),
                    Tiendas(
                        nombre = "Springfield",
                        descripcion = "Moda casual para hombres y mujeres."
                    )
                ),
                imagen = "https://www.valenciablog.com/wp-content/uploads/2006/11/saler-centro-comercial-valencia.jpg"
            ),
            Centros(
                nombre = "Aqua Multiespacio",
                ubicacion = "Calle de Menorca, 19",
                tiendas = "120 Tiendas",
                listOf(
                    Tiendas(
                        nombre = "Primark",
                        descripcion = "Ropa y accesorios a precios muy económicos."
                    ),
                    Tiendas(
                        nombre = "Decathlon",
                        descripcion = "Todo tipo de material deportivo para diversas disciplinas."
                    ),
                    Tiendas(
                        nombre = "FNAC",
                        descripcion = "Libros, música, películas, electrónica y más."
                    ),
                    Tiendas(
                        nombre = "Kiko Milano",
                        descripcion = "Productos de belleza y maquillaje a precios asequibles."
                    )
                ),
                imagen = "https://estaticos-cdn.prensaiberica.es/clip/d2e16a3c-7ba6-4e2e-83b1-85e85c337ec2_source-aspect-ratio_default_0.jpg"
            ),
            Centros(
                nombre = "Nuevo Centro",
                ubicacion = "Avenida Pío XII, 2",
                tiendas = "200 Tiendas",
                listOf(
                    Tiendas(
                        nombre = "Corte Inglés",
                        descripcion = "Gran almacén con una amplia oferta en moda, hogar, electrónica y más."
                    ),
                    Tiendas(
                        nombre = "Springfield",
                        descripcion = "Moda casual para hombres y mujeres."
                    ),
                    Tiendas(
                        nombre = "Burger King",
                        descripcion = "Restaurante de comida rápida con hamburguesas, patatas y más."
                    ),
                    Tiendas(
                        nombre = "Nike Store",
                        descripcion = "Tienda especializada en productos deportivos de la marca Nike."
                    )
                ),
                imagen = "https://th.bing.com/th/id/R.a7fad4478feffe294708a5046f38c648?rik=uXlVM7iLehhH2w&pid=ImgRaw&r=0"
            ),
            Centros(
                nombre = "Bonaire",
                ubicacion = "Autovía A3, Salida 345",
                tiendas = "200 Tiendas",
                listOf(
                    Tiendas(
                        nombre = "Leroy Merlin",
                        descripcion = "Todo lo que necesitas para bricolaje, construcción, decoración y jardinería."
                    ),
                    Tiendas(
                        nombre = "Pull & Bear",
                        descripcion = "Moda joven y urbana."),
                    Tiendas(
                        nombre = "Apple Store",
                        descripcion = "Tienda oficial de productos Apple."
                    ),
                    Tiendas(
                        nombre = "Game",
                        descripcion = "Especialistas en videojuegos y consolas."
                    ),
                    Tiendas(
                        nombre = "Druni",
                        descripcion = "Tienda que vende cosmetica"

                    )
                ),
                imagen = "https://breeam.es/wp-content/uploads/2020/02/ES_BONAIRE__ARMANDO_ROMERO_OTHERS_6-scaled-1.jpg"
            )
        )
    }
}