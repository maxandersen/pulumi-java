// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.awsnative.nimblestudio.enums.StudioEncryptionConfigurationKeyType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Configuration of the encryption method that is used for the studio.&lt;/p&gt;
 * 
 */
public final class StudioEncryptionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final StudioEncryptionConfigurationArgs Empty = new StudioEncryptionConfigurationArgs();

    /**
     * &lt;p&gt;The ARN for a KMS key that is used to encrypt studio data.&lt;/p&gt;
     * 
     */
    @Import(name="keyArn")
    private @Nullable Output<String> keyArn;

    /**
     * @return &lt;p&gt;The ARN for a KMS key that is used to encrypt studio data.&lt;/p&gt;
     * 
     */
    public Optional<Output<String>> keyArn() {
        return Optional.ofNullable(this.keyArn);
    }

    @Import(name="keyType", required=true)
    private Output<StudioEncryptionConfigurationKeyType> keyType;

    public Output<StudioEncryptionConfigurationKeyType> keyType() {
        return this.keyType;
    }

    private StudioEncryptionConfigurationArgs() {}

    private StudioEncryptionConfigurationArgs(StudioEncryptionConfigurationArgs $) {
        this.keyArn = $.keyArn;
        this.keyType = $.keyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StudioEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StudioEncryptionConfigurationArgs $;

        public Builder() {
            $ = new StudioEncryptionConfigurationArgs();
        }

        public Builder(StudioEncryptionConfigurationArgs defaults) {
            $ = new StudioEncryptionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyArn &lt;p&gt;The ARN for a KMS key that is used to encrypt studio data.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder keyArn(@Nullable Output<String> keyArn) {
            $.keyArn = keyArn;
            return this;
        }

        /**
         * @param keyArn &lt;p&gt;The ARN for a KMS key that is used to encrypt studio data.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder keyArn(String keyArn) {
            return keyArn(Output.of(keyArn));
        }

        public Builder keyType(Output<StudioEncryptionConfigurationKeyType> keyType) {
            $.keyType = keyType;
            return this;
        }

        public Builder keyType(StudioEncryptionConfigurationKeyType keyType) {
            return keyType(Output.of(keyType));
        }

        public StudioEncryptionConfigurationArgs build() {
            $.keyType = Objects.requireNonNull($.keyType, "expected parameter 'keyType' to be non-null");
            return $;
        }
    }

}
