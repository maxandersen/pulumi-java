// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dbformariadb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateEndpointPropertyArgs extends ResourceArgs {

    public static final PrivateEndpointPropertyArgs Empty = new PrivateEndpointPropertyArgs();

    /**
     * Resource id of the private endpoint.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Resource id of the private endpoint.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    private PrivateEndpointPropertyArgs() {}

    private PrivateEndpointPropertyArgs(PrivateEndpointPropertyArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateEndpointPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateEndpointPropertyArgs $;

        public Builder() {
            $ = new PrivateEndpointPropertyArgs();
        }

        public Builder(PrivateEndpointPropertyArgs defaults) {
            $ = new PrivateEndpointPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Resource id of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Resource id of the private endpoint.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public PrivateEndpointPropertyArgs build() {
            return $;
        }
    }

}
