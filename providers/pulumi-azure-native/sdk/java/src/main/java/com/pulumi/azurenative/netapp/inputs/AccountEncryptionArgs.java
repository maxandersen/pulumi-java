// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encryption settings
 * 
 */
public final class AccountEncryptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountEncryptionArgs Empty = new AccountEncryptionArgs();

    /**
     * Encryption Key Source. Possible values are: &#39;Microsoft.NetApp&#39;.
     * 
     */
    @Import(name="keySource")
      private final @Nullable Output<String> keySource;

    public Output<String> keySource() {
        return this.keySource == null ? Codegen.empty() : this.keySource;
    }

    public AccountEncryptionArgs(@Nullable Output<String> keySource) {
        this.keySource = keySource;
    }

    private AccountEncryptionArgs() {
        this.keySource = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keySource;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keySource = defaults.keySource;
        }

        public Builder keySource(@Nullable Output<String> keySource) {
            this.keySource = keySource;
            return this;
        }
        public Builder keySource(@Nullable String keySource) {
            this.keySource = Codegen.ofNullable(keySource);
            return this;
        }        public AccountEncryptionArgs build() {
            return new AccountEncryptionArgs(keySource);
        }
    }
}
