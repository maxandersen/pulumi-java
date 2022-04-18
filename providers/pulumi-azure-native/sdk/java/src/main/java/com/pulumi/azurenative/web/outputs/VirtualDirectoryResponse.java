// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualDirectoryResponse {
    /**
     * Physical path.
     * 
     */
    private final @Nullable String physicalPath;
    /**
     * Path to virtual application.
     * 
     */
    private final @Nullable String virtualPath;

    @CustomType.Constructor
    private VirtualDirectoryResponse(
        @CustomType.Parameter("physicalPath") @Nullable String physicalPath,
        @CustomType.Parameter("virtualPath") @Nullable String virtualPath) {
        this.physicalPath = physicalPath;
        this.virtualPath = virtualPath;
    }

    /**
     * Physical path.
     * 
    */
    public Optional<String> physicalPath() {
        return Optional.ofNullable(this.physicalPath);
    }
    /**
     * Path to virtual application.
     * 
    */
    public Optional<String> virtualPath() {
        return Optional.ofNullable(this.virtualPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualDirectoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String physicalPath;
        private @Nullable String virtualPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualDirectoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.virtualPath = defaults.virtualPath;
        }

        public Builder physicalPath(@Nullable String physicalPath) {
            this.physicalPath = physicalPath;
            return this;
        }
        public Builder virtualPath(@Nullable String virtualPath) {
            this.virtualPath = virtualPath;
            return this;
        }        public VirtualDirectoryResponse build() {
            return new VirtualDirectoryResponse(physicalPath, virtualPath);
        }
    }
}
