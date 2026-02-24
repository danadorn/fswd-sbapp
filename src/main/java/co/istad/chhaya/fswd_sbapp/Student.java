package co.istad.chhaya.fswd_sbapp;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.Builder;

@Builder
public record Student(
        String name,
        String gender,
        String course
) {
}
