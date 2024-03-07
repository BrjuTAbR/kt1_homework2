package ru.netology

import org.junit.Test

import org.junit.Assert.*

class Task2KtTest {

    @Test
    fun calcTransferVisaMaxTransfer() {
        val transferAmountTest = 150_000
        val cardTypeTest = "Visa"
        val prevTransfersAmountTest = 0

        val result = calcTransfer(transferAmountTest, cardTypeTest, prevTransfersAmountTest)

        assertEquals(1125, result)
    }

    @Test
    fun calcTransferVisaMaxPrev() {
        val transferAmountTest = 100_000
        val cardTypeTest = "Visa"
        val prevTransfersAmountTest = 500_000

        val result = calcTransfer(transferAmountTest, cardTypeTest, prevTransfersAmountTest)

        assertEquals(750, result)
    }

    @Test
    fun calcTransferVisaMax() {
        val transferAmountTest = 150_000
        val cardTypeTest = "Visa"
        val prevTransfersAmountTest = 0

        val result = calcTransfer(transferAmountTest, cardTypeTest, prevTransfersAmountTest)

        assertEquals(1125, result)

    }

    @Test
    fun calcTransferMirMaxTransfer() {
        val transferAmountTest = 150_000
        val cardTypeTest = "Мир"
        val prevTransfersAmountTest = 300_000

        val result = calcTransfer(transferAmountTest, cardTypeTest, prevTransfersAmountTest)

        assertEquals(0, result)

    }

    @Test
    fun calcTransferMS() {

        val transferAmountTest = 50_000
        val cardTypeTest = "Mastercard"
        val prevTransfersAmountTest = 0


        val result = calcTransfer(transferAmountTest, cardTypeTest, prevTransfersAmountTest)

        assertEquals(0, result)
    }

    @Test
    fun calcTransferMSPrev() {

        val transferAmountTest = 50_000
        val cardTypeTest = "Mastercard"
        val prevTransfersAmountTest = 35_000


        val result = calcTransfer(transferAmountTest, cardTypeTest, prevTransfersAmountTest)

        assertEquals(80, result)
    }

    @Test
    fun calcTransferMirOver() {
        val transferAmountTest = 145_000
        val cardTypeTest = "Мир"
        val prevTransfersAmountTest = 555_001

        val result = calcTransfer(transferAmountTest, cardTypeTest, prevTransfersAmountTest)

        assertEquals(-1, result)

    }
     @Test
    fun calcTransferMirOverTransfer() {
        val transferAmountTest = 160_000
        val cardTypeTest = "Мир"
        val prevTransfersAmountTest = 100_000

        val result = calcTransfer(transferAmountTest, cardTypeTest, prevTransfersAmountTest)

        assertEquals(-1, result)

    }



}