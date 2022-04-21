// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Exchange data type connection.
 * 
 */
public final class OfficeDataConnectorDataTypesResponseExchange extends com.pulumi.resources.InvokeArgs {

    public static final OfficeDataConnectorDataTypesResponseExchange Empty = new OfficeDataConnectorDataTypesResponseExchange();

    /**
     * Describe whether this data type connection is enabled or not.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private OfficeDataConnectorDataTypesResponseExchange() {}

    private OfficeDataConnectorDataTypesResponseExchange(OfficeDataConnectorDataTypesResponseExchange $) {
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OfficeDataConnectorDataTypesResponseExchange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OfficeDataConnectorDataTypesResponseExchange $;

        public Builder() {
            $ = new OfficeDataConnectorDataTypesResponseExchange();
        }

        public Builder(OfficeDataConnectorDataTypesResponseExchange defaults) {
            $ = new OfficeDataConnectorDataTypesResponseExchange(Objects.requireNonNull(defaults));
        }

        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public OfficeDataConnectorDataTypesResponseExchange build() {
            return $;
        }
    }

}
