package com.juaracoding;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class catatanKeuanganTest {
    private AndroidDriver driver;
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Pixel 2 API 30");
        dc.setCapability("udid", "emulator-5556");
        dc.setCapability("platformName", "android");
        dc.setCapability("platformVersion", "11");
        dc.setCapability("appPackage", "com.chad.financialrecord");
        dc.setCapability("appActivity", "com.rookie.catatankeuangan.feature.splash.SplashActivity");
        dc.setCapability("noReset", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, dc);

    }

    @AfterClass
    public void finish() {
        delay(3);
        driver.quit();
    }

    //Pembuatan Testing Pemasukkan Pertama Dengan kategori Pakaian
    @Test
    public void testIncomeFashion(){
        //delay = memberikan waktu jeda kepada program
        delay(5);
        //melakukan penambahan data pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/fabMenu").click();
        delay(3);
        //memilih fitur pemasukkan pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/btnIncome").click();
        delay(3);
        //menekan tombol tanggal pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/tvDate").click();
        delay(3);
        //memilih tanggal 23 Agustus 2024
        driver.findElementByXPath("//android.view.View[@content-desc='23 Agustus 2024']").click();
        delay(3);
        //menekan ok pada tampilan tanggal
        driver.findElementById("android:id/button1").click();
        delay(3);
        //membuka kolom kategory
        driver.findElementById("com.chad.financialrecord:id/spCategory").click();
        delay(2);
        //memilih kategori pakaian pada aplikasi
        driver.findElementByXPath("//android.widget.TextView[@resource-id='com.chad.financialrecord:id/tvName' and @text='Pakaian']").click();
        delay(2);
        //input data harga pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/etAmount").sendKeys("1500000");
        delay(3);
        //input keterangan pada pemasukkan aplikasi
        driver.findElementById("com.chad.financialrecord:id/etNote").sendKeys("Penjualan Baju Kaos Volunteer Event");
        delay(3);
        //menekan tombol simpan pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/btSave").click();
        delay(3);
    }
    //Pembuatan Testing Pemasukkan Kedua Dengan kategori Mobil
    @Test
    public void testIncomeCar(){
        //delay = memberikan waktu jeda kepada program
        delay(5);
        //melakukan penambahan data pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/fabMenu").click();
        delay(3);
        //memilih fitur pemasukkan pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/btnIncome").click();
        delay(3);
        //menekan tombol tanggal pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/tvDate").click();
        delay(3);
        //memilih tanggal 26 Agustus 2024
        driver.findElementByXPath("//android.view.View[@content-desc='26 Agustus 2024']").click();
        delay(3);
        //menekan ok pada tampilan tanggal
        driver.findElementById("android:id/button1").click();
        delay(3);
        //membuka kolom kategory
        driver.findElementById("com.chad.financialrecord:id/spCategory").click();
        delay(2);
        //memilih kategori Kendaraan pada aplikasi
        driver.findElementByXPath("//android.widget.TextView[@resource-id='com.chad.financialrecord:id/tvName' and @text='Mobil']").click();
        delay(2);
        //input data harga pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/etAmount").sendKeys("100000000");
        delay(3);
        //input keterangan pada pemasukkan aplikasi
        driver.findElementById("com.chad.financialrecord:id/etNote").sendKeys("Penjualan Mobil");
        delay(3);
        //menekan tombol simpan pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/btSave").click();
        delay(5);
    }
    //Pembuatan Testing Pengeluaran Pertama Dengan kategori Makanan
    @Test
    public void testExpensesFood(){
        //delay = memberikan waktu jeda kepada program
        delay(5);
        //melakukan penambahan data pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/fabMenu").click();
        delay(3);
        //menekan tombol tanggal pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/tvDate").click();
        delay(3);
        //memilih tanggal 23 Agustus 2024
        driver.findElementByXPath("//android.view.View[@content-desc='27 Agustus 2024']").click();
        delay(3);
        //menekan ok pada tampilan tanggal
        driver.findElementById("android:id/button1").click();
        delay(3);
        //membuka kolom kategory
        driver.findElementById("com.chad.financialrecord:id/spCategory").click();
        delay(2);
        //memilih kategori Makanan pada aplikasi
        driver.findElementByXPath("//android.widget.TextView[@resource-id='com.chad.financialrecord:id/tvName' and @text='Makanan']").click();
        delay(2);
        //input data harga pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/etAmount").sendKeys("1400000");
        delay(3);
        //input keterangan pada pemasukkan aplikasi
        driver.findElementById("com.chad.financialrecord:id/etNote").sendKeys("Konsumsi Volunteer");
        delay(3);
        //menekan tombol simpan pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/btSave").click();
        delay(5);
    }
    //Pembuatan Testing Pengeluaran Kedua Dengan kategori Pulsa
    @Test
    public void testExpensesCredit(){
        //delay = memberikan waktu jeda kepada program
        delay(5);
        //melakukan penambahan data pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/fabMenu").click();
        delay(3);
        //menekan tombol tanggal pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/tvDate").click();
        delay(3);
        //memilih tanggal 23 Agustus 2024
        driver.findElementByXPath("//android.view.View[@content-desc='27 Agustus 2024']").click();
        delay(3);
        //menekan ok pada tampilan tanggal
        driver.findElementById("android:id/button1").click();
        delay(3);
        //membuka kolom kategory
        driver.findElementById("com.chad.financialrecord:id/spCategory").click();
        delay(2);
        //memilih kategori Pulsa pada aplikasi
        driver.findElementByXPath("//android.widget.TextView[@resource-id='com.chad.financialrecord:id/tvName' and @text='Pulsa']").click();
        delay(2);
        //input data harga pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/etAmount").sendKeys("2000000");
        delay(3);
        //input keterangan pada pemasukkan aplikasi
        driver.findElementById("com.chad.financialrecord:id/etNote").sendKeys("Paket Data Bulanan Toko");
        delay(3);
        //menekan tombol simpan pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/btSave").click();
        delay(5);
    }
    //Pembuatan Testing Pengeluaran Ketiga Dengan kategori Tagihan
    @Test
    public void testExpensesTagihan(){
        //delay = memberikan waktu jeda kepada program
        delay(5);
        //melakukan penambahan data pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/fabMenu").click();
        delay(3);
        //menekan tombol tanggal pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/tvDate").click();
        delay(3);
        //memilih tanggal 23 Agustus 2024
        driver.findElementByXPath("//android.view.View[@content-desc='30 Agustus 2024']").click();
        delay(3);
        //menekan ok pada tampilan tanggal
        driver.findElementById("android:id/button1").click();
        delay(3);
        //membuka kolom kategory
        driver.findElementById("com.chad.financialrecord:id/spCategory").click();
        delay(2);
        //memilih kategori Pulsa pada aplikasi
        driver.findElementByXPath("//android.widget.TextView[@resource-id='com.chad.financialrecord:id/tvName' and @text='Tagihan']").click();
        delay(2);
        //input data harga pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/etAmount").sendKeys("3400000");
        delay(3);
        //input keterangan pada pemasukkan aplikasi
        driver.findElementById("com.chad.financialrecord:id/etNote").sendKeys("Tagihan tak terduga");
        delay(3);
        //menekan tombol simpan pada aplikasi
        driver.findElementById("com.chad.financialrecord:id/btSave").click();
        delay(5);
    }
    @Test
    public void testShowBalance(){
        delay(2);
        driver.findElementById("com.chad.financialrecord:id/ibSetting").click();
        delay(3);
        driver.findElementById("com.chad.financialrecord:id/llChart");
        delay(3);
        driver.findElementByXPath("//android.widget.LinearLayout[@resource-id='com.chad.financialrecord:id/btnTipe']/android.widget.ImageView");
        delay(3);
        driver.findElementByXPath("//android.widget.TextView[@text='Ringkasan']");
    }


    public static void delay(long detik) {
        try {
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
