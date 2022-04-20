// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DiskEncryptionConfigurationResponse {
    /**
     * On Linux pool, only &#34;TemporaryDisk&#34; is supported; on Windows pool, &#34;OsDisk&#34; and &#34;TemporaryDisk&#34; must be specified.
     * 
     */
    private final @Nullable List<String> targets;

    @CustomType.Constructor
    private DiskEncryptionConfigurationResponse(@CustomType.Parameter("targets") @Nullable List<String> targets) {
        this.targets = targets;
    }

    /**
     * On Linux pool, only &#34;TemporaryDisk&#34; is supported; on Windows pool, &#34;OsDisk&#34; and &#34;TemporaryDisk&#34; must be specified.
     * 
    */
    public List<String> targets() {
        return this.targets == null ? List.of() : this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskEncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskEncryptionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targets = defaults.targets;
        }

        public Builder targets(@Nullable List<String> targets) {
            this.targets = targets;
            return this;
        }
        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }        public DiskEncryptionConfigurationResponse build() {
            return new DiskEncryptionConfigurationResponse(targets);
        }
    }
}
