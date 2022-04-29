// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.azurenative.eventhub.enums.PrivateLinkConnectionStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ConnectionState information.
 * 
 */
public final class ConnectionStateArgs extends ResourceArgs {

    public static final ConnectionStateArgs Empty = new ConnectionStateArgs();

    /**
     * Description of the connection state.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the connection state.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Status of the connection.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,PrivateLinkConnectionStatus>> status;

    /**
     * @return Status of the connection.
     * 
     */
    public Optional<Output<Either<String,PrivateLinkConnectionStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    private ConnectionStateArgs() {}

    private ConnectionStateArgs(ConnectionStateArgs $) {
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionStateArgs $;

        public Builder() {
            $ = new ConnectionStateArgs();
        }

        public Builder(ConnectionStateArgs defaults) {
            $ = new ConnectionStateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the connection state.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the connection state.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param status Status of the connection.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<Either<String,PrivateLinkConnectionStatus>> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of the connection.
         * 
         * @return builder
         * 
         */
        public Builder status(Either<String,PrivateLinkConnectionStatus> status) {
            return status(Output.of(status));
        }

        /**
         * @param status Status of the connection.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        /**
         * @param status Status of the connection.
         * 
         * @return builder
         * 
         */
        public Builder status(PrivateLinkConnectionStatus status) {
            return status(Either.ofRight(status));
        }

        public ConnectionStateArgs build() {
            return $;
        }
    }

}
