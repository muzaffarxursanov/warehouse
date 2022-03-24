package com.example.warehouse.repository.attachment;

import com.example.warehouse.model.entity.attachment.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
