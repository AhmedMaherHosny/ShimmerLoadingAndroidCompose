package com.example.shimmerloadingcompose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.shimmerloadingcompose.models.Product
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

class MainViewModel : ViewModel() {
    var listOfProducts by mutableStateOf(listOf<Product>())
    var isLoading by mutableStateOf(false)

    init {
        viewModelScope.launch {
            isLoading = true
            delay(TimeUnit.SECONDS.toMillis(5))
            isLoading = false
            listOfProducts = listOf(
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
                Product(
                    id = 1,
                    title = "Cigar",
                    desc = "Indulge in the rich and robust flavors of our premium cigars, a testament to craftsmanship and tradition.",
                    imageName = "cigar"
                ),
            )
        }
    }
}