package com.arpinder.orderms.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sequence {
    @Id
    private String id;
    private int sequence;
}
