package com.example.myproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AttachDTO {
    private Long attachId;
    private String filePath;
    private String fileRealName;
    private String fileChgName;
}
