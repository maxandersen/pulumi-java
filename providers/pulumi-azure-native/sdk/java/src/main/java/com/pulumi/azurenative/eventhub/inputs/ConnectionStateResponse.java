// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventhub.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ConnectionState information.
 * 
 */
public final class ConnectionStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectionStateResponse Empty = new ConnectionStateResponse();

    /**
     * Description of the connection state.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Status of the connection.
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private ConnectionStateResponse() {}

    private ConnectionStateResponse(ConnectionStateResponse $) {
        this.description = $.description;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionStateResponse $;

        public Builder() {
            $ = new ConnectionStateResponse();
        }

        public Builder(ConnectionStateResponse defaults) {
            $ = new ConnectionStateResponse(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public ConnectionStateResponse build() {
            return $;
        }
    }

}
