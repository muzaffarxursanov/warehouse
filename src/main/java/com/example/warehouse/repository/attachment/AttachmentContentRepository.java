package com.example.warehouse.repository.attachment;

import com.example.warehouse.model.entity.attachment.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Long> {
}
