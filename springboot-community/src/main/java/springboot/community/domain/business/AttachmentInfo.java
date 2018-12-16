package springboot.community.domain.business;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "attachment_info", schema = "post_loan", catalog = "")
public class AttachmentInfo {
    private Long id;
    private Integer attachmentType;
    private Long businessObjectId;
    private String fileName;
    private String storagePath;
    private Integer isDelete;
    private Timestamp createTime;
    private Timestamp modifyTime;

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attachment_type", nullable = true)
    public Integer getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(Integer attachmentType) {
        this.attachmentType = attachmentType;
    }

    @Basic
    @Column(name = "business_object_id", nullable = true)
    public Long getBusinessObjectId() {
        return businessObjectId;
    }

    public void setBusinessObjectId(Long businessObjectId) {
        this.businessObjectId = businessObjectId;
    }

    @Basic
    @Column(name = "file_name", nullable = true, length = 200)
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Basic
    @Column(name = "storage_path", nullable = true, length = 500)
    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    @Basic
    @Column(name = "is_delete", nullable = false)
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "modify_time", nullable = false)
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttachmentInfo that = (AttachmentInfo) o;
        return id == that.id &&
                isDelete == that.isDelete &&
                Objects.equals(attachmentType, that.attachmentType) &&
                Objects.equals(businessObjectId, that.businessObjectId) &&
                Objects.equals(fileName, that.fileName) &&
                Objects.equals(storagePath, that.storagePath) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(modifyTime, that.modifyTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, attachmentType, businessObjectId, fileName, storagePath, isDelete, createTime, modifyTime);
    }
}
