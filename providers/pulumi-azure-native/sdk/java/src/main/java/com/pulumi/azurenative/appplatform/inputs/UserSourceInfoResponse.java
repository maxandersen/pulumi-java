// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Source information for a deployment
 * 
 */
public final class UserSourceInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserSourceInfoResponse Empty = new UserSourceInfoResponse();

    /**
     * Selector for the artifact to be used for the deployment for multi-module projects. This should be
     * the relative path to the target module/project.
     * 
     */
    @Import(name="artifactSelector")
    private @Nullable String artifactSelector;

    public Optional<String> artifactSelector() {
        return Optional.ofNullable(this.artifactSelector);
    }

    /**
     * Relative path of the storage which stores the source
     * 
     */
    @Import(name="relativePath")
    private @Nullable String relativePath;

    public Optional<String> relativePath() {
        return Optional.ofNullable(this.relativePath);
    }

    /**
     * Type of the source uploaded
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Version of the source
     * 
     */
    @Import(name="version")
    private @Nullable String version;

    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private UserSourceInfoResponse() {}

    private UserSourceInfoResponse(UserSourceInfoResponse $) {
        this.artifactSelector = $.artifactSelector;
        this.relativePath = $.relativePath;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserSourceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserSourceInfoResponse $;

        public Builder() {
            $ = new UserSourceInfoResponse();
        }

        public Builder(UserSourceInfoResponse defaults) {
            $ = new UserSourceInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder artifactSelector(@Nullable String artifactSelector) {
            $.artifactSelector = artifactSelector;
            return this;
        }

        public Builder relativePath(@Nullable String relativePath) {
            $.relativePath = relativePath;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public UserSourceInfoResponse build() {
            return $;
        }
    }

}
