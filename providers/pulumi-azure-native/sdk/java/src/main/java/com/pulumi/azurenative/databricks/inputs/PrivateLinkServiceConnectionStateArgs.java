// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databricks.inputs;

import com.pulumi.azurenative.databricks.enums.PrivateLinkServiceConnectionStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The current state of a private endpoint connection
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * Actions required for a private endpoint connection
     * 
     */
    @Import(name="actionRequired")
    private @Nullable Output<String> actionRequired;

    /**
     * @return Actions required for a private endpoint connection
     * 
     */
    public Optional<Output<String>> actionRequired() {
        return Optional.ofNullable(this.actionRequired);
    }

    /**
     * The description for the current state of a private endpoint connection
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for the current state of a private endpoint connection
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The status of a private endpoint connection
     * 
     */
    @Import(name="status", required=true)
    private Output<Either<String,PrivateLinkServiceConnectionStatus>> status;

    /**
     * @return The status of a private endpoint connection
     * 
     */
    public Output<Either<String,PrivateLinkServiceConnectionStatus>> status() {
        return this.status;
    }

    private PrivateLinkServiceConnectionStateArgs() {}

    private PrivateLinkServiceConnectionStateArgs(PrivateLinkServiceConnectionStateArgs $) {
        this.actionRequired = $.actionRequired;
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLinkServiceConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLinkServiceConnectionStateArgs $;

        public Builder() {
            $ = new PrivateLinkServiceConnectionStateArgs();
        }

        public Builder(PrivateLinkServiceConnectionStateArgs defaults) {
            $ = new PrivateLinkServiceConnectionStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionRequired Actions required for a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder actionRequired(@Nullable Output<String> actionRequired) {
            $.actionRequired = actionRequired;
            return this;
        }

        /**
         * @param actionRequired Actions required for a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder actionRequired(String actionRequired) {
            return actionRequired(Output.of(actionRequired));
        }

        /**
         * @param description The description for the current state of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for the current state of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param status The status of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder status(Output<Either<String,PrivateLinkServiceConnectionStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,PrivateLinkServiceConnectionStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status The status of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status The status of a private endpoint connection
         * 
         * @return builder
         * 
         */
        public Builder status(PrivateLinkServiceConnectionStatus status) {
            return status(Either.ofRight(status));
        }

        public PrivateLinkServiceConnectionStateArgs build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
