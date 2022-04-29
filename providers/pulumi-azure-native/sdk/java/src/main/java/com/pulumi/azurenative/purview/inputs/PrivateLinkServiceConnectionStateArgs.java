// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.purview.inputs;

import com.pulumi.azurenative.purview.enums.Status;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private link service connection state.
 * 
 */
public final class PrivateLinkServiceConnectionStateArgs extends ResourceArgs {

    public static final PrivateLinkServiceConnectionStateArgs Empty = new PrivateLinkServiceConnectionStateArgs();

    /**
     * The required actions.
     * 
     */
    @Import(name="actionsRequired")
    private @Nullable Output<String> actionsRequired;

    /**
     * @return The required actions.
     * 
     */
    public Optional<Output<String>> actionsRequired() {
        return Optional.ofNullable(this.actionsRequired);
    }

    /**
     * The description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The status.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,Status>> status;

    /**
     * @return The status.
     * 
     */
    public Optional<Output<Either<String,Status>>> status() {
        return Optional.ofNullable(this.status);
    }

    private PrivateLinkServiceConnectionStateArgs() {}

    private PrivateLinkServiceConnectionStateArgs(PrivateLinkServiceConnectionStateArgs $) {
        this.actionsRequired = $.actionsRequired;
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
         * @param actionsRequired The required actions.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(@Nullable Output<String> actionsRequired) {
            $.actionsRequired = actionsRequired;
            return this;
        }

        /**
         * @param actionsRequired The required actions.
         * 
         * @return builder
         * 
         */
        public Builder actionsRequired(String actionsRequired) {
            return actionsRequired(Output.of(actionsRequired));
        }

        /**
         * @param description The description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param status The status.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,Status>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,Status> status) {
            return status(Output.of(status));
        }

        /**
         * @param status The status.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status The status.
         * 
         * @return builder
         * 
         */
        public Builder status(Status status) {
            return status(Either.ofRight(status));
        }

        public PrivateLinkServiceConnectionStateArgs build() {
            return $;
        }
    }

}
