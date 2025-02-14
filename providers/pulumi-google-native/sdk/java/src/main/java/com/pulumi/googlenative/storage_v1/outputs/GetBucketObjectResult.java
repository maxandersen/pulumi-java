// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.storage_v1.outputs.BucketObjectCustomerEncryptionResponse;
import com.pulumi.googlenative.storage_v1.outputs.BucketObjectOwnerResponse;
import com.pulumi.googlenative.storage_v1.outputs.ObjectAccessControlResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBucketObjectResult {
    /**
     * @return Access controls on the object.
     * 
     */
    private final List<ObjectAccessControlResponse> acl;
    /**
     * @return The name of the bucket containing this object.
     * 
     */
    private final String bucket;
    /**
     * @return Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600.
     * 
     */
    private final String cacheControl;
    /**
     * @return Number of underlying components that make up this object. Components are accumulated by compose operations.
     * 
     */
    private final Integer componentCount;
    /**
     * @return Content-Disposition of the object data.
     * 
     */
    private final String contentDisposition;
    /**
     * @return Content-Encoding of the object data.
     * 
     */
    private final String contentEncoding;
    /**
     * @return Content-Language of the object data.
     * 
     */
    private final String contentLanguage;
    /**
     * @return Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream.
     * 
     */
    private final String contentType;
    /**
     * @return CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c checksum, see Hashes and ETags: Best Practices.
     * 
     */
    private final String crc32c;
    /**
     * @return A timestamp in RFC 3339 format specified by the user for an object.
     * 
     */
    private final String customTime;
    /**
     * @return Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
     * 
     */
    private final BucketObjectCustomerEncryptionResponse customerEncryption;
    /**
     * @return HTTP 1.1 Entity tag for the object.
     * 
     */
    private final String etag;
    /**
     * @return Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is signified by the hold&#39;s release (i.e. this value is set to false). After being released (set to false), such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false.
     * 
     */
    private final Boolean eventBasedHold;
    /**
     * @return The content generation of this object. Used for object versioning.
     * 
     */
    private final String generation;
    /**
     * @return The kind of item this is. For objects, this is always storage#object.
     * 
     */
    private final String kind;
    /**
     * @return Not currently supported. Specifying the parameter causes the request to fail with status code 400 - Bad Request.
     * 
     */
    private final String kmsKeyName;
    /**
     * @return MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices.
     * 
     */
    private final String md5Hash;
    /**
     * @return Media download link.
     * 
     */
    private final String mediaLink;
    /**
     * @return User-provided metadata, in key/value pairs.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * @return The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number is only meaningful in the context of a particular generation of a particular object.
     * 
     */
    private final String metageneration;
    /**
     * @return The name of the object. Required if not specified by URL parameter.
     * 
     */
    private final String name;
    /**
     * @return The owner of the object. This will always be the uploader of the object.
     * 
     */
    private final BucketObjectOwnerResponse owner;
    /**
     * @return A server-determined value that specifies the earliest time that the object&#39;s retention period expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with an active event-based hold, since retention expiration is unknown until the hold is removed. Note 2: This value can be provided even when temporary hold is set (so that the user can reason about policy without having to first unset the temporary hold).
     * 
     */
    private final String retentionExpirationTime;
    /**
     * @return The link to this object.
     * 
     */
    private final String selfLink;
    /**
     * @return Content-Length of the data in bytes.
     * 
     */
    private final String size;
    /**
     * @return Storage class of the object.
     * 
     */
    private final String storageClass;
    /**
     * @return Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and overwrites. A common use case of this flag is regulatory investigations where objects need to be retained while the investigation is ongoing. Note that unlike event-based hold, temporary hold does not impact retention expiration time of an object.
     * 
     */
    private final Boolean temporaryHold;
    /**
     * @return The creation time of the object in RFC 3339 format.
     * 
     */
    private final String timeCreated;
    /**
     * @return The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted.
     * 
     */
    private final String timeDeleted;
    /**
     * @return The time at which the object&#39;s storage class was last changed. When the object is initially created, it will be set to timeCreated.
     * 
     */
    private final String timeStorageClassUpdated;
    /**
     * @return The modification time of the object metadata in RFC 3339 format.
     * 
     */
    private final String updated;

    @CustomType.Constructor
    private GetBucketObjectResult(
        @CustomType.Parameter("acl") List<ObjectAccessControlResponse> acl,
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("cacheControl") String cacheControl,
        @CustomType.Parameter("componentCount") Integer componentCount,
        @CustomType.Parameter("contentDisposition") String contentDisposition,
        @CustomType.Parameter("contentEncoding") String contentEncoding,
        @CustomType.Parameter("contentLanguage") String contentLanguage,
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("crc32c") String crc32c,
        @CustomType.Parameter("customTime") String customTime,
        @CustomType.Parameter("customerEncryption") BucketObjectCustomerEncryptionResponse customerEncryption,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("eventBasedHold") Boolean eventBasedHold,
        @CustomType.Parameter("generation") String generation,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("kmsKeyName") String kmsKeyName,
        @CustomType.Parameter("md5Hash") String md5Hash,
        @CustomType.Parameter("mediaLink") String mediaLink,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("metageneration") String metageneration,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("owner") BucketObjectOwnerResponse owner,
        @CustomType.Parameter("retentionExpirationTime") String retentionExpirationTime,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("size") String size,
        @CustomType.Parameter("storageClass") String storageClass,
        @CustomType.Parameter("temporaryHold") Boolean temporaryHold,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeDeleted") String timeDeleted,
        @CustomType.Parameter("timeStorageClassUpdated") String timeStorageClassUpdated,
        @CustomType.Parameter("updated") String updated) {
        this.acl = acl;
        this.bucket = bucket;
        this.cacheControl = cacheControl;
        this.componentCount = componentCount;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentType = contentType;
        this.crc32c = crc32c;
        this.customTime = customTime;
        this.customerEncryption = customerEncryption;
        this.etag = etag;
        this.eventBasedHold = eventBasedHold;
        this.generation = generation;
        this.kind = kind;
        this.kmsKeyName = kmsKeyName;
        this.md5Hash = md5Hash;
        this.mediaLink = mediaLink;
        this.metadata = metadata;
        this.metageneration = metageneration;
        this.name = name;
        this.owner = owner;
        this.retentionExpirationTime = retentionExpirationTime;
        this.selfLink = selfLink;
        this.size = size;
        this.storageClass = storageClass;
        this.temporaryHold = temporaryHold;
        this.timeCreated = timeCreated;
        this.timeDeleted = timeDeleted;
        this.timeStorageClassUpdated = timeStorageClassUpdated;
        this.updated = updated;
    }

    /**
     * @return Access controls on the object.
     * 
     */
    public List<ObjectAccessControlResponse> acl() {
        return this.acl;
    }
    /**
     * @return The name of the bucket containing this object.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Cache-Control directive for the object data. If omitted, and the object is accessible to all anonymous users, the default will be public, max-age=3600.
     * 
     */
    public String cacheControl() {
        return this.cacheControl;
    }
    /**
     * @return Number of underlying components that make up this object. Components are accumulated by compose operations.
     * 
     */
    public Integer componentCount() {
        return this.componentCount;
    }
    /**
     * @return Content-Disposition of the object data.
     * 
     */
    public String contentDisposition() {
        return this.contentDisposition;
    }
    /**
     * @return Content-Encoding of the object data.
     * 
     */
    public String contentEncoding() {
        return this.contentEncoding;
    }
    /**
     * @return Content-Language of the object data.
     * 
     */
    public String contentLanguage() {
        return this.contentLanguage;
    }
    /**
     * @return Content-Type of the object data. If an object is stored without a Content-Type, it is served as application/octet-stream.
     * 
     */
    public String contentType() {
        return this.contentType;
    }
    /**
     * @return CRC32c checksum, as described in RFC 4960, Appendix B; encoded using base64 in big-endian byte order. For more information about using the CRC32c checksum, see Hashes and ETags: Best Practices.
     * 
     */
    public String crc32c() {
        return this.crc32c;
    }
    /**
     * @return A timestamp in RFC 3339 format specified by the user for an object.
     * 
     */
    public String customTime() {
        return this.customTime;
    }
    /**
     * @return Metadata of customer-supplied encryption key, if the object is encrypted by such a key.
     * 
     */
    public BucketObjectCustomerEncryptionResponse customerEncryption() {
        return this.customerEncryption;
    }
    /**
     * @return HTTP 1.1 Entity tag for the object.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is signified by the hold&#39;s release (i.e. this value is set to false). After being released (set to false), such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is the loan being paid in full. In this example, these objects will be held intact for any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins from the moment event-based hold transitioned from true to false.
     * 
     */
    public Boolean eventBasedHold() {
        return this.eventBasedHold;
    }
    /**
     * @return The content generation of this object. Used for object versioning.
     * 
     */
    public String generation() {
        return this.generation;
    }
    /**
     * @return The kind of item this is. For objects, this is always storage#object.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Not currently supported. Specifying the parameter causes the request to fail with status code 400 - Bad Request.
     * 
     */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * @return MD5 hash of the data; encoded using base64. For more information about using the MD5 hash, see Hashes and ETags: Best Practices.
     * 
     */
    public String md5Hash() {
        return this.md5Hash;
    }
    /**
     * @return Media download link.
     * 
     */
    public String mediaLink() {
        return this.mediaLink;
    }
    /**
     * @return User-provided metadata, in key/value pairs.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata;
    }
    /**
     * @return The version of the metadata for this object at this generation. Used for preconditions and for detecting changes in metadata. A metageneration number is only meaningful in the context of a particular generation of a particular object.
     * 
     */
    public String metageneration() {
        return this.metageneration;
    }
    /**
     * @return The name of the object. Required if not specified by URL parameter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The owner of the object. This will always be the uploader of the object.
     * 
     */
    public BucketObjectOwnerResponse owner() {
        return this.owner;
    }
    /**
     * @return A server-determined value that specifies the earliest time that the object&#39;s retention period expires. This value is in RFC 3339 format. Note 1: This field is not provided for objects with an active event-based hold, since retention expiration is unknown until the hold is removed. Note 2: This value can be provided even when temporary hold is set (so that the user can reason about policy without having to first unset the temporary hold).
     * 
     */
    public String retentionExpirationTime() {
        return this.retentionExpirationTime;
    }
    /**
     * @return The link to this object.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Content-Length of the data in bytes.
     * 
     */
    public String size() {
        return this.size;
    }
    /**
     * @return Storage class of the object.
     * 
     */
    public String storageClass() {
        return this.storageClass;
    }
    /**
     * @return Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and overwrites. A common use case of this flag is regulatory investigations where objects need to be retained while the investigation is ongoing. Note that unlike event-based hold, temporary hold does not impact retention expiration time of an object.
     * 
     */
    public Boolean temporaryHold() {
        return this.temporaryHold;
    }
    /**
     * @return The creation time of the object in RFC 3339 format.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The deletion time of the object in RFC 3339 format. Will be returned if and only if this version of the object has been deleted.
     * 
     */
    public String timeDeleted() {
        return this.timeDeleted;
    }
    /**
     * @return The time at which the object&#39;s storage class was last changed. When the object is initially created, it will be set to timeCreated.
     * 
     */
    public String timeStorageClassUpdated() {
        return this.timeStorageClassUpdated;
    }
    /**
     * @return The modification time of the object metadata in RFC 3339 format.
     * 
     */
    public String updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ObjectAccessControlResponse> acl;
        private String bucket;
        private String cacheControl;
        private Integer componentCount;
        private String contentDisposition;
        private String contentEncoding;
        private String contentLanguage;
        private String contentType;
        private String crc32c;
        private String customTime;
        private BucketObjectCustomerEncryptionResponse customerEncryption;
        private String etag;
        private Boolean eventBasedHold;
        private String generation;
        private String kind;
        private String kmsKeyName;
        private String md5Hash;
        private String mediaLink;
        private Map<String,String> metadata;
        private String metageneration;
        private String name;
        private BucketObjectOwnerResponse owner;
        private String retentionExpirationTime;
        private String selfLink;
        private String size;
        private String storageClass;
        private Boolean temporaryHold;
        private String timeCreated;
        private String timeDeleted;
        private String timeStorageClassUpdated;
        private String updated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketObjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.bucket = defaults.bucket;
    	      this.cacheControl = defaults.cacheControl;
    	      this.componentCount = defaults.componentCount;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentType = defaults.contentType;
    	      this.crc32c = defaults.crc32c;
    	      this.customTime = defaults.customTime;
    	      this.customerEncryption = defaults.customerEncryption;
    	      this.etag = defaults.etag;
    	      this.eventBasedHold = defaults.eventBasedHold;
    	      this.generation = defaults.generation;
    	      this.kind = defaults.kind;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.md5Hash = defaults.md5Hash;
    	      this.mediaLink = defaults.mediaLink;
    	      this.metadata = defaults.metadata;
    	      this.metageneration = defaults.metageneration;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.retentionExpirationTime = defaults.retentionExpirationTime;
    	      this.selfLink = defaults.selfLink;
    	      this.size = defaults.size;
    	      this.storageClass = defaults.storageClass;
    	      this.temporaryHold = defaults.temporaryHold;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeDeleted = defaults.timeDeleted;
    	      this.timeStorageClassUpdated = defaults.timeStorageClassUpdated;
    	      this.updated = defaults.updated;
        }

        public Builder acl(List<ObjectAccessControlResponse> acl) {
            this.acl = Objects.requireNonNull(acl);
            return this;
        }
        public Builder acl(ObjectAccessControlResponse... acl) {
            return acl(List.of(acl));
        }
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = Objects.requireNonNull(cacheControl);
            return this;
        }
        public Builder componentCount(Integer componentCount) {
            this.componentCount = Objects.requireNonNull(componentCount);
            return this;
        }
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = Objects.requireNonNull(contentDisposition);
            return this;
        }
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = Objects.requireNonNull(contentEncoding);
            return this;
        }
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = Objects.requireNonNull(contentLanguage);
            return this;
        }
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        public Builder crc32c(String crc32c) {
            this.crc32c = Objects.requireNonNull(crc32c);
            return this;
        }
        public Builder customTime(String customTime) {
            this.customTime = Objects.requireNonNull(customTime);
            return this;
        }
        public Builder customerEncryption(BucketObjectCustomerEncryptionResponse customerEncryption) {
            this.customerEncryption = Objects.requireNonNull(customerEncryption);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder eventBasedHold(Boolean eventBasedHold) {
            this.eventBasedHold = Objects.requireNonNull(eventBasedHold);
            return this;
        }
        public Builder generation(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder md5Hash(String md5Hash) {
            this.md5Hash = Objects.requireNonNull(md5Hash);
            return this;
        }
        public Builder mediaLink(String mediaLink) {
            this.mediaLink = Objects.requireNonNull(mediaLink);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder metageneration(String metageneration) {
            this.metageneration = Objects.requireNonNull(metageneration);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder owner(BucketObjectOwnerResponse owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder retentionExpirationTime(String retentionExpirationTime) {
            this.retentionExpirationTime = Objects.requireNonNull(retentionExpirationTime);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        public Builder temporaryHold(Boolean temporaryHold) {
            this.temporaryHold = Objects.requireNonNull(temporaryHold);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeDeleted(String timeDeleted) {
            this.timeDeleted = Objects.requireNonNull(timeDeleted);
            return this;
        }
        public Builder timeStorageClassUpdated(String timeStorageClassUpdated) {
            this.timeStorageClassUpdated = Objects.requireNonNull(timeStorageClassUpdated);
            return this;
        }
        public Builder updated(String updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }        public GetBucketObjectResult build() {
            return new GetBucketObjectResult(acl, bucket, cacheControl, componentCount, contentDisposition, contentEncoding, contentLanguage, contentType, crc32c, customTime, customerEncryption, etag, eventBasedHold, generation, kind, kmsKeyName, md5Hash, mediaLink, metadata, metageneration, name, owner, retentionExpirationTime, selfLink, size, storageClass, temporaryHold, timeCreated, timeDeleted, timeStorageClassUpdated, updated);
        }
    }
}
