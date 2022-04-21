// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The private endpoint resource from Microsoft.Network provider.
 * 
 */
public final class PrivateEndpointConnectionPropertiesPrivateEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionPropertiesPrivateEndpointArgs Empty = new PrivateEndpointConnectionPropertiesPrivateEndpointArgs();

    /**
     * The resource id of the private endpoint resource from Microsoft.Network provider.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private PrivateEndpointConnectionPropertiesPrivateEndpointArgs() {}

    private PrivateEndpointConnectionPropertiesPrivateEndpointArgs(PrivateEndpointConnectionPropertiesPrivateEndpointArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointConnectionPropertiesPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointConnectionPropertiesPrivateEndpointArgs $;

        public Builder() {
            $ = new PrivateEndpointConnectionPropertiesPrivateEndpointArgs();
        }

        public Builder(PrivateEndpointConnectionPropertiesPrivateEndpointArgs defaults) {
            $ = new PrivateEndpointConnectionPropertiesPrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public PrivateEndpointConnectionPropertiesPrivateEndpointArgs build() {
            return $;
        }
    }

}
