package lewis.libby.module4_example.screens

import androidx.compose.runtime.Composable
import lewis.libby.module4_example.components.SimpleText

@Composable
fun ActorDisplay(
    actorId: String,
) {
    SimpleText(text = "Actor $actorId")
}