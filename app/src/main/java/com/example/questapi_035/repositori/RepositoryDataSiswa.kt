package com.example.questapi_035.repositori

import com.example.questapi_035.apiservice.ServiceApiSiswa
import com.example.questapi_035.modeldata.DataSiswa

interface RepositoryDataSiswa{
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void>
}
