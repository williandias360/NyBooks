package br.com.willian.nybooks.data

import br.com.willian.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {
    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey:String = "gXIWsAPxHOvixuBNapsg8L9hFp9qjSqd",
        @Query("list") list:String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}