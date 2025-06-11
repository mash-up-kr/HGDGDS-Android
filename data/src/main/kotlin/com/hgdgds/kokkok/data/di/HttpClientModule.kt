package com.hgdgds.kokkok.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.Dispatcher
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HttpClientModule {
    @Provides
    fun providesHttpLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

    @Provides
    fun providesAdjustMaxRequestPerHostOKHttpDispatcher(): Dispatcher =
        Dispatcher().apply {
            maxRequestsPerHost = 10
        }

    @Provides
    fun providesOKHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor,
        okHttpDispatcher: Dispatcher,
    ): OkHttpClient =
        OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .addInterceptor(httpLoggingInterceptor)
            .dispatcher(okHttpDispatcher)
            .build()

    @Provides
    @Singleton
    fun providesKokRetrofit(okHttpClient: OkHttpClient): Retrofit {
        val contentType = "application/json".toMediaType()
        val jsonRule = Json {
            ignoreUnknownKeys = true // JSON에 정의되지 않은 키를 무시할지 여부
            encodeDefaults = true // 기본값(default)을 가진 프로퍼티도 JSON에 포함 할지 여부
            prettyPrint = true // 사람이 읽기 쉬운 JSON 문자열로 출력할지 여부
        }
        /** baseurl 추후 추가 예정 */
        return Retrofit.Builder()
            .baseUrl("")
            .client(okHttpClient)
            .addConverterFactory(jsonRule.asConverterFactory(contentType))
            .build()
    }
}
