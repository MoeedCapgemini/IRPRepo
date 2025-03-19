package com.example.irpproject.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import com.example.irpproject.data.model.NewsArticle
import com.example.irpproject.ui.theme.IRPProjectTheme


@Composable
fun NewsDetailPage(newsArticle: NewsArticle, onBackPressed: () -> Unit) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .padding(PaddingValues(16.dp))
            .verticalScroll(scrollState)
    ) {

        // Article Title
        Text(
            text = newsArticle.title,
            style = MaterialTheme.typography.headlineLarge.copy(
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Author and Date
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = newsArticle.author,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = newsArticle.publishedDate,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 16.sp,
                    color = Color.Gray
                )
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Image


        Image(
            painter = rememberAsyncImagePainter(
                model = "https://www.europeanscientist.com/wp-content/uploads/2022/04/46385A43-4ABE-46E7-8556-37B944126F7F.jpeg",
                onState = { state ->
                    if (state is AsyncImagePainter.State.Loading) {

                    }
                    if (state is AsyncImagePainter.State.Error) {

                    }
                }
            ),
            contentDescription = "Article Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(8.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))
        // Article Content
        Text(
            text = newsArticle.content,
            style = MaterialTheme.typography.bodyLarge,
            lineHeight = 24.sp,
            modifier = Modifier.fillMaxWidth()
        )

    }


}

@Preview(showBackground = true)
@Composable
fun PreviewNewsDetailScreen() {
    IRPProjectTheme {
        val sampleArticle = NewsArticle(
            title = "Breaking News: Compose for Android",
            author = "John Doe",
            publishedDate = "March 17, 2025",
            content = "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps...",
            imageRes = "https://www.europeanscientist.com/wp-content/uploads/2022/04/46385A43-4ABE-46E7-8556-37B944126F7F.jpeg", // Example Image
        )
        NewsDetailPage(newsArticle = sampleArticle, {})
    }
}


