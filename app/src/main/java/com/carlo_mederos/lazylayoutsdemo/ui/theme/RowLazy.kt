package com.carlo_mederos.lazylayoutsdemo.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InterestsLazyRow(
    interests: List<String>,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
) {
    LazyRow(
        modifier = modifier,
        contentPadding = contentPadding,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(interests) { interest ->
            AssistChip(
                onClick = { },
                label = { Text(interest) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InterestsLazyRowPreview() {
    InterestsLazyRow(
        interests = listOf("Android", "Kotlin", "Compose", "Diseño", "Cine", "Deporte", "Música", "Viajes")
    )
}
