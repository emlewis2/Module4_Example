package lewis.libby.module4_example.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import lewis.libby.module4_example.R
import lewis.libby.module4_example.Screen
import lewis.libby.module4_example.components.MovieScaffold
import lewis.libby.module4_example.components.SimpleText
import lewis.libby.module4_example.repository.RatingDto

@Composable
fun RatingList(
    ratings: List<RatingDto>,
    onSelectListScreen: (Screen) -> Unit,
    onResetDatabase: () -> Unit,
    onRatingClick: (String) -> Unit,
) = MovieScaffold(
    title = stringResource(id = R.string.screen_title_movies),
    onSelectListScreen = onSelectListScreen,
    onResetDatabase = onResetDatabase,
) { paddingValues ->
    Column(modifier = Modifier.padding(paddingValues)) {
        ratings.forEach {
            SimpleText(text = it.name) {
                onRatingClick(it.id)
            }
        }
    }
}