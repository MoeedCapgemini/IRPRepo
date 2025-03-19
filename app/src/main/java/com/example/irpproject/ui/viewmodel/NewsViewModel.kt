package com.example.irpproject.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.irpproject.data.model.NewsArticle

class NewsViewModel : ViewModel() {
    fun getNewsArticle(): NewsArticle {
        return NewsArticle(
            title = "Breaking News: Compose for Android",
            author = "John Doe",
            publishedDate = "March 17, 2025",
            content = "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..." +
                    "Jetpack Compose is the modern toolkit for building native UIs in Android. In this article, we will explore how Compose makes it easier to build Android apps..."
            ,
            imageRes = "https://www.europeanscientist.com/wp-content/uploads/2022/04/46385A43-4ABE-46E7-8556-37B944126F7F.jpeg", // Example Image
        )
    }
}