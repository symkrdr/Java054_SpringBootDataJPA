package com.seyma.java054_springbootdatajpa.repository;

import com.seyma.java054_springbootdatajpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    /**
     * Özelleştirilmiş sorgu yazacağız.
     * interface içerisine method gövdesi yazılamaz.
     * Bu nedenle Spring kendi yapısına uygun şekilde
     * geliştirilmiş olduğun TERSİNE MÜHENDİSLİK yapısı sayesinde sorgu yazmanızı
     * kolaylaştırıyor
     * sadece method un tanımını yaparak sorgu oluşturabiliyorsunuz.
     *
     * Spring Data ile Sorgu Methodu oluşturmak,
     * 1-*find(arama)/count(sayaç)/exists(var mı)
     * 1.1. -optional;OPTIONAL,all,top
     * 2-By: neye göre arama ,sayma,varlık yokluk kontrol etme
     * 3-[Entity->değişken adı]: hangi entitye ait repositoryde işlem yapıyorsanız onun içerisindeki değişken
     * adlarını ekliyoruz.
     * 4-eğer birden fazla sorgulama kriteri var ise,
     * 4.1.And,Or diye davam edilir.
     * 4.2.[Entity->değişken]
     *method adı oluşturulduktan sonra methodun alacağı parametreler değişken olarak yazılır.
     *
     *
     */


    //select*from tblcustomer where name =?
    List<Customer> findAllByName(String Name);






    Optional<Customer> findOptionalByName(String Name); //tek bir şey istediğimde optinal ama liste istersem list

}
