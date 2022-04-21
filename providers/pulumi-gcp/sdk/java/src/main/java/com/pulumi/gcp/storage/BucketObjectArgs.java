// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage;

import com.pulumi.asset.AssetOrArchive;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketObjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketObjectArgs Empty = new BucketObjectArgs();

    /**
     * The name of the containing bucket.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * [Cache-Control](https://tools.ietf.org/html/rfc7234#section-5.2)
     * directive to specify caching behavior of object data. If omitted and object is accessible to all anonymous users, the default will be public, max-age=3600
     * 
     */
    @Import(name="cacheControl")
    private @Nullable Output<String> cacheControl;

    public Optional<Output<String>> cacheControl() {
        return Optional.ofNullable(this.cacheControl);
    }

    /**
     * Data as `string` to be uploaded. Must be defined if `source` is not. **Note**: The `content` field is marked as sensitive.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * [Content-Disposition](https://tools.ietf.org/html/rfc6266) of the object data.
     * 
     */
    @Import(name="contentDisposition")
    private @Nullable Output<String> contentDisposition;

    public Optional<Output<String>> contentDisposition() {
        return Optional.ofNullable(this.contentDisposition);
    }

    /**
     * [Content-Encoding](https://tools.ietf.org/html/rfc7231#section-3.1.2.2) of the object data.
     * 
     */
    @Import(name="contentEncoding")
    private @Nullable Output<String> contentEncoding;

    public Optional<Output<String>> contentEncoding() {
        return Optional.ofNullable(this.contentEncoding);
    }

    /**
     * [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object data.
     * 
     */
    @Import(name="contentLanguage")
    private @Nullable Output<String> contentLanguage;

    public Optional<Output<String>> contentLanguage() {
        return Optional.ofNullable(this.contentLanguage);
    }

    /**
     * [Content-Type](https://tools.ietf.org/html/rfc7231#section-3.1.1.5) of the object data. Defaults to &#34;application/octet-stream&#34; or &#34;text/plain; charset=utf-8&#34;.
     * 
     */
    @Import(name="contentType")
    private @Nullable Output<String> contentType;

    public Optional<Output<String>> contentType() {
        return Optional.ofNullable(this.contentType);
    }

    /**
     * Enables object encryption with Customer-Supplied Encryption Key (CSEK). Google [documentation about CSEK.](https://cloud.google.com/storage/docs/encryption/customer-supplied-keys)
     * Structure is documented below.
     * 
     */
    @Import(name="customerEncryption")
    private @Nullable Output<BucketObjectCustomerEncryptionArgs> customerEncryption;

    public Optional<Output<BucketObjectCustomerEncryptionArgs>> customerEncryption() {
        return Optional.ofNullable(this.customerEncryption);
    }

    @Import(name="detectMd5hash")
    private @Nullable Output<String> detectMd5hash;

    public Optional<Output<String>> detectMd5hash() {
        return Optional.ofNullable(this.detectMd5hash);
    }

    /**
     * Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is
     * signified by the hold&#39;s release (i.e. this value is set to false). After being released (set to false), such objects
     * will be subject to bucket-level retention (if any).
     * 
     */
    @Import(name="eventBasedHold")
    private @Nullable Output<Boolean> eventBasedHold;

    public Optional<Output<Boolean>> eventBasedHold() {
        return Optional.ofNullable(this.eventBasedHold);
    }

    /**
     * The resource name of the Cloud KMS key that will be used to [encrypt](https://cloud.google.com/storage/docs/encryption/using-customer-managed-keys) the object.
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * User-provided metadata, in key/value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The name of the object. If you&#39;re interpolating the name of this object, see `output_name` instead.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A path to the data you want to upload. Must be defined
     * if `content` is not.
     * 
     */
    @Import(name="source")
    private @Nullable Output<AssetOrArchive> source;

    public Optional<Output<AssetOrArchive>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The [StorageClass](https://cloud.google.com/storage/docs/storage-classes) of the new bucket object.
     * Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`. If not provided, this defaults to the bucket&#39;s default
     * storage class or to a [standard](https://cloud.google.com/storage/docs/storage-classes#standard) class.
     * 
     */
    @Import(name="storageClass")
    private @Nullable Output<String> storageClass;

    public Optional<Output<String>> storageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    /**
     * Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and
     * overwrites.
     * 
     */
    @Import(name="temporaryHold")
    private @Nullable Output<Boolean> temporaryHold;

    public Optional<Output<Boolean>> temporaryHold() {
        return Optional.ofNullable(this.temporaryHold);
    }

    private BucketObjectArgs() {}

    private BucketObjectArgs(BucketObjectArgs $) {
        this.bucket = $.bucket;
        this.cacheControl = $.cacheControl;
        this.content = $.content;
        this.contentDisposition = $.contentDisposition;
        this.contentEncoding = $.contentEncoding;
        this.contentLanguage = $.contentLanguage;
        this.contentType = $.contentType;
        this.customerEncryption = $.customerEncryption;
        this.detectMd5hash = $.detectMd5hash;
        this.eventBasedHold = $.eventBasedHold;
        this.kmsKeyName = $.kmsKeyName;
        this.metadata = $.metadata;
        this.name = $.name;
        this.source = $.source;
        this.storageClass = $.storageClass;
        this.temporaryHold = $.temporaryHold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketObjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketObjectArgs $;

        public Builder() {
            $ = new BucketObjectArgs();
        }

        public Builder(BucketObjectArgs defaults) {
            $ = new BucketObjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        public Builder cacheControl(@Nullable Output<String> cacheControl) {
            $.cacheControl = cacheControl;
            return this;
        }

        public Builder cacheControl(String cacheControl) {
            return cacheControl(Output.of(cacheControl));
        }

        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder contentDisposition(@Nullable Output<String> contentDisposition) {
            $.contentDisposition = contentDisposition;
            return this;
        }

        public Builder contentDisposition(String contentDisposition) {
            return contentDisposition(Output.of(contentDisposition));
        }

        public Builder contentEncoding(@Nullable Output<String> contentEncoding) {
            $.contentEncoding = contentEncoding;
            return this;
        }

        public Builder contentEncoding(String contentEncoding) {
            return contentEncoding(Output.of(contentEncoding));
        }

        public Builder contentLanguage(@Nullable Output<String> contentLanguage) {
            $.contentLanguage = contentLanguage;
            return this;
        }

        public Builder contentLanguage(String contentLanguage) {
            return contentLanguage(Output.of(contentLanguage));
        }

        public Builder contentType(@Nullable Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder customerEncryption(@Nullable Output<BucketObjectCustomerEncryptionArgs> customerEncryption) {
            $.customerEncryption = customerEncryption;
            return this;
        }

        public Builder customerEncryption(BucketObjectCustomerEncryptionArgs customerEncryption) {
            return customerEncryption(Output.of(customerEncryption));
        }

        public Builder detectMd5hash(@Nullable Output<String> detectMd5hash) {
            $.detectMd5hash = detectMd5hash;
            return this;
        }

        public Builder detectMd5hash(String detectMd5hash) {
            return detectMd5hash(Output.of(detectMd5hash));
        }

        public Builder eventBasedHold(@Nullable Output<Boolean> eventBasedHold) {
            $.eventBasedHold = eventBasedHold;
            return this;
        }

        public Builder eventBasedHold(Boolean eventBasedHold) {
            return eventBasedHold(Output.of(eventBasedHold));
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder source(@Nullable Output<AssetOrArchive> source) {
            $.source = source;
            return this;
        }

        public Builder source(AssetOrArchive source) {
            return source(Output.of(source));
        }

        public Builder storageClass(@Nullable Output<String> storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        public Builder storageClass(String storageClass) {
            return storageClass(Output.of(storageClass));
        }

        public Builder temporaryHold(@Nullable Output<Boolean> temporaryHold) {
            $.temporaryHold = temporaryHold;
            return this;
        }

        public Builder temporaryHold(Boolean temporaryHold) {
            return temporaryHold(Output.of(temporaryHold));
        }

        public BucketObjectArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            return $;
        }
    }

}
