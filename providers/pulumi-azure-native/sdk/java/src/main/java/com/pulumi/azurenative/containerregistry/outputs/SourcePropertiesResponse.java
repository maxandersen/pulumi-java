// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.AuthInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SourcePropertiesResponse {
    /**
     * @return The branch name of the source code.
     * 
     */
    private final @Nullable String branch;
    /**
     * @return The full URL to the source code repository
     * 
     */
    private final String repositoryUrl;
    /**
     * @return The authorization properties for accessing the source code repository and to set up
     * webhooks for notifications.
     * 
     */
    private final @Nullable AuthInfoResponse sourceControlAuthProperties;
    /**
     * @return The type of source control service.
     * 
     */
    private final String sourceControlType;

    @CustomType.Constructor
    private SourcePropertiesResponse(
        @CustomType.Parameter("branch") @Nullable String branch,
        @CustomType.Parameter("repositoryUrl") String repositoryUrl,
        @CustomType.Parameter("sourceControlAuthProperties") @Nullable AuthInfoResponse sourceControlAuthProperties,
        @CustomType.Parameter("sourceControlType") String sourceControlType) {
        this.branch = branch;
        this.repositoryUrl = repositoryUrl;
        this.sourceControlAuthProperties = sourceControlAuthProperties;
        this.sourceControlType = sourceControlType;
    }

    /**
     * @return The branch name of the source code.
     * 
     */
    public Optional<String> branch() {
        return Optional.ofNullable(this.branch);
    }
    /**
     * @return The full URL to the source code repository
     * 
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }
    /**
     * @return The authorization properties for accessing the source code repository and to set up
     * webhooks for notifications.
     * 
     */
    public Optional<AuthInfoResponse> sourceControlAuthProperties() {
        return Optional.ofNullable(this.sourceControlAuthProperties);
    }
    /**
     * @return The type of source control service.
     * 
     */
    public String sourceControlType() {
        return this.sourceControlType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private String repositoryUrl;
        private @Nullable AuthInfoResponse sourceControlAuthProperties;
        private String sourceControlType;

        public Builder() {
    	      // Empty
        }

        public Builder(SourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.repositoryUrl = defaults.repositoryUrl;
    	      this.sourceControlAuthProperties = defaults.sourceControlAuthProperties;
    	      this.sourceControlType = defaults.sourceControlType;
        }

        public Builder branch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }
        public Builder repositoryUrl(String repositoryUrl) {
            this.repositoryUrl = Objects.requireNonNull(repositoryUrl);
            return this;
        }
        public Builder sourceControlAuthProperties(@Nullable AuthInfoResponse sourceControlAuthProperties) {
            this.sourceControlAuthProperties = sourceControlAuthProperties;
            return this;
        }
        public Builder sourceControlType(String sourceControlType) {
            this.sourceControlType = Objects.requireNonNull(sourceControlType);
            return this;
        }        public SourcePropertiesResponse build() {
            return new SourcePropertiesResponse(branch, repositoryUrl, sourceControlAuthProperties, sourceControlType);
        }
    }
}
