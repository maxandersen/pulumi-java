// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.ActiveDirectoryPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFilesIdentityBasedAuthenticationResponse {
    /**
     * Required if choose AD.
     * 
     */
    private final @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties;
    /**
     * Indicates the directory service used.
     * 
     */
    private final String directoryServiceOptions;

    @CustomType.Constructor
    private AzureFilesIdentityBasedAuthenticationResponse(
        @CustomType.Parameter("activeDirectoryProperties") @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties,
        @CustomType.Parameter("directoryServiceOptions") String directoryServiceOptions) {
        this.activeDirectoryProperties = activeDirectoryProperties;
        this.directoryServiceOptions = directoryServiceOptions;
    }

    /**
     * Required if choose AD.
     * 
    */
    public Optional<ActiveDirectoryPropertiesResponse> activeDirectoryProperties() {
        return Optional.ofNullable(this.activeDirectoryProperties);
    }
    /**
     * Indicates the directory service used.
     * 
    */
    public String directoryServiceOptions() {
        return this.directoryServiceOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFilesIdentityBasedAuthenticationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties;
        private String directoryServiceOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFilesIdentityBasedAuthenticationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryProperties = defaults.activeDirectoryProperties;
    	      this.directoryServiceOptions = defaults.directoryServiceOptions;
        }

        public Builder activeDirectoryProperties(@Nullable ActiveDirectoryPropertiesResponse activeDirectoryProperties) {
            this.activeDirectoryProperties = activeDirectoryProperties;
            return this;
        }
        public Builder directoryServiceOptions(String directoryServiceOptions) {
            this.directoryServiceOptions = Objects.requireNonNull(directoryServiceOptions);
            return this;
        }        public AzureFilesIdentityBasedAuthenticationResponse build() {
            return new AzureFilesIdentityBasedAuthenticationResponse(activeDirectoryProperties, directoryServiceOptions);
        }
    }
}
