// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesis.inputs;

import com.pulumi.awsnative.kinesis.enums.StreamEncryptionEncryptionType;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * When specified, enables or updates server-side encryption using an AWS KMS key for a specified stream. Removing this property from your stack template and updating your stack disables encryption.
 * 
 */
public final class StreamEncryption extends com.pulumi.resources.InvokeArgs {

    public static final StreamEncryption Empty = new StreamEncryption();

    /**
     * The encryption type to use. The only valid value is KMS.
     * 
     */
    @Import(name="encryptionType", required=true)
    private StreamEncryptionEncryptionType encryptionType;

    public StreamEncryptionEncryptionType encryptionType() {
        return this.encryptionType;
    }

    /**
     * The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified Amazon Resource Name (ARN) to either an alias or a key, or an alias name prefixed by &#34;alias/&#34;.You can also use a master key owned by Kinesis Data Streams by specifying the alias aws/kinesis.
     * 
     */
    @Import(name="keyId", required=true)
    private String keyId;

    public String keyId() {
        return this.keyId;
    }

    private StreamEncryption() {}

    private StreamEncryption(StreamEncryption $) {
        this.encryptionType = $.encryptionType;
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamEncryption $;

        public Builder() {
            $ = new StreamEncryption();
        }

        public Builder(StreamEncryption defaults) {
            $ = new StreamEncryption(Objects.requireNonNull(defaults));
        }

        public Builder encryptionType(StreamEncryptionEncryptionType encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        public Builder keyId(String keyId) {
            $.keyId = keyId;
            return this;
        }

        public StreamEncryption build() {
            $.encryptionType = Objects.requireNonNull($.encryptionType, "expected parameter 'encryptionType' to be non-null");
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            return $;
        }
    }

}
