// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.nimblestudio.inputs;

import com.pulumi.awsnative.nimblestudio.enums.StudioEncryptionConfigurationKeyType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
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
      private final @Nullable Output<String> keyArn;

    public Output<String> keyArn() {
        return this.keyArn == null ? Codegen.empty() : this.keyArn;
    }

    @Import(name="keyType", required=true)
      private final Output<StudioEncryptionConfigurationKeyType> keyType;

    public Output<StudioEncryptionConfigurationKeyType> keyType() {
        return this.keyType;
    }

    public StudioEncryptionConfigurationArgs(
        @Nullable Output<String> keyArn,
        Output<StudioEncryptionConfigurationKeyType> keyType) {
        this.keyArn = keyArn;
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
    }

    private StudioEncryptionConfigurationArgs() {
        this.keyArn = Codegen.empty();
        this.keyType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyArn;
        private Output<StudioEncryptionConfigurationKeyType> keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyArn = defaults.keyArn;
    	      this.keyType = defaults.keyType;
        }

        public Builder keyArn(@Nullable Output<String> keyArn) {
            this.keyArn = keyArn;
            return this;
        }
        public Builder keyArn(@Nullable String keyArn) {
            this.keyArn = Codegen.ofNullable(keyArn);
            return this;
        }
        public Builder keyType(Output<StudioEncryptionConfigurationKeyType> keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder keyType(StudioEncryptionConfigurationKeyType keyType) {
            this.keyType = Output.of(Objects.requireNonNull(keyType));
            return this;
        }        public StudioEncryptionConfigurationArgs build() {
            return new StudioEncryptionConfigurationArgs(keyArn, keyType);
        }
    }
}
