// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.VirtualDirectoryResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualApplicationResponse {
    /**
     * Physical path.
     * 
     */
    private final @Nullable String physicalPath;
    /**
     * &lt;code&gt;true&lt;/code&gt; if preloading is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    private final @Nullable Boolean preloadEnabled;
    /**
     * Virtual directories for virtual application.
     * 
     */
    private final @Nullable List<VirtualDirectoryResponse> virtualDirectories;
    /**
     * Virtual path.
     * 
     */
    private final @Nullable String virtualPath;

    @CustomType.Constructor
    private VirtualApplicationResponse(
        @CustomType.Parameter("physicalPath") @Nullable String physicalPath,
        @CustomType.Parameter("preloadEnabled") @Nullable Boolean preloadEnabled,
        @CustomType.Parameter("virtualDirectories") @Nullable List<VirtualDirectoryResponse> virtualDirectories,
        @CustomType.Parameter("virtualPath") @Nullable String virtualPath) {
        this.physicalPath = physicalPath;
        this.preloadEnabled = preloadEnabled;
        this.virtualDirectories = virtualDirectories;
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
     * &lt;code&gt;true&lt;/code&gt; if preloading is enabled; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
    */
    public Optional<Boolean> preloadEnabled() {
        return Optional.ofNullable(this.preloadEnabled);
    }
    /**
     * Virtual directories for virtual application.
     * 
    */
    public List<VirtualDirectoryResponse> virtualDirectories() {
        return this.virtualDirectories == null ? List.of() : this.virtualDirectories;
    }
    /**
     * Virtual path.
     * 
    */
    public Optional<String> virtualPath() {
        return Optional.ofNullable(this.virtualPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualApplicationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String physicalPath;
        private @Nullable Boolean preloadEnabled;
        private @Nullable List<VirtualDirectoryResponse> virtualDirectories;
        private @Nullable String virtualPath;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualApplicationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.physicalPath = defaults.physicalPath;
    	      this.preloadEnabled = defaults.preloadEnabled;
    	      this.virtualDirectories = defaults.virtualDirectories;
    	      this.virtualPath = defaults.virtualPath;
        }

        public Builder physicalPath(@Nullable String physicalPath) {
            this.physicalPath = physicalPath;
            return this;
        }
        public Builder preloadEnabled(@Nullable Boolean preloadEnabled) {
            this.preloadEnabled = preloadEnabled;
            return this;
        }
        public Builder virtualDirectories(@Nullable List<VirtualDirectoryResponse> virtualDirectories) {
            this.virtualDirectories = virtualDirectories;
            return this;
        }
        public Builder virtualDirectories(VirtualDirectoryResponse... virtualDirectories) {
            return virtualDirectories(List.of(virtualDirectories));
        }
        public Builder virtualPath(@Nullable String virtualPath) {
            this.virtualPath = virtualPath;
            return this;
        }        public VirtualApplicationResponse build() {
            return new VirtualApplicationResponse(physicalPath, preloadEnabled, virtualDirectories, virtualPath);
        }
    }
}
