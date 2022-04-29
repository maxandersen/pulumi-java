// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private endpoint object properties.
 * 
 */
public final class PrivateEndpointArgs extends ResourceArgs {

    public static final PrivateEndpointArgs Empty = new PrivateEndpointArgs();

    /**
     * Full identifier of the private endpoint resource.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Full identifier of the private endpoint resource.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private PrivateEndpointArgs() {}

    private PrivateEndpointArgs(PrivateEndpointArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointArgs $;

        public Builder() {
            $ = new PrivateEndpointArgs();
        }

        public Builder(PrivateEndpointArgs defaults) {
            $ = new PrivateEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Full identifier of the private endpoint resource.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Full identifier of the private endpoint resource.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public PrivateEndpointArgs build() {
            return $;
        }
    }

}
