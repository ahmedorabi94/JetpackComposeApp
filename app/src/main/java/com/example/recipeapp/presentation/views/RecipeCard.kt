package com.example.recipeapp.presentation.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.recipeapp.domain.model.Recipe
import com.example.recipeapp.util.DEFAULT_RECIPE_IMAGE
import com.example.recipeapp.util.loadPicture


@Composable
fun RecipeCard(recipe: Recipe, onclick: () -> Unit) {

    Card(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .padding(bottom = 6.dp, top = 6.dp)
            .clickable(onClick = onclick)
            .fillMaxWidth(),
        elevation = 8.dp

    ) {

        Column() {


            val image =
                loadPicture(url = recipe.featuredImage, defaImage = DEFAULT_RECIPE_IMAGE).value

            image?.let { img ->
                Image(
                    bitmap = img.asImageBitmap(),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(225.dp),
                    contentScale = ContentScale.Crop
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, bottom = 12.dp, start = 8.dp, end = 8.dp)
            ) {
                Text(
                    text = recipe.title, modifier = Modifier
                        .fillMaxWidth(0.85f)
                        .wrapContentWidth(Alignment.Start),
                    style = MaterialTheme.typography.h5
                )

                Text(
                    text = recipe.rating.toString(),
                    modifier = Modifier
                        .fillMaxWidth(0.85f)
                        .wrapContentWidth(Alignment.End)
                        .align(Alignment.CenterVertically),
                    style = MaterialTheme.typography.h6
                )


            }


        }

    }

}


@Preview
@Composable
fun ComposablePreview() {
    // RecipeCard()
}