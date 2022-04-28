package com.backend.domain.image.dto;

import com.backend.domain.image.domain.entity.Image;
import lombok.Builder;

@Builder
public class ImageResponse {

    private Long id;

    private Long location_id;

    private String path;

    public static ImageResponse of(Image image) {
        return ImageResponse.builder()
                .id(image.getId())
                .location_id(image.getLocation().getId())
                .path(image.getPath())
                .build();
    }
}