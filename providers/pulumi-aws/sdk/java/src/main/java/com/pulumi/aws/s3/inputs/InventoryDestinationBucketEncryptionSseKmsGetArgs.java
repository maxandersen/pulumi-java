// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InventoryDestinationBucketEncryptionSseKmsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InventoryDestinationBucketEncryptionSseKmsGetArgs Empty = new InventoryDestinationBucketEncryptionSseKmsGetArgs();

    /**
     * The ARN of the KMS customer master key (CMK) used to encrypt the inventory file.
     * 
     */
    @Import(name="keyId", required=true)
    private Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId;
    }

    private InventoryDestinationBucketEncryptionSseKmsGetArgs() {}

    private InventoryDestinationBucketEncryptionSseKmsGetArgs(InventoryDestinationBucketEncryptionSseKmsGetArgs $) {
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InventoryDestinationBucketEncryptionSseKmsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InventoryDestinationBucketEncryptionSseKmsGetArgs $;

        public Builder() {
            $ = new InventoryDestinationBucketEncryptionSseKmsGetArgs();
        }

        public Builder(InventoryDestinationBucketEncryptionSseKmsGetArgs defaults) {
            $ = new InventoryDestinationBucketEncryptionSseKmsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyId(Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public InventoryDestinationBucketEncryptionSseKmsGetArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            return $;
        }
    }

}
