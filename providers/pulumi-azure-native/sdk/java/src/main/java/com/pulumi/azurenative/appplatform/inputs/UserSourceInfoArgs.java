// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.enums.UserSourceType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Source information for a deployment
 * 
 */
public final class UserSourceInfoArgs extends ResourceArgs {

    public static final UserSourceInfoArgs Empty = new UserSourceInfoArgs();

    /**
     * Selector for the artifact to be used for the deployment for multi-module projects. This should be
     * the relative path to the target module/project.
     * 
     */
    @Import(name="artifactSelector")
    private @Nullable Output<String> artifactSelector;

    /**
     * @return Selector for the artifact to be used for the deployment for multi-module projects. This should be
     * the relative path to the target module/project.
     * 
     */
    public Optional<Output<String>> artifactSelector() {
        return Optional.ofNullable(this.artifactSelector);
    }

    /**
     * Relative path of the storage which stores the source
     * 
     */
    @Import(name="relativePath")
    private @Nullable Output<String> relativePath;

    /**
     * @return Relative path of the storage which stores the source
     * 
     */
    public Optional<Output<String>> relativePath() {
        return Optional.ofNullable(this.relativePath);
    }

    /**
     * Type of the source uploaded
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,UserSourceType>> type;

    /**
     * @return Type of the source uploaded
     * 
     */
    public Optional<Output<Either<String,UserSourceType>>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Version of the source
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return Version of the source
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private UserSourceInfoArgs() {}

    private UserSourceInfoArgs(UserSourceInfoArgs $) {
        this.artifactSelector = $.artifactSelector;
        this.relativePath = $.relativePath;
        this.type = $.type;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserSourceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserSourceInfoArgs $;

        public Builder() {
            $ = new UserSourceInfoArgs();
        }

        public Builder(UserSourceInfoArgs defaults) {
            $ = new UserSourceInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactSelector Selector for the artifact to be used for the deployment for multi-module projects. This should be
         * the relative path to the target module/project.
         * 
         * @return builder
         * 
         */
        public Builder artifactSelector(@Nullable Output<String> artifactSelector) {
            $.artifactSelector = artifactSelector;
            return this;
        }

        /**
         * @param artifactSelector Selector for the artifact to be used for the deployment for multi-module projects. This should be
         * the relative path to the target module/project.
         * 
         * @return builder
         * 
         */
        public Builder artifactSelector(String artifactSelector) {
            return artifactSelector(Output.of(artifactSelector));
        }

        /**
         * @param relativePath Relative path of the storage which stores the source
         * 
         * @return builder
         * 
         */
        public Builder relativePath(@Nullable Output<String> relativePath) {
            $.relativePath = relativePath;
            return this;
        }

        /**
         * @param relativePath Relative path of the storage which stores the source
         * 
         * @return builder
         * 
         */
        public Builder relativePath(String relativePath) {
            return relativePath(Output.of(relativePath));
        }

        /**
         * @param type Type of the source uploaded
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<Either<String,UserSourceType>> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the source uploaded
         * 
         * @return builder
         * 
         */
        public Builder type(Either<String,UserSourceType> type) {
            return type(Output.of(type));
        }

        /**
         * @param type Type of the source uploaded
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        /**
         * @param type Type of the source uploaded
         * 
         * @return builder
         * 
         */
        public Builder type(UserSourceType type) {
            return type(Either.ofRight(type));
        }

        /**
         * @param version Version of the source
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Version of the source
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public UserSourceInfoArgs build() {
            return $;
        }
    }

}
