/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cemilan.praktikum.pws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author asus
 */
@Entity
@Table(name="iwak")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokoIkan {
     @Id
    private Long kodeikan;
    private String Namaiwak;
    private String Jenisiwak;
    private int hargaiwak;
    
}
