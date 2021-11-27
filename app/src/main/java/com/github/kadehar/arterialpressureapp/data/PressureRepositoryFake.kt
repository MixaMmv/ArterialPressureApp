package com.github.kadehar.arterialpressureapp.data

import com.github.kadehar.arterialpressureapp.domain.model.ArterialPressure

class PressureRepositoryFake() : PressureRepository {
    override suspend fun addNewRecord(arterialPressure: ArterialPressure) {
        TODO("Not yet implemented")
    }

    override suspend fun updateRecord(arterialPressure: ArterialPressure) {
        TODO("Not yet implemented")
    }

    override suspend fun getAllRecords(): List<ArterialPressure> {
        return listOf(
            ArterialPressure("1", "1", "1", 1613447403000),
            ArterialPressure("2", "2", "2", 1618545003000),
            ArterialPressure("3", "3", "3", 1634356203000),
            ArterialPressure("4", "4", "4", 1637725803000),
            ArterialPressure("5", "5", "5", 1637985003000)
        )
    }

    override suspend fun getRecordById(id: String): ArterialPressure {
        TODO("Not yet implemented")
    }

    override suspend fun deleteRecord(arterialPressure: ArterialPressure) {
        TODO("Not yet implemented")
    }
}