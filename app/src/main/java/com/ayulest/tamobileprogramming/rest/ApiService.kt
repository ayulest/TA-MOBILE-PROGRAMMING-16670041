package com.ayulest.tamobileprogramming.rest

import com.ayulest.tamobileprogramming.BuildConfig
import com.ayulest.tamobileprogramming.model.ModelRootData
import retrofit.http.GET
import rx.Observable

interface ApiService {
    //    http://informatika.upgris.ac.id/mobile/data/index.php/api/example/detil_jadwal?key=8e7c4667df0bf0fe2d1766fc554dbc&npm=16670041
    @GET("detil_jadwal?key="+ BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getJadwalKuliah(): Observable<ModelRootData>

    @GET("detil_pribadi?key=" + BuildConfig.API_KEY + "&npm=" + BuildConfig.NPM)
    fun getProfil(): Observable<ModelRootData>

}